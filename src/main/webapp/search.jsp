<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="crud.User" import="crud.Dao1" %>
<!DOCTYPE html>
<html>
<head>
 <meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>Freelancer - Start Bootstrap Theme</title>
 
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700"
	rel="stylesheet" type="text/css" />
<link
	href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic"
	rel="stylesheet" type="text/css" />
<!-- Core theme CSS (includes Bootstrap)-->
<link href="css/index-styles.css" rel="stylesheet" />
</head>
<body id="page-top">

<table border="1" class ="table">
<thead>

<tr><th colspan="8"><h3> l etudiant trouve : </h3></th></tr>
<tr>
<th>ID</th>
<th>CNE</th>
<th>NOM</th>
<th>PRENOM</th>
<th>DATE_DE_NAISSANCE</th>
<th>FILIERE</th>
<th>PARCOURS</th>
<th>SEMESTRE</th>
</tr>
</thead>
<tbody>
<% Dao1 dao=new Dao1() ;
 int id=(int)session.getAttribute("y");
 User e=dao.findById(id);  
%>

<tr> <td><%=e.getId() %></td>
     <td><%=e.getCNE() %></td>
     <td><%=e.getNom() %></td>
     <td><%=e.getPrenom() %></td>
     <td><%=e.getDateDeNaissaance() %></td>
     <td><%=e.getFiliere() %></td>
     <td><%=e.getParcours()%></td>
     <td><%=e.getSemestre()%></td>
</tr> 
</tbody>
</table>
<a href="addStudent.jsp" >Retour a la page Precedente</a>
</body>
</html>