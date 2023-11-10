package lesson22.waits;

import lesson21.WebDriverInteraction;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicityWaitExample {

    private WebDriver driver;
    private WebDriverWait webDriverWait;

    @BeforeTest
    public void initDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void testWithImplicityWait(){
        driver.get("https://www.google.com.ua");
        WebElement someElement = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.id("someId")));
        someElement.click();

        WebElement someElement2 = driver.findElement(By.xpath("someElement2"));
        webDriverWait.until(ExplicityConditions.elementToBeClickable(someElement2));

        sleep(5000);
    }
}