package homework29;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private static final String URL = "https://rozetka.com.ua/";

    public static void open() {
        Selenide.open(URL);
    }

    public static void goToComputersAndLaptops() {
        $(By.xpath("(//a[contains(text(),'Компьютеры и ноутбуки')])[1]")).click();
    }
}




