package RestAssured;
import org.json.simple.JSONObject;
import org.junit.Test;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class TestGetRegister {
    String url = "https://parabank.parasoft.com/parabank/register.htm";
    Response response = get(url);
    @Test
    public void test01() {
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeader("content-type"));
        System.out.println(response.getTime());
    }


}
