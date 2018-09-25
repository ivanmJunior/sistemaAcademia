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
	<body>
		
		<div class="container">
			<h1 class="mt-5">FitNet</h1>
			<div class="alert alert-warning alert-dismissible fade show" role="alert">
           		<h3>${msg}</h3>
           		<button type="button" class="close" data-dismiss="alert" aria-label="Close">
    			<span aria-hidden="true">&times;</span>
  				</button>
  				</div>
  				<div class="form-group">
  					<div class="col-sm-offset-2 col-sm-10">
  						<a href="<%=request.getContextPath()%>/WEB-INF/views/login.jsp" class="btn btn-primary">Fazer Login</a>
  						<a href="<%=request.getContextPath()%>" class="btn btn-secondary">Página Inicial</a>
  					</div>
  				</div>
 		</div>
	
		<jsp:include page="/resources/templates/rodapeDark.jsp"></jsp:include>
	
		<script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
		<script	src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
		<script	src="<%=request.getContextPath()%>/resources/js/validaFormClienteUser.js"></script>
	</body>
</html>