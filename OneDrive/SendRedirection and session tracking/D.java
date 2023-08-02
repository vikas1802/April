package a;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/gpage")
public class D extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public D() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		PrintWriter pw = response.getWriter();
		if(email.equals("abc")&&password.equals(123)) {
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
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
