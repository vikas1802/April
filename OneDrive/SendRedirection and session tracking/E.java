package a;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/po")
public class E extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public E() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter obj = response.getWriter();
		obj.println("<html>");
		obj.println("<body>");
		obj.println("<form action = 'po' method = 'post' >");
		obj.println("email:<input type = 'text' name = 'email'>");
		obj.println("password:<input type='text' name='password'>");
		obj.println("<button type='submit'>submit</submit>");
		obj.println("</form>");
		obj.println("</body>");
		obj.println("</html>");
	} 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		PrintWriter pw = response.getWriter();
		if(email.equals("abc")&&password.equals("123")) {
			response.sendRedirect("https://www.google.com/");
			
		}
		else if(email.equals("")&&password.equals("")) {
			pw.println("<script>alert('please input mail and password :')</script>");
			RequestDispatcher re = request.getRequestDispatcher("Aa.html");
			re.include(request, response);
		}
		else if(!email.equals("abc")&&!password.equals("123")) {
			pw.println("<script>alert('please input right mail and password :')</script>");
			RequestDispatcher re = request.getRequestDispatcher("Aa.html");
			re.include(request, response);
		}
		
		doGet(request, response);
	}

}
