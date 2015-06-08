
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;
 
@Path("/ctokservice")
public class CtoKService {
  @GET
  @Produces("application/json")
  public Response convertCtoF() throws JSONException {

    JSONObject jsonObject = new JSONObject();
  
    Double celsius = 36.8;
    Double kelvin = celsius +275;

    jsonObject.put("C Value", celsius);
    jsonObject.put("K Value", kelvin); 

    String result = "@Produces(\"application/json\") Output: \n\nC to K Converter Output: \n\n" + jsonObject;
    return Response.status(200).entity(result).build();
  }
 
  @Path("{ck}")
  @GET
  @Produces("application/json")
  public Response convertCtoKfromInput(@PathParam("ck") float c) throws JSONException {
    JSONObject jsonObject = new JSONObject();
    
    float fahrenheit;
    float celsius = c;
    float kelvin = celsius + 275;
  
    jsonObject.put("C Value", celsius);
    jsonObject.put("K Value", kelvin); 
    
    String result = "@Produces(\"application/json\") Output: \n\nC to K Converter Output: \n\n" + jsonObject;
    return Response.status(200).entity(result).build();
  }
}
