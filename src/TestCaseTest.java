
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
	
	
}
