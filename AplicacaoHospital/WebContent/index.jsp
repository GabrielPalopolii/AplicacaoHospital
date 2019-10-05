<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hospital</title>
<link href="style.css" rel="stylesheet" type="text/css">

</head>
<body>
	<div id ="content">		
		<fieldset>
			<legend>
				<h1>Hospital</h1>
				
			</legend>
			
			<div id ="homeContent">
			<form action="login" method="post">
				<input type ="text" name ="login" placeholder="Login"/>
				<input type ="password" name ="senha" placeholder="Senha"/>
				<button>Enviar</button>
				<br>
				<a id ="navHome"href ="cadastro.jsp">Click Aqui para se Cadastrar</a>
				
		</div>
			</form>
		
		</fieldset>

	</div>
		<div id ="image">
			<img id ="wallpaper" src ="images.jpg">
		</div>

</body>
</html>