package com.spep.unnati;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SearchLabour
 */
@WebServlet("/SearchLabour")
public class SearchLabour extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchLabour() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String label = request.getParameter("searchlabel");
		String option = request.getParameter("search-as");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
                           
             if (option.equalsIgnoreCase("skill"))
             {
            	 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/unnati", "root", "root");
    			 PreparedStatement ps=conn.prepareStatement("select * from labour where skill=?");
    			 ps.setString(1, label);  
    			 
    			 out.println("<body style='background-color:transparent;'>");
                 out.print("<h1 style='text-align: center;color: darkcyan;padding-top:12px;'>* Labour Details *</h1>");
            	 
                 /* Printing column names */  
                 ResultSet rs=ps.executeQuery();  
                 ResultSetMetaData rsmd=rs.getMetaData();  
              	  
            	 out.print("<table style='margin-left: 100px;margin-top: 58px;background-color: rgba(0, 150, 136, 0.66);padding: 18px;width:1150px;'>");
             	
            	 int total=rsmd.getColumnCount();  
            	 out.print("<tr>");  
            	   
            	 
            	 out.print("<td><h5>Full Name</h5></td>"); 
            	 out.print("<td><h5> Contact Number</h5></td>"); 
            	 out.print("<td><h5>Gender</h5></td>"); 
            	 out.print("<td><h5>Skill Knows</h5></td>"); 
            	 out.print("<td><h5>Country</h5></td>"); 
            	 out.print("<td><h5>State</h5></td>"); 
            	 out.print("<td><h5>Pin Code</h5></td>"); 
            	 out.print("<td><h5>City</h5></td>"); 
            	 out.print("<td><h5>Job Status</h5></td>"); 
            	 out.print("<td><h5>Date Of Registration</h5></td>");        	 
            	   
            	 out.print("</tr>");  
            	               
            	 /* Printing result */  
            	 out.println("</br>");  
            	 while(rs.next())  
            	 {  
            		 out.print("<tr><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td><td>"+rs.getString(7)+"</td><td>"+rs.getString(8)+"</td><td>"+rs.getString(9)+"</td><td>"+rs.getString(12)+"</td><td>"+rs.getString(13)+"</td></tr>");  
            		             
            	 }   
                    
                  out.print("</tr>");
                  out.print("</table>");
             }
             
             else if (option.equalsIgnoreCase("username"))
             {
            	 /* Printing result */  
            	 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/unnati", "root", "root");
    			 PreparedStatement ps=conn.prepareStatement("select * from labour where fullname=?");
    			 ps.setString(1, label);  
    			
    			 out.println("<body style='background-color:transparent;'>");
                 out.print("<h1 style='text-align: center;color: darkcyan;padding-top:12px;'>* Labour Details *</h1>");
            	 
                 ResultSet rs=ps.executeQuery();    
            	 out.print("<table style='margin-left: 300px;margin-top: 58px;background-color: rgba(0, 150, 136, 0.66);padding: 18px;width:800px;'>");
            	 
            	 while(rs.next())  
                 {  
                    out.print("<tr>");
                    out.print("<td style='padding: 6px 0px;font-size: 16px;color: cornsilk;font-family: serif;'>"+"Sr. No"+"</td>");
                    out.print("<td>"+rs.getString(1)+"</td></tr>");
                    out.print("<tr><td style='padding: 6px 0px;font-size: 16px;color: cornsilk;font-family: serif;'>"+"Full Name :"+"</td>");
                    out.print("<td>"+rs.getString(2)+"</td></tr>");
                    out.print("<tr><td style='padding: 6px 0px;font-size: 16px;color: cornsilk;font-family: serif;'>"+"Contact Number :"+"</td>");
                    out.print("<td>"+rs.getString(3)+"</td></tr>");
                    out.print("<tr><td style='padding: 6px 0px;font-size: 16px;color: cornsilk;font-family: serif;'>"+"Gender :"+"</td>");
                    out.print("<td>"+rs.getString(4)+"</td></tr>");
                    out.print("<tr><td style='padding: 6px 0px;font-size: 16px;color: cornsilk;font-family: serif;'>"+"Skill Knows :"+"</td>");
                    out.print("<td>"+rs.getString(5)+"</td></tr>");
                    out.print("<tr><td style='padding: 6px 0px;font-size: 16px;color: cornsilk;font-family: serif;'>"+"Country :"+"</td>");
                    out.print("<td>"+rs.getString(6)+"</td></tr>");
                    out.print("<tr><td style='padding: 6px 0px;font-size: 16px;color: cornsilk;font-family: serif;'>"+"State :"+"</td>");
                    out.print("<td>"+rs.getString(7)+"</td></tr>");
                    out.print("<tr><td style='padding: 6px 0px;font-size: 16px;color: cornsilk;font-family: serif;'>"+"Pin Code :"+"</td>");
                    out.print("<td>"+rs.getString(8)+"</td></tr>");
                    out.print("<tr><td style='padding: 6px 0px;font-size: 16px;color: cornsilk;font-family: serif;'>"+"City :"+"</td>");
                    out.print("<td>"+rs.getString(9)+"</td></tr>");
                    out.print("<tr><td style='padding: 6px 0px;font-size: 16px;color: cornsilk;font-family: serif;'>"+"Job Status : "+"</td>");
                    out.print("<td>"+rs.getString(12)+"</td></tr>");
                    out.print("<tr><td style='padding: 6px 0px;font-size: 16px;color: cornsilk;font-family: serif;'>"+"Date Of Registration :"+"</td>");
                    out.print("<td>"+rs.getString(13)+"</td></tr>");
                 }  
       
            	 out.print("</table>");
             }
             else
             {
            	 out.println("error in Searching");
             }
            
             
             out.print("<h4 style='text-align: center;margin-top: 24px;'><a style='text-decoration: none;' href='institutedashboard.jsp'>Go Back to the Dashbaord</a>");
      }catch (Exception e2)
        {
            e2.printStackTrace();
        }
		
      finally{out.close();
			
		}
	}

}
