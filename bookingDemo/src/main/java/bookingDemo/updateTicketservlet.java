package bookingDemo;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class updateTicketservlet
 */
@WebServlet("/updateTicketservlet")
public class updateTicketservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get details from success.jsp
		String name = request.getParameter("name");
		String nic = request.getParameter("nic");
		String email = request.getParameter("email");
		String dpstation = request.getParameter("dstation");
		String arrstation = request.getParameter("astation");
		String seatclass = request.getParameter("sclass");
		String numofseats = request.getParameter("nseat");
		
		//boolean isTrue;
		
		List<Ticket> tickDetails  =train_A.updateTickdetails(name,nic, email, dpstation, arrstation, seatclass, numofseats);
		request.setAttribute("tickDetails",tickDetails);
		RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
		dis.forward(request,response);

		/*String name = request.getParameter("name");
		String email = request.getParameter("email");
		String dpstation = request.getParameter("dstation");
		String arrstation = request.getParameter("astation");
		String seatclass = request.getParameter("sclass");
		String numofseats = request.getParameter("nseat");
		
		boolean isTrue;
		isTrue = train_A.updateTicket(name, email, dpstation, arrstation, seatclass, numofseats);
		
		if (isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
			dis.forward(request,response);
		}
		else {
			RequestDispatcher dis = request.getRequestDispatcher("un_success.jsp");
			dis.forward(request,response);
		}*/
	}

}
