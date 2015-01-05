
public class TestCaseTest extends TestCase {
	
	public TestCaseTest(String methodName) {
		super(methodName);
	}

	public void testTemplateMethod() throws Exception{
		WasRun test = new WasRun("testMethod");
		test.run();
		System.out.println(test.log);
		assert("setUp testMethod tearDown ".equalsIgnoreCase(test.log));
	}
	
	public void testResult() throws Exception{
		WasRun test = new WasRun("testMethod");
		TestResult result = new TestResult();
		result = test.run();
		System.out.println(result.summary());
		assert(result.runCount==1 && result.errorCount==0);
	}
	public void testFailedResult() throws Exception{
		WasRun test = new WasRun("testBrokenMethod");
		TestResult result = new TestResult();
		result = test.run();
		System.out.println(result.summary());
		assert(result.runCount==1 && result.errorCount==1);
	}
	public void testFailedResultFormatting(){
		TestResult result = new TestResult();
		result.testStarted();
		result.testFailed();
		System.out.println(result.summary());
		assert(result.runCount==1 && result.errorCount==1);
	}
	
}
