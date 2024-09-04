import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandles {
    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        String ParentWindow = driver.getWindowHandle();
        driver.findElement(By.xpath("//button[@class='whButtons']")).click();
        Set<String> set = driver.getWindowHandles();
        System.out.println(set.size());
        for(String childWindow:set){
            if(!ParentWindow.equals(set)){
                driver.switchTo().window(childWindow);
                driver.manage().window().maximize();
                driver.findElement(By.xpath("//a[text()='Tech News']")).click();
            }
        }
    }
}
