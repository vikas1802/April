package a;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/v3")
public class X4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public X4() {
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
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		PrintWriter obj = response.getWriter();
		obj.println("<h1>LE BHAI TERI DETAILS</h1>");
		obj.println("<br> name :"+name);
		obj.println("<br> age :"+age);
		obj.println("<br> fathername:"+fathername);
		obj.println("<br> fatheradd:"+fatheradd);
		obj.println("<br> fatherage:"+fatherage);
		obj.println("<br> mothername:"+mothername);
		obj.println("<br> motheradd:"+motheradd);
		obj.println("<br> motherage:"+motherage);
		obj.println("<br> email:"+email);
		obj.println("<br> password:"+password);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
