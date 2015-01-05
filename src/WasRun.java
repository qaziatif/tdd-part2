
public class WasRun extends TestCase {
	boolean wasRun;
	boolean wasSetUp;

	public WasRun(String methodName) {
		super(methodName);
	}

	public void run() {
		
	}
	
	public void setUp(){
		wasRun = false;
		wasSetUp=true;
	}
}
