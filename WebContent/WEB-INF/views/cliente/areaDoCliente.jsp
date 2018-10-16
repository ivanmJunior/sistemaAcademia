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

		<!-- Main Header -->
		<header class="main-header"> <!-- Logo --> <a
			href="<%=request.getContextPath()%>/index" class="logo"> <!-- mini logo for sidebar mini 50x50 pixels -->
			<span class="logo-mini">FitNet</span> <!-- logo for regular state and mobile devices -->
			<span class="logo-lg">FitNet</span>
		</a> <!-- Header Navbar --> <nav class="navbar navbar-static-top"
			role="navigation"> <!-- Sidebar toggle button--> <a href="#"
			class="sidebar-toggle" data-toggle="push-menu" role="button"> <span
			class="sr-only">Toggle navigation</span>
		</a> <!-- Navbar Right Menu -->
		<div class="navbar-custom-menu">
			<ul class="nav navbar-nav">
				<!-- User Account Menu -->
				<li class="dropdown user user-menu">
					<!-- Menu Toggle Button --> <a href="#" class="dropdown-toggle"
					data-toggle="dropdown"> <!-- The user image in the navbar--> <img
						src="<%=request.getContextPath()%>/resources/dist/img/avatar5.png"
						class="user-image" alt="User Image"> <!-- hidden-xs hides the username on small devices so only the image appears. -->
						<span class="hidden-xs">Fulano Junior</span>
				</a>
					<ul class="dropdown-menu">
						<!-- The user image in the menu -->
						<li class="user-header"><img
							src="<%=request.getContextPath()%>/resources/dist/img/avatar5.png"
							class="img-circle" alt="User Image">

							<p>
								Fulano Junior - Web Developer <small>Membro desde Abr.
									2018</small>
							</p></li>
						<!-- Menu Body -->
						<li class="user-body">
							<div class="row">
								<div class="col-xs-4 text-center">
									<a href="#">Followers</a>
								</div>
								<div class="col-xs-4 text-center">
									<a href="#">Sales</a>
								</div>
								<div class="col-xs-4 text-center">
									<a href="#">Friends</a>
								</div>
							</div> <!-- /.row -->
						</li>
						<!-- Menu Footer-->
						<li class="user-footer">
							<div class="pull-left">
								<a href="#" class="btn btn-default btn-flat">Perfil</a>
							</div>
							<div class="pull-right">
								<a href="#" class="btn btn-default btn-flat">Sair</a>
							</div>
						</li>
					</ul>
				</li>
			</ul>
		</div>
		</nav> </header>
		<!-- Left side column. contains the logo and sidebar -->
		<aside class="main-sidebar"> <!-- sidebar: style can be found in sidebar.less -->
		<section class="sidebar"> <!-- Sidebar user panel (optional) -->
		<div class="user-panel">
			<div class="pull-left image">
				<img
					src="<%=request.getContextPath()%>/resources/dist/img/avatar5.png"
					class="img-circle" alt="User Image">
			</div>
			<div class="pull-left info">
				<p>Fulano Junior</p>
				<!-- Status -->
				<a href="#"><i class="fa fa-circle text-success"></i> Online</a>
			</div>
		</div>

		<!-- Sidebar Menu -->
		<ul class="sidebar-menu" data-widget="tree">
			<li class="header">MENU</li>
			<!-- Optionally, you can add icons to the links -->
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
			<!-- Optionally, you can add icons to the links -->
			<li class="active"><a href="#4"><i class="fa "></i> <span>2º
						via Boleto</span></a></li>
			<li class="active"><a href="#5"><i class="fa "></i> <span>Extrato
						de Pagamentos</span></a></li>
		</ul>
		<!-- /.sidebar-menu --> </section> <!-- /.sidebar --> </aside>

		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
			<h1>
				Inicio <small>Planos</small>
			</h1>
			<ol class="breadcrumb">
				<li><a href="/"><i class="fa fa-home"></i> Home</a></li>
				<li class="active">Usuários</li>
			</ol>
			</section>
			
			<section class="content container-fluid">
				<div>
					<p align="center">Você não possui um plano!</p>
				</div>
			</section>
		</div>

		
		<!-- Main Footer -->
		<footer class="main-footer"> <!-- To the right -->
		<div class="pull-right hidden-xs">
			<a target="_blank" href="<%=request.getContextPath()%>/index">FitNet</a>
		</div>

		</footer>

	</div>

</body>
</html>