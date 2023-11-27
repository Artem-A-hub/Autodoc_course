package lesson26;

import init.InitialWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class TestStatusCodeExample extends InitialWebDriver {

    final String BASE_URL = "https://the-internet.herokuapp.com/status_codes/200";
    final int EXPECTED_STATUS_CODE = 200;

    @Test
    public void testFrame() throws InterruptedException, IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(BASE_URL).openConnection();
        httpURLConnection.connect();

        int statusCode = httpURLConnection.getResponseCode();
        System.out.println(statusCode);
        Assert.assertEquals(statusCode, EXPECTED_STATUS_CODE);

    }
}