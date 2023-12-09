package pattern.pagebject.selenide;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchPageLocators {

    ElementsCollection tittleOfAllProducts = $$(byXpath("//span[@class='goods-tile__title']"));

}