import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;
 
@Path("")
public class Home {
  @GET
  @Produces("application/json")
  public Response convertFtoC() throws JSONException {
    String result = "use /ctofservice/35 to convert 35 Celsius to Fahrenheit \n\nother services include \n\nftocservice\nctokservice";
    return Response.status(200).entity(result).build();
  }

}
