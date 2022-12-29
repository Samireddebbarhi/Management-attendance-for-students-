<%@ page language="java" contentType="text/html; charset=ISO-8859-1" import="java.util.*"
    pageEncoding="ISO-8859-1" import="java.sql.*" import="crud.User" import="dbinteraction.Db_inter" import="crud.Dao1"%>
<!DOCTYPE html>

<html>
<meta charset="ISO-8859-1">
<link type="text/css"rel="stylesheet" href="style.css">
<title>Insert title here</title>
<head>
<title>Affichage JSP</title>
</head>
<body>
<% String msg=(String)session.getAttribute("m");

 if(msg!=null){
  if (msg.equals("actif"))
  {%>
 <input type="text" class="infos "style="color:red;"value ="Mr/Mme <%=session.getAttribute("l") %> <%=session.getAttribute("f")%> est inscrit avec SUCCES!!!" disabled />
   <%} 
  else if(msg.equals("inactif"))
      { %>
    <p style="color:red;">   VOTRE INSCRIPTION A ETE ERRONE </p> 
  
 <%}}%>

<table border="1" class ="table">
<thead>

<tr><th colspan="8"><h3> Liste des Etudiants inscrits : </h3></th></tr>
<tr>
<th>ID</th>
<th>CNE</th>
<th>NOM</th>
<th>PRENOM</th>
<th>DATE DE NAISSANCE</th>
<th>FILIERE</th>
<th>PARCOURS</th>
<th>SEMESTRE</th>
</tr>
</thead>
<tbody style="color:white" >
<% Dao1 dao=new Dao1() ;
   List <User> list=new ArrayList<User>();
    list =dao.afficher_all_etud(); 
%>
<% for(User e:list) {%>
<tr> <td><%=e.getId() %></td>
     <td><%=e.getCNE() %></td>
     <td><%=e.getNom() %></td>
     <td><%=e.getPrenom() %></td>
     <td><%=e.getDateDeNaissaance() %></td>
     <td><%=e.getFiliere() %></td>
     <td><%=e.getParcours() %></td>
     <td><%=e.getSemestre()%></td>
</tr> <%} %>
</tbody>
</table>
 <p align="right"><a href="index.jsp"  >Retour a la page Precedente</a></p>
 
  
  
 

</body>
</html>
