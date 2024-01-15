package testpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import endPoints.UserEndpoints;
import io.restassured.response.Response;
import pojo.PojoClass;

public class Test1 {
	String actualId;


	@Test
public void getUserId() {
	
	
	 PojoClass u1 =new PojoClass();
	    
	 u1.setName("rajesh");
		u1.setEmail("rajesh12443@gmail.com");
		u1.setGender("male");
		u1.setStatus("active");
		
	Response rs=UserEndpoints.postUser(u1);	
	
              actualId  =rs.getBody().jsonPath().getString("id");
               
         Assert.assertEquals(rs.getStatusCode(),201);
}


   @Test
   public void tc1(){
        System.out.println(actualId);
          Response rs=UserEndpoints.DeleteUser(actualId);	  
        
           rs.then().statusCode(204);

      }

}
