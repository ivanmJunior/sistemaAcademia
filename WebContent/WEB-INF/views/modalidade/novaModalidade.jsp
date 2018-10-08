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
		
		<div class="container">
			<h2 class="mt-5">Cadastrar Nova Modalidade</h2>
		
		<div class="ccol-md-6 mb-3">
		
        <form class="needs-validation" novalidate action="<%=request.getContextPath()%>/adicionaModalidades" method="post">
		  
		  <div class="form-row">
		    <div class="col-md-6 mb-3">
		      <label for="validationCustom01">Descrição</label>
		      <input type="text" name="descricao"  class="form-control" id="validationCustom01" placeholder="Descrição" required>
		      <div class="valid-feedback">
		        Ok!
		      </div>
		    </div>
		    </div>
		    <div class="form-row">
		    <div class="col-md-2 mb-3">
		      <label for="validationCustom02">Valor R$</label>
		      <input type="text" name="valor" class="form-control" id="validationCustom02" placeholder="0.00" required>
		      <div class="valid-feedback">
		        Ok!
		      </div>
		    </div>
		    </div>
		     <div class="form-row">
		    <div class="col-md-6 mb-3">
		      <label for="validationCustom03">Observação</label>
		      <textarea name="observacao"  class="form-control" id="validationCustom03" placeholder="Observações"></textarea>
		     
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
		  	<button class="btn btn-success" type="submit">Salvar</button>
		    	<a href="<%=request.getContextPath() %>/listarModalidades" class="btn btn-secondary">Voltar</a>
	      </form>
	      </div>
		</div>
	
		<jsp:include page="/WEB-INF/views/templates/rodapeDark.jsp"></jsp:include>
	
		<script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
		<script	src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
		<script	src="<%=request.getContextPath()%>/resources/js/validaFormClienteUser.js"></script>
	</body>
</html>