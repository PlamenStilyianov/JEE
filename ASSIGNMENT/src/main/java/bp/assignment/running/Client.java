package bp.assignment.running;

import bp.assignment.services.UserService;
import bp.assignment.services.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: plamen
 */

public final class Client {

    private static final ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");

    private static final QName SERVICE_NAME = new QName("http://running.assignment.bp/", "UserService");
    private static final QName PORT_NAME = new QName("http://running.assignment.bp/", "UserServicePort");

    private Client() {
    }

    public static void main(String args[]) throws Exception {
        Service service = Service.create(SERVICE_NAME);
        // Endpoint Address
        String endpointAddress = "http://localhost:9000/userService";
        // If web service deployed on Tomcat (either standalone or embedded)
        // as described in sample README, endpoint should be changed to:
        // String endpointAddress = "http://localhost:8080/bp_assignment/services/user_service";

        // Add a port to the Service
        service.addPort(PORT_NAME, SOAPBinding.SOAP11HTTP_BINDING, endpointAddress);

        UserService userService = service.getPort(UserService.class);

        UserService serviceImpl = (UserServiceImpl) ctx.getBean("userServiceImpl");

        serviceImpl.addUser("Plamen", 45);
        serviceImpl.addUser("Pano", 40);
        serviceImpl.addUser("Serge", 67);
        serviceImpl.addUser("Mark", 40);

        System.out.println("The eldest person is: " + userService.findOldestUser());


        System.out.println("User average age: " + userService.averageAge());

        List<String> users = userService.findUsers(40);

        for(String u : users)
            System.out.println( "User on age 45 is: " + u);
    }
}
