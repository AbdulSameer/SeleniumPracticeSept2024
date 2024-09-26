package selenium_java_interview_questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class DifferentTypesOfWait {
    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();
        //webdriver wait or explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));

        //implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //fluent wait
        FluentWait<WebDriver> wait1 = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
    }
}
