package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

import static pageobjectmodel.Base.driver;

public class Actions {

        locators l = new locators();
        public  Actions(){
            PageFactory.initElements(driver,l);
            WebElement ele = driver.findElement(By.xpath(""));
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(ExpectedConditions.visibilityOf(ele));

            Wait<WebDriver> wait1 = new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(15))
                    .pollingEvery(Duration.ofMillis(10))
                    .ignoring(NoSuchElementException.class);
        }

        public void close(){
            l.close.click();
        }
}
