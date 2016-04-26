package Test;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import setUp.SetUp;

/**
 * Created by Admin on 19.04.2016.
 */
public class rozetkaLogin {
    WebDriver driver;
    String expectedUserName="testjavaqa";
    String userEmail="";
    String baseUrl="https://my.rozetka.com.ua/signin/";
    WebElement inputLogin;
    WebElement inputPassword;
    WebElement submit;
    String expectedUserElement;
    String userNameActual;

    @Before
    public void setUp(){
//        driver=new FirefoxDriver();
//        driver.get(baseUrl);
        SetUp setUp=new SetUp();
        driver=setUp.getDriver();
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void rozetkaLogin() throws InterruptedException {
//        inputLogin=driver.findElement(By.xpath("//*[@id=\"signin_form\"]/div[1]/input"));
//        inputPassword=driver.findElement(By.xpath("//*[@id=\"signin_form\"]/div[2]/input"));
//        submit=driver.findElement(By.xpath("//*[@id=\"signin_form\"]/div[3]/button/span"));
//        inputLogin.sendKeys("galiusik.ok@bigmir.net");
//        Thread.sleep(1000);
//        inputPassword.sendKeys("Galiusik0201");
//        Thread.sleep(1000);
//        submit.click();
//        Thread.sleep(1000);
        //Assert.assertTrue(userNameActual.equalsIgnoreCase(expectedUserElement));
//this is git
        //comment
        RozetkaLoginPage LoginPage=new RozetkaLoginPage(driver);
        LoginPage.Login(userEmail, userPassword);
        Assert.assertTrue(LoginPage.checkUserName);

    }
}
