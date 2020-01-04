import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestNG {

    @Test
    public void myTestMethod() {
        System.out.println("Inside method:- myTestMethod");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\maheshkannan\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.seleniumframework.com/Practiceform/");
        String title = driver.getTitle();
        System.out.println(title);

        driver.quit();
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This piece of code is executed before method:- myTestMethod");
        System.setProperty("webdriver.gecko.driver", "C:UsersVardhanworkspaceSeleniumProjectfilesgeckodriver.exe");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This piece of code is executed after method:- myTestMethod");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("This piece of code is executed before the class is executed");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("This piece of code is executed after the class is executed");
    }

}

