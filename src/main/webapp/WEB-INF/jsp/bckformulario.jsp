<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Ejemplo Spring MVC</title>

<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<nav class="navbar navbar-default" role="navigation">
  <div class="navbar-header">
    <button type="button" class="navbar-toggle" data-toggle="collapse"
            data-target=".navbar-ex1-collapse">
      <span class="sr-only">Desplegar navegación</span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
    </button>
    <a class="navbar-brand" href="#">SANGUCHETTO</a>
  </div>
 
  <!-- Agrupar los enlaces de navegación, los formularios y cualquier
       otro elemento que se pueda ocultar al minimizar la barra -->
  <div class="collapse navbar-collapse navbar-ex1-collapse">
    <ul class="nav navbar-nav">
    
    <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
          Carrito <span class="glyphicon glyphicon-shopping-cart" aria-hidden="true">
          <b class="caret"></b>
        </a>
        <ul class="dropdown-menu">
          <li><a href="agregarAlCarrito">Agregar</a></li>        
          <li class="divider"></li>
          <li><a href="carrito">Ver</a></li>          
        </ul>
      </li>
      
      <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
          Personas <b class="caret"></b>
        </a>
        <ul class="dropdown-menu">
          <li><a href="irform">Alta</a></li>          
          <li><a href="consultarpersonas">Consulta</a></li>
          <li class="divider"></li>
          <li><a href="modificarpersonas">Modificar(edad)</a></li>
          <li><a href="Eliminar">Eliminar</a></li>
        </ul>
      </li>
      <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
          Ingredientes <b class="caret"></b>
        </a>
        <ul class="dropdown-menu">
          <li><a href="agregarIngrediente">Alta</a></li>
          <li class="divider"></li>
          <li><a href="consultarIngrediente">Consulta</a></li>
        </ul>
      </li>      
    </ul>
  </div>
</nav>

	<div class="container">
		<div class="panel panel-default">
			<div class="panel-body">
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
			</div>
		</div>
	</div>
</body>	
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="js/jquery-1.11.3.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>
</html>