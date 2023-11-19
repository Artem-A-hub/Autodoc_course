/*ДЗ. Сохранение тайтлов товаров и цен в Маp и маппинг в txt
1. Перейти на https://rozetka.com.ua/
2. В сайд меню перейти в раздел Ноутбуки и компьютеры
3. Перейти в категорию Ноутбуки
4. На странице поисковой выдачи собрать все тайтлы(название товаров) и цены товаров. (60 штук)
5. Записать их в Map.
6. С помощью FileWriter записать данные с Map в файл rozetkaTest.txt (Пример ОЖ результат: Ноутбук Acer Nitro 5 AN515-57-54K7 (NH.QESEU.003) Shale Black - 32 999)*/

package homework24;

import init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Rozetka2 extends WebDriverInit {
    @Test
    public void RozetkaBuyProduct() {
        // Шаг 1: Открыть https://rozetka.com.ua/
        driver.manage().window().maximize(); // разворачивает окно браузера на весь экран
        driver.get("https://rozetka.com.ua/");
        // Шаг 2: Перейти в раздел «Компьютеры и ноутбуки»
        WebElement computersLink = webDriverWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("(//div/ul/li//a[@class='menu-categories__link'])[1]")));
        computersLink.click();
        // Шаг 3: Перейти в раздел «Ноутбуки»
        WebElement laptopsLink = webDriverWait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[@class='tile-cats__picture ng-star-inserted' and contains(@title, 'Ноутбуки')]")));
        laptopsLink.click();
        // Шаг 4: На странице поисковой выдачи собрать все тайтлы(название товаров) и цены товаров. (60 штук)
        List<WebElement> productElements = webDriverWait.until(
                ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div//span[@class='goods-tile__title']")));
        Map<String, String> productDetails = new HashMap<>();

        for (WebElement productElement : productElements) {
            String title = productElement.getText();
            WebElement priceElement = productElement.findElement(By.xpath("./ancestor::div[@class='goods-tile__inner']//span[@class='goods-tile__price-value']"));
            String price = priceElement.getText();
            productDetails.put(title, price);
        }

        // Шаг 5: Записать их в Map
        writeProductDetailsToFile(productDetails, "src/test/java/homework24/result.txt");
    }

    private void writeProductDetailsToFile(Map<String, String> productDetails, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            // Шаг 6: С помощью FileWriter записать данные с Map в файл
            for (Map.Entry<String, String> entry : productDetails.entrySet()) {
                writer.write(entry.getKey() + " - " + entry.getValue() + "\n");
            }
            System.out.println("Данные успешно записаны в файл " + fileName);
        } catch (IOException e) {
            System.err.println("Ошибка при записи данных в файл " + fileName);
            e.printStackTrace();
        }
    }
}
