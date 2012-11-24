package net.mklew.rest;

import com.sun.jersey.spi.resource.Singleton;
import net.mklew.demo.Hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Marek Lewandowski <marek.m.lewandowski@gmail.com>
 * @since 10/12/12
 *        Time: 5:18 AM
 */
@Singleton
@Path("/hello")
public class HelloRest
{
    private final Hello helloBean;

    public HelloRest(Hello helloBean)
    {
        this.helloBean = helloBean;
    }

    // This method is called if TEXT_PLAIN is request
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayPlainTextHello() {
        return "Hello Jersey";
    }

    // This method is called if XML is request
    @GET
    @Produces(MediaType.TEXT_XML)
    public String sayXMLHello() {
        return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
    }

    // This method is called if HTML is request
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String sayHtmlHello() {
        return "<html> " + "<title>" + "Hello Jersey" + "</title>"
                + "<body><h1>" + "Hello Jersey" + "</body></h1>" + "<h2>"+helloBean.sayHello()+"</h2>" + "</html> ";
    }

}
