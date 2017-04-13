<!DOCTYPE html>
<html>
<head>
	<title>UNNATI : DASHBOARD</title>
	<meta charset="utf-8">
	<meta name="Job Protal"/>
	<meta name="viewport" content="width=device-width, initial-scale=1"/>
	<link rel="shortcut icon" href="img/logo.png"/>
	<link rel="stylesheet" type="text/css" href="css/main.css"/>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"/>
</head>
<style>

</style>

<body>

	<div class="top-header">
		<div class="container">
			<a href="index.html"><img src="img/logo.png" style="float: left;"></a>
			<a href="Logout" style="float: right;padding-top: 12px;"><span class="glyphicon glyphicon-log-out"></span>&nbsp;LOGOUT</a>
		</div>
	</div>
	
	<div class="institute-nav"> 
		<div class="container">
		    <hr>
		    <div class="tab">
				<button class="tablinks" onclick="openCategory(event, 'profile')" id="defaultOpen">PROFILE</button>
				<button class="tablinks" onclick="openCategory(event, 'searchLabour')">SEARCH LABOUR</button>
				<button class="tablinks" onclick="openCategory(event, 'viewLabour')">VIEW LABOUR</button>
			</div>	

			<div id="searchLabour" class="tabcontent">
				<form>
					<table border="1">
						<tr>
							<td>
								<h4>Name : </h4>
							</td>
							<td>
								<input type="text" name="labname">
							</td>
						</tr>
					</table>
				</form>
			</div>

			<div id="viewLabour" class="tabcontent">
			  
			</div>

			<div id="profile" class="tabcontent">
				<%
				HttpSession check_session = request.getSession(false);
				String uname = (String)session.getAttribute("username");
				
				if(uname != null) {	
					%> 
					<h3 style="text-align: center;">Welcome <%= uname %> </h3><%	
				}
				%>
				
			</div>

		</div>
	</div>

	<div class="footer">
		<div class="container">
			<hr>
				
				<div class="social-link">

					<h3 class="fa fa-text">Follow Us :</h3>
					<a href="#" class="fa fa-facebook"></a>
					<a href="#" class="fa fa-twitter"></a>
					<a href="#" class="fa fa-google"></a>
					<a href="#" class="fa fa-linkedin"></a>
				</div>
			<hr>

			<div class="rights">
				<h6>Some Contains are copied &copy; 2017</h6>
			</div>
		</div>
	</div>	
</body>
	<script src="js/main.js"></script>
</html>