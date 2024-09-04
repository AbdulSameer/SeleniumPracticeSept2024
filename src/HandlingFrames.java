import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class HandlingFrames {
    public static void main(String args[]) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://docs.oracle.com/javase/8/docs/api/");
        List<WebElement> noOfFrames = driver.findElements(By.tagName("frame"));
        System.out.println("no of frames are: "+noOfFrames.size());
        int n = noOfFrames.size();
        String al = null;
        for(int i=0;i<n;i++){
            driver.switchTo().frame(i);
            System.out.println(i);
            al = driver.findElement(By.xpath("//frame[@name]")).getAttribute("title");
            System.out.println("id of frame: "+al);
           if(al.equals("classFrame")){
               driver.findElement(By.xpath("//a[text()='compact1']")).click();
           }
        }
    }
}
