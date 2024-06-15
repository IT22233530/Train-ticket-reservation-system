package bookingDemo;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/bookingservlet")
public class bookingservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get values from booking form
		String name = request.getParameter("name");
		String nic = request.getParameter("nic");
		String email = request.getParameter("email");
		String dpstation = request.getParameter("dstation");
		String arrstation = request.getParameter("astation");
		String seatclass = request.getParameter("sclass");
		String numofseats = request.getParameter("nseat");
		
		//boolean isTrue;
		
		List<Ticket> tickDetails  =train_A.insertTickdetails(name,nic, email, dpstation, arrstation, seatclass, numofseats);//call the function
		request.setAttribute("tickDetails",tickDetails);
		RequestDispatcher dis = request.getRequestDispatcher("success.jsp");// 
		dis.forward(request,response);
		
		/*if (isTrue==true) {
			RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
			dis.forward(request,response);
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("un_success.jsp");
			dis2.forward(request,response);
		}*/
	}

}
