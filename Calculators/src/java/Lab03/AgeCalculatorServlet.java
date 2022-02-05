/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab03;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author zahra
 */
public class AgeCalculatorServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        
        String symbol= "^[\\d]+$";
        String age=request.getParameter("age");
        request.setAttribute("userAge", age);
        
        
        if(age==null || age.trim().equals("")){
            request.setAttribute("message", "You must give your current age");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
            
        }
        
        if(!age.matches(symbol)){
            request.setAttribute("massage", "You must enter a number.");
            getServletContext().getRequestDispatcher("/WEB/INF/agecalculator.jsp").forward(request, response);
            return;
        }
        
        request.setAttribute("message", "Your age next birthday will be " + (Integer.parseInt(age) +1));
          getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }
    @Override
    public String getServletInfo(){
        return "Short description";
    }
}
    
    
    
    