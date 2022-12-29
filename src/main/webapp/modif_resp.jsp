<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>Ajout resp.</title>
 <link type="text/css" rel="stylesheet" href="style.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Cairo:wght@200;600;800&family=Fredoka:wght@300;400;500;600&family=Noto+Sans:wght@400;700&display=swap" rel="stylesheet">
 
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700"
	rel="stylesheet" type="text/css" />
<link
	href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic"
	rel="stylesheet" type="text/css" />
<!-- Core theme CSS (includes Bootstrap)-->
<link href="css/index-styles.css" rel="stylesheet" />
</head>
<body>
<header class="masthead bg-primary text-white text-center">
		<div class="container d-flex align-items-center flex-column">
<form action="Inscription" method="post" class="infos">

<h1>MODIFIER LES INFOS D UN Responsable</h1>
 <input type="text" name="cni" placeholder="CNI d etudiant a modifier" required>
  <input type="text" name="lname" placeholder="Last  Name" required>
 <input type="text" name="fname" placeholder="First Name" required>
  <input type="email" name="log" placeholder="EMAIL" required>
    <input type="password" name="pass" placeholder="PASSWORD" required>
 <input type="submit"   name="act" value="modifier"     placeholder="modifier">
</form>
  		 
			<div class="divider-custom divider-light">
				<div class="divider-custom-line"></div>
				<div class="divider-custom-icon">
					<i class="fas fa-star"></i>
				</div>
				<div class="divider-custom-line"></div>
			</div>
			<!-- Masthead Subheading-->
			<p class="masthead-subheading font-weight-light mb-0"> <p align="right"><p align="right" ><a href="Acceuil_resp.jsp">Retour a la page precedente-- </a></p>
</p>
		
		</div>
	</header>	 
	 


</body>
</html>