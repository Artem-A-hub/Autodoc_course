package lesson24;

import init.InitialWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestFindElements extends InitialWebDriver {
//    Перейти на сайт https://rozetka.com.ua/
//    Перейти в категорию Ноутбуки и компьютеры
//    Перейти в подкатегорию Ноутбуки
//    Вывести тайтлы всех товаров в консоль
//    Проверить, что в товарной выдаче на первой странице отобразилось 60 товаров

    @Test
    public void findElements() {
        driver.get("https://rozetka.com.ua/");
        WebElement laptopsAndCompCategory = driver.findElement(
                By.xpath("//ul[contains(@class, 'menu-categories_type_main')]/li[1]"));
        laptopsAndCompCategory.click();
        WebElement subCategory = driver.findElement(By.xpath("(//a[contains(@href, 'c80004/')])[1]"));
        subCategory.click();

        By tittles = By.xpath("//span[@class='goods-tile__title']");
        webDriverWait.until(ExpectedConditions.elementToBeClickable(tittles));
        List<WebElement> listOfTittles = driver.findElements(tittles);

        for (WebElement element : listOfTittles) {
            String tittleText = element.getText();
            System.out.println(tittleText);
        }

        Assert.assertEquals(listOfTittles.size(), 60, "Elements size on page doesn't equals 60");
    }
}