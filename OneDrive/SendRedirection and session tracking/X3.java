package a;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/v2")
public class X3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public X3() {
        super();
    }
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String fathername = request.getParameter("fathername");
		String fatheradd = request.getParameter("fatheradd");
		String fatherage = request.getParameter("fatherage");
		String mothername = request.getParameter("mothername");
		String motheradd = request.getParameter("motheradd");
		String motherage = request.getParameter("motherage");
		PrintWriter obj = response.getWriter();
		obj.println("<h1>EK OR BHRDE YR</h1>");
		obj.println("<html>");
		obj.println("<body>");
		obj.println("<form action = 'v3' method = 'get'><br>");
		obj.println("email:<input type = 'text' name = 'email'><br>");
		obj.println("password:<input type = 'text' name = 'password'><br>");
		obj.println("<input type = 'hidden' name = 'name' value = "+name+"><br>");
		obj.println("<input type = 'hidden' name = 'age' value = "+age+"><br>");
		obj.println("<input type = 'hidden' name = 'fathername' value = "+fathername+"><br>");
		obj.println("<input type = 'hidden' name = 'fatheradd' value = "+fatheradd+"><br>");
		obj.println("<input type = 'hidden' name = 'fatherage' value = "+fatherage+"><br>");
		obj.println("<input type = 'hidden' name = 'mothername' value = "+mothername+"><br>");
		obj.println("<input type = 'hidden' name = 'motheradd' value = "+motheradd+"><br>");
		obj.println("<input type = 'hidden' name = 'motherage' value = "+motherage+"><br>");
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
