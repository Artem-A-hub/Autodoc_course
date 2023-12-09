package homework29;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class CartPage {

    final String EXPECTED_COUNT = "1";
    final String EXPECTED_TITLE = "Ноутбук Lenovo IdeaPad Slim 3 15AMN8 (82XQ009HRA) Arctic Grey / 15.6\" IPS Full HD / AMD Ryzen 5 7520U / RAM 16 ГБ / SSD 512 ГБ";

    public static void checkCartCount() {
        $(By.xpath("//div//span[@class='badge badge--green ng-star-inserted' and contains(., '1')]")).shouldHave(text("1"));
    }

    public static void goToCart() {
        $(By.xpath("//div//button[@class='header__button ng-star-inserted header__button--active']")).click();
    }

    public static void checkTitleProduct() {
        $(By.xpath("//div[@class='cart-product__body']//a[@class='cart-product__title'][1]")).shouldHave(text("Ноутбук Lenovo IdeaPad Slim 3 15AMN8 (82XQ009HRA) Arctic Grey / 15.6\" IPS Full HD / AMD Ryzen 5 7520U / RAM 16 ГБ / SSD 512 ГБ"));
    }
}