package lesson19.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @DataProvider(name = "SetBrowser")
    public Object[][] myData() {
        return new Object[][]{{"autodoc.de"},
                {" autodoc.ko"},
                {"autodoc.de/tyres"}};
    }

    @Test(dataProvider = "SetBrowser")
    public void myTest(String data) {
        System.out.println("page opened on route " + data);
    }

}
