package a;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/s2")
public class Z12 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Z12() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  response.setContentType("text/html");
	        String name = request.getParameter("name");
	        String age = request.getParameter("age");
	        String email=request.getParameter("email");
	        String contact=request.getParameter("contact");
	        PrintWriter out=response.getWriter();
	        out.println("<html>");
	        out.println("<body>");
	        out.println("<h1>eduaction details </h1>");
	        out.println("<form action='s3' method='get'>");
	        out.println("qua:<input type='text' name='qua'/></br>");
	        out.println("uni :<input type='text' name='uni'/></br>");
	       
	        out.println("<input type='hidden' name='name' value="+name+"><br>");
	        out.println("<input type='hidden' name='age' value="+age+"><br>");
	        out.println("<input type='hidden' name='mobile' value="+contact+"><br>");
	        out.println("<input type='hidden' name='email' value="+email+"><br>");
	       
	        out.println("<input type='submit' value='next'/></br>" );
	        out.println("</form>");
	        out.println("</body>");
	        out.println("</html>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
