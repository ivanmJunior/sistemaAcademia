<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="icon" href="<%=request.getContextPath()%>/imagem/Logo21x21.ico">
	<link href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css"	rel="stylesheet">
	<link href="<%=request.getContextPath()%>/resources/css/signin.css"	rel="stylesheet">
	<jsp:include page="/resources/templates/navBarDark.jsp"></jsp:include>

	<title>Login - FitNet</title>


</head>

<body class="text-center">
	<form class="form-signin" action="<%=request.getContextPath()%>/ControllerAcessoCliente" method="post">
		<jsp:include page="/resources/templates/frmLogin.jsp"></jsp:include>
	</form>
</body>
</html>