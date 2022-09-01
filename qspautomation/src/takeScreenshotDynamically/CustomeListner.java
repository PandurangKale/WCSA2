package takeScreenshotDynamically;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomeListner extends BaseTest implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	}

	@Override
	public void onTestFailure(ITestResult result) {

		String nameOfFailedMethod = result.getMethod().getMethodName();
		try {
			failed(nameOfFailedMethod);
		} catch (IOException e) {
		
		}
		Reporter.log("screenshot is taken with "+nameOfFailedMethod+" ",true);
		
		
	}

	

	@Override
	public void onTestSkipped(ITestResult result) {
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
	}

	@Override
	public void onFinish(ITestContext context) {


	}
}

