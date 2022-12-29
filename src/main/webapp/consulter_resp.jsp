<%@ page language="java" contentType="text/html; charset=ISO-8859-1" import="java.util.*"
    pageEncoding="ISO-8859-1" import="java.sql.*" import="crud.Resp_u" import="dbinteraction.Db_inter" import="crud.Dao1"%>
<!DOCTYPE html>
<html>
<meta charset="ISO-8859-1">
<link type="text/css"rel="stylesheet" href="style.css">
<title>Insert title here</title>
<head>
<title>Affichage JSP</title>
</head>
<body>

<table border="1" class ="table">
<thead>

<tr><th colspan="5"><h3> Liste des Responsable inscrits : </h3></th></tr>
<tr>
<th>CNI</th>
<th>NOM</th>
<th>PRENOM</th>
<th>EMAIL</th>
<th>PASSWORD</th>
 
</tr>
</thead>
<tbody style="color:white">
<% Dao1 dao=new Dao1() ;
   List <Resp_u> list=new ArrayList<Resp_u>();
    list =dao.afficher_all_resp(); 
%>
<% for(Resp_u e:list) {%>
<tr> <td><%=e.getCni() %></td>
     <td><%=e.getNom() %></td>
     <td><%=e.getPrenom() %></td>
     <td><%=e.getLogin() %></td>
     <td><%=e.getPassword() %></td>
    
</tr> <%} %>
</tbody>
</table>
<a href="index.jsp"  >Retour a la page Precedente</a>
</body>
</html>