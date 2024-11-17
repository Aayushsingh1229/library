/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

@WebServlet("/BookServlet")
public class BookServlet extends HttpServlet {

    @Override
            
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String BookId = request.getParameter("n1");
        String BookName = request.getParameter("n2");
        String AuthorName = request.getParameter("a1");
        String Category = request.getParameter("c1");
        PrintWriter pw = response.getWriter();
        
        String url="jdbc:mysql://localhost:3306/library";
        String uname1="root";
        String pass1=""; 
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname1, pass1);
            PreparedStatement stm=con.prepareStatement("insert into lib values(?,?,?,?); ");
            stm.setString(1,BookId);
            stm.setString(2,BookName);
            stm.setString(3,AuthorName);
            stm.setString(4,Category);
            int row= stm.executeUpdate();
            if(row==1){
                pw.write("Book added Successfully"); 
            }
            
        }
        catch(Exception e){
            pw.write("Soorry the page was not found ");
        }
    }

}
