
package init;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class InitialWebDriver {

    public WebDriver driver;
    public WebDriverWait webDriverWait;

    @BeforeClass
    public void initBefore() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        //Отключает уведомления в браузере.
        options.addArguments("--disable-notifications");

        //Отключает блокировку всплывающих окон.
        options.addArguments("--disable-popup-blocking");

        //Отключает инфобары Chrome (например, "Chrome is being controlled by automated test software").
        options.addArguments("--disable-infobars");

        // Эта опция позволяет управлять некоторыми функциями, связанными с автоматизацией,
        // и ее использование может помочь предотвратить обнаружение автоматизированных средств веб-тестирования
        options.addArguments("--disable-blink-features=AutomationControlled");

        //Запускает браузер в режиме без графического интерфейса (headless mode).
//        options.addArguments("--headless");

        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @AfterClass
    public void after() {
        driver.quit();
    }

}