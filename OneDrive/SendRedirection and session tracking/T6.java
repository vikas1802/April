package a;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/koi1")
public class T6 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public T6() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String username = request.getParameter("username");
		String fathername = request.getParameter("fathername");
		String mothername = request.getParameter("mothername");
		PrintWriter obj = response.getWriter();
		obj.println("<br> email:"+email);
		obj.println("<br> password: "+password);
		obj.println("<br> username : "+username);
		obj.println("<br> fathername : "+fathername);
		obj.println("<br>mothername : "+mothername);
	}
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
