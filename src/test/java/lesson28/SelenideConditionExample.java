package lesson28;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class SelenideConditionExample {

    @Test
    public void testSelenideCondition() {
        open("https://rozetka.com.ua/");
        $(By.name("search")).setValue("Mac");
        $(By.xpath("//button[contains(@class, 'search-form__submit')]"))
                .shouldBe(Condition.visible, Duration.ofSeconds(3))
                .shouldHave(Condition.text("Найти"), Duration.ofSeconds(20))
                .shouldNotHave(Condition.text("Alex"))
                .click();
        sleep(5000);

    }
}