package example.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.catalina.connector.Response;

import example.jdbc.Department;
import example.jdbc.DepartmentDao;

/**
 * Servlet implementation class ShowDeptServlets
 */
@WebServlet("/showdept")
public class ShowDeptServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Object obj = request.getAttribute("loadedDept");
		Department dept =(Department)obj;
		String name =dept.getName();
		String location = dept.getLoc();
		out.println("<h2>Showing Dept Details: </h2>");
		out.println("<h2>Name: "+name +"</h2>");
		out.println("<h2>Location: "+location+ "</h2>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
