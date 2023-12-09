package lesson29;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestAddingToBasket {

    private SoftAssert softAssert = new SoftAssert();
    final String EXPECTED_PRODUCT_QUANTITY = "1";

    @Test
    public void testAddingToBasket() {
        open("https://rozetka.com.ua/");
        $(byXpath("//ul[contains(@class, 'menu-categories_type_main')]/li[1]"))
                .click();
        $(byXpath("(//a[contains(@href, 'c80004/')])[1])"))
                .click();
        $(byXpath("(//button[contains(@class, 'buy-button')])[1]"))
                .shouldBe(Condition.visible, Duration.ofSeconds(5))
                .click();
        SelenideElement tittleOfFirstProduct = $(byXpath("//a[@class='cart-product__title']"));
        String textOfTittleOfFirstProduct = tittleOfFirstProduct.attr("innerText");

        SelenideElement basketCounter = $(byXpath("//span[contains(@class, 'badge badge')]"));
        String numFromBasketCounter = basketCounter.attr("innerText");
        softAssert.assertEquals(numFromBasketCounter, EXPECTED_PRODUCT_QUANTITY);
        basketCounter.click();
        String textOfTittleInBasket = $(byXpath("//a[@class='cart-product__title']"))
                .attr("innerText");
        softAssert.assertEquals(textOfTittleInBasket, textOfTittleOfFirstProduct);
        softAssert.assertAll();
    }
}