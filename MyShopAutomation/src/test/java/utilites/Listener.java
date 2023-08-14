package utilites;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
    public void onTestStart(ITestResult result) {
        System.out.println("Execution started");
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("my test case pass  "+result.getName());
    }

    public void onTestFailure(ITestResult result) {

        System.out.println("my test case get fails  "+result.getName());
        UtilClass.takeScreenshot(result.getName());
        System.out.println(" Screenshot Taken ");
    }

    public void onTestSkipped(ITestResult result) {
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        this.onTestFailure(result);
    }

    public void onStart(ITestContext context) {
    }

    public void onFinish(ITestContext context) {

    }

}
