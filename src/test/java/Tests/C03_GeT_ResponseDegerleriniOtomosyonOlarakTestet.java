package Tests;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C03_GeT_ResponseDegerleriniOtomosyonOlarakTestet {
    @Test
    public void test02() {

//      1-Request Body ve endpoint hazıralma
        String url= "https://restful-booker.herokuapp.com/booking/10";

//      2. expected data hazirlama

//      3. send requst get response and save it
        Response response=given().when().get(url);

        response.prettyPrint();

//      4.  Do asseertion: assertion yaapmanın bir cok yolu vardır. bunlardan birincisi then kullanmaktır..

        response
                .then()
                .assertThat()
                .statusCode(200)
                .contentType("application/json; charset=utf-8")
                .header("Server","Cowboy")
                .statusLine("HTTP/1.1 200 OK");




    }

}
//      1-Request Body ve endpoint hazıralma
//      2. expected data hazirlama
//      3. send requst get response and save it
//      4.  Do asseertion