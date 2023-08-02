package a;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/s1")
public class Z1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Z1() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 response.setContentType("text/html");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		PrintWriter out = response.getWriter();
		out.println("<h1>Contact information</h1>");
		out.println("<html>");
		out.println("<body>");
		out.println("<form action='s2' method = 'get'>");
		out.println("email:<input type = 'text' name = 'email'/></br>");
		out.println("contact:<input type ='text' name = 'contact'/></br>");
		 out.println("<input type='hidden' name='name' value="+name+"><br>");
	     out.println("<input type='hidden' name='age' value="+age+"><br>");
		out.println("<input type = 'submit' value = 'next'/></br>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
