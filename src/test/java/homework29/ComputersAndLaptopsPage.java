package homework29;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ComputersAndLaptopsPage {

    public static void goToLaptops() {
        $(By.xpath("//a[@class='tile-cats__picture ng-star-inserted' and contains(@title, 'Ноутбуки')]")).click();
    }
}

