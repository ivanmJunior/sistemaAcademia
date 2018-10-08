<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!doctype html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel="icon" href="<%=request.getContextPath()%>/imagem/Logo21x21.ico">
		<link href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css"	rel="stylesheet">
		<link href="<%=request.getContextPath()%>/resources/css/sticky-footer-navbar.css" rel="stylesheet">
		
		<title>FitNet</title>
		
	</head>
	<body onload="mensagem();">
		
		<div class="container">
			<div class="text-center">
				<img class="rounded mx-auto d-block"
					src="<c:url value="/resources/imagem/Logo64x64.png"/>" alt=""
					width="200" height="200" >
				<h3 class="col-ms-12 mb-5">FitNet</h3>
				
			<div class="alert alert-warning" role="alert">
           		<h3>${msg.mensagemErro}</h3>
   		    </div>
  				<div class="form-group">
  					<div class="col-sm-offset-2 col-sm-12">
  						<button onclick="voltar()" class="btn btn-secondary">Voltar</button>
  					</div>
  				</div>
  			</div>
 		</div>

		<jsp:include page="/WEB-INF/views/templates/rodapeDark.jsp"></jsp:include>
	
		<script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
		<script	src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
		<script	src="<%=request.getContextPath()%>/resources/js/validaFormClienteUser.js"></script>
		<script src="<%=request.getContextPath()%>/resources/js/voltar.js"></script>
	</body>
</html>