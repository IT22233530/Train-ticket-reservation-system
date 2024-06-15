package bookingDemo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class deleteTicketservlet
 */
@WebServlet("/deleteTicketservlet")
public class deleteTicketservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nic = request.getParameter("nic");//get NIC from success.jsp
		boolean isTrue;
		
		isTrue = train_A.deleteTicket(nic);
		
		if (isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("index.jsp");
			dis.forward(request,response);
		}
		else {
			RequestDispatcher dis = request.getRequestDispatcher("un_success.jsp");
			dis.forward(request,response);
		}
	}

}
