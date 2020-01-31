package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import pomPages.LoginPage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class First {


    WebDriver driver;
    LoginPage loginPage;


    @Before("@Smoke")
    public void login() {
        System.out.println("Before");
        Properties properties;
        final String propertyFilePath = "D:\\Cucumber_Practice\\src\\test\\java\\configuration\\reportConfig.properties";
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
        String reportPath = properties.getProperty("reportConfigPath");
    }
    @Given("^Select the browser type \"([^\"]*)\"")
    public void Select_browser(String browser) {
        browser = browser.toUpperCase();


        switch (browser) {

            case "CHROME":

                driver = new ChromeDriver();

                break;

            case "FIREFOX":

                driver = new FirefoxDriver();

                break;

            default:

                System.out.println("Invalid browser type");

                break;

        }

    }
    @When("^Initiating page factory$")
    public void initiating_Page_Factory() {
        loginPage = PageFactory.initElements(driver,LoginPage.class);
                
    }
    @When("^Application launched in the browser$")
    public void launch_the_application_in_chrome_browser() {
        System.out.println("launch the application in chrome browser");
        driver.get("https://wordpress.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @And("Enter the \"([^\"]*)\" and \"([^\"]*)\"")
    public void enter_the(String UserName, String Password) {

        System.out.println("Enter Credentials");
        loginPage.LoginButton.click();
        loginPage.Username.sendKeys(UserName);
        loginPage.Continue.click();
        loginPage.Password.sendKeys(Password);

    }

    @And("^Click on the Login button$")
    public void click_on_the_Login_button() {
        System.out.println("Click on login button");
        loginPage.Continue.click();

    }


    @Then("^Verify the Home Page$")
    public void Verify_the_Home_Page() {

        String sTitle =driver.getTitle();
        Assert.assertEquals(sTitle,"Log In — WordPress.com");
        driver.close();

    }

    @AfterClass

        public static void writeExtentReport() {

        }

    }


