/*
1. Открыть браузер и ввести URL: https://rozetka.com.ua/.
2. Нажать на кнопку “Логин“.
3. В открывшемся попапе нажать на кнопку “Зарегистрироваться“.
4. Нажать на пользовательское соглашение (гиперссылка).
5. После нажатия на пользовательское соглашение, удостовериться, что тайтл в открывшейся вкладке имеет следующий текст: “Угода користувача | ROZETKA”.
6. Проверить, что на странице присутствует текст “Как удалить аккаунт?” и он отображается на странице.
Доп. условие: В тесте должно быть 3 ассерта
*/

package homework25;

import init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.Set;
import java.util.List;

public class Rozetka3 extends WebDriverInit {

    final String EXPECTED_TITLE = "Положення про обробку і захист персональних даних | ROZETKA";
    final String EXPECTED_TITLE2 = "Захист персональних даних.";

    @Test
    public void RozetkaLinks() throws InterruptedException {
        // Шаг 1: Открыть https://rozetka.com.ua/
        driver.manage().window().maximize(); // разворачивает окно браузера на весь экран
        driver.get("https://rozetka.com.ua/");

        // Шаг 2: Нажать на кнопку “Логин“.
        WebElement loginBtn = driver.findElement(
                By.xpath("(//button[contains(@class, 'header__button')])[2]"));
        loginBtn.click();

        // Шаг 3: В открывшемся попапе нажать на кнопку “Зарегистрироваться“.
        WebElement registrationLink = driver.findElement(
                By.xpath("(//button[contains(@class, 'auth-modal__register-link')])"));
        registrationLink.click();

        // Шаг 4: Нажать на пользовательское соглашение (гиперссылка)
        WebElement privacyPolicyLink = driver.findElement(
                By.xpath("//a[@class='button button_type_link']"));
        privacyPolicyLink.click();

        // Переключение на новую вкладку
        Set<String> handles = driver.getWindowHandles();
        List<String> listHandles = new ArrayList<>(handles);
        driver.switchTo().window(listHandles.get(1));

        // Шаг 5: Удостовериться, что тайтл в открывшейся вкладке имеет следующий текст: “Положення про обробку і захист персональних даних | ROZETKA' не отображается на странице”.
        // Проверка отображения текста в коде страницы
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, EXPECTED_TITLE, "Тайтл не совпадает");

        // Проверка отображения текста на странице
        WebElement agreementText = driver.findElement(
                By.xpath("//h3//strong[contains(text(), 'Положення про обробку і захист персональних даних')]"));
        String actualTitleOnPage = agreementText.getText();
        Assert.assertEquals(actualTitleOnPage, EXPECTED_TITLE, "'Положення про обробку і захист персональних даних | ROZETKA' не отображается на странице");

        // Шаг 6: Проверить, что на странице присутствует текст “Захист персональних даних.” и он отображается на странице.
        WebElement dataAccountText = driver.findElement(
                By.xpath("//li//p//strong[contains(text(), 'Захист персональних даних.')]"));
        Assert.assertTrue(dataAccountText.isDisplayed(), "Захист персональних даних.' отсутствует");
    }
}