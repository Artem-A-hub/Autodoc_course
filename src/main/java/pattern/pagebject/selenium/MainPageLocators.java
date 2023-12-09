package pattern.pagebject.selenium;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MainPageLocators {

    protected By inputSearch = By.name("search");
    protected By btnSearch = By.xpath("//button[contains(@class, 'search-form__submit')]");

    protected By computersAndLaptopsLink = By.xpath("//div/ul/li//a[@class='menu-categories__link'][1]");

    protected By laptopsLink = By.xpath("//a[@class='tile-cats__picture ng-star-inserted' and contains(@title, 'Ноутбуки')]");

    protected By addFirstProductToCart = By.xpath("//div//button[@class='buy-button goods-tile__buy-button ng-star-inserted' and @type='button'])[1]");

    protected By actualCountInCartHeader = By.xpath("//div//button[@class='header__button ng-star-inserted header__button--active']");

    protected By actualProductTitleInBasket = By.xpath("//div[@class='cart-product__body']//a[@class='cart-product__title'][1]");

    protected By goToCart = By.xpath("//div//button[@class='header__button ng-star-inserted header__button--active']");

    SelenideElement laptopSubCategory = $(byXpath("(//a[contains(@href, 'c80004/')])[1]"));

}