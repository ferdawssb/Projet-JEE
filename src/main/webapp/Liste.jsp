
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="Model.Etudiant"%>
<%@ page import="Dao.Gestiondb"%>
<%@ page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>




	<h1>Liste des Etudiants</h1>
	<table>
		<th>Num</th>
		<th>Nom</th>
		<th>Prenom</th>
		<th>Tel</th>
		<th>Action</th>


		<%
		Gestiondb ges = new Gestiondb();
		List<Etudiant> le = ges.getAllEtudiants();

		for (int i = 0; i < le.size(); i++) {
		%>
		<tr>
			<td><%=le.get(i).getNum()%></td>
			<td><%=le.get(i).getNom()%></td>
			<td><%=le.get(i).getPrenom()%></td>
			<td><%=le.get(i).getTel()%></td>
			<td><a href="Supprimer?id=<%=le.get(i).getNum()%>">Supprimer</a></td>
		</tr>
		<%
		}
		%>
	</table>
	<br>

	<hr>



	<h1>Ajouter un etudiant</h1>
	<form method="post" action="/ServletDemo/Ajouter">
		Numero: <input type="number" name="num"> Prenom:<input
			type="Text" name="prenom"> Nom: <input type="text" name="nom">
		Tel:<input type="Text" name="tel"> <input type="Submit"
			Value="Enregistre">
	</form>


</body>
</html>