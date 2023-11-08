<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Gestion des Etudiants</h1>
<hr>

<h2>Entre votre identité:</h2>
<form method="post" action="/ServletDemo/Verification">

Utilisateur: <input type="Text" name="user" >
<br>
<br>
Mot de passe: <input type="password" name="password">
<br>
<br>
<input type="Submit" value="se connecter">

</form>


</body>
</html>