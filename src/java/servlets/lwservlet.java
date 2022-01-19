/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import wsc.NewWebService_Service;

/**
 *
 * @author chira
 */
public class lwservlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/NewWebService/NewWebService.wsdl")
    private NewWebService_Service service;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet lwservlet</title>");            
            out.println("</head>");
            out.println("<body style=\"background-color:grey;color:white\">");
            
            String bookName=request.getParameter("bookName");
            
            String radio=request.getParameter("r1");
            
            int amount=Integer.parseInt(request.getParameter("amount"));
            
            //out.println("<h1>Servlet HospitalServlet at " + radio + "</h1>");
            if(radio.equals("Issue"))
                out.println("<h1>"+issueBook(bookName, amount)+"</h1>");
            else if(radio.equals("Return"))
                out.println("<h1>"+returnBook(bookName, amount)+"</h1>");
            else
            { 
                out.println("<span style=\"background-color:blue;color:white;\">Our Stocks</span>");
		for(int i=0;i<4;i++)
                    out.println("<h1>"+displayBook(i)+"</h1>");
            }
            
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private String issueBook(java.lang.String bookName, int amount) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        wsc.NewWebService port = service.getNewWebServicePort();
        return port.issueBook(bookName, amount);
    }

    private String returnBook(java.lang.String bookName, int amount) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        wsc.NewWebService port = service.getNewWebServicePort();
        return port.returnBook(bookName, amount);
    }

    private String displayBook(int i) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        wsc.NewWebService port = service.getNewWebServicePort();
        return port.displayBook(i);
    }

    
    
    
    
    
    
}
