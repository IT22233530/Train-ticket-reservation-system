<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="index.css">
    <style>
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
          table, th, td {
          border: 2px solid whitesmoke;
		  border-collapse: collapse;
		  background-color:rgba(52, 82, 191, 0.667);
          
        }
    </style>
    
</head>

<body>
    <header class="header">
        <div class="logo">
            <img src="./img/logo1.png" alt="Logo" width=70px height=40px style="margin-left:450px;">
        </div>
        <div class="box">
			<h1 style="color:whitesmoke;text-align:center">EASY TRAIN RESEVATION</h1>
		</div>
        <nav class="navigation">
            <ul>
                <li><a href="home.jsp">Home</a></li>
                <li><a href="#">About</a></li>
                <li><a href="#">Services</a></li>
                <li><a href="#">Portfolio</a></li>
                <li><a href="#">Contact</a></li>
            </ul>
        </nav>
    </header>
    <br>


    <div>
        <img src="./img/tA.jpg" alt="" width="600px" height="300px" style="margin-left: 80px;">
            <div class="content">
                <a href="./tA.jsp">Train A</a>
            </div>
        <div  style="position:absolute; margin-top: -250px;">
            <table style="margin-left: 750px;color:white">
                <tr>
                    <th>Departure Station</th>
                    <th>Departure Time</th>
                    <th>Arrival Station</th>
                    <th>Arrival Time</th>
                </tr>
                <tr>
                    <td></td>
                    <td>1pm</td>
                    <td></td>
                    <td>2pm</td>
                </tr>
            </table>
        </div>
    </div>

    <div>    
        <img src="./img/tB.jpg" alt="" width="600px" height="300px" style="margin-left: 80px;">
            <div class="content1">
                <a href="">Train B</a>
            </div>
            <div  style="position:absolute; margin-top: -250px;">
                <table style="margin-left: 750px;color:white">
                    <tr>
                        <th>Departure Station</th>
                        <th>Departure Time</th>
                        <th>Arrival Station</th>
                        <th>Arrival Time</th>
                    </tr>
                    <tr>
                        <td></td>
                        <td>1pm</td>
                        <td></td>
                        <td>2pm</td>
                    </tr>
                </table>
            </div>
        </div>
        
     <div>   
        <img src="./img/tC.jpg" alt="" width="600px" height="300px" style="margin-left: 80px;">
            <div class="content2">
                <a href="">Train C</a>
            </div>
            <div  style="position:absolute; margin-top: -250px;">
                <table style="margin-left: 750px;color:white">
                    <tr>
                        <th>Departure Station</th>
                        <th>Departure Time</th>
                        <th>Arrival Station</th>
                        <th>Arrival Time</th>
                    </tr>
                    <tr>
                        <td></td>
                        <td>1pm</td>
                        <td></td>
                        <td>2pm</td>
                    </tr>
                </table>
            </div>
     </div> 

    <div>       
        <img src="./img/tD.jpg" alt="" width="600px" height="300px" style="margin-left: 80px;">
            <div class="content3">
                <a href="">Train D</a>
            </div>
            <div  style="position:absolute; margin-top: -250px;">
                <table style="margin-left: 750px;color:white">
                    <tr>
                        <th>Departure Station</th>
                        <th>Departure Time</th>
                        <th>Arrival Station</th>
                        <th>Arrival Time</th>
                    </tr>
                    <tr>
                        <td></td>
                        <td>1pm</td>
                        <td></td>
                        <td>2pm</td>
                    </tr>
                </table>
            </div>
    </div>
            
    <div>        
        <img src="./img/tE.jpg" alt="" width="600px" height="300px" style="margin-left: 80px;">
            <div class="content4">
                <a href="">Train E</a>
            </div>
            <div  style="position:absolute; margin-top: -250px;">
                <table style="margin-left: 750px;color:white">
                    <tr>
                        <th>Departure Station</th>
                        <th>Departure Time</th>
                        <th>Arrival Station</th>
                        <th>Arrival Time</th>
                    </tr>
                    <tr>
                        <td></td>
                        <td>1pm</td>
                        <td></td>
                        <td>2pm</td>
                    </tr>
                </table>
            </div>
    </div>

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