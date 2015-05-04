
package net.mancke.examples.dropwizard;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Consumes;

/**
 * Hello World REST demo
 *
 * @author smancke
 */
@Path("/")
public class ExampleResource {

    private ServiceConfiguration configuration;

    public ExampleResource(ServiceConfiguration configuration) {
        this.configuration = configuration;
    }

    @GET
    @Path("/hello")
    public String hello() {
    	return "Hello World!";
    }
    
    @POST
    @Path("/hello")
    @Consumes("application/json")
    public String hello(Person person) {

    	return "Hello "+ person.getName();
	
    }

    @GET
    @Path("/answer")
    public String answer() {
    	return "The answer is "+ configuration.getAnswer();
    }
}
