<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  

<link type="text/css" rel="stylesheet" href="style.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Cairo:wght@200;600;800&family=Fredoka:wght@300;400;500;600&family=Noto+Sans:wght@400;700&display=swap" rel="stylesheet">
<title>Insert new admin</title>
</head>
<body>


<form action="Inscription" method="post" class="infos">

<h1>Inscription</h1>
 <input type="text" name="id" placeholder="id" required>
 <input type="text" name="nom" placeholder="Last  Name" required>
 <input type="text" name="pren" placeholder="First Name" required>
  <input type="text" name="log" placeholder="login" required>
 <input type="text" name="pass" placeholder="password" required>
 
 
 <input type="submit"   name="act" value="inscrire"    placeholder="Add">

</form>


</body>
</html>