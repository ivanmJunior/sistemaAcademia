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
      	<h1 class="mt-5">Funcionarios</h1>
      
      <div class="row">
      	<div class="col-sm-2">
      		<form class="navbar-form" action="">
      			<a href="#" class="btn btn-outline-primary my-2 my-sm-3" 
                 data-toggle="modal" data-target="#selecionaFuncaoModal">Novo Funcionario</a>
      		</form>
      	</div>
      	<div class="col-sm-4">
      		<form class="form-inline mt-2 mt-md-0" action="<%=request.getContextPath()%>/filtrarTelaFuncionario?nome=${funcionario.nome}">
      			<input class="form-control mr-sm-1" type="text" name="nome"
				placeholder="Digite aqui" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-3" type="submit">Filtrar</button>
      		</form>
      	</div>
      </div>
      
		<table class="table table-striped">
		  <thead>
		    <tr>
		      <th scope="col">Código</th>
		      <th scope="col">CPF</th>
		      <th scope="col">Nome</th>
		      <th scope="col">Função</th>
		      <th scope="col">Fone</th>
		      <th scope="col">Celular</th>
		      <th scope="col">Ativo</th>
		      <th scope="col">Data Cadastro</th>
		      <th scope="col">Ação</th>
		    </tr>
		  </thead>
		  <tbody>
		  	<c:forEach items="${listaFuncionarios}" var="funcionario">
	  		 	<tr>
	  		 	  
	  		 	  <td>${funcionario.id}</td>
	  		 	  <td>${funcionario.cpf}</td>
	  		 	  <td>${funcionario.nome}</td>
			      <td>${funcionario.funcao}</td>
			      <td>${funcionario.fone}</td>
			      <td>${funcionario.fone2}</td>
			      
			      <c:if test="${funcionario.statusAtivo eq true}">
			      	<td>SIM</td>
			      </c:if>
			      <c:if test="${funcionario.statusAtivo eq false}">
			      	<td>NÃO</td>
			      </c:if>
			      <td><fmt:formatDate type="date" value="${funcionario.dataCadastro.time}" pattern="dd/MM/yyyy"/></td>
			      <td><a href="<%=request.getContextPath() %>/carregarTelaFuncionario?id=${funcionario.id}" class="btn btn-primary btn-xs">Editar</a>
			      	  <a href="<%=request.getContextPath() %>/removeFuncionario?id=${funcionario.id}" class="btn btn-danger btn-xs">Excluir</a>
			      </td>
		    	</tr>
		  	</c:forEach>
		   </tbody>
		</table>
	</div>
	
	<!-- Modal Formulário de Cadoastro de Cliente -->
	
	<jsp:include page="/WEB-INF/views/templates/modalFormulario.jsp"></jsp:include>
	
	<div class="modal fade " id="selecionaFuncaoModal" tabindex="-1"
		role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true" >
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Selecionar Função</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form class="needs-validation" novalidate
						action="<%=request.getContextPath()%>/selecionaInserir"
						method="post">
						<div class="col-md-7 mb-3">
                  <label for="exampleInputCountryFuncao">Função</label>
                  <select class="form-control" id="exampleInputCountryFuncao" name="funcao" required>
                    <option value="" selected="selected">Selecione uma Função</option>
                    <option value="Recepcionista">Recepcionista</option>
                    <option value="Instrutor">Instrutor</option>
                    <option value="Nutricionista">Nutricionista</option>
        
                 </select>
                 <div class="invalid-feedback">
		            Informe a Função.
		         </div>
            </div>
            <div class="modal-footer">
							<button type="button" class="btn btn-secondary"
								data-dismiss="modal">Fechar</button>
							<button type="submit" class="btn btn-success">Confirmar</button>
						</div>
						</form>
						</div>
						</div>
						</div>
						</div>
	
		<script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
		<script	src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
		<script	src="<%=request.getContextPath()%>/resources/js/validaFormClienteUser.js"></script>
		<script	src="<%=request.getContextPath()%>/resources/js/verificarSenhas.js"></script>
		
	</body>
</html>