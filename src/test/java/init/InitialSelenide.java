package init;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

public class InitialSelenide {

    @BeforeTest
    public void before() {
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--user-agent=some user agent");
        Configuration.browserSize = "1280x720";
        Configuration.browserPosition = "0x0";
        Configuration.timeout = 10000;
        Configuration.browserCapabilities = options;
    }
}