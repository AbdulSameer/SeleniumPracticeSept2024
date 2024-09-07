package seleniumjdbcvalidationfromdatabase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.*;
import java.util.concurrent.TimeUnit;

public class Google {
    public static void main(String args[]) throws SQLException {
        String text = "";
        String url = "jdbc:postgresql://localhost:5432/test";
        String userName = "postgres";
        String password = "admin";

        //Initializing the connection
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        //establishing the connection
        conn = DriverManager.getConnection(url,userName,password);
        System.out.println("connected to the database successfully");

        //create a statement
        stmt = conn.createStatement();

        //defining sql query
        String query = "select name from users";

        //execute the query
        rs = stmt.executeQuery(query);

        //process the result
        while(rs.next()){
            //fetch colums from the result
            text = rs.getString("name");
        }

        //database operations

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://google.com");
        driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys(text);
    }
}
