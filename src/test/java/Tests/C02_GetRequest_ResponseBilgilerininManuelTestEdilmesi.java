package Tests;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C02_GetRequest_ResponseBilgilerininManuelTestEdilmesi {
    @Test
    public void test01() {

//      1-Request Body ve endpoint hazıralma
        String url= "https://restful-booker.herokuapp.com/booking/10";

//      2. expected data hazirlama

//      3. send requst get response and save it
        Response response=given().when().get(url);

        response.prettyPrint();

        System.out.println("response.getStatusCode() = " + response.getStatusCode() +
                            "\n content type :"+ response.getContentType() +
                            "\n header server :" +response.getHeader("server") +
                            "\nStatus Line:" + response.getStatusLine()+
                            "\n response suresi :"+ response.getTime());


//      4.  do asseertion

    }
}
