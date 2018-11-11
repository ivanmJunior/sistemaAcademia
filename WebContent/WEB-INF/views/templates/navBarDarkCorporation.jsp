<header>
	<!-- Fixed navbar -->
	<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
		<a class="navbar-brand" href="index">FitNet</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarCollapse" aria-controls="navbarCollapse"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<ul class="navbar-nav">
		<li class="nav-item"><a class="nav-link " href="<%=request.getContextPath()%>/telaPrincipalSistema">Principal</a></li>
			<li class="nav-item dropdown">
			<a class="nav-link dropdown-toggle" href="#"
				id="navbarDropdownMenuLink" role="button" data-toggle="dropdown"
				aria-haspopup="true" aria-expanded="false"> Cadastros </a>
				<div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
					<a class="dropdown-item" href="" data-toggle="modal"
						data-target="#cadastrarClienteUsuario">Cliente Express</a> <a
						class="dropdown-item"
						href="<%=request.getContextPath()%>/listarClientes">Clientes</a> <a
						class="dropdown-item"
						href="<%=request.getContextPath()%>/listarModalidades">Modalidades</a>
					<a class="dropdown-item" href="<%=request.getContextPath()%>/listarFuncionarios">Funcion�rios</a> <a
						class="dropdown-item" href="#">Planos</a>
				</div></li>
		</ul>
		<div class="collapse navbar-collapse" id="navbarCollapse">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item dropdown">
			<a class="nav-link dropdown-toggle" href="#"
				id="navbarDropdownMenuLink" role="button" data-toggle="dropdown"
				aria-haspopup="true" aria-expanded="false"> Avalia��o F�sica </a>
				<div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
					<a class="dropdown-item" href="">Nova Avalia��o</a>
					<a	class="dropdown-item"
						href="">Agendamentos</a>
				</div></li>
				<li class="nav-item dropdown">
			<a class="nav-link dropdown-toggle" href="#"
				id="navbarDropdownMenuLink" role="button" data-toggle="dropdown"
				aria-haspopup="true" aria-expanded="false"> Contas </a>
				<div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
					<a class="dropdown-item" href="" >A Receber</a>
					<a	class="dropdown-item"
						href="">Recebimentos</a>
				</div></li>
				<li class="nav-item"><a class="nav-link " href="#">Configura��s</a>
				</li>
				<li class="nav-item"><a class="nav-link " href="#">Ajuda</a></li>
				
				<li class="nav-item active dropdown">
					<a class="nav-link dropdown-toggle" href="#"
					id="navbarDropdownMenuLink" role="button" data-toggle="dropdown"
					aria-haspopup="true" aria-expanded="false"> Usuario: ${usuarioLogado.usuario} </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
						<a class="dropdown-item" href="<%=request.getContextPath()%>/logoutSistema">Sair</a>
					</div>
				</li>
			</ul>

		</div>
	</nav>
</header>