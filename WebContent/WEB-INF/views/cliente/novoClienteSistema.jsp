<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!doctype html>
<html>
  <head>
    <meta charset="ISO-8859-1">
    <link rel="icon" href="<%=request.getContextPath()%>/resources/imagem/Logo21x21.ico">
    <link href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/resources/css/sticky-footer-navbar.css" rel="stylesheet">
   
    <title>Cadastro de Cliente - FitNet</title>
  </head>
  
	<body>
		<jsp:include page="/WEB-INF/views/templates/navBarDarkCorporation.jsp"></jsp:include>

	    <div class="container">
	      <h1 class="mt-5">Cadastrar Novo Cliente</h1>
	      
	     <form class="needs-validation" novalidate action="<%=request.getContextPath()%>/adicionaClientes" method="post">
		  <div class="form-row">
		    <div class="col-md-4 mb-3">
		      <label for="validationNome">Nome</label>
		      <input type="text" min="10" name="nome" class="form-control" 
		      id="validationNome" placeholder="Nome Completo" required>
		      <div class="invalid-feedback">
		        Informe o Nome.
		      </div>
		    </div>
		   <div class="col-md-4 mb-3">
		      <label for="validationEmail">Email</label>
		      <input type="email" name="email" class="form-control" 
		      id="validationEmail" placeholder="Email" required>
		      <div class="invalid-feedback">
		        Informe o email.
		      </div>
		    </div>
		      <div class="col-md-2 mb-3">
                  <label for="InputBirthdataNascimento">Data de Nascimento</label>
                  <input type="date" class="form-control" id="InputBirthdataNascimento" name="dataNascimento">
            </div>
		    <div class="col-md-2 mb-3">
		      <label for="validationCPF">CPF</label>
		      <input type="text" min="11" max="11" name="cpf" 
		      class="form-control" id="validationCPF" placeholder="99999999999" required>
		      <div class="invalid-feedback">
		      	Informe um Número de CPF.
		     </div>
		    </div>
		  </div>
		  <div class="form-row">
		     <div class="col-md-4 mb-3">
		      <label for="validationCustomUsername">Usuário</label>
		      <div class="input-group">
		        <div class="input-group-prepend">
		          <span class="input-group-text" id="inputGroupPrepend">@</span>
		        </div>
		        <input type="text" min="6" name="acesso.usuario" 
		        class="form-control" id="validationCustomUsername" placeholder="Usuário" 
		        aria-describedby="inputGroupPrepend" required>
		        <div class="invalid-feedback">
		          Informe usuário minimo 6 digitos.
		        </div>
		      </div>
		    </div> 
		    <div class="col-md-4 mb-3">
			      <label for="validationSenha">Senha</label>
			      <input type="password" min="6" name="acesso.senha" 
			      class="form-control" id="validationSenha" placeholder="Minimo 6 digitos" required>
			      <div class="invalid-feedback">
			        Informe a senha.
		      </div>
		    </div>
		    <div class="col-md-4 mb-3">
			      <label for="validationConfirmarSenha">Confirmar Senha</label>
			      <input type="password" min="6" name="acesso.confirmarSenha" 
			      class="form-control" id="validationConfirmaSenha" placeholder="Minimo 6 digitos" required>
			      <div class="invalid-feedback">
			        Informe novamente senha.
		      </div>
		    </div>
		    </div>
		    <div class="form-row">
			    <div class="col-md-4 mb-3">
				      <label for="validationEndereço">Endereço</label>
				      <input type="text" name="endereco.logradouro" class="form-control"
				      id="validationEndereço" placeholder="Rua">
			    </div>
			    <div class="col-md-2 mb-3">
				      <label for="validationNumero">Número</label>
				      <input type="number" name="endereco.numero" class="form-control" 
				      id="validationNumero" placeholder="Numero">
			    </div>
			    <div class="col-md-2 mb-3">
		      		<label for="validationComplemento">Complemento</label>
		      		<input type="text" name="endereco.complemento" class="form-control" 
		      		id="validationComplemento" placeholder="Ex.: casa">
		    	</div> 
		    	<div class="col-md-4 mb-3">
			      <label for="validationBairro">Bairro</label>
			      <input type="text" name="endereco.bairro" class="form-control" 
			      id="validationBairro" placeholder="Bairro">
		      </div>
		    </div>
		    <div class="form-row">
		    <div class="col-md-4 mb-3">
		      <label for="validationCidade">Cidade</label>
		      <input type="text" name="endereco.cidade" class="form-control" 
		      id="validationCidade" placeholder="Cidade">
		    </div>
		    <div class="col-md-4 mb-3">
                  <label for="InputCountryUF">Estado</label>
                  <select class="form-control" id="InputCountryUF" name="endereco.uf">
                    <option value="" selected="selected">Selecione um estado</option>
                    <option value="AC">Acre</option>
                    <option value="AL">Alagoas</option>
                    <option value="AP">Amapa</option>
                    <option value="AM">Amazonas</option>
                    <option value="BA">Bahia</option>
                    <option value="CE">Ceará</option>
                    <option value="DF">Brasília</option>
                    <option value="ES">Espirito Santo</option>
                    <option value="GO">Goiás</option>
                    <option value="MA">Maranhão</option>
                    <option value="MT">Mato Grosso</option>
                    <option value="MS">Mato Grosso do Sul</option>
                    <option value="MG">Minas Gerais</option>
                    <option value="PA">Pará</option>
                    <option value="PB">Paraiba</option>
                    <option value="PR">Paraná</option>
                    <option value="PE">Pernambuco</option>
                    <option value="PI">Piauí</option>
                    <option value="RJ">Rio de Janeiro</option>
                    <option value="RN">Rio Grande do Norte</option>
                    <option value="RS">Rio Grande do Sul</option>
                    <option value="RO">Rondonia</option>
                    <option value="RR">Roraima</option>
                    <option value="SC">Santa Catarina</option>
                    <option value="SP">São Paulo</option>
                    <option value="SE">Sergipe</option>
                    <option value="TO">Tocantins</option>
                  </select>
                </div>
		    <div class="col-md-4 mb-3">
		      <label for="validationCEP">CEP</label>
		      <input type="text" name="endereco.cep" class="form-control" 
		      id="validationCEP" placeholder="00000-000">
		    </div>
		     <div class="col-md-3 mb-3">
		      <label for="validationFone">Fone</label>
		      <input type="text" name="fone" class="form-control" 
		      id="validationFone" placeholder="DDD 9999-9999">
		    </div>
		    <div class="col-md-3 mb-3">
		      <label for="validationCelular">Celular</label>
		      <input type="text" name="fone2" class="form-control" 
		      id="validationCelular" placeholder="DDD 9 9999-9999" required>
		      <div class="invalid-feedback">
		        Informe um Número para contato.
		      </div>
		    </div>
		  </div>
		  <div class="form-group">
		    <div class="form-check">
		      <input class="form-check-input" name="statusAtivo" type="checkbox" id="invalidCheck" checked="checked" required>
		      <label class="form-check-label" for="invalidCheck">
		        Ativo
		      </label>
		    </div>
		  </div>
		  <button class="btn btn-primary" type="submit">Salvar</button>
		  <a href="<%=request.getContextPath() %>/listarClientes" class="btn btn-secondary">Voltar</a>
		</form>
	    </div>
		
		<jsp:include page="/WEB-INF/views/templates/rodapeDark.jsp"></jsp:include>
		
		<script	src="<%=request.getContextPath()%>/resources/js/verificarSenhas.js"></script>
    	<script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
    	<script src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
    	<script src="<%=request.getContextPath()%>/resources/js/validaFormClienteUser.js"></script>
	</body>
</html>