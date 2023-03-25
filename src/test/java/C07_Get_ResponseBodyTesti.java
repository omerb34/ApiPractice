import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C07_Get_ResponseBodyTesti {

    /*
        https://jsonplaceholder.typicode.com/posts/44 url'ine bir GET request yolladigimizda,
        donen Response’in
                status code'unun 200,
                ve content type'inin Aplication.JSON,
                ve response body'sinde bulunan userId'nin 5,
                ve response body'sinde bulunan title'in "optio dolor molestias sit"
        oldugunu test edin.

     */

    @Test
    public void test01() {

// 1- send point ve request body hazırla..
    String url=  " https://jsonplaceholder.typicode.com/posts/44";// burada request body hazırlamaya gerek yok. sadece get yapıyoruz.

//   2-Expected Body olustur = verilen taskta dönen bodynin şöyle olduğunu test et demediği için bu kısmı atlıyoruz.

//   3-send de request get the request...
        Response response= given().when().get(url);
        response.prettyPrint();

//   4-Do assertion:
        response
                .then()
                .assertThat()
                .statusCode(200)
                .contentType(ContentType.JSON)// burada string olarak yukarıdaki Aplication.JSON,dayazabiirdik...
                .body("userID", Matchers.equalTo(null))
                .body("title",Matchers.equalTo("optio dolor molestias sit"));




    }
}
