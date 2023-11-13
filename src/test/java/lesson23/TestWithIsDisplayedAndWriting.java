package lesson23;

import init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.FileWriter;
import java.io.IOException;

public class TestWithIsDisplayedAndWriting extends WebDriverInit {

    final String EXPECTED_LABEL_COLOR = "rgba(0, 160, 70, 1)";

    @Test
    public void firstTest() throws IOException {
        driver.get("https://rozetka.com.ua/");
        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.sendKeys("Mac");
        WebElement btnSearch = driver.findElement(
                By.xpath("//button[contains(@class, 'search-form__submit')]"));
        btnSearch.click();
        WebElement tittleOfFirstProduct = driver.findElement(
                By.xpath("(//span[@class='goods-tile__title'])[1]"));
        tittleOfFirstProduct.click();
        WebElement inStockLabel = driver.findElement(
                By.xpath("//p[contains(@class, 'status-label--green')]"));
        String colorOfInStockLabel = inStockLabel.getCssValue("color");
        WebElement price = driver.findElement(By.xpath("//p[@class='product-price__big']"));
        if (inStockLabel.isDisplayed() && colorOfInStockLabel.equals(EXPECTED_LABEL_COLOR)) {
            FileWriter fileWriter = new FileWriter("lesson23.txt");
            fileWriter.write(tittleOfFirstProduct.getText() + " " + price.getAttribute("innerText"));
            fileWriter.close();
        }
    }
}