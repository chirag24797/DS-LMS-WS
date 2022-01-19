
package wsc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "NewWebService", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface NewWebService {


    /**
     * 
     * @param amount
     * @param bookName
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "issueBook", targetNamespace = "http://ws/", className = "wsc.IssueBook")
    @ResponseWrapper(localName = "issueBookResponse", targetNamespace = "http://ws/", className = "wsc.IssueBookResponse")
    @Action(input = "http://ws/NewWebService/issueBookRequest", output = "http://ws/NewWebService/issueBookResponse")
    public String issueBook(
        @WebParam(name = "bookName", targetNamespace = "")
        String bookName,
        @WebParam(name = "amount", targetNamespace = "")
        int amount);

    /**
     * 
     * @param i
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "displayBook", targetNamespace = "http://ws/", className = "wsc.DisplayBook")
    @ResponseWrapper(localName = "displayBookResponse", targetNamespace = "http://ws/", className = "wsc.DisplayBookResponse")
    @Action(input = "http://ws/NewWebService/displayBookRequest", output = "http://ws/NewWebService/displayBookResponse")
    public String displayBook(
        @WebParam(name = "i", targetNamespace = "")
        int i);

    /**
     * 
     * @param amount
     * @param bookName
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "returnBook", targetNamespace = "http://ws/", className = "wsc.ReturnBook")
    @ResponseWrapper(localName = "returnBookResponse", targetNamespace = "http://ws/", className = "wsc.ReturnBookResponse")
    @Action(input = "http://ws/NewWebService/returnBookRequest", output = "http://ws/NewWebService/returnBookResponse")
    public String returnBook(
        @WebParam(name = "bookName", targetNamespace = "")
        String bookName,
        @WebParam(name = "amount", targetNamespace = "")
        int amount);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://ws/", className = "wsc.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://ws/", className = "wsc.HelloResponse")
    @Action(input = "http://ws/NewWebService/helloRequest", output = "http://ws/NewWebService/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}