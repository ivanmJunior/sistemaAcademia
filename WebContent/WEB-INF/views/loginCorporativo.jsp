<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!doctype html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel="icon" href="<c:url value="/resources/imagem/Logo21x21.ico"/>">
		<link href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" rel="stylesheet">
		<link href="<%=request.getContextPath()%>/resources/css/sticky-footer-navbar.css" rel="stylesheet">
		<link href="<%=request.getContextPath()%>/resources/css/signin.css"	rel="stylesheet">
		
		<title>Login Corporativo - FitNet</title>
		<jsp:include page="/WEB-INF/views/templates/navBarDark.jsp" ></jsp:include>
	</head>
	<body class="text-center">
		
		<form class="form-signin" action="<%=request.getContextPath()%>/logarSistema" method="post">
			<jsp:include page="/WEB-INF/views/templates/frmLogin.jsp"></jsp:include>
		</form>
		
		<script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
		<script	src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
		<script	src="<%=request.getContextPath()%>/resources/js/validaFormClienteUser.js"></script>
	</body>
</html>