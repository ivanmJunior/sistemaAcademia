    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<img class="mb-4"
	src="<%=request.getContextPath()%>/resources/imagem/Logo64x64.png" alt=""
	width="200" height="200">
<h1 class="h3 mb-3 font-weight-normal">Login</h1>
<label for="inputEmail" class="sr-only">Email adress</label>
<input type="email" id="inputEmail" class="form-control"
	placeholder="Usuário" name="txtUsuarioLogin" required autofocus>
<label for="inputPassword" class="sr-only">Password</label>
<input type="password" id="inputPassword" class="form-control"
	placeholder="Senha" name="txtSenhaLogin" required>
<div class="checkbox mb-3">
	<label> <input type="checkbox" value="remember-me">
		Lembre-me
	</label>
</div>
<button class="btn btn-lg btn-primary btn-block" type="submit">Entrar</button>
<p class="mt-5 mb-3 text-muted">&copy; 2017-2018</p>