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
   
    <title>Cadastro de Cliente - FitNet</title>
  </head>
  
	<body>
		<jsp:include page="/resources/templates/navBarDarkCorporation.jsp"></jsp:include>

	    <div class="container">
	    	
	      <h1 class="mt-5">FitNet</h1>
	      <p class="lead">Cadastro de Cliente</p>
	      
	     <form class="needs-validation" novalidate action="<%=request.getContextPath()%>/ControllerInserirClienteSistema" method="post">
		  <div class="form-row">
		    <div class="col-md-4 mb-3">
		      <label for="validationCustom01">Primeiro Nome</label>
		      <input type="text" name="txtNome" class="form-control" id="validationCustom01" placeholder="Primeiro Nome" required>
		      <div class="valid-feedback">
		        Looks good!
		      </div>
		    </div>
		    <div class="col-md-4 mb-3">
		      <label for="validationCustom02">Sobrenome</label>
		      <input type="text" name="txtSobrenome" class="form-control" id="validationCustom02" placeholder="Sobrenome" required>
		      <div class="valid-feedback">
		        Looks good!
		      </div>
		    </div>
		    <div class="col-md-4 mb-3">
		      <label for="validationCustomUsername">Usuário</label>
		      <div class="input-group">
		        <div class="input-group-prepend">
		          <span class="input-group-text" id="inputGroupPrepend">@</span>
		        </div>
		        <input type="text" name="txtUsuario" class="form-control" id="validationCustomUsername" placeholder="Nome do Usuário" aria-describedby="inputGroupPrepend" required>
		        <div class="invalid-feedback">
		          Por favor informe um nome de usuário.
		        </div>
		      </div>
		    </div>
		  </div>
		  <div class="form-row">
		      <div class="col-md-4 mb-3">
			      <label for="validationCustom03">Email</label>
			      <input type="text" name="txtEmail" class="form-control" id="validationCustom03" placeholder="Email" required>
			      <div class="invalid-feedback">
			        Por favor informe o email.
		      </div>
		    </div>
		    <div class="col-md-4 mb-3">
			      <label for="validationCustom04">Senha</label>
			      <input type="password" name="txtSenha" class="form-control" id="validationCustom04" placeholder="Senha" required>
			      <div class="invalid-feedback">
			        Por favor informe a senha.
		      </div>
		    </div>
		    <div class="col-md-4 mb-3">
			      <label for="validationCustom11">Confirmar Senha</label>
			      <input type="password" name="txtSenha" class="form-control" id="validationCustom11" placeholder="Digite novamente a Senha" required>
			      <div class="invalid-feedback">
			        Por favor informe novamente senha.
		      </div>
		    </div>
		    <div class="col-md-6 mb-3">
			      <label for="validationCustom05">Endereço</label>
			      <input type="text" name="txtEndereco" class="form-control" id="validationCustom05" placeholder="Rua e Numero">
			      <div class="invalid-feedback">
			        Por favor informe a rua e o numero.
		      </div>
		    </div>
		    <div class="col-md-6 mb-3">
		      <label for="validationCustom06">Cidade</label>
		      <input type="text" name="txtCidade" class="form-control" id="validationCustom06" placeholder="Cidade">
		      <div class="invalid-feedback">
		        Por favor informe a Cidade.
		      </div>
		    </div>
		    <div class="col-md-3 mb-3">
                  <label for="exampleInputCountry">Estado</label>
                  <select class="form-control" id="exampleInputCountry" name="country">
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
		    <div class="col-md-3 mb-3">
		      <label for="validationCustom08">CEP</label>
		      <input type="text" name="txtCep" class="form-control" id="validationCustom08" placeholder="00000-000">
		      <div class="invalid-feedback">
		        Por favor informe um CEP.
		      </div>
		    </div>
		     <div class="col-md-3 mb-3">
		      <label for="validationCustom09">Fone</label>
		      <input type="text" name="txtFone" class="form-control" id="validationCustom09" placeholder="DDD 9999-9999">
		      <div class="invalid-feedback">
		        Por favor informe um Número para contato.
		      </div>
		    </div>
		    <div class="col-md-3 mb-3">
		      <label for="validationCustom10">Celular</label>
		      <input type="text" name="txtCelular" class="form-control" id="validationCustom10" placeholder="DDD 9 9999-9999" required>
		      <div class="invalid-feedback">
		        Por favor informe um Número para contato.
		      </div>
		    </div>
		    <div class="col-md-3 mb-3">
                  <label for="exampleInputBirth">Data de Nascimento</label>
                  <input type="date" class="form-control" id="exampleInputBirth" name="birth">
                </div>
		    <div class="col-md-3 mb-3">
		      <label for="validationCustom13">CPF</label>
		      <input type="text" name="txtCPF" class="form-control" id="validationCustom13" placeholder="99999999999">
		      <div class="invalid-feedback">
		        
		      </div>
		    </div>
		  </div>
		  <div class="form-group">
		    <div class="form-check">
		      <input class="form-check-input" type="checkbox" value="" id="invalidCheck" required>
		      <label class="form-check-label" for="invalidCheck">
		        Aceito os termos e condições.
		      </label>
		      <div class="invalid-feedback">
		        Você deve concordar antes de salvar.
		      </div>
		    </div>
		  </div>
		  <button class="btn btn-primary" type="submit">Salvar</button>
		</form>
	    </div>
		
		<jsp:include page="/resources/templates/rodapeDark.jsp"></jsp:include>
		
    	<script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
    	<script src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
    	<script src="<%=request.getContextPath()%>/resources/js/validaFormClienteUser.js"></script>
	</body>
</html>