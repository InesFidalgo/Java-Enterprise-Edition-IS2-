package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ejbs.CRUDBean;

/**
 * Servlet implementation class NewCourse
 */
@WebServlet("/AddProftoCourse")
//http://localhost:8080/Project2IS-Web/AddProftoCourse?order=1
public class AddProftoCourse extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	 CRUDBean ejbremote;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProftoCourse() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		if (request.getParameter("order").equals("1")) {
			  String action = request.getParameter("action");
			 
			 
			  int idc = Integer.parseInt(request.getParameter("idc"));
			  
			 
			 
			  int idp = Integer.parseInt(request.getParameter("idp"));


		
			ejbremote.AddProfCourse(idc, idp);
			request.getRequestDispatcher("/addproftocourse.jsp").forward(request, response);
			
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
