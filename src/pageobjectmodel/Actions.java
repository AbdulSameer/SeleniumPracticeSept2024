package pageobjectmodel;

import org.openqa.selenium.support.PageFactory;

public class Actions {

        locators l = new locators();
        public  Actions(){
            PageFactory.initElements(Base.driver,l);
        }

        public void close(){
            l.close.click();
        }
}
