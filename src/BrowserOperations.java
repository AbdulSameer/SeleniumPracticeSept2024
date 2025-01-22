import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserOperations {
    public static void main(String args[]){
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches",new String[]{"enable-automation"});
        WebDriver driver = new ChromeDriver(options);
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.acceptInsecureCerts();
    }
}
