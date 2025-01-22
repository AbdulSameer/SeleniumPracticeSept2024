import org.testng.annotations.*;
import org.testng.annotations.Test;

public class TestNGAnnotations {
    @BeforeSuite
    public  void beforeSuit(){
        System.out.println("This is before suite method");
    }
    @BeforeTest
    public  void beforeTest(){
        System.out.println("This is before test method");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("This is before class method");
    }
    @BeforeMethod
    public  void beforeMethod(){
        System.out.println("This is before method method");
    }
    @Test
    public  void test(){
        System.out.println("This is test method");
    }
    @AfterSuite
    public  void afterSuit(){
        System.out.println("This is after suite method");
    }
    @AfterTest
    public static void afterTest(){
        System.out.println("This is after test method");
    }
    @AfterClass
    public  void afterClass(){
        System.out.println("This is after class method");
    }
    @AfterMethod
    public  void afterMethod(){
        System.out.println("This is after method method");
    }
}
