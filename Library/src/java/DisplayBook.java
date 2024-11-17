/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

@WebServlet("/DisplayBook")
public class DisplayBook extends HttpServlet {

    @Override
            
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        
        String url="jdbc:mysql://localhost:3306/library";
        String uname1="root";
        String pass1=""; 
        String BookId = request.getParameter("n1");
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname1, pass1);
            PreparedStatement stm=con.prepareStatement("select * from lib where BookId=(?); ");
            stm.setString(1,BookId);
            ResultSet rs=stm.executeQuery();
            while(rs.next()){
                int id = rs.getInt("BookId");
                String name = rs.getString("BookName");
                String Author = rs.getString("AuthorName");
                String category = rs.getString("Category");
                
                pw.write("Book Name:"+name+"\n");
                pw.write("Book ID:"+id+"\n");
                pw.write("Book Author:"+Author+"\n");
                pw.write("Book Category:"+category+"\n");
                
            }
            
        }
        catch(Exception e){
            pw.write("Soorry the page was not found ");
        }
    }

}
