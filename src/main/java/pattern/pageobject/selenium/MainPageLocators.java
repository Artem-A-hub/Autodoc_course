package pattern.pagebject.selenium;

import org.openqa.selenium.By;

public class MainPageLocators {

    protected By inputSearch = By.name("search");
    protected By btnSearch = By.xpath("//button[contains(@class, 'search-form__submit')]");
}