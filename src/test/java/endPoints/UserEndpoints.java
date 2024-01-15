package endPoints;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojo.PojoClass;
public class UserEndpoints {

	public static  Response postUser(PojoClass u) {
	Response rs=	given()
		.accept("application/json")
		.contentType(ContentType.JSON)
		.header("Authorization", "Bearer f894ea6ee14fb2ad3e8bf6962b4a2362776df5af1ddfe73a415429fec43a5e99")
		 .body(u)
		.when()
		 .post("https://gorest.co.in/public/v2/users");
		 
	return rs;	
	}
	
	public static Response DeleteUser(String id) {
		Response rs=	given()
				.accept("application/json")
				.contentType(ContentType.JSON)
				.header("Authorization", "Bearer f894ea6ee14fb2ad3e8bf6962b4a2362776df5af1ddfe73a415429fec43a5e99")
				
				
				.when()
				 .delete("https://gorest.co.in/public/v2/users" +"/"+id);
				 
			return rs;	}

}
