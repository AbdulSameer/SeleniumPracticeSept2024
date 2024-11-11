package seleniumjdbcvalidationfromdatabase;

import org.testng.ITestListener;
import org.testng.ITestResult;
import java.io.IOException;

public class FailScreenShot implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test case failed: " + result.getName());

        // Capture a screenshot on test failure
        Google testInstance = (Google) result.getInstance();
        try {
            testInstance.takeScreenshot(result.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
