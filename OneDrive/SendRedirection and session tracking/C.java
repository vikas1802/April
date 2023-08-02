import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class C
 */
public class C extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public C() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter obj = response.getWriter();
		obj.println("<h1>Welcome</h1>");
		obj.println("<p>After 30 second this page automaticly redirect to google</p>");
		response.setHeader("Refresh","10;url='https://www.google.com");
		obj.close();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
