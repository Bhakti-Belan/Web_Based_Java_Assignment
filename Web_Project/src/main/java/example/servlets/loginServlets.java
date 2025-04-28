package example.servlets;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import org.apache.catalina.Session;

/**
 * Servlet implementation class loginServlets
 */
@WebServlet("/doLogin")
public class loginServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlets() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String userId = request.getParameter("userName");
		String pwd = request.getParameter("password");
		
		if(userId.equals("hrAdmin") && pwd.equals("asAdmin")){
				HttpSession session =request.getSession();
				session.setAttribute("LogedInUser", userId);
				session.setAttribute("greetingMsg", "Welcome");
				
				ServletContext ctx = getServletContext();
				String companyPolicy = """
						we are delighted to serve our customer in a better Way.
						We Value our Customer,
						""";
				ctx.setAttribute("ourCompPolicy", companyPolicy);
				out.println("<h2>Authentaction Sucessful.</h2>");
				out.println("<h2>To proceed, please <a href='show.jsp'>Click Here.</a></h2>");
				
		}
		else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
			out.println("<h2>Invalid Username / password.Try again</h2> ");
			dispatcher.include(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
