<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro Funcionario</title>
</head>
<body>

	<div id ="content">
		<form action="funcionario" method ="post">
		<fieldset>
			<legend>
				Cadastro Funcionario
			</legend>
			
			<div id = componentes>
				<label>
					Nome Completo:
					<input name ="nome" type ="text" placeholder= "digite seu nome">
				</label>
				
				<label>
					E-mail:
					<input name ="email" type ="text" placeholder= "digite seu E-mail">
				</label>
				
				<br>
				<label>
					Telefone:
					<input name ="tel" type ="text" placeholder= "digite seu telefone">
				</label>
				
				<label>
					Usuario:
					<input name ="user" type ="text" placeholder= "digite seu nome de Usuario" required>
				</label>
				<br>
				<label>
					Senha:
					<input name ="pwd" type ="password" placeholder= "digite sua senha" required>
				</label>
				
				<label>
					Cargo:
					<input name ="cargo" type ="text" placeholder= "digite: medico ou recepcionista">
					
					
					</select>
				</label>
				
				<button>Cadastro</button>
				</form>
			</div>
		
		</fieldset>
	
	
	
	</div>


</body>
</html>