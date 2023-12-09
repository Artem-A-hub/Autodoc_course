package lesson29;

import com.codeborne.selenide.ElementsCollection;
import org.testng.annotations.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$$;

public class SelenideCollectionsExample {

    @Test
    public void testCollections() {
        ElementsCollection sideMenu = $$(byXpath("//a[@class='menu-categories__link']"));
        int collectionSize = sideMenu.size();
        System.out.println(collectionSize);

        sideMenu.shouldHave(size(16));

        String text = sideMenu.get(1).getText();
        System.out.println(text);

        ElementsCollection filterCollection = sideMenu.filterBy(text("Товары для геймеров"));
        System.out.println(filterCollection.size());

    }
}