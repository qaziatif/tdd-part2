
public class RunTests {

	public static void main(String[] args) throws Exception {
		new TestCaseTest("testTemplateMethod").run();
		new TestCaseTest("testResult").run();
		new TestCaseTest("testFailedResult").run();
		new TestCaseTest("testFailedResultFormatting").run();
	}

}
