<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Ejemplo Spring MVC</title>

</head>
<body>


	<div class="container">
		<div class="panel panel-default">
			<div class="panel-body">
				<form:form action="updatepersona" modelAttribute="persona" role="form" method="POST" >
					<div class="form-group">
						<label for="nombre">Nombre</label>
						<form:input id="nombre" class="form-control" type="text" path="nombre" placeholder="Ingresar Nombre" />
					</div>
					<div class="form-group">
						<label for="apellido">Apellido</label>
						<form:input id="apellido" class="form-control" type="text" path="apellido" placeholder="Ingresar Apellido" />
					</div>
					<div class="form-group">
						<label for="mail">Mail</label>
						<form:input id="mail" class="form-control" type="mail" path="email" placeholder="Ingresar Mail" />
					</div>
					<div class="form-group">
						<label for="edad">Edad</label>
						<form:input id="edad" class="form-control" type="text" path="edad" placeholder="Ingresar Edad" />
					</div>
					<button type="submit" class="btn btn-default">Modificar</button>
				</form:form>
			</div>
			<div>
			  
			</div>
		</div>
	</div>
</body>	
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="js/jquery-1.11.3.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>
</html>