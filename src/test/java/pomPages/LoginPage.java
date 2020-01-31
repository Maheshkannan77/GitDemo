package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        //super(driver);
        this.driver =driver;

    }

    @FindBy(xpath = "//*[@id=\"lpc-header-nav\"]/div/div/div[1]/header/nav/ul[2]/li[1]/a")
    public  WebElement LoginButton;

    @FindBy(name = "usernameOrEmail")
    public  WebElement Username;

    @FindBy(name = "password")
    public  WebElement Password;

    @FindBy(id ="search-component-1")
    public  WebElement Search;

    @FindBy(xpath = "//*[@id=\"primary\"]/div/main/div/div[1]/div/form/div[1]/div[2]/button")
    public  WebElement Continue;


}
