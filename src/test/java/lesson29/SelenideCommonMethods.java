package lesson29;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.source;
import static com.codeborne.selenide.WebDriverRunner.url;

public class SelenideCommonMethods {

    @Test
    public void testCommonMethods() {
        open("https://rozetka.com.ua/");

        SelenideElement btnSearch = $(By.xpath("//button[contains(@class, 'search-form__submit')]"));
        SelenideElement btnSearchByText = $(byText("Найти"));

        String btnSearchText = btnSearch.text();
        System.out.println(btnSearchText);

        String getAttributeLocalName = btnSearch.attr("LocalName");
        System.out.println(getAttributeLocalName);

        String getCssBackgroundColor = btnSearch.getCssValue("background-color");
        System.out.println(getCssBackgroundColor);

        String currentUrl = url();
        System.out.println(currentUrl);

        String currentSource = source();
        System.out.println(currentSource);

    }

}