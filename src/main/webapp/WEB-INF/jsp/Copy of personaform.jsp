<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2> formulario  personas </h2>
<form:form action="saludo" modelAttribute="persona" role="form" method="POST" >
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
					<button type="submit" class="btn btn-default">Enviar</button>
				</form:form>
</body>
</html>