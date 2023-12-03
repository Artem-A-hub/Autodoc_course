package pattern.factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.By.xpath;

public class MainPage {

    @FindBy(className = "search")
    private WebElement inputSearch;

    @FindBy(xpath = "//button[contains(@class, 'search-form__submit')]")
    private WebElement btnSearch;
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public MainPage typeTextInInputSearch(String text) {
        inputSearch.sendKeys(text);
        return this;
    }

    public MainPage clearOfInputSearch() {
        inputSearch.clear();
        return this;
    }

    public SearchPage clickBtnSearch() {
        btnSearch.click();
        return new SearchPage(driver);
    }
}