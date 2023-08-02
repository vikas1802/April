package a;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/s3")
public class Z123 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Z123() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  response.setContentType("text/html");
	        String name = request.getParameter("name");
	        String age = request.getParameter("age");
	        String mobile = request.getParameter("mobile");
	        String email = request.getParameter("email");
	        String qualification = request.getParameter("qua");
	        String university = request.getParameter("uni");
	        PrintWriter out = response.getWriter();
	        out.println("<html>");
	        out.println("<body>");
	        out.println("<form>");
	        out.println("<h1>Please Confirm Details:</h1><hr>");
	        out.println("<br>Name: "+name);
	        out.println("<br>Age: "+age);
	        out.println("<br>Mobile: "+mobile);
	        out.println("<br>Email: "+email);
	        out.println("<br>Qualification: "+qualification);
	        out.println("<br>University: "+university);
	        out.println("</form>");
	        out.println("</body>");
			out.println("</html>");
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
