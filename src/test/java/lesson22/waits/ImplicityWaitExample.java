package lesson22.waits;

import lesson21.WebDriverInteraction;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class ImplicityWaitExample {

    private WebDriver driver;
    @BeforeTest
    public void initDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeout().implicityWait(Duration.ofSeconds(10));
    }

    @Test
    public void ImplicityWaitExample(){
        driver.get("https://www.google.com.ua");
        driver.findElement(By.xpath("someElement")).click();
    }
}