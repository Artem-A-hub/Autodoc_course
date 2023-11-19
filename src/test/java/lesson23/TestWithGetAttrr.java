package lesson23;

import init.InitialWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWithGetAttrr extends InitialWebDriver {

    final String EXPECTED_TITTLE = "Ноутбук Apple MacBook Air 13\" M1 8/256GB 2020 (MGN63) Space Gray";

    @Test
    public void firstTest() {
        driver.get("https://rozetka.com.ua/");
        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.sendKeys("Mac");
        WebElement btnSearch = driver.findElement(
                By.xpath("//button[contains(@class, 'search-form__submit')]"));
        btnSearch.click();
        WebElement tittleOfFirstProduct = driver.findElement(
                By.xpath("(//span[@class='goods-tile__title'])[1]"));
        tittleOfFirstProduct.click();
        WebElement tittleOnProductPage = driver.findElement(
                By.xpath("//div[@class='product__heading']/h1"));
        String tittleOnProductPageText = tittleOnProductPage.getAttribute("innerText");
        Assert.assertEquals(tittleOnProductPageText, EXPECTED_TITTLE, "Titles doesn’t equals");
    }
}