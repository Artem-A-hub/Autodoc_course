package lesson25;

import init.InitialWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class TestProxy extends InitialWebDriver {

    private  String ipForProxy = "45.22.209.157:8888";

    @Test
    public void testProxy() throws InterruptedException {
        Proxy proxy = new Proxy();
        // Налаштування адреси та порту проксі-сервера
        proxy.setHttpProxy(ipForProxy);
        proxy.setSslProxy(ipForProxy);
        System.out.println(proxy.getSslProxy());

        ChromeOptions options = new ChromeOptions();
        options.setCapability("proxy", proxy);

        sleep(10000);
        driver.get("https://2ip.ua/ru/");
        driver.manage().deleteAllCookies();
        WebElement ip = driver.findElement(By.className("ip"));
        String ipText = ip.getText();
        System.out.println(ipText);
        driver.quit();
    }

}