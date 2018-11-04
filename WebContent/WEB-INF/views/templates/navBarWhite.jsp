<div
	class="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-white border-bottom shadow-sm">
	<h5 class="my-0 mr-md-auto font-weight-normal">
		<a class="navbar-brand" href="<%=request.getContextPath()%>/index">FitNet</a>
		<a class="navbar-brand" href="<%=request.getContextPath()%>/loginCorporativo">Corporativo</a>
	</h5>
 
	<nav class="my-2 my-md-0 mr-md-3">

		<a class="p-2 text-dark" href="#">Empresa</a>
		<a class="p-2 text-dark" href="#">Planos</a>
	</nav>
	<a class="btn btn-outline-primary" href="" data-toggle="modal" 
	     data-target="#cadastrarClienteUsuario" onclick="inscrevaOff();">Inscreva-se</a>
		<a	class="btn btn-outline-primary"
		href="<%=request.getContextPath()%>/loginCliente">Entrar</a>
</div>
