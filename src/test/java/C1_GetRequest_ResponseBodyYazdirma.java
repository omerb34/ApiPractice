import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C1_GetRequest_ResponseBodyYazdirma {
    @Test
    public void get01(){

//     1-Request Body ve endpoint hazıralma
        String url= "https://restful-booker.herokuapp.com/booking/10";

//      2. expected data hazirlama

//      3. send requst get response and save it
        Response response=given().when().get(url);
        response.prettyPrint();

//      4.  do asseertion


    }

   /*
   {
    "firstname": "Eric",
    "lastname": "Brown",
    "totalprice": 265,
    "depositpaid": true,
    "bookingdates": {
        "checkin": "2015-05-18",
        "checkout": "2016-09-01"
    },
    "additionalneeds": "Breakfast"
}


    */

}
