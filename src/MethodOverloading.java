import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.chrome.ChromeOptions;

public class MethodOverloading {
    public String emp_details(){
        String name = "sameer";
        System.out.println(name);
        return name;
    }
    public int emp_details(int salary){
        System.out.println(salary);
        return salary;
    }
    public static void main(String args[]){
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.emp_details();
        methodOverloading.emp_details(200000);
    }
}
