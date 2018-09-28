<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!doctype html>
<html>
  <head>
    <meta charset="ISO-8859-1">
   <link rel="icon" href="<%=request.getContextPath()%>/imagem/Logo21x21.ico">
   
    <title>Dados dos Clientes - FitNet</title>

    <!-- Bootstrap core CSS -->
    <link href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="<%=request.getContextPath()%>/resources/css/sticky-footer-navbar.css" rel="stylesheet">
  </head>
 
	<jsp:include page="/resources/templates/navBarDarkCorporation.jsp"></jsp:include>

    <!-- Begin page content -->
    <div class="container-fluid">
      <div class="page-header">
      	<h1 class="mt-5">Clientes</h1>
      </div>
      <div class="row">
      	<div class="col-sm-2">
      		<form class="navbar-form" action="<%=request.getContextPath()%>/views/cadastrarClienteSistema.jsp">
      			<button type="submit" class="btn btn-outline-primary my-2 my-sm-3">Novo Cliente</button>
      		</form>
      	</div>
      	<div class="col-sm-4">
      		<form class="form-inline mt-2 mt-md-0" action="">
      			<input class="form-control mr-sm-1" type="text"
				placeholder="Digite aqui" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-3" type="submit">Filtrar</button>
      		</form>
      	</div>
      </div>
      
		<table class="table">
		  <thead>
		    <tr>
		      <th scope="col">Linha</th>
		      <th scope="col">Matricula</th>
		      <th scope="col">Código</th>
		      <th scope="col">CPF</th>
		      <th scope="col">Nome</th>
		      <th scope="col">Email</th>
		      <th scope="col">Fone</th>
		      <th scope="col">Celular</th>
		      <th scope="col">Data Cadastro</th>
		      <th scope="col">Ação</th>
		    </tr>
		  </thead>
		  <tbody>
		  	<c:forEach items="${clientes}" var="cl">
	  		 	<tr>
	  		 	  <th scope="row">1</th>
	  		 	  <td>${cl.matricula.numeroMatricula}</td>
	  		 	  <td>${cl.id}</td>
	  		 	  <td>${cl.cpf}</td>
			      <td>${cl.nome}</td>
			      <td>${cl.email}</td>
			      <td>${cl.fone}</td>
			      <td>${cl.fone2}</td>
			      <td><fmt:formatDate type="date" value="${cl.dataCadastro}"/></td>
			      <td><a href="" class="btn btn-primary btn-xs">Editar</a>
			      	  <a href="" class="btn btn-danger btn-xs">Excluir</a>
			      </td>
		    	</tr>
		  	</c:forEach>
		   </tbody>
		</table>
	</div>
</body>
</html>