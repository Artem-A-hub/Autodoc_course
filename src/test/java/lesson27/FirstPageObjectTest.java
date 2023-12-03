package lesson27;

import init.InitialWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pattern.pageobject.selenium.MainPage;

public class FirstPageObjectTest extends InitialWebDriver {

    final String EXPECTED_TITTLE = "Ноутбук Apple MacBook Air 13\" M1 8/256GB 2020 (MGN63) Space Gray";
    final String URL = "https://rozetka.com.ua/ua/";

    @Test
    public void firstTest() {
        driver.get(URL);
        String actualTittle = new MainPage(driver).typeTextInInputSearch("Mac").clickBtnSearch()
                .clickOnProductTittleByIndex(0)
                .getTittleText();
        Assert.assertEquals(actualTittle, EXPECTED_TITTLE);
    }
}