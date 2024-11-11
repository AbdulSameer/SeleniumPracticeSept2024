package seleniumjdbcvalidationfromdatabase;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.concurrent.TimeUnit;

@Listeners(FailScreenShot.class)
public class Google {
    public static WebDriver driver = new ChromeDriver();

    // Method to take a screenshot
    public void takeScreenshot(String testName) throws IOException {
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("C:\\Users\\Sameer\\Downloads\\src\\failScreenShots\\" + testName + ".png"));
    }

    @Test
    public void testGoogleSearch() throws SQLException {
        String text = "";
        String url = "jdbc:postgresql://localhost:5432/test";
        String userName = "postgres";
        String password = "admin";

        // Establishing the connection
        Connection conn = DriverManager.getConnection(url, userName, password);
        System.out.println("Connected to the database successfully");

        // Create a statement
        Statement stmt = conn.createStatement();

        // Define SQL query
        String query = "SELECT name FROM users";

        // Execute the query
        ResultSet rs = stmt.executeQuery(query);

        // Process the result
        while (rs.next()) {
            text = rs.getString("name");
        }

        // Database and Selenium operations
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://facebook.com");

        // Asserting the title to trigger failure
        String title = driver.getTitle();
        Assert.assertEquals(title, "facebook");  // this may fail if the title isn't "facebook"

        // Using the retrieved text in the search box
        driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys(text);
    }
}
