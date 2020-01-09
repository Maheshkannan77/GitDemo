import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SampleTest {

    public static WebDriver driver = null;
    public static WebDriverWait wait = null;

    @Parameters({"browser"})
    @Test

    public void myTestMethod(String browser) {


        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\maheshkannan\\Downloads\\chromedriver_win32\\chromedriver.exe");
            System.out.println("Hello");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new ChromeDriver();
        } else {
            Reporter.log("Invalid Browser type given in TestNG.xml");
        }


        wait = new WebDriverWait(driver, 10);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String title = driver.getTitle();
        wait.until(ExpectedConditions.titleContains("Amazon"));

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println(allLinks.size());
        for (WebElement link : allLinks) {
            System.out.print(link.getText());
        }
        System.out.println(title);

        Assert.assertEquals(title, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
        if (title.contentEquals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")) {
            System.out.println(("Title Validation passed"));
        } else {
            System.out.println("Title Validation Failed");
        }
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Sunglasses");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
        driver.close();


    }

}

