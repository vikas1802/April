package a;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/hi2")
public class T3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public T3() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		PrintWriter obj = response.getWriter();
		obj.println("<h1>WELCOME TO FACEBOOK CREATE A ACCOUNT </h1>");
		obj.println("<html>");
		obj.println("<body>");
		obj.println("<form action = 'hi2' method = 'post'>");
		obj.println("username: <input type ='text' name = 'username'/></br>");
		obj.println("pass: <input type ='text' name = 'pass'/></br>");
		obj.println("fathername: <input type ='text' name = 'fathername'/></br>");
		obj.println("mothername: <input type ='text' name = 'mothername'/></br>"); 
		obj.println("hobbies: <input type ='text' name = 'hobbies'/></br>");
		obj.println("<input type = 'hidden' name = 'email' value = "+email+"><br>");
		obj.println("<input type = 'hidden' name = 'password' value = "+password+"><br>");
		obj.println("<input type ='submit' value = 'next'/></br>");
		obj.println("</form>");
		obj.print("</body>");
		obj.println("</html>");
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
	   
//		doGet(request, response);
	}

}
