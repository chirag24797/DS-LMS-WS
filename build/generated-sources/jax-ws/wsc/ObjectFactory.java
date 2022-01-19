
package wsc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsc package. 
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

    private final static QName _DisplayBook_QNAME = new QName("http://ws/", "displayBook");
    private final static QName _DisplayBookResponse_QNAME = new QName("http://ws/", "displayBookResponse");
    private final static QName _Hello_QNAME = new QName("http://ws/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://ws/", "helloResponse");
    private final static QName _IssueBook_QNAME = new QName("http://ws/", "issueBook");
    private final static QName _IssueBookResponse_QNAME = new QName("http://ws/", "issueBookResponse");
    private final static QName _ReturnBook_QNAME = new QName("http://ws/", "returnBook");
    private final static QName _ReturnBookResponse_QNAME = new QName("http://ws/", "returnBookResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DisplayBook }
     * 
     */
    public DisplayBook createDisplayBook() {
        return new DisplayBook();
    }

    /**
     * Create an instance of {@link DisplayBookResponse }
     * 
     */
    public DisplayBookResponse createDisplayBookResponse() {
        return new DisplayBookResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link IssueBook }
     * 
     */
    public IssueBook createIssueBook() {
        return new IssueBook();
    }

    /**
     * Create an instance of {@link IssueBookResponse }
     * 
     */
    public IssueBookResponse createIssueBookResponse() {
        return new IssueBookResponse();
    }

    /**
     * Create an instance of {@link ReturnBook }
     * 
     */
    public ReturnBook createReturnBook() {
        return new ReturnBook();
    }

    /**
     * Create an instance of {@link ReturnBookResponse }
     * 
     */
    public ReturnBookResponse createReturnBookResponse() {
        return new ReturnBookResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplayBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "displayBook")
    public JAXBElement<DisplayBook> createDisplayBook(DisplayBook value) {
        return new JAXBElement<DisplayBook>(_DisplayBook_QNAME, DisplayBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplayBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "displayBookResponse")
    public JAXBElement<DisplayBookResponse> createDisplayBookResponse(DisplayBookResponse value) {
        return new JAXBElement<DisplayBookResponse>(_DisplayBookResponse_QNAME, DisplayBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssueBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "issueBook")
    public JAXBElement<IssueBook> createIssueBook(IssueBook value) {
        return new JAXBElement<IssueBook>(_IssueBook_QNAME, IssueBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssueBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "issueBookResponse")
    public JAXBElement<IssueBookResponse> createIssueBookResponse(IssueBookResponse value) {
        return new JAXBElement<IssueBookResponse>(_IssueBookResponse_QNAME, IssueBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "returnBook")
    public JAXBElement<ReturnBook> createReturnBook(ReturnBook value) {
        return new JAXBElement<ReturnBook>(_ReturnBook_QNAME, ReturnBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "returnBookResponse")
    public JAXBElement<ReturnBookResponse> createReturnBookResponse(ReturnBookResponse value) {
        return new JAXBElement<ReturnBookResponse>(_ReturnBookResponse_QNAME, ReturnBookResponse.class, null, value);
    }

}
