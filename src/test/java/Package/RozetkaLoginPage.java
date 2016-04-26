package Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Admin on 21.04.2016.
 */
public class RozetkaLoginPage {
    WebDriver driver;
    String baseUrl="https://my.rozetka.com.ua/signin/";

  @FindBy(xpath="//*[@id=\"signin_form\"]/div[1]/input")
    WebElement userEmail;

    @FindBy(xpath="//*[@id=\"signin_form\"]/div[2]/input")
    WebElement userPassword;

    @FindBy(xpath="//*[@id=\"signin_form\"]/div[3]/button/span")
    WebElement submit;

    @FindBy(xpath="//*[@id=\"header_user_menu_parent\"]/a")
    WebElement userNameLink;

    public RozetkaLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        driver.get(baseUrl);
        driver.manage();
    }

    public RozetkaLoginPage(WebElement userNameLink) {
        this.userNameLink = userNameLink;
    }

    public void Login(String userName, String password){
        //driver.get(baseUrl);
        userEmail.sendKeys(userName);
        userPassword.sendKeys(password);
        submit.click();
    }

    public boolean checkUserNameAfterLogin(String expectedUserName){
        System.out.println("Checking username...");
        String actualUserName=userNameLink.getText();
        System.out.println("Actual username" + actualUserName);
        System.out.println("Expected username" + expectedUserName);
        if(expectedUserName.equalsIgnoreCase(actualUserName)) {
            System.out.println("Expected username = actual username");
            return true;
        }
        return false;
    }

}
