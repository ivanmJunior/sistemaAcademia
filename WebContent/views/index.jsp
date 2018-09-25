<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!doctype html>
<html>
  <head>
    <meta charset="ISO-8859-1">
    <link rel="icon" href="<%=request.getContextPath()%>/imagem/Logo21x21.ico">
    
    <title>Inicio - FitNet</title>

    <!-- Bootstrap core CSS -->
    <link href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="<%=request.getContextPath()%>/resources/css/pricing.css" rel="stylesheet">
  </head>

  <body>

  	<jsp:include page="/resources/templates/navBarWhite.jsp"></jsp:include>
	
	
    <div class="pricing-header px-3 py-3 pt-md-5 pb-md-4 mx-auto text-center">
      <h1 class="display-4">FitNet</h1>
      <p class="lead">Não perca tempo! Nossas promoções.</p>
    </div>

    <div class="container">
      <div class="card-deck mb-3 text-center">
        <div class="card mb-4 shadow-sm">
          <div class="card-header">
            <h4 class="my-0 font-weight-normal">Active</h4>
          </div>
          <div class="card-body">
            <h1 class="card-title pricing-card-title">R$29 <small class="text-muted">/mês</small></h1>
            <ul class="list-unstyled mt-3 mb-4">
              <li>Avaliação Física</li>
              <li>10 Treinos Acompanhados</li>
              <li>Musculação</li>
              <li>-</li>
            </ul>
            <button type="button" class="btn btn-lg btn-block btn-outline-primary">Inscreva-se</button>
          </div>
        </div>
        <div class="card mb-4 shadow-sm">
          <div class="card-header">
            <h4 class="my-0 font-weight-normal">Pro</h4>
          </div>
          <div class="card-body">
            <h1 class="card-title pricing-card-title">R$50 <small class="text-muted">/mês</small></h1>
            <ul class="list-unstyled mt-3 mb-4">
              <li>Beneficios do Active</li>
              <li>Acompanamento Clinico</li>
              <li>Funcional 1 vez por semana</li>
              <li>-</li>
            </ul>
            <button type="button" class="btn btn-lg btn-block btn-primary">Inscreva-se</button>
          </div>
        </div>
        <div class="card mb-4 shadow-sm">
          <div class="card-header">
            <h4 class="my-0 font-weight-normal">Pro Plus</h4>
          </div>
          <div class="card-body">
            <h1 class="card-title pricing-card-title">R$70 <small class="text-muted">/mês</small></h1>
            <ul class="list-unstyled mt-3 mb-4">
              <li>Beneficios do Pro</li>
              <li>Funcional Diário</li>
              <li>Aerobica 3 vezes por mês</li>
              <li>1 Luta</li>
            </ul>
            <button type="button" class="btn btn-lg btn-block btn-primary">Inscreva-se</button>
          </div>
        </div>
      </div>
	 <jsp:include page="/resources/templates/carrossel.jsp"></jsp:include>
     <jsp:include page="/resources/templates/rodapeWhite.jsp"></jsp:include>
    </div>
        <!-- Bootstrap core JavaScript -->

    <script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
    <script src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
    <script>
      Holder.addTheme('thumb', {
        bg: '#55595c',
        fg: '#eceeef',
        text: 'Thumbnail'
      });
    </script>
  </body>
</html>

