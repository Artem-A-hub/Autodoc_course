package lesson31.yearSort;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;
import static lesson31.Specification.*;

public class SortedYear {

    private final String BASE_URL = "https://reqres.in/";

    @Test
    public void testSortedYear(){
        installSpec(requestSpecification(BASE_URL),
                responseSpecification(200));
        List<YearsData> yearsDataList = given()
                .when()
                .get("api/unknown")
                .then().log().all()
                .extract().body().jsonPath().getList("data", YearsData.class);

        List<String> actualYear = yearsDataList.stream().map(YearsData::getYear).collect(Collectors.toList());
        List<String> expectedYear = actualYear.stream().sorted().collect(Collectors.toList());

        Assert.assertEquals(actualYear, expectedYear);
    }
}
