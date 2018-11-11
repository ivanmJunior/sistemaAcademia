<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Usuários - Área do Cliente</title>
<link rel="icon"
	href="<%=request.getContextPath()%>/resources/imagem/Logo21x21.ico">
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/bower_components/bootstrap/dist/css/bootstrap.min.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/bower_components/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/bower_components/Ionicons/css/ionicons.min.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/dist/css/AdminLTE.min.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/dist/css/skins/skin-blue.min.css">
</head>

<body class="hold-transition skin-blue sidebar-mini">
	<div class="wrapper">
	
		<header class="main-header"> 
		<a	href="<%=request.getContextPath()%>/index" class="logo"> 
			<span class="logo-mini">FitNet</span> 
			<span class="logo-lg">FitNet</span>
		</a> 
		<nav class="navbar navbar-static-top"
			role="navigation"> 
			<a href="#"	class="sidebar-toggle" data-toggle="push-menu" role="button">
			<span class="sr-only">Toggle navigation</span>
		</a> 
		<div class="navbar-custom-menu">
			<ul class="nav navbar-nav">
				
				<li class="dropdown user user-menu" class="nav-item active dropdown">
					 <a href="#" class="nav-link dropdown-toggle" role="button" aria-haspopup="true"
					 aria-expanded="false"	data-toggle="dropdown"> 
					<img src="<%=request.getContextPath()%>/resources/dist/img/avatar5.png"
						class="user-image" alt="User Image">
						<span class="hidden-xs">${usuarioLogado.usuario}</span>
					</a>
					<ul class="dropdown-menu">
						<li class="user-header">
						<img	src="<%=request.getContextPath()%>/resources/dist/img/avatar5.png"
							class="img-circle" alt="User Image">
						</li>
				
					</ul>
				</li>
			</ul>
			
			<ul class="nav navbar-nav">
				
				<li class="dropdown user user-menu" class="nav-item active dropdown">
					 <a href="<%=request.getContextPath()%>/logoutCliente" class="nav-link dropdown-toggle" role="button" aria-haspopup="true"
					 aria-expanded="false"	data-toggle="dropdown"> 
					<img src="<%=request.getContextPath()%>/resources/imagem/sair.png"
					    class="user-image" alt="User Image">
						<span class="hidden-xs">Sair</span>
					</a>
					<ul class="dropdown-menu">
						<li class="user-header">
						<img	src="<%=request.getContextPath()%>/resources/imagem/sair.png"
							class="img-circle" alt="User Image">
						</li>
				
					</ul>
				</li>
			</ul>
		</div>
		</nav>
		</header>
		
		<aside class="main-sidebar"> 
		<section class="sidebar"> 
		<div class="user-panel">
			<div class="pull-left image">
				<img
					src="<%=request.getContextPath()%>/resources/dist/img/avatar5.png"
					class="img-circle" alt="User Image">
			</div>
			<div class="pull-left info">
				<p>${usuarioLogado.usuario}</p>
				<!-- Status -->
				<a href="#"><i class="fa fa-circle text-success"></i> Online</a>
			</div>
		</div>

		<!-- Sidebar Menu -->
		<ul class="sidebar-menu" data-widget="tree">
			<li class="header">MENU</li>
			
			<li class="active"><a href="#1"><i class="fa "></i> <span>Agendar
						Avaliação</span></a></li>
			<li class="active"><a href="<%=request.getContextPath()%>/areaClienteTreino"><i class="fa "></i> <span>Marcar
						Treino</span></a></li>
			<li class="active"><a href="#2"><i class="fa "></i> <span>Resultados</span></a></li>
			<li class="active"><a href="#3"><i class="fa "></i> <span>Ficha
						de Avaliação</span></a></li>

		</ul>
		<ul class="sidebar-menu" data-widget="tree">
			<li class="header">Financeiro</li>
			
			<li class="active"><a href="#4"><i class="fa "></i> <span>2º
						via Boleto</span></a></li>
			<li class="active"><a href="#5"><i class="fa "></i> <span>Extrato
						de Pagamentos</span></a></li>
		</ul>
		</section>
		</aside>

		
		<div class="content-wrapper">
		
			<section class="content-header">
			<h1>
				Inicio <small>Planos</small>
			</h1>
			<ol class="breadcrumb">
				<li><a href="<%=request.getContextPath()%>/areaDoCLiente"><i class="fa fa-home"></i> Home</a></li>
				<li class="active">Usuários</li>
			</ol>
			</section>
			
			<section class="content container-fluid">
				<div>
					<p align="center">Você não possui um plano!</p>
				</div>
			</section>
		</div>

		<footer class="main-footer"> 
		<div class="pull-right hidden-xs">
			<a target="_blank" href="<%=request.getContextPath()%>/index">FitNet</a>
		</div>

		</footer>

	</div>

</body>
</html>