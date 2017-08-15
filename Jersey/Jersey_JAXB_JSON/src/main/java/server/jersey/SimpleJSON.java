package server.jersey;

/**
 * Created by Igor on 8/15/2017.
 */

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by marom on 27/09/16.
 */
@Path("simplejson")
public class SimpleJSON {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response  getIt() {
        JSONObject object = null;
        Response response = null;

        object = new JSONObject();

        try {
            object.put("Name", "Bryan");
            object.put("Age", "27");
        }
        catch (JSONException e)
        {

        }
        response = Response.status(Response.Status.OK).entity(object.toString()).build();
        return response;
    }

}