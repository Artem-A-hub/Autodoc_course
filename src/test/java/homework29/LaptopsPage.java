package homework29;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LaptopsPage {

    public static void addFirstProductToCart() {
        $(By.xpath("(//div//button[@class='buy-button goods-tile__buy-button ng-star-inserted' and @type='button'])[1]")).click();
    }
}




