package RestAssured;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class TestPostNewAccount {
    String customerId = "12545";
    String fromAccountId ="13677";
    String URL = "https://parabank.parasoft.com/parabank/services_proxy/bank/createAccount?customerId="+customerId+"&newAccountType=1&fromAccountId="+fromAccountId;
    Response response =
            given()
                .auth()
                .basic("sera02", "123456")
                .when()
                .post(URL);

    @Test
    public void test01(){
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeader("content-type"));
        System.out.println(response.getTime());
    };
}
