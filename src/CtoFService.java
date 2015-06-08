
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;
 
@Path("/ctofservice")
public class CtoFService {
//	@GET
//	@Produces("application/xml")
//	public String convertCtoF() {
// 
//	  Double fahrenheit;
//		Double celsius = 36.8;
//		fahrenheit = ((celsius * 9) / 5) + 32;
// 
//		String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
//		return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
//	}
	@GET
	@Produces("application/json")
	public Response convertCtoF() throws JSONException {

	  JSONObject jsonObject = new JSONObject();
	
	  Double fahrenheit;
	  Double celsius = 36.8;
	  fahrenheit = ((celsius * 9) / 5) + 32;

	  jsonObject.put("C Value", celsius);
	  jsonObject.put("F Value", fahrenheit); 

		String result = "@Produces(\"application/json\") Output: \n\nC to F Converter Output: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
	}
 
//	@Path("{c}")
//	@GET
//	@Produces("application/xml")
//	public String convertCtoFfromInput(@PathParam("c") Double c) {
//		Double fahrenheit;
//		Double celsius = c;
//		fahrenheit = ((celsius * 9) / 5) + 32;
// 
//		String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
//		return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
//	}
	@Path("{cf}")
	@GET
	@Produces("application/json")
	public Response convertCtoFfromInput(@PathParam("c") float c) throws JSONException {
		JSONObject jsonObject = new JSONObject();
		float celsius;
		float fahrenheit;
		celsius = c;
		fahrenheit = ((celsius * 9) / 5) + 32;
	
		jsonObject.put("C Value", celsius);
    jsonObject.put("F Value", fahrenheit); 
    
		String result = "@Produces(\"application/json\") Output: \n\nC to F Converter Output: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
	}
}
