package init;

/*import io.github.bonigarcia.wdm.WebDriverManager;*/
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class WebDriverInit {

    protected WebDriver driver;
    protected WebDriverWait webDriverWait;

    @BeforeTest
    public void initDriver() {
/*      WebDriverManager.chromedriver().setup();*/
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @AfterTest
    public void after() {
        driver.quit();
    }

    public void changeCFCookie(String value){
        Cookie cookie = new Cookie("cf_clearance",value);
        driver.manage().deleteCookieNamed("cf_clearance");
        driver.manage().addCookie(cookie);
        driver.navigate().refresh();
    }

}