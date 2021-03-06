<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!doctype html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel="icon" href="/imagem/Logo21x21.ico">
		<link href="/resources/css/bootstrap.min.css"	rel="stylesheet">
		<link href="/resources/css/sticky-footer-navbar.css" rel="stylesheet">
		
		<title>Nova P�gina - FitNet</title>
		
	</head>
	<body>
		<jsp:include page="/WEB-INF/views/templates/navBarDark.jsp"></jsp:include>
		
		<div class="container">
			<h1 class="mt-5">FitNet</h1>
			<p class="lead">P�gina em Branco</p>
		</div>
	
		<jsp:include page="/WEB-INF/views/templates/rodapeDark.jsp"></jsp:include>
	
		<script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
		<script	src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
		<script	src="<%=request.getContextPath()%>/resources/js/validaFormClienteUser.js"></script>
	</body>
</html>