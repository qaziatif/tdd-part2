import java.lang.reflect.Method;


public class TestCase {
	protected String methodName ;

	public TestCase(String methodName) {
		this.methodName = methodName;
	}

	public void setUp(){
		
	}
	
	public TestResult run() throws Exception{
		TestResult result= new TestResult();
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
