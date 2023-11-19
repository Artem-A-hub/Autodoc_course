/*1. Открыть https://rozetka.com.ua/
2. Перейти в раздел «Компьютеры и ноутбуки»
3. Перейти в раздел «Ноутбуки»
4. Добавить первый товар в корзину
5. Проверить что в корзину добавился один товар (проверить в кружке на кнопке корзины)
6. Перейти в корзину
7. Проверить, что добавился правильный товар (сравнить тайтлы)*/

package homework23;

import init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Rozetka extends WebDriverInit {

    final String EXPECTED_COUNT = "1";
    final String EXPECTED_TITLE = "Ноутбук Lenovo IdeaPad 3 15IAU7 (82RK00TWRA) Arctic Grey / 15.6\" IPS Full HD / Intel Core i5-1235U / RAM 16 ГБ / SSD 512 ГБ / Підсвічування клавіатури";

    @Test
    public void RozetkaBuyProduct() {
        // Шаг 1: Открыть https://rozetka.com.ua/
        driver.manage().window().maximize(); // разворачивает окно браузера на весь экран
        driver.get("https://rozetka.com.ua/");
        // Шаг 2: Перейти в раздел «Компьютеры и ноутбуки»
        WebElement computersLink = webDriverWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//div/ul/li//a[@class='menu-categories__link'])[1]")));
        computersLink.click();
        // Шаг 3: Перейти в раздел «Ноутбуки»
        WebElement laptopsLink = webDriverWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[@class='tile-cats__picture ng-star-inserted' and contains(@title, 'Ноутбуки')]")));
        laptopsLink.click();
        // Шаг 4: Добавить первый товар в корзину
        WebElement addToCartButton = webDriverWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//div//button[@class='buy-button goods-tile__buy-button ng-star-inserted' and @type='button'])[1]")));
        addToCartButton.click();
        // Шаг 5: Проверить, что в корзину добавлен один товар
        WebElement cartCount = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div//span[@class='badge badge--green ng-star-inserted' and contains(.,'1')]")));
        String actualCount = cartCount.getText();
        Assert.assertEquals(actualCount, EXPECTED_COUNT, "Count 1 doesn’t equals");
        // Шаг 6: Перейти в корзину
        WebElement goToCartButton = driver.findElement(
                By.xpath("//div//button[@class='header__button ng-star-inserted header__button--active']"));
        goToCartButton.click();
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='cart-product__body']"))); //Добавил ожидание, т.к. "1" в значке корзины не успевает появиться
        // Шаг 7: Проверить, что добавлен правильный товар (сравнение тайтлов)
        WebElement productTitle = driver.findElement(
                By.xpath("//div[@class='cart-product__body']//a[@class='cart-product__title'][1]"));
        String actualTitle = productTitle.getText();
        Assert.assertEquals(actualTitle, EXPECTED_TITLE, "Title doesn’t equals");

        System.out.println("Товар добавлен в корзину!");
    }
}