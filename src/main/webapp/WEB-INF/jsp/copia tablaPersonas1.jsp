<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Sanguchetto</title>
<!-- Bootstrap -->
<link href="css/bootstrap-tema.min.css" rel="stylesheet">
</head>
<body>

<h1>		Persona - <small>Listado</small> </h1>
			<table class="table table-striped">
				<tr>
					<td><h1> nombre </h1></td>
					<td><h1> apellido </h1> </td>
					<td><h1> email</h1></td>
					<td><h1> edad</h1></td>
				
				</tr>
			
				<c:forEach items="${tabla}" var="persona">
					<tr>
						<td>${persona.nombre}</td>
						<td>${persona.apellido}</td>
						<td>${persona.email}</td>
						<td>${persona.edad}</td>
					</tr>
				</c:forEach>
			</table>
			<a href="irform">Dar de Alta una persona</a>
		</div>
		<div class="col-md-2"></div>
		
	</div>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="js/jquery-1.11.3.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>
</body>
</html>
