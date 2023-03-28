package Tests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.put;

public class C06_Put_ResponseBilgileriAssertion {
    /*
             https://jsonplaceholder.typicode.com/posts/70 url’ine asagidaki Json formatindaki body ile bir
             PUT request gonderdigimizde

        {
            "title": "Ahmet",
            "body": "Merhaba",
            "userId": 10,
            "id": 70
        }
        donen Response’un,
            status code’unun 200,
            ve content type’inin application/json; charset=utf-8,
            ve Server isimli Header’in degerinin cloudflare,
            ve status Line’in HTTP/1.1 200 OK

     */

    @Test
    public void test01() {

//   1-end point ve request body hazirla:
        String url= "https://jsonplaceholder.typicode.com/posts/70";
        JSONObject requestBody= new JSONObject();
        requestBody.put("title","Ahmet");
        requestBody.put("body","Merhaba");
        requestBody.put("userID",10);
        requestBody.put("id",70);

//   2-Expected Body olustur = verilen taskta dönen bodynin şöyle olduğunu test et demediği için bu kısmı atlıyoruz.

//   3-send de request get the request...
     Response response=  given().contentType(ContentType.JSON)
                        .when().body(requestBody.toString())//JSON objesi ile çalıştığımız için stringe çevirdik
                        .put(url);
      /*
      Not!! yukarıda givenden sonra bir body eklememiz ve bodynin türünü belirtmemiz gerekiyor. Çünkü soruda bir put
       yaparak body gönder denmiş. Yani soruda sadece responsın sadece teknik bilgilerini test ettik.
       bodynin içeriğini sonra test edeceğiz...
       */

//   4-Do assertion:
        response
                .then()
                .assertThat()
                .statusCode(200)
                .contentType("application/json; charset=utf-8")
                .header("server","cloudflare")
                .statusLine("HTTP/1.1 200 OK");















    }
}
