	
public class WasRun extends TestCase {
	String log;

	public WasRun(String methodName) {
		super(methodName);
	}

	public void setUp(){
		log = "setUp ";
	}
	
	public void testMethod(){
		log += "testMethod ";
	}
	
	public void tearDown(){
		log += "tearDown ";
	}
}
