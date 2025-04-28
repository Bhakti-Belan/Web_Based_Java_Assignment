package example.sarvlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import example.jdbc.Department;
import example.jdbc.DepartmentDao;
import example.jdbc.JdbcDao;

/**
 * Servlet implementation class SearchDeptServlet
 */
@WebServlet("/SearchDept")
public class SearchDeptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		String deptNo = request.getParameter("deptNo");
		int dept_No = Integer.parseInt(deptNo);
		
		JdbcDao<Department, Integer>dao=new DepartmentDao();
		Department foundDepartment = dao.getOne(dept_No);
		
		RequestDispatcher dispatcher = null;
		
		if(foundDepartment == null) {
			out.print("<h2>Department Not Found due to invalid ID.Please try again.</h2>");
		dispatcher= request.getRequestDispatcher("searchDept.html");
		dispatcher.include(request, response);
		}
		else {
			dispatcher = request.getRequestDispatcher("showdept");
		request.setAttribute("loadedDept", foundDepartment);
		dispatcher.forward(request, response);
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
