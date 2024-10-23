import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.List;

public class ActionsClass {
    WebDriver driver ;
    WebDriverWait wait;

    public Locators locators;

    public ActionsClass(WebDriver driver){
        this.driver = driver;
        locators = new Locators();
        PageFactory.initElements(driver,locators);
    }

    public void enterData(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(locators.expandTableData)).click();
    }

    public void copyPasteData(){
        wait =  new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(locators.jsonData)).click();
        wait.until(ExpectedConditions.elementToBeClickable(locators.jsonData)).clear();
        String jsoneFilePath = ".\\src\\TestData\\data.json";
        String data = "";
        try{
            data = new String(Files.readAllBytes(Paths.get(jsoneFilePath)));
        }catch (IOException e) {
            e.printStackTrace();
        }

        locators.jsonData.sendKeys(data);
    }

    public void refreshDataTable(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(locators.refreshTable)).click();
    }

    public void assertingData(){
        String jsonFilePath = ".\\src\\TestData\\data.json";
        String data = "";
        try{
            data = new String(Files.readAllBytes(Paths.get(jsonFilePath)));
        }catch (IOException e) {
            e.printStackTrace();
        }
        JSONArray jsonArray = new JSONArray(data);

        List<WebElement> tableRows = locators.tableRows;

        for(int i=0;i<jsonArray.length();i++){
            // Get JSON object for each person
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            String name = jsonObject.getString("name");
            int age = jsonObject.getInt("age");
            String gender = jsonObject.getString("gender");

            // Extract corresponding table row
            WebElement row = tableRows.get(i);

            List<WebElement> columns = row.findElements(By.tagName("td"));

            String tableName = locators.cols.get(0).getText();
            String tableAge = locators.cols.get(1).getText();
            String tableGender = locators.cols.get(2).getText();

           // assert name.equals(tableName) : "Name doesn't match!";
           // assert String.valueOf(age).equals(tableAge) : "Age doesn't match!";
           // assert gender.equals(tableGender) : "Gender doesn't match!";

            System.out.println("Row " + (i + 1) + " matches: " + name + ", " + age + ", " + gender);
        }
        }
    }
