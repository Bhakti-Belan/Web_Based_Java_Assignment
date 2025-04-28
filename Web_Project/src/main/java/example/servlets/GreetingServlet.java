package example.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class GreetingServlet
 */
@WebServlet(name="myGreetingServlet",urlPatterns= {"/doGreet","/greet"})
public class GreetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String mimeType="text/html";
	response.setContentType(mimeType);
	String responseText="<html> <body bgcolor='red'> <h1 style ='color:Black'>WELCOME To Servlet</h1></body></html>";
	System.out.println("from service method");
	PrintWriter out=response.getWriter();
	out.println(responseText);
	
     
	}
	public void init()
	{
		System.out.println("From Intit");
		
	}
	public void destroy()
	{
		System.out.println("From destroy");
	}

}
