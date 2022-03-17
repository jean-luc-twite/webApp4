/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ac.za.tut.web;

import ac.za.tut.busness.ArthmerticDataS;
import ac.za.tut.processor.ArithmeticDataProcess;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
@WebServlet(name = "arthmerticDataServlet", urlPatterns = {"/arthmerticDataServlet.do"})
public class arthmerticDataServlet extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //extract data 
        String num1 =request.getParameter("num1");
        String num2 = request.getParameter("num2");
        String op =request.getParameter("op");
        //do something with the data-->process
        ArthmerticDataS ad = new  ArthmerticDataS(num1,num2,op);
        ArithmeticDataProcess adp = new ArithmeticDataProcess();
        String outcome =adp.determineRequiredFunctionality(ad);
        //send data to jsp purpose--> attach data to the request data 
        request.setAttribute("num1", num1);
        request.setAttribute("num2", num2);
        request.setAttribute("op", op);
        request.setAttribute("outcome", outcome);
        //send data to jsp FOR DISPLAY PURPOSE
        RequestDispatcher disp =request .getRequestDispatcher("arithmetique_outcome.jsp");
        disp.forward(request, response);
         
    }


}
