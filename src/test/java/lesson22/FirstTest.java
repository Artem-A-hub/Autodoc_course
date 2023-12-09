package lesson22;

/*import io.github.bonigarcia.wdm.WebDriverManager;*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstTest {
    private WebDriver driver;
    private WebDriverWait webDriverWait;

    final String EXPECTED_TITTLE = "Ноутбук Apple MacBook Air 13 M1 8/256GB 2020 (MGN63) Space Gray";

    @BeforeTest
    public void initDriver() {
/*        WebDriverManager.chromedriver().setup();*/
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void firstTest() {
        driver.get("https://rozetka.com.ua/");
        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.sendKeys("Mac");
        WebElement btnSearch = driver.findElement(
                By.xpath("//button[contains(@class, 'search-form__submit')]"));
        btnSearch.click();
        WebElement tittleOfFirstProduct = driver.findElement(
                By.xpath("(//rz-grid//span[@class='goods-tile__title'])[1]"));
        String tittle = tittleOfFirstProduct.getText().trim();

//        if (tittle.contains("Mac")) {
//            System.out.println("Title contains searching data");
//        } else {
//            Assert.fail("Title doesn't contains searching data");
//        }

        Assert.assertEquals(tittle, EXPECTED_TITTLE, "Title doesn't contains searching data");
    }

    @AfterTest
    public void after() {
        driver.quit();
    }

}