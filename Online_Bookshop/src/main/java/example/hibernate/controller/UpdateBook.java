package example.hibernate.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.bookshop.entity.Book;
import com.bookshop.service.BookService;

import example.hibernate.exception.ResourceNotFoundException;

/**
 * Servlet implementation class UpdateBook
 */
@WebServlet("/updateBook")
public class UpdateBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateBook() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String title=request.getParameter("title");
		String utitle=request.getParameter("uTitle");
		double price=Double.valueOf(request.getParameter("price"));
		int year=Integer.valueOf(request.getParameter("year"));
		BookService bs=new BookService();
		Book book=bs.getBookByTitle(title);
		try {
		
			if(bs.updateBook(book, utitle, price, year))
			{
				
			out.println("Book Updated SuccessFully!!!");
			request.getRequestDispatcher("updateBook.jsp").include(request, response);
			}
			
		
		}catch(Exception e)
		{
			out.println(e.getMessage());
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
