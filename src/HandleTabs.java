import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.List;

public class HandleTabs {
    public static void main(String args[]) throws AWTException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://google.com");
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("how to handle multiple tabs");
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        List<WebElement> list = driver.findElements(By.tagName("a"));
        System.out.println(list.size());
        Actions a = new Actions(driver);
        a.contextClick(driver.findElement(By.xpath("//h3[text()='How to handle multiple tabs in Selenium']"))).build().perform();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Set<String> windowHandles = driver.getWindowHandles();
        ArrayList tabs = new ArrayList(windowHandles);
        driver.switchTo().window((String) tabs.get(1));

    }
}
