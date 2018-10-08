<header>
      <!-- Fixed navbar -->
      <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
        <a class="navbar-brand" href="index">FitNet</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="dropdown">
          <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
		    Cadastros
		  </button>
		  <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
		   <a class="dropdown-item" href="" data-toggle="modal"
		       data-target="#cadastrarClienteUsuario">Cliente Express</a>
		    <a class="dropdown-item" href="<%=request.getContextPath()%>/listarClientes">Clientes</a>
		    <a class="dropdown-item" href="<%=request.getContextPath()%>/listarModalidades">Modalidades</a>
		    <a class="dropdown-item" href="#">Funcionários</a>
		    <a class="dropdown-item" href="#">Planos</a>
		 </div>
		</div>

        <div class="collapse navbar-collapse" id="navbarCollapse">
          <ul class="navbar-nav mr-auto">
          	<li class="nav-item">
              <a class="nav-link " href="#">Avaliação Física</a>
            </li>
            <li class="nav-item">
              <a class="nav-link " href="#">Contas</a>
            </li>
             <li class="nav-item">
              <a class="nav-link " href="#">Configuraçõs</a>
            </li>
            <li class="nav-item">
              <a class="nav-link " href="#">Ajuda</a>
            </li>
             <li class="nav-item active">
              <a class="nav-link"> Usuario: ${usuarioLogado}</a>
            </li>
          </ul>
           
        </div>
      </nav>
    </header>