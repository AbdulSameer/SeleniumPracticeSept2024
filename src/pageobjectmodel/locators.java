package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class locators {
    public locators() {
        PageFactory.initElements(Base.driver, this);
    }
    @FindBy(xpath = "//span[@data-cy='closeModal']")
    WebElement close;


}
