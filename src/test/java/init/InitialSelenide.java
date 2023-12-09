package init;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

public class InitialSelenide {

    protected WebDriver driver;
    @BeforeTest
    public void before() {
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--user-agent=some user agent");
        Configuration.browserSize = "1280x720";
        Configuration.browserPosition = "0x0";
        Configuration.timeout = 10000;
        Configuration.browserCapabilities = options;
    }
    public void changeCFCookie(String value){
        Cookie cookie = new Cookie("cf_clearance",value);
        driver.manage().deleteCookieNamed("cf_clearance");
        driver.manage().addCookie(cookie);
        driver.navigate().refresh();
    }
}