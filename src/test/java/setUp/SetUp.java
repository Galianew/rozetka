package setUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Admin on 21.04.2016.
 */
public class SetUp {
    WebDriver driver;

    public WebDriver getDriver(){
        //driver.quit();
        if(driver==null){
            driver=new FirefoxDriver();
        }

        return driver;
    }
}
