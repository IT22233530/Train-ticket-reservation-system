package bookingDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class train_A {
	
	/*public static List<Ticket> validate(String s_class,int av_seats){
		
		ArrayList<Ticket> tick = new ArrayList<>();
		
		//crate database connection
		String url = "jdbc:mysql://localhost:3306/booking";
		String user = "root";
		String password = "";
		
		//validate
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,user,password);
			Statement stmt = con.createStatement();
			String sql = 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return tick;
		}*/
	
		//insert Ticket details and display
		public static List<Ticket> insertTickdetails(String name,String nic,String email,String dpstation,String arrstation,String seatclass,String numofseats) {
			
		
			ArrayList<Ticket> tick = new ArrayList<>();
			
			String url = "jdbc:mysql://localhost:3306/booking";
			String user = "root";
			String password = "#Wsk2003";
			
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url,user,password);
				Statement stmt = con.createStatement();
				String sql = "insert into ticket values(0,'"+name+"','"+nic+"','"+email+"','"+dpstation+"','"+arrstation+"','"+seatclass+"','"+numofseats+"')";
				String sql2 = "select * from ticket where nic='"+nic+"'";
				int rs = stmt.executeUpdate(sql);
				
				if(rs > 0) {
					
					
					ResultSet rs2 = stmt.executeQuery(sql2);
					if (rs2.next()) {

						String name1 = rs2.getString(2);
						String nic1 = rs2.getString(3);
						String email1 = rs2.getString(4);
						String dstation = rs2.getString(5);
						String arstation = rs2.getString(6);
						String stclass = rs2.getString(7);
						int numseat = rs2.getInt(8);
						
						Ticket T = new Ticket(name1,nic1,email1,dstation,arstation,stclass,numseat);
						tick.add(T);
					}
						
				}
				else {
					
				}
				
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
			return tick;
		}
		//update ticket details and display
		public static List<Ticket> updateTickdetails(String name,String nic,String email,String dpstation,String arrstation,String seatclass,String numofseats) {
			
			
			ArrayList<Ticket> tick = new ArrayList<>();
			
			String url = "jdbc:mysql://localhost:3306/booking";
			String user = "root";
			String password = "#Wsk2003";
			
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url,user,password);
				Statement stmt = con.createStatement();
				String sql = "update ticket set cus_name='"+name+"',nic='"+nic+"',cus_email='"+email+"',dep_station='"+dpstation+"',arr_station='"+arrstation+"',st_class='"+seatclass+"',num_seats='"+numofseats+"' where nic='"+nic+"'";
				String sql2 = "select * from ticket where cus_name='"+name+"'";
				int rs = stmt.executeUpdate(sql);
				
				if(rs > 0) {
					
					
					ResultSet rs2 = stmt.executeQuery(sql2);
					if (rs2.next()) {

						String name1 = rs2.getString(2);
						String nic1 = rs2.getString(3);
						String email1 = rs2.getString(4);
						String dstation = rs2.getString(5);
						String arstation = rs2.getString(6);
						String stclass = rs2.getString(7);
						int numseat = rs2.getInt(8);
						
						Ticket T = new Ticket(name1,nic1,email1,dstation,arstation,stclass,numseat);
						tick.add(T);
					}
						
				}
				else {
					
				}
				
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
			return tick;
		}
		/*public static boolean updateTicket(String name,String email,String dpstation,String arrstation,String seatclass,String numofseats) {
			
			boolean isSucces = false;
			String url = "jdbc:mysql://localhost:3306/booking";
			String user = "root";
			String password = "#Wsk2003";
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url,user,password);
				Statement stmt = con.createStatement();
				
				String sql = "update ticket set cus_name='"+name+"',cus_email='"+email+"',dep_station='"+dpstation+"',arr_station='"+arrstation+"',st_class='"+seatclass+"',num_seats='"+numofseats+"' where cus_name='"+name+"' " ;
				int rs = stmt.executeUpdate(sql);
				
				if(rs > 0) {
					isSucces = true;
				}
				else {
					isSucces = false;
				}
				
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
			
			return isSucces;
			
		}*/
		
		//delete ticket details
		public static boolean deleteTicket(String nic) {
			boolean isSucces = false;
			String url = "jdbc:mysql://localhost:3306/booking";
			String user = "root";
			String password = "#Wsk2003";
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url,user,password);
				Statement stmt = con.createStatement();
				
				String sql = "delete from ticket where nic ='"+nic+"'";
				int rs = stmt.executeUpdate(sql);
				
				if(rs>0) {
					isSucces = true;
				}
				else {
					isSucces = false;
				}
				
			}
			catch (Exception e){
				e.printStackTrace();
			}
			
			return isSucces;
		}
		
		
		
		
		
	}

  
