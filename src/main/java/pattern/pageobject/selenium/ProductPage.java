package pattern.pageobject.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    By tittleOfProduct = By.xpath("//div[@class='product__heading']/h1");
    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTittleText() {
        return driver.findElement(tittleOfProduct).getAttribute("innerText");
    }

}