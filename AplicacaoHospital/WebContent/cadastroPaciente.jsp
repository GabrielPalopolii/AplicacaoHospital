<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="style.css" rel="stylesheet" type="text/css">

</head>
<body>
	<fieldset>
		<legend>			
			<h1>Ficha de Cadastro</h1>
		</legend>
		<form action="cadastroPaciente" method ="post">
			<div id ="ficha">
			
			Nome:
					<input name ="nome" type ="text" placeholder= "digite seu nome">

				
				
					Telefone:
					<input name ="tel" type ="text" placeholder= "digite seu telefone">
				
				<br>
				
				
					CPF:
					<input name ="cpf" type ="text" placeholder= "digite CPF paciente">
				
				
				
					Data Nascimento:
					<input id ="dt" type ="date" placeholder= "digite Data Nascimento">
				
				
				
				<br>
				
				</div>
			<label>
					
				<button id ="cd">Cadastrar</button>
		</form>
		
	
		<div id ="image">
			<img id ="wallpaper" src ="images.jpg">
		</div>
				
				</div>
		
	</fieldset>
	
	
	

</body>
</html>