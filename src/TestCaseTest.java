
public class TestCaseTest extends TestCase {
	
	public TestCaseTest(String methodName) {
		super(methodName);
	}
	
	public void setUp(){
		result = new TestResult();
	}

	public void testTemplateMethod() throws Exception{
		WasRun test = new WasRun("testMethod");
		test.run(result);
		System.out.println(test.log);
		assert("setUp testMethod tearDown ".equalsIgnoreCase(test.log));
	}
	
	public void testResult() throws Exception{
		WasRun test = new WasRun("testMethod");
		test.run(result);
		assert(result.runCount==1 && result.errorCount==0);
	}
	public void testFailedResult() throws Exception{
		WasRun test = new WasRun("testBrokenMethod");
		test.run(result);
		assert(result.runCount==1 && result.errorCount==1);
	}
	public void testFailedResultFormatting(){
		result.testStarted();
		result.testFailed();
		assert(result.runCount==1 && result.errorCount==1);
	}
	public void testSuite() throws Exception{
		TestSuite suite= new TestSuite();
		suite.add(new WasRun("testMethod"));
		suite.add(new WasRun("testBrokenMethod"));
		suite.run(result);
		assert(result.runCount==2 && result.errorCount==1);
	}
	
}
