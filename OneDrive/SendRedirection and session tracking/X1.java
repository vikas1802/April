package a;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/lky")

public class X1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public X1() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	PrintWriter obj = response.getWriter();
	obj.println("<h1>please detail bhro</h1>");
	obj.println("<html>");
	obj.println("<body>");
	obj.println("<form action = 'v1' method = 'get'></br>");
	obj.println("fathername:<input type = 'text' name = 'fathername'/></br>");
	obj.println("fatheradd:<input type ='text' name = 'fatheradd'/></br>");
	obj.println("fatherage:<input type = 'text' name = 'fatherage'/></br>");
	obj.println("<input type = 'hidden' name = 'name' value = "+name+"/></br>");
	obj.println("<input type = 'hidden' name = 'age' value = "+age+"></br>");
	obj.println("<button type = 'submit'>Submit</button>");
	obj.println("</form>");
	obj.println("</body>");
	obj.println("</html>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
