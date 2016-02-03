package bp.assignment.running;

import bp.assignment.services.UserServiceImpl;

import javax.xml.ws.Endpoint;

/**
 * Created with IntelliJ IDEA.
 * User: plamen
 */
public class Server {
    protected Server() throws Exception {
        // START SNIPPET: publish
        System.out.println("Starting Server");
        UserServiceImpl implementor = new UserServiceImpl();
        String address = "http://localhost:9000/userService";
        Endpoint.publish(address, implementor);
        // END SNIPPET: publish
    }

    public static void main(String args[]) throws Exception {
        new Server();
        System.out.println("Server ready...");

        Thread.sleep(5 * 60 * 1000);
        System.out.println("Server exiting");
        System.exit(0);
    }
}
