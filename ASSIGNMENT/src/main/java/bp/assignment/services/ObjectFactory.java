
package bp.assignment.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the bp.assignment.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindUsers_QNAME = new QName("http://services.assignment.bp/", "findUsers");
    private final static QName _FindOldestUser_QNAME = new QName("http://services.assignment.bp/", "findOldestUser");
    private final static QName _AddUser_QNAME = new QName("http://services.assignment.bp/", "addUser");
    private final static QName _FindOldestUserResponse_QNAME = new QName("http://services.assignment.bp/", "findOldestUserResponse");
    private final static QName _FindUsersResponse_QNAME = new QName("http://services.assignment.bp/", "findUsersResponse");
    private final static QName _AddUserResponse_QNAME = new QName("http://services.assignment.bp/", "addUserResponse");
    private final static QName _AverageAgeResponse_QNAME = new QName("http://services.assignment.bp/", "averageAgeResponse");
    private final static QName _AverageAge_QNAME = new QName("http://services.assignment.bp/", "averageAge");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: bp.assignment.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AverageAge }
     * 
     */
    public AverageAge createAverageAge() {
        return new AverageAge();
    }

    /**
     * Create an instance of {@link AverageAgeResponse }
     * 
     */
    public AverageAgeResponse createAverageAgeResponse() {
        return new AverageAgeResponse();
    }

    /**
     * Create an instance of {@link AddUserResponse }
     * 
     */
    public AddUserResponse createAddUserResponse() {
        return new AddUserResponse();
    }

    /**
     * Create an instance of {@link FindUsersResponse }
     * 
     */
    public FindUsersResponse createFindUsersResponse() {
        return new FindUsersResponse();
    }

    /**
     * Create an instance of {@link FindOldestUserResponse }
     * 
     */
    public FindOldestUserResponse createFindOldestUserResponse() {
        return new FindOldestUserResponse();
    }

    /**
     * Create an instance of {@link AddUser }
     * 
     */
    public AddUser createAddUser() {
        return new AddUser();
    }

    /**
     * Create an instance of {@link FindOldestUser }
     * 
     */
    public FindOldestUser createFindOldestUser() {
        return new FindOldestUser();
    }

    /**
     * Create an instance of {@link FindUsers }
     * 
     */
    public FindUsers createFindUsers() {
        return new FindUsers();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.assignment.bp/", name = "findUsers")
    public JAXBElement<FindUsers> createFindUsers(FindUsers value) {
        return new JAXBElement<FindUsers>(_FindUsers_QNAME, FindUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindOldestUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.assignment.bp/", name = "findOldestUser")
    public JAXBElement<FindOldestUser> createFindOldestUser(FindOldestUser value) {
        return new JAXBElement<FindOldestUser>(_FindOldestUser_QNAME, FindOldestUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.assignment.bp/", name = "addUser")
    public JAXBElement<AddUser> createAddUser(AddUser value) {
        return new JAXBElement<AddUser>(_AddUser_QNAME, AddUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindOldestUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.assignment.bp/", name = "findOldestUserResponse")
    public JAXBElement<FindOldestUserResponse> createFindOldestUserResponse(FindOldestUserResponse value) {
        return new JAXBElement<FindOldestUserResponse>(_FindOldestUserResponse_QNAME, FindOldestUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.assignment.bp/", name = "findUsersResponse")
    public JAXBElement<FindUsersResponse> createFindUsersResponse(FindUsersResponse value) {
        return new JAXBElement<FindUsersResponse>(_FindUsersResponse_QNAME, FindUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.assignment.bp/", name = "addUserResponse")
    public JAXBElement<AddUserResponse> createAddUserResponse(AddUserResponse value) {
        return new JAXBElement<AddUserResponse>(_AddUserResponse_QNAME, AddUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AverageAgeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.assignment.bp/", name = "averageAgeResponse")
    public JAXBElement<AverageAgeResponse> createAverageAgeResponse(AverageAgeResponse value) {
        return new JAXBElement<AverageAgeResponse>(_AverageAgeResponse_QNAME, AverageAgeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AverageAge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.assignment.bp/", name = "averageAge")
    public JAXBElement<AverageAge> createAverageAge(AverageAge value) {
        return new JAXBElement<AverageAge>(_AverageAge_QNAME, AverageAge.class, null, value);
    }

}
