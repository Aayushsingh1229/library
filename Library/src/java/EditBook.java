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

@WebServlet("/EditBook")
public class EditBook extends HttpServlet {

 
            
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
            PreparedStatement stm=con.prepareStatement("UPDATE `lib` SET `BookName`=(?),`AuthorName`=(?),`Category`=(?) WHERE `BookId`=(?)");
            
            stm.setString(1,BookName);
            stm.setString(2,AuthorName);
            stm.setString(3,Category);
            stm.setString(4,BookId);
            stm.executeUpdate();
            
            pw.write("table updated");
            
            
            
        }
        catch(Exception e){
            pw.write("Sorry the page was not found ");
        }
    }

}
