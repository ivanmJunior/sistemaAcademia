<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!doctype html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="icon" href="<%=request.getContextPath()%>/resources/imagem/Logo21x21.ico">

<title>Inicio - FitNet</title>

<!-- Bootstrap core CSS -->
<link href="<c:url value="/resources/css/bootstrap.min.css"/>"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="<%=request.getContextPath()%>/resources/css/pricing.css" rel="stylesheet">
</head>

<body>

	<jsp:include page="/WEB-INF/views/templates/navBarWhite.jsp"></jsp:include>

	<div
		class="pricing-header px-3 py-3 pt-md-5 pb-md-4 mx-auto text-center">
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
					<h1 class="card-title pricing-card-title">
						R$29 <small class="text-muted">/mês</small>
					</h1>
					<ul class="list-unstyled mt-3 mb-4">
						<li>Avaliação Física</li>
						<li>10 Treinos Acompanhados</li>
						<li>Musculação</li>
						<li>-</li>
					</ul>
					<button type="button"
						class="btn btn-lg btn-block btn-outline-primary">Inscreva-se</button>
				</div>
			</div>
			<div class="card mb-4 shadow-sm">
				<div class="card-header">
					<h4 class="my-0 font-weight-normal">Pro</h4>
				</div>
				<div class="card-body">
					<h1 class="card-title pricing-card-title">
						R$50 <small class="text-muted">/mês</small>
					</h1>
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
					<h1 class="card-title pricing-card-title">
						R$70 <small class="text-muted">/mês</small>
					</h1>
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
		<jsp:include page="/WEB-INF/views/templates/carrossel.jsp"></jsp:include>
		<jsp:include page="/WEB-INF/views/templates/rodapeWhite.jsp"></jsp:include>
	</div>
	
	<!-- Modal Formulário de Cadoastro de Cliente -->
	
	<div class="modal fade " id="cadastrarClienteUsuario" tabindex="-1"
		role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Cadastrar-se</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body" >
					<form class="needs-validation" novalidate
						action="<%=request.getContextPath()%>/adicionaClientesUsuario"
						method="post">
						<div class="form-row" >
							<div class="col-md-12 mb-2">
								<label for="validationNome">Nome</label> 
								<input  type="text" min="10"
									name="nome" class="form-control" id="validationNome"
									placeholder="Nome cmopleto" required >
								<div class="invalid-feedback">Informe o Nome</div>
							</div>
						</div>
						<div class="form-row">
							<div class="col-md-12 mb-2">
								<label for="validationEmail">Email</label> <input type="email"
									name="email" class="form-control" id="validationEmail"
									placeholder="Email" required autofocus>
								<div class="invalid-feedback">Informe o email.</div>
							</div>
						</div>
						<div class="form-row">
							<div class="col-md-12 mb-2">
								<label for="InputBirthdataNascimento">Data de Nascimento</label> <input
									type="date" class="form-control" id="InputBirthdataNascimento"
									name="dataNascimento">
							</div>
						</div>
						<div class="form-row">
							<div class="col-md-12 mb-2">
								<label for="validationCPF">CPF</label> <input type="text"
									name="cpf" minLenght="11" class="form-control" id="validationCPF"
									placeholder="Apenas Números" required="required">
									
								<div class="invalid-feedback">Informe um Número	de CPF Válido.</div>
								
							</div>
						</div>
						<div class="form-row">
							<div class="col-md-12 mb-2">
								<label for="validationCustomUsername">Usuário</label>
								<div class="input-group">
									<div class="input-group-prepend">
										<span class="input-group-text" id="inputGroupPrepend">@</span>
									</div>
									<input type="text" min="6" name="acesso.usuario" class="form-control"
										id="validationCustomUsername" placeholder="Usuário"
										aria-describedby="inputGroupPrepend" required>
									<div class="invalid-feedback">Informe um nome de usuário.</div>
								</div>
							</div>
						</div>
						<div class="form-row">
							<div class="col-md-12 mb-2">
								<label for="validationSenha">Senha</label> <input
									type="password" minLenght="6" name="acesso.senha" class="form-control"
									id="validationSenha" placeholder="Senha" required>
								<div class="invalid-feedback">Por Favor redefina as Senhas.</div>
							</div>
						</div>
						<div class="form-row">
							<div class="col-md-12 mb-2">
								<label for="validationConfirmarSenha">Confirmar Senha</label> <input
									type="password" minLenght="6" name="acesso.confirmarSenha"
									class="form-control" id="validationConfirmarSenha"
									placeholder="Confirme Senha" required>
								<div class="invalid-feedback">Por Favor redefina as Senhas. Minimo 6 digitos.</div>
							</div>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-secondary"
								data-dismiss="modal">Fechar</button>
							<button type="submit" class="btn btn-success">Confirmar</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>

	<!-- Bootstrap core JavaScript -->
	
	<script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
	<script src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
	<script	src="<%=request.getContextPath()%>/resources/js/verificarSenhas.js"></script>
	<script	src="<%=request.getContextPath()%>/resources/js/validarCpf.js"></script>
	<script	src="<%=request.getContextPath()%>/resources/js/validaFormClienteUser.js"></script>

</body>
</html>

