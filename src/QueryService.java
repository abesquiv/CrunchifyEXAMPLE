import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;
 
@Path("/convert")
public class QueryService {
  @GET
  @Produces("application/json")
  public Response convert(@QueryParam("unit")String dept, @QueryParam("value")float value) throws JSONException {

    JSONObject jsonObject = new JSONObject();
    float c;
    float f;
    float k;
  
    if (dept.equals("C")) {
      c = value;
      k = c + 275;
      f = ((c * 9) / 5) + 32;
    }else if(dept.equals("F")){
      f = value;
      c = (f - 32)*5/9;
      k = c + 275;
    }else if(dept.equals("K")){
      k = value;
      c = k - 275;
      f = ((c * 9) / 5) + 32;
    }else{
      return convert();
    }

    jsonObject.append("F value", f);
    jsonObject.append("C value", c);
    jsonObject.append("K value", k);
    
    String result = "@Produces(\"application/json\") Output: \n\nOutput: \n\n" + jsonObject;
    return Response.status(200).entity(result).build();
  }
  @GET
  @Produces("application/json")
  public Response convert() throws JSONException {
    return Response.status(200).entity("Make sure to include unit (C,K,or F) as a quer and value as Query paramters").build();
  }

}
