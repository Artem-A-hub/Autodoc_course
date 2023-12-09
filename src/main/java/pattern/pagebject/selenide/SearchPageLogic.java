package pattern.pagebject.selenide;

import com.codeborne.selenide.CollectionCondition;

import java.time.Duration;

public class SearchPageLogic extends SearchPageLocators {

    public SearchPageLogic checkQuantityOfGoodsTittles(int tittleAmount) {
        tittleOfAllProducts
                .shouldBe(CollectionCondition.size(tittleAmount), Duration.ofSeconds(10));
        return this;
    }
}