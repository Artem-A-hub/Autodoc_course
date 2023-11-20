package lesson25;

import init.InitialWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class TestIsSelected extends InitialWebDriver {

    @Test
    public void testIsSelected() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        WebElement loginBtn = driver
                .findElement(By.xpath("(//button[contains(@class, 'header__button')])[2]"));
        loginBtn.click();

        WebElement rememberCheckBoxInput = driver.findElement(By.id("remember_me"));
        WebElement rememberCheckBox = driver
                .findElement(By.xpath("//label[@class='auth-modal__remember-checkbox']"));

        System.out.println(rememberCheckBoxInput.isSelected());

        rememberCheckBox.click();

        System.out.println(rememberCheckBoxInput.isSelected());

        sleep(5000);
    }
}