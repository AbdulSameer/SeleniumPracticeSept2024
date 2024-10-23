import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

import java.util.List;

public class Locators {
@FindBy(how= How.XPATH, using="//summary[text()='Table Data']")
    public WebElement expandTableData;

@FindBy(how=How.XPATH, using="//textarea[@id='jsondata']")
    public WebElement jsonData;

@FindBy(how=How.XPATH, using="//button[text()='Refresh Table']")
    public WebElement refreshTable;

@FindBy(how=How.XPATH, using="//table[@id='dynamictable']/tr")
public List<WebElement> tableRows;

@FindBys({
            @FindBy(id = "dynamictable"),
            @FindBy(tagName = "tr")
    })
    public List<WebElement> rows;

@FindBys({
            @FindBy(id = "dynamictable"),
            @FindBy(tagName = "tr"),
            @FindBy(tagName = "td")
    })
    public List<WebElement> cols;


}
