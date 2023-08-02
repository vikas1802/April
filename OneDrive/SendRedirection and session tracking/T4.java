package a;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/koi")
public class T4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public T4() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		PrintWriter obj = response.getWriter();
		if(email.equals("abc")&&password.equals("123")){
		RequestDispatcher re = request.getRequestDispatcher("T5");
		re.forward(request, response);
	}
		else if(email.equals("")&&password.equals("")) {
			RequestDispatcher rd = request.getRequestDispatcher("T4.html");
			rd.include(request, response);
		}
		else if(!email.equals("abc")&&!password.equals("123")) {
			RequestDispatcher rd = request.getRequestDispatcher("T4.html");
			rd.include(request, response);
		}
			
	}
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
