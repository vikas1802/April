package a;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
@WebServlet("/process")
public class D1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public D1() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String pwd = request.getParameter("pwd");
		String gender = request.getParameter("gen");
		String address = request.getParameter("address");
		String qual = request.getParameter("qlfy");
		String[] skills = request.getParameterValues("skills");
		String[] hobbies = request.getParameterValues("hob");
		out.println("<table border='2'>");
		out.println("<tr><th>Name:</th><td>"+name+"</td></tr>");
		out.println("<tr><th>Password:</th><td>"+pwd+"</td></tr>");
		out.println("<tr><th>Gener:</th><td>"+gender+"</td></tr>");
		out.println("<tr><th>Address:</th><td>"+address+"</td></tr>");
		out.println("<tr><th>Qualification:</th><td>"+qual+"</td></tr>");
		out.println("<tr><th>Skills:</th><td>"+Arrays.toString(skills)+"</td></tr>");
		out.println("<tr><th>Hobbies:</th><td>"+Arrays.toString(hobbies)+"</td></tr>"); 
		out.println("</table>");
		out.close();
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
