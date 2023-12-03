package pattern.pageobject.selenium;

import org.openqa.selenium.WebDriver;
import pattern.pageobject.selenium.ICartPage;

public class MainPage extends pattern.pagebject.selenium.MainPageLocators implements ICartPage {

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage checkingCart(WebDriver driver){
        checkingCart(this.driver);
        return this;
    }

    public MainPage typeTextInInputSearch(String text) {
        driver.findElement(inputSearch).sendKeys(text);
        return this;
    }

    public MainPage clearOfInputSearch() {
        driver.findElement(inputSearch).clear();
        return this;
    }

    public pattern.pagebject.selenium.SearchPage clickBtnSearch() {
        driver.findElement(btnSearch).click();
        return new pattern.pagebject.selenium.SearchPage(driver);
    }
}