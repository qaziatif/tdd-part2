import java.lang.reflect.Method;


public class TestCase {
	private String methodName ;

	public TestCase(String methodName) {
		this.methodName = methodName;
	}

	public void setUp(){
		
	}
	
	public void run() throws Exception{
		this.setUp();
		try{
			Method method = this.getClass().getMethod(methodName);
			method.invoke(this);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		tearDown();
	}
	public void tearDown(){
		
	}

}
