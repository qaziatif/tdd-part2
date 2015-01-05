
public class TestCaseTest extends TestCase {
	
	WasRun test ;
	public TestCaseTest(String methodName) {
		super(methodName);
	}

	public void testSetUp(){
		test = new WasRun("testMethod");
		test.run();
		assert (test.wasSetUp);
	}
	public void testRunning(){
		WasRun test = new WasRun("testMethod");
		test.run();
		assert (test.wasRun);
	}
	
	public void setUp(){
		test = new WasRun("testMethod");
	}
}
