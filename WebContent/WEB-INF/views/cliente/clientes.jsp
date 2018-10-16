<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!doctype html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel="icon" href="<%=request.getContextPath()%>/resources/imagem/Logo21x21.ico">
		<link href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css"	rel="stylesheet">
		<link href="<%=request.getContextPath()%>/resources/css/sticky-footer-navbar.css" rel="stylesheet">
		
		<title>Sistema - FitNet</title>
		
	</head>
	<body>
		
		<jsp:include page="/WEB-INF/views/templates/navBarDarkCorporation.jsp"></jsp:include>
		
		<!-- Begin page content -->
   	  <div class="container-fluid">
      	<h1 class="mt-5">Clientes</h1>
      
      <div class="row">
      	<div class="col-sm-2">
      		<form class="navbar-form" action="<%=request.getContextPath()%>/formCliente">
      			<button type="submit" class="btn btn-outline-primary my-2 my-sm-3">Novo Cliente</button>
      		</form>
      	</div>
      	<div class="col-sm-4">
      		<form class="form-inline mt-2 mt-md-0"  action="<%=request.getContextPath()%>/filtrarTelaCliente?nome=${cl.nome}">
      			<input class="form-control mr-sm-1" type="text" name="nome"
				placeholder="Digite aqui" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-3" type="submit">Filtrar</button>
      		</form>
      	</div>
      </div>
      
		<table class="table table-striped">
		  <thead>
		    <tr>
		      <th scope="col">Matricula</th>
		      <th scope="col">Código</th>
		      <th scope="col">CPF</th>
		      <th scope="col">Nome</th>
		      <th scope="col">Email</th>
		      <th scope="col">Fone</th>
		      <th scope="col">Celular</th>
		      <th scope="col">Ativo</th>
		      <th scope="col">Data Cadastro</th>
		      <th scope="col">Ação</th>
		    </tr>
		  </thead>
		  <tbody>
		  	<c:forEach items="${clientes}" var="cl">
	  		 	<tr>
	  		 	  
	  		 	  <td>${cl.matricula.numeroMatricula}</td>
	  		 	  <td>${cl.id}</td>
	  		 	  <td>${cl.cpf}</td>
			      <td>${cl.nome}</td>
			      <td>${cl.email}</td>
			      <td>${cl.fone}</td>
			      <td>${cl.fone2}</td>
			      <c:if test="${cl.statusAtivo eq true}">
			      	<td>SIM</td>
			      </c:if>
			      <c:if test="${cl.statusAtivo eq false}">
			      	<td>NÃO</td>
			      </c:if>
			      <td><fmt:formatDate type="date" value="${cl.dataCadastro.time}" pattern="dd/MM/yyyy"/></td>
			      <td><a href="<%=request.getContextPath() %>/carregarTelaCliente?id=${cl.id}" class="btn btn-primary btn-xs">Editar</a>
			      	  <a href="<%=request.getContextPath() %>/removeCliente?id=${cl.id}" class="btn btn-danger btn-xs">Excluir</a>
			      </td>
		    	</tr>
		  	</c:forEach>
		   </tbody>
		</table>
	</div>
	
	<!-- Modal Formulário de Cadoastro de Cliente -->
	
	<jsp:include page="/WEB-INF/views/templates/modalFormulario.jsp"></jsp:include>
	
		<script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
		<script	src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
		<script	src="<%=request.getContextPath()%>/resources/js/validaFormClienteUser.js"></script>
		<script	src="<%=request.getContextPath()%>/resources/js/verificarSenhas.js"></script>
	</body>
</html>