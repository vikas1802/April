package a;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/v1")
public class X2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public X2() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String fathername = request.getParameter("fathername");
		String fatheradd = request.getParameter("fatheradd");
		String fatherage = request.getParameter("fatherage");
		PrintWriter obj = response.getWriter();
		obj.println("<h1>YE BHI BHRO YRR</h1>");
		obj.println("<html>");
		obj.println("<html>");
		obj.println("<body>");
		obj.println("<form action = 'v2' method = 'get'><br>");
		obj.println("mothername:<input type= 'text' name = 'mothername'/><br>");
		obj.println("motheradd:<input type= 'text' name = 'motheradd'/><br>");
		obj.println("motherage:<input type= 'text' name = 'motherage'/><br>");
		obj.println("<input type= 'hidden' name = 'name' value = "+name+"><br>");
		obj.println("<input type= 'hidden' name = 'age' value = "+age+"><br>");
		obj.println("<input type= 'hidden' name = 'fathername' value = "+fathername+"><br>");
		obj.println("<input type= 'hidden' name = 'fatheradd' value = "+fatheradd+"><br>");
		obj.println("<input type= 'hidden' name = 'fatherage' value = "+fatherage+"><br>");
		obj.println("<button type = 'submit'>Submit</button>");
		obj.println("</form>");
		obj.println("</body>");
		obj.println("</html>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
