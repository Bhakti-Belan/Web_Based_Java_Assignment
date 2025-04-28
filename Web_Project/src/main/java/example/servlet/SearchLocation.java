package example.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import example.jdbc.Department;
import example.jdbc.DepartmentDao;
import example.jdbc.JdbcDao;

/**
 * Servlet implementation class SearchLocation
 */
@WebServlet("/searchLoc")
public class SearchLocation extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String location = request.getParameter("loc");
		JdbcDao<Department, Integer>dao = new DepartmentDao();
		Collection<Department> allDepartment=dao.getAll();
		List<String> deptNames = new ArrayList<>();
		for(Department dept : allDepartment) {
			String deptLoc = dept.getLoc();
			if(deptLoc != null) {
			if(deptLoc.equals(location));
			deptNames.add(dept.getName());
			}
		}
		
		int listSize = deptNames.size();
		if(listSize == 0) {
			RequestDispatcher dispatcher =request.getRequestDispatcher("SearchLoc.html");
			out.println("<h2>No Department found against given Location. try again</h2>");
			dispatcher.include(request, response);
		}
		else {
			HttpSession session = request.getSession();
			session.setAttribute("loadedDeptNames", deptNames);
			out.println("<h2>"+listSize+" department(s) Found</h2>");
		out.println("<h2>To view them, <a href = 'viewDepts'>Click Here</a></h2>");
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
