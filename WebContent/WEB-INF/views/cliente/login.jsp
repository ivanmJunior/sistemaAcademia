<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="icon" href="<%=request.getContextPath()%>/resources/imagem/Logo21x21.ico">
	<link href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css"	rel="stylesheet">
	<link href="<%=request.getContextPath()%>/resources/css/signin.css"	rel="stylesheet">
	<jsp:include page="/WEB-INF/views/templates/navBarDark.jsp"></jsp:include>

	<title>Login - FitNet</title>


</head>

<body class="text-center">
	<form class="form-signin" action="<%=request.getContextPath()%>/areaDoCLiente" method="post">
		<jsp:include page="/WEB-INF/views/templates/frmLogin.jsp"></jsp:include>
	</form>
</body>
</html>