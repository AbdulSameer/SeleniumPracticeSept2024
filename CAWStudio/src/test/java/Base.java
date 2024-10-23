import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class Base {
    public static WebDriver driver;
    WebDriverWait wait;
@BeforeMethod
    public void setUp(){
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    driver.get("https://testpages.herokuapp.com/styled/tag/dynamic-table.html");
}
@AfterMethod
    public void tear(){
    driver.quit();
}
}
