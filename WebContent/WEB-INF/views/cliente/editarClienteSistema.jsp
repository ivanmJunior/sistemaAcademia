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
	      
	     <form class="needs-validation" novalidate action="<%=request.getContextPath()%>/editarCliente?id=${cliente.id}" method="post">
		  <div class="form-row">
		    <div class="col-md-2 mb-3">
		      <label >Código</label>
		      <label class="form-control">${cliente.id}</label>
		    </div>
		   <div class="col-md-2 mb-3">
		      <label>Matricula</label>
		       <label class="form-control">${cliente.matricula.numeroMatricula}</label>
		    </div>
		      <div class="col-md-4 mb-3">
                  <label for="exampleInputBirth">Data Cadastro</label>
                   <label class="form-control">
                   		<fmt:formatDate value="${cliente.dataCadastro.time}" pattern="dd/MM/yyyy"/>
                   </label>
		      </div>
		      <div class="col-md-4 mb-3">
                  <label for="exampleInputBirth">Data Alteração</label>
                  <label class="form-control">
                  		<fmt:formatDate value="${cliente.dataAlteracao.time}" pattern="dd/MM/yyyy"/>
                  </label>
    	     </div>
		  </div>
		  <div class="form-row">
		    <div class="col-md-4 mb-3">
		      <label for="validationCustom01">Nome</label>
		      <input type="text" min="10" name="nome" value="${cliente.nome}" 
		      class="form-control" id="validationCustom01" placeholder="Nome Completo" required>
		      <div class="valid-feedback">
		        OK!
		      </div>
		    </div>
		   <div class="col-md-4 mb-3">
		      <label for="validationCustom02">Email</label>
		      <input type="email" name="email" value="${cliente.email}"
		      class="form-control" id="validationCustom02" placeholder="Email" required>
		      <div class="invalid-feedback">
		        Por favor informe o email.
		      </div>
		    </div>
		      <div class="col-md-2 mb-3">
                  <label for="validationDataNascimento">Data Nascimento</label>
                  <input type="date" name="dataNascimento" 
                  class="form-control" id="validationDataNascimento"
                    value="<fmt:formatDate value="${cliente.dataNascimento.time}" pattern="yyyy-MM-dd"/>">
            </div>
             <div class="valid-feedback">
		        OK!
		    </div>
		    <div class="col-md-2 mb-3">
		      <label for="validationCPF">CPF</label>
		      <input type="text" min="11" maxlength="11" name="cpf" value="${cliente.cpf}"
		      class="form-control" id="validationCPF" placeholder="Apenas Números" required="required">
		      <div class="invalid-feedback">
		      	Por favor informe um Número de CPF.
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
		        <input type="text" min="6" name="acesso.usuario" value="${cliente.acesso.usuario}"
		        class="form-control" id="validationCustomUsername" placeholder="Usuário" 
		        aria-describedby="inputGroupPrepend" required>
		        <div class="invalid-feedback">
		          Por favor informe um nome de usuário.
		        </div>
		      </div>
		    </div> 
		    <div class="col-md-4 mb-3">
			      <label for="validationSenha">Senha</label>
			      <input type="password" min="6" name="acesso.senha" value="${cliente.acesso.senha}" class="form-control" id="validationSenha" placeholder="Senha" required>
			      <div class="invalid-feedback">
			        Por favor informe a senha.
		      </div>
		    </div>
		    <div class="col-md-4 mb-3">
			      <label for="validationConfirmarSenha">Confirmar Senha</label>
			      <input type="password" min="6" name="acesso.confirmarSenha" value="${cliente.acesso.confirmarSenha}"
			      class="form-control" id="validationConfirmarSenha" placeholder="Confirme Senha" required>
			      <div class="invalid-feedback">
			        Por favor informe novamente senha.
		      </div>
		    </div>
		    </div>
		    <div class="form-row">
			    <div class="col-md-4 mb-3">
				      <label for="validationCustom05">Endereço</label>
				      <input type="text" name="endereco.logradouro" value="${cliente.endereco.logradouro}"
				      class="form-control" id="validationCustom05" placeholder="Rua">
				      <div class="invalid-feedback">
				        Por favor informe a rua e o numero.
			      	 </div>
			    </div>
			    <div class="col-md-2 mb-3">
				      <label for="validationCustom06">Número</label>
				      <input type="number" name="endereco.numero" value="${cliente.endereco.numero}"
				      class="form-control" id="validationCustom06" placeholder="Numero">
				      <div class="invalid-feedback">
				        Por favor informe a rua e o numero.
			      	 </div>
			    </div>
			    <div class="col-md-2 mb-3">
		      		<label for="validationCustom07">Complemento</label>
		      		<input type="text" name="endereco.complemento" value="${cliente.endereco.complemento}"
		      		class="form-control" id="validationCustom07" placeholder="Ex.: casa">
		    	</div> 
		    
		    	<div class="col-md-4 mb-3">
			      <label for="validationCustom08">Bairro</label>
			      <input type="text" name="endereco.bairro" value="${cliente.endereco.bairro}"
			      class="form-control" id="validationCustom08" placeholder="bairro">
			      <div class="invalid-feedback">
			        Por favor informe a rua e o numero.
		      	 </div>
		      </div>
		    </div>
		    <div class="form-row">
		    <div class="col-md-4 mb-3">
		      <label for="validationCustom09">Cidade</label>
		      <input type="text" name="endereco.cidade" value="${cliente.endereco.cidade}"
		      class="form-control" id="validationCustom09" placeholder="Cidade">
		      <div class="invalid-feedback">
		        Por favor informe a Cidade.
		      </div>
		    </div>
		    <div class="col-md-4 mb-3">
                  <label for="exampleInputCountry">Estado</label>
                  <select class="form-control" id="exampleInputCountry" name="endereco.uf">
                    <option value="${cliente.endereco.uf}" selected="selected">${cliente.endereco.uf}</option>
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
		      <label for="validationCustom10">CEP</label>
		      <input type="text" min="9" max="9" name="endereco.cep" value="${cliente.endereco.cep}"
		      class="form-control" id="validationCustom10" placeholder="Ex.: 00000-000">
		      <div class="invalid-feedback">
		        Por favor informe um CEP.
		      </div>
		    </div>
		     <div class="col-md-3 mb-3">
		      <label for="validationCustom12">Fone</label>
		      <input type="text" name="fone" value="${cliente.fone}"
		      class="form-control" id="validationCustom12"  placeholder="(000) 9999-9999">
		      <div class="invalid-feedback">
		        Por favor informe um Número para contato.
		      </div>
		    </div>
		    <div class="col-md-3 mb-3">
		      <label for="validationCustom14">Celular</label>
		      <input type="text" name="fone2" value="${cliente.fone2}"
		      class="form-control" id="validationCustom14" placeholder="(000) 9 9999-9999" required>
		      <div class="invalid-feedback">
		        Por favor informe um Número para contato.
		      </div>
		    </div>

		  </div>
		  <div class="form-group">
		    <div class="form-check">
		      <input class="form-check-input" name="statusAtivo" type="checkbox" id="invalidCheck"
			    value="${cliente.statusAtivo}"	${cliente.statusAtivo?	'checked'	:	''	}>
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
    	<script src="<%=request.getContextPath()%>/resources/js/maskCpfCnpj.js"></script>
    	<script src="<%=request.getContextPath()%>/resources/js/validaFormClienteUser.js"></script>
	</body>
</html>