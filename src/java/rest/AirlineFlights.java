package rest;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("flights")
//@RolesAllowed("Admin")
public class AirlineFlights {
  
  
  @GET
  @Path("/{from}/{date}/{tickets}")
  @Produces(MediaType.APPLICATION_JSON)
  public String getFlightsFrom(@PathParam("from") String from, 
          @PathParam("date") String date, @PathParam("tickets") String tickets){
      
      
      return "hej";
  }
  
  @GET
  @Path("/{from}/{to}/{date}/{tickets}")
  @Produces(MediaType.APPLICATION_JSON)
  public String getFlightsFromTo(@PathParam("from") String from, @PathParam("to") String to,
          @PathParam("date") String date, @PathParam("tickets") String tickets){
      
      
      return "hej";
  }
  
  
 
}
