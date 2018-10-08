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
    <div class="container">
      
      <div class="page-header">
      	<h1 class="mt-5">Modalidades</h1>
      </div>
     
      <div class="row">
      	<div class="col-sm-2">
      		
      	<a href="<%=request.getContextPath()%>/novaModalidade"  class="btn btn-outline-primary my-2 my-sm-3">Nova Modalidade</a>
      		
      	</div>
      	<div class="col-sm-4">
      		<form class="form-inline mt-2 mt-md-0" action="<%=request.getContextPath()%>/filtrarTelaModalidade?descricao=${modalidade.descricao}">
      			<input class="form-control mr-sm-1" type="text" name="descricao"
				placeholder="Digite aqui" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-3" type="submit">Filtrar</button>
      		</form>
      	</div>
      </div>
      
      
		<table class="table table-striped">
		  <thead>
		    <tr>
		      <th scope="col">Código</th>
		      <th scope="col">Descrição</th>
		      <th scope="col">Valor</th>
		      <th scope="col">Observação</th>
		      <th scope="col">Data Cadastro</th>
		      <th scope="col">Ativa</th>
		      <th scope="col">Ação</th>
		    </tr>
		  </thead>
		  <tbody>
		  	<c:forEach items="${listaModalidades}" var="modalidade">
	  		 	<tr>
	  		 	  <td>${modalidade.idModalidade}</td>
	  		 	  <td>${modalidade.descricao}</td>
	  		 	  <td><fmt:setLocale value="PT_BR"/>
	  		 	  	<fmt:formatNumber value="${modalidade.valor}" type="currency"></fmt:formatNumber> </td>
			      <td>${modalidade.observacao}</td>
			      <td><fmt:formatDate value="${modalidade.dataCadastro.time}" pattern="dd-MM-yyyy"/></td>
			      <c:if test="${modalidade.statusAtivo eq true}">
			      	<td>SIM</td>
			      </c:if>
			      <c:if test="${modalidade.statusAtivo eq false}">
			      	<td>NÃO</td>
			      </c:if>
			      <td><a href="<%=request.getContextPath() %>/carregarTelaModalidade?idModalidade=${modalidade.idModalidade}"
			      class="btn btn-primary btn-xs">Editar</a>
			      	  <a href="<%=request.getContextPath() %>/removeModalidade?idModalidade=${modalidade.idModalidade}" class="btn btn-danger btn-xs">Excluir</a>
			      </td>
		    	</tr>
		  	</c:forEach>
		   </tbody>
		</table>
		
		
	   	
	</div>
	
	
	<!-- Modal Cadastrar Modalidade -->

	<div class="modal fade" id="cadastrarModalidade" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
	  <div class="modal-dialog modal-dialog-centered" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="exampleModalLabel">Cadastrar Modalidade</h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	          <span aria-hidden="true">&times;</span>
	        </button>
	      </div>
	      <div class="modal-body">
     	
        <form class="needs-validation" novalidate action="<%=request.getContextPath()%>/adicionaModalidades" method="post">
		  
		  <div class="form-row">
		    <div class="col-md-12 mb-3">
		      <label for="validationCustom01">Descrição</label>
		      <input type="text" name="descricao" class="form-control" id="validationCustom01" placeholder="Descrição" required>
		      <div class="valid-feedback">
		        Ok!
		      </div>
		    </div>
		    </div>
		    <div class="form-row">
		    <div class="col-md-6 mb-3">
		      <label for="validationCustom02">Valor R$</label>
		      <input type="text" name="valor" class="form-control" id="validationCustom02" placeholder="0.00" required>
		      <div class="valid-feedback">
		        Ok!
		      </div>
		    </div>
		    </div>
		     <div class="form-row">
		    <div class="col-md-12 mb-3">
		      <label for="validationCustom03">Observação</label>
		      <input type="text" name="observacao" class="form-control" id="validationCustom03" placeholder="Observações">
		      <div class="valid-feedback">
		        Ok!
		      </div>
		    </div>
		    </div>
			  <div class="form-group">
			    <div class="form-check">
			      <input class="form-check-input" type="checkbox" id="invalidCheck" name="statusAtivo" checked="checked">
			      <label class="form-check-label" for="invalidCheck">
			        Ativa
			      </label>
			    </div>
			  </div>
		  	<button class="btn btn-primary" type="submit">Salvar</button>
		    <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>
	      </form>
	      </div>
	   	</div>
	  </div>
	</div>

<!-- Modal Editar Modalidade -->

	<div class="modal fade" id="editarModalidade" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
	  <div class="modal-dialog modal-dialog-centered" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="exampleModalLabel">Editar Modalidade</h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	          <span aria-hidden="true">&times;</span>
	        </button>
	      </div>
	      <div class="modal-body">
     	
        <form class="needs-validation" novalidate action="<%=request.getContextPath()%>/alteraModalidade" method="post">
		  
		  <div class="form-row">
		    <div class="col-md-12 mb-3">
		      <label for="validationCustom01">Descrição</label>
		      <input type="text" name="descricao" class="form-control" id="validationCustom01" value="${modalidade.descricao}" placeholder="Descrição" required>
		      <div class="valid-feedback">
		        Ok!
		      </div>
		    </div>
		    </div>
		    <div class="form-row">
		    <div class="col-md-6 mb-3">
		      <label for="validationCustom02">Valor R$</label>
		      <input type="text" name="valor" class="form-control" id="validationCustom02" placeholder="0.00" required>
		      <div class="valid-feedback">
		        Ok!
		      </div>
		    </div>
		    </div>
		     <div class="form-row">
		    <div class="col-md-12 mb-3">
		      <label for="validationCustom03">Observação</label>
		      <input type="text" name="observacao" class="form-control" id="validationCustom03" placeholder="Observações">
		      <div class="valid-feedback">
		        Ok!
		      </div>
		    </div>
		    </div>
			  <div class="form-group">
			    <div class="form-check">
			      <input class="form-check-input" type="checkbox" id="invalidCheck" name="statusAtivo" checked="checked">
			      <label class="form-check-label" for="invalidCheck">
			        Ativa
			      </label>
			    </div>
			  </div>
		  	<button class="btn btn-primary" type="submit">Editar</button>
		    <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>
	      </form>
	      </div>
	   	</div>
	  </div>
	</div>
	<script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
	<script	src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
	<script	src="<%=request.getContextPath()%>/resources/js/validaFormClienteUser.js"></script>
	</body>
</html>