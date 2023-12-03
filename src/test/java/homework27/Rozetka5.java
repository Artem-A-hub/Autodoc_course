/*ДЗ. Тест проверки добавления товара в корзину с использованием Page Object
1. Открыть https://rozetka.com.ua/ua/
2. Перейти в раздел «Компьютеры и ноутбуки»
3. Перейти в раздел «Ноутбуки»
4. Добавить первый товар в корзину
5. Проверить что в корзину добавился один товар
6. Перейти в корзину и проверить, что добавился правильный товар*/

package homework27;
import init.InitialWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pattern.pageobject.selenium.MainPage;
public class Rozetka5 extends InitialWebDriver {

    final String EXPECTED_TITLE = "Ноутбук Lenovo IdeaPad Slim 5 16IAH8 (83BG001ARA) Cloud Grey / 16\" IPS WUXGA / Intel Core i5-12450H / RAM 16 ГБ / SSD 512 ГБ / Підсвічування клавіатури / Зарядка через Type-C";
    final String URL = "https://rozetka.com.ua/ua/";

    @Test
    public void buyFirstProduct() {
        driver.get(URL);

        MainPage mainPage = new MainPage(driver);
        mainPage.navigateToComputersAndLaptops().navigateToLaptops().addFirstProductToCart();

        new MainPage(driver).checkCountBasketInHeader();

        String actualProduct = mainPage.clickGoToCart().checkAddedProduct(driver, EXPECTED_TITLE);
        Assert.assertEquals(actualProduct, EXPECTED_TITLE);
    }
}

