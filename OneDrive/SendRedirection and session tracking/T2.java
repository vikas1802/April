package a;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hlo1")
public class T2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public T2() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	String email = request.getParameter("email" );
	String password = request.getParameter("password");
	String username = request.getParameter("username");
	String pass = request.getParameter("pass");
	String fathername = request.getParameter("fathername");
	String mothername = request.getParameter("mothername");
	String hobbies = request.getParameter("hobbies" );
	PrintWriter out = response.getWriter(); 
	
     out.println("<h1>Please Confirm Details:</h1><br>");
     out.println("<br>emailid: "+email );
     out.println("<br>pswrd: "+password);
     out.println("<br>name: "+username);
     out.println("<br>passsss: "+pass);
     out.println("<br>papa: "+fathername);
     out.println("<br>mummy: "+mothername);
     out.println("<br>hob: "+hobbies);
   
     
	}
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
