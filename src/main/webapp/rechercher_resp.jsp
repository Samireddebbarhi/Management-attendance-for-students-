<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="crud.Resp_u" import="crud.Dao1" %>
<html>
<head>
 <meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>cherchher</title>
 
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

<tr><th colspan="5"><h3> Le Responsable qui se trouve : </h3></th></tr>
<tr>
<th>CNI</th>
<th>NOM</th>
<th>PRENOM</th>
<th>EMAIL</th>
<th>PASSWORD</th>
</tr>
</thead>
<tbody>
<% Dao1 dao=new Dao1() ;
 String cni=(String)session.getAttribute("y");
 Resp_u e=dao.findByCNI(cni);  
%>

<tr> <td><%=e.getCni()%></td>
     <td><%=e.getNom()%></td>
     <td><%=e.getPrenom()%></td>
     <td><%=e.getLogin()%></td>
     <td><%=e.getPassword()%></td>
</tr> 
</tbody>
</table>
<a href="Acceuil_resp.jsp" >Retour a la page Precedente</a>
</body>
</html>