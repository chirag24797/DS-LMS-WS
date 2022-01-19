/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author chira
 */
@WebService(serviceName = "NewWebService")
@Stateless()
public class NewWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    
    
    String bks[]={"JAVA","DS","AIT","SE"};
	int quantity[]={10,10,10,10};
    
    
    @WebMethod(operationName = "issueBook")
    public String issueBook(@WebParam(name = "bookName") String bookName, @WebParam(name = "amount") int amount) {
        //TODO write your implementation code here:
        int i,flag=0;
		for(i=0;i<bks.length;i++)
		{
			if(bookName.equalsIgnoreCase(bks[i]))
			{
				flag=1;
				break;
			}
		}
			if(flag==1)
			{
				if(quantity[i]==0)
				{
					return "Books not available in Book "+bks[i];	
				}
				else
				{
					quantity[i]=quantity[i]-amount;
					return amount+" book/s of "+bookName+" issued successfully";
				}
			}
		else
		return "Incorrect Account Name";    
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "returnBook")
    public String returnBook(@WebParam(name = "bookName") String bookName, @WebParam(name = "amount") int amount) {
        //TODO write your implementation code here:
        int i,flag=0;
		for(i=0;i<bks.length;i++)
		{
		if(bookName.equalsIgnoreCase(bks[i]))
			{
				flag=1;
				break;
			}
			}
			if(flag==1)
			{
				if(quantity[i]==10)
				{
					return bookName+" Already Returned";
				}
				else
				{
				quantity[i]=quantity[i]+amount;
				return "Successfully returned "+amount+" "+bookName+" book/s";
				}
			}
		else
		return "Incorrect Account Name";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "displayBook")
    public String displayBook(@WebParam(name = "i") int i) {
        //TODO write your implementation code here:
        return (bks[i]+"\t"+quantity[i]);
    }
    
    
    
    
    
    
    
    
    
}
