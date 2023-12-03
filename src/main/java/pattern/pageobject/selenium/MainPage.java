package pattern.pageobject.selenium;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MainPage extends pattern.pageobject.selenium.MainPageLocators implements ICartPage {

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage checkingCart(WebDriver driver) {
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

    public pattern.pageobject.selenium.SearchPage clickBtnSearch() {
        driver.findElement(btnSearch).click();
        return new pattern.pageobject.selenium.SearchPage(driver);
    }

    public MainPage navigateToComputersAndLaptops() {
        driver.findElement(computersAndLaptopsLink).click();
        return this;
    }

    public MainPage navigateToLaptops() {
        driver.findElement(laptopsLink).click();
        return this;
    }

    public MainPage addFirstProductToCart() {
        driver.findElement(addFirstProductToCart).click();
        return this;
    }

    public MainPage checkCountBasketInHeader() {
        driver.findElement(actualCountInCartHeader).click();
        return this;
    }

    public MainPage clickGoToCart() {
        driver.findElement(goToCart).click();
        return this;
    }

    public String checkAddedProduct(WebDriver driver, String expectedProductTitle) {
        String actualProductTitle = driver.findElement(actualProductTitleInBasket).getText();
        Assert.assertEquals(actualProductTitle, expectedProductTitle);
        return actualProductTitle;
    }
}