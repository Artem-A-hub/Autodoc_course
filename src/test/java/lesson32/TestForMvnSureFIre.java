package lesson32;

import io.qameta.allure.*;
import lessons.lesson32.SomeClassForAllureStep;
import org.testng.annotations.Test;

public class TestForMvnSureFIre {

    @Test
    @Owner("Alex")
    @Description("Test check something")
    @Severity(SeverityLevel.NORMAL)
    public void testSurefirePlugin() {
        System.out.println("Message for test");
        SomeClassForAllureStep someClassForAllureStep = new SomeClassForAllureStep();
        someClassForAllureStep.open("Google");
        someClassForAllureStep.someMethod("Alex");
    }
}