package lesson26;

import init.InitialWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class TestUploadExample extends InitialWebDriver{

    @Test
    public void testUpload() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement uploadElement = driver.findElement(By.id("file-upload"));
        WebElement uploadBtn = driver.findElement(By.id("file-submit"));

        uploadElement.sendKeys("/Users/autodoc/IdeaProject/Autodoc_courses/somefile.txt");

        uploadBtn.click();

        sleep(5000);
    }
}
