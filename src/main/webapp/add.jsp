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
<title>ajout etudiant</title>
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
			<!-- Masthead Avatar Image-->
			<!-- Masthead Heading-->
			<form action="Inscription" method="post" class="infos">

<h1>Insert a Student</h1>
 <input type="text" name="id" placeholder="codeApogee" required>
 <input type="text" name="cne" placeholder="CNE" required>
 <input type="text" name="lname" placeholder="Last  Name" required>
 <input type="text" name="fname" placeholder="First Name" required>
  <input type="date" name="ddn" placeholder="DatedeNaissance" required>
  <input type="text" name="fil" placeholder="fiiere" required>
  <input type="text" name="Parc" placeholder="Parcours" required>
  
  <SELECT name="semest"> 
<OPTION  value="s1/s2">S1/S2</OPTION>
<OPTION VALUE="s3/s4">S3/S4</OPTION> 
<OPTION VALUE="s6" selected>s6</OPTION>
<OPTION VALUE="s5/s6">S5/s6</OPTION>
</SELECT>
 
 

 <input type="submit"   name="act" value="Add"     placeholder="Add">
 

 </form>
			
  			<!-- Icon Divider-->
			<div class="divider-custom divider-light">
				<div class="divider-custom-line"></div>
				<div class="divider-custom-icon">
					<i class="fas fa-star"></i>
				</div>
				<div class="divider-custom-line"></div>
			</div>
			<!-- Masthead Subheading-->
			<p class="masthead-subheading font-weight-light mb-0">  <a href="addStudent.jsp"> retour a la page precedente</a>

</p>
		
		</div>
	</header>



</body>
</html>