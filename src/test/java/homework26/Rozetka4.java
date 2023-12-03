/*ДЗ:
1. Перейти на https://rozetka.com.ua/
2. В сайд меню перейти в раздел Ноутбуки и компьютеры
3. Перейти в категорию Ноутбуки
4. Примерить фильтр “Продавец” Rozetka
5. Примерить фильтр “Цена” установить цену до - 100000
6. Перейти на продуктовую первого товара с плашкой “Акция”
7. Проверить что на продуктовой странице отображается плашка “Акция”*/

package homework26;

import init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static java.lang.Thread.sleep;

public class Rozetka4 extends WebDriverInit {

    String cookieValue = "yC0E9vFohPtilVZjcXmegMu6RaYyBaB8nRZ5.dEvBRI-1701112422-0-1-63416de4.ac13a8bb.34403204-0.2.1701112422";

    @Test
    public void RozetkaBuyProduct() throws InterruptedException {
        // Шаг 1: Открыть https://rozetka.com.ua/
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/ua/promo/black-friday/");
        changeCFCookie(cookieValue);        // Шаг 2: В сайд меню перейти в раздел Ноутбуки и компьютеры
        WebElement computersLink = webDriverWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[contains(@class, 'categories-filter__link-title') and contains(text(), \"Ноутбуки, планшети та комп'ютерна периферія\")]")));
        computersLink.click();
        // Шаг 3: Перейти в раздел «Ноутбуки»
        WebElement laptopsLink = webDriverWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[contains(@class, 'categories-filter__link') and text()=\"Ноутбуки\"]")));
        laptopsLink.click();
        // Шаг 4. Примерить фильтр “Продавец” Rozetka
        WebElement filterRozetka = webDriverWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[@data-filter-name='seller']//li//a[@data-id='Rozetka']")));
        filterRozetka.click();
        // Шаг 4. Примерить фильтр “Цена” установить цену до - 100000
        WebElement filterPrice = driver.findElement(
                By.xpath("//input[@type='text' and @formcontrolname='max' and contains(@class, 'slider-filter__input')]"));
        filterPrice.clear();
        filterPrice.sendKeys("10000");
        // Шаг 5. Примерить фильтр “Цена” установить цену до - 100000
        WebElement okButton = driver.findElement(
                By.cssSelector("button.slider-filter__button"));
        okButton.click();
        sleep(5000);
        // Шаг 6. Найти элемент с плашкой "Акция"
        WebElement elementWithBlackFridayLabel = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//div/span[contains(@class, 'goods-tile__label promo-label promo-label_type_action ng-star-inserted')]")));
        // Шаг 6.1 Перейти на продуктовую первого товара с плашкой "Акция"
        WebElement productWithBlackFriday = webDriverWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//rz-catalog//a[@title])[1]")));
        productWithBlackFriday.click();
        // Шаг 7. Проверить что на продуктовой странице отображается плашка “Акция” (Акция)
        WebElement blackFridayLabel = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//p[@class='product-price__small ng-star-inserted']")));
        assert blackFridayLabel.isDisplayed() : "Плашка 'Акция' не отображается на странице.";
        System.out.println("Плашка 'Акция' отображается на странице.");
    }
}