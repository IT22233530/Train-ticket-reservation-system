<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="index.css">
<style>
 
		body {
    		background-image : url('./img/bck.jpg');
    		margin :0;
    		padding :0;
    		background-size :cover;
    		overflow:auto;
    		background-attachment: fixed;	
    	}
    	.header {
    		background-color:rgba(63, 63, 66, 0.633);
    		background-blend-mode: lighten ;
    		color: white;
   			padding: 10px 0;
    		display: flex;
    		justify-content: space-between;
    		align-items: center;
		}
    	.box h1{
    			margin-right:120px;
                color: #fff;
                font-size: 30px;
                font-weight: 800;
                letter-spacing: 0.1em;
                text-shadow: 0 0 10px #00b3ff,
                            0 0 20px #00b3ff,
                            0 0 40px #00b3ff,
                            0 0 80px #00b3ff,
                            0 0 120px #00b3ff;

            }
    	.delete{
    		margin-top: 2%;
   	 		margin-left: 32%;
   	 		margin-bottom:8%;
   	 		width: 600px;
    		background: linear-gradient(to right,rgba(255, 149, 37, 0.7), rgba(51, 114, 240, 0.7));
   			box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.1);
    		border-radius: 10px;
    	}
    	.delete form{
    		padding:50px;
		}
		.delete form label{
   			 font-size: 20px;
   			 color:whitesmoke;
    
		}
		.delete input[type=text],[type=email] {
			text-align:left;
			font-size: 20px;
			border-radius: 5px;
  			width:350px;
  			height:25px;
			margin: 8px 0;
 			
		}
		.delete input[type=submit]{
                position: relative;
                display:inline-block;
                padding: 7px 12px;
                color: white;
                background:linear-gradient(to right,
                                    rgba(90, 148, 181, 0.882),
                                    rgba(90, 148, 181, 0.882),
                                    rgba(90, 148, 181, 0.882)
                                
    							);
                border-color: white;
                border-radius: 15px;
                font-weight: 600;
                font-size: 20px;               
          }

</style>

</head>
<body>
		<%
			String name = request.getParameter("name");
			String nic = request.getParameter("nic");
			String email = request.getParameter("email");
			String depstation = request.getParameter("dpst");
			String arrstation = request.getParameter("arst");
			String stclass = request.getParameter("sclass");
			String nmseat = request.getParameter("nmseat");
		
		%>
		
	<header class="header">
        <div class="logo">
            <img src="./img/logo1.png" alt="Logo" width=70px height=40px style="margin-left:450px;">
        </div>
        <div class="box">
			<h1 style="color:whitesmoke;text-align:center">EASY TRAIN RESEVATION</h1>
		</div>
        <nav class="navigation">
            <ul>
                <li><a href="#">Home</a></li>
                <li><a href="#">About</a></li>
                <li><a href="#">Services</a></li>
                <li><a href="#">Portfolio</a></li>
                <li><a href="#">Contact</a></li>
            </ul>
        </nav>
    </header>
    
		<div class="delete">
			<form action="delete" method="post">
		    <h2 style="margin-left: 170px;margin-top:10px;color:white">Delete ticket</h2>
		    
            <label for="name">Name :</label>
            <input type="text" id="name" name="name" value="<%=name%>" readonly><br><br>
            <label for="name">NIC  :</label>
            <input type="text" id="nic" name="nic" style="margin-left:15px;" value="<%=nic%>" readonly><br><br>
            
			<input type="submit" onclick="showSuccessAlert()" name="Submit" value="delete" style="margin-left: 200px;margin-top:10px">
		</form>
		</div>
	<script>
        function showSuccessAlert() {
            alert("Successfully deleted!!");
        }
  	  </script>
	<footer class="footer">
        <div class="contact-details">
            <h3>Contact Us</h3>
            <p>Email: info@example.com</p>
            <p>Phone: +123 456 789</p>
        </div>
    	<div class="sponsors">
            <h3>Our Sponsors</h3>
            <img src="https://www.freepnglogos.com/uploads/visa-and-mastercard-logo-26.png" alt="Sponsor 1" width=70px; height=20px>
            <img src="https://www.freepnglogos.com/uploads/paypal-logo-png-1.png" alt="Sponsor 2" width=70px; height=20px>
            <!-- Add more sponsor logos as needed -->
        </div>
    </footer>


</body>
</html>