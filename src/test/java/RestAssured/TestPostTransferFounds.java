package RestAssured;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class TestPostTransferFounds {
    String customerId = "12545";
    String fromAccountId = "13788";
    String toAccountId = "13677";
    String amount = "50";
    String url = "https://parabank.parasoft.com/parabank/services_proxy/bank/transfer?fromAccountId="+fromAccountId+"&toAccountId="+toAccountId+"&amount="+amount;
    Response response =
            given()
                    .auth()
                    .basic("sera02", "123456")
                    .when()
                    .post(url);
    @Test
    public void test01() {
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeader("content-type"));
        System.out.println(response.getTime());
    }
}
