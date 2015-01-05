import java.lang.reflect.Method;


public class TestCase {
	protected String methodName ;
	TestResult result;

	public TestCase(String methodName) {
		this.methodName = methodName;
	}

	public void setUp(){
		
	}
	
	public TestResult run(TestResult result) throws Exception{
		result.testStarted();
		this.setUp();
		try{
			Method method = this.getClass().getMethod(methodName);
			method.invoke(this);
		}catch(Exception ex){
			result.testFailed();
			ex.printStackTrace();
		}
		tearDown();
		return result;
	}
	public void tearDown(){
		
	}

}
