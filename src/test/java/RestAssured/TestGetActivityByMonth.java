package RestAssured;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class TestGetActivityByMonth {
    String accountId = "13677";
    String url = "https://parabank.parasoft.com/parabank/services_proxy/bank/accounts/"+accountId+"/transactions/month/All/type/All";
    Response response =
            given()
                    .auth()
                    .basic("sera02", "123456")
                    .when()
                    .get(url);
    @Test
    public void test01() {
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeader("content-type"));
        System.out.println(response.getTime());
    }
}
