/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author zahra
 */
public class NoteServlet extends HttpServlet  {

   

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
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
    
    
    
        // to read files
    
        BufferedReader br  = new BufferedReader(new FileReader(new File(path)));
    
         // to write to a file
         PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false))); 

    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
   
        return; }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        String title = request.getParameter("title");
        String contents= request.getParameter("contents");
        
        Note note = new Note(title,contents);
        
        request.setAttribute("note", note);
        
    }
   

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
