package a;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/kk1")
public class T8 extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public T8() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		PrintWriter obj = response.getWriter();
		obj.println("<h1>WELCOME TO FB</h1>");
		obj.println("<html>");
		obj.println("<body>");
		obj.println("<form action = 'kk1' method = 'post'>");
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
		doGet(request, response);
	}

}
