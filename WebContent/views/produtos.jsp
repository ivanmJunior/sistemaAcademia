<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!doctype html>
<html>
  <head>
    <meta charset="ISO-8859-1">
    <link rel="icon" href="<%=request.getContextPath()%>/imagem/Logo21x21.ico">
    <link href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/resources/css/sticky-footer-navbar.css" rel="stylesheet">
   
    <title>Produtos - FitNet</title>
  </head>

  <body>

    <jsp:include page="/resources/templates/navBarDark.jsp"></jsp:include>

    <div class="container">
      <h1 class="mt-5">FitNet</h1>
      <p class="lead">Começando</p>
      <p>Voltar para <a href="../sticky-footer">the default sticky footer</a> minus the navbar.</p>
    </div>

	<jsp:include page="/resources/templates/rodapeDark.jsp"></jsp:include>
	
    <script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
    <script src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
  </body>
</html>
