import java.util.ArrayList;


public class TestSuite {

	ArrayList<TestCase> tests = new ArrayList<TestCase>();
	
	public void add(TestCase testCase) {
		tests.add(testCase);
	}

	public void run(TestResult result) throws Exception {
		for(TestCase test : tests){
			test.run(result);
		}
	}
}
