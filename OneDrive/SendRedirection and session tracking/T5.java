package a;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class T5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public T5() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		PrintWriter obj = response.getWriter();
		obj.println("<h1>WELCOME TO FB</h1>");
		obj.println("<html>");
		obj.println("<body>");
		obj.println("<form action = 'koi1' method = 'get'>");
		obj.println("username: <input type = 'text' name = 'username'/><br>");
		obj.println("fathername: <input type = 'text' name = 'fathername'/><br>");
		obj.println("mothername:<input type = 'text' name = 'mothername'/><br>");
		obj.println("<input type = 'hidden' name = 'email' value ="+email+"><br>");
		obj.println("<input type = 'hidden' name = 'password' value = "+password+"><br>");
		obj.println("<input type = 'submit' value = 'next'/></br>");
		obj.println("</form>");
		obj.println("</body>");
		obj.println("</html>");
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
