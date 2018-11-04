<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!doctype html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="icon"
	href="<%=request.getContextPath()%>/resources/imagem/Logo21x21.ico">
<link
	href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="<%=request.getContextPath()%>/resources/css/sticky-footer-navbar.css"
	rel="stylesheet">

<title>Cadastro de Funcionario - FitNet</title>
</head>

<body>
	<jsp:include page="/WEB-INF/views/templates/navBarDarkCorporation.jsp"></jsp:include>

	<div class="container">
		<h1 class="mt-5">Cadastrar Novo Funcionario</h1>

		<form id="formFuncionario" class="needs-validation" novalidate
			action="<%=request.getContextPath()%>/${objetoConfigMetodo.metodo}"
			method="post">
			<div class="p-4 bg-light rounded">
				<div class="form-row">
					<div class="col-md-4 mb-3">
						<label for="validationNome">Nome</label> <input type="text"
							onblur="lengthMinimo(this, 15);" name="nome" class="form-control" id="validationNome"
							placeholder="Informe o Nome" required>
							<div class="invalid-feedback">Informe o nome completo.</div>
					</div>
					<div class="col-md-4 mb-3">
						<label for="validationEmail">Email</label> <input type="email"
							name="email" class="form-control" id="validationEmail"
							placeholder="Email">
						<div class="invalid-feedback">Por favor informe o email.</div>
					</div>
					<div class="col-md-2 mb-3">
						<label for="exampleInputBirthNascimento">Data de
							Nascimento</label> <input type="date" class="form-control"
							id="exampleInputBirthNascimento" name="dataNascimento">
					</div>
					<div class="col-md-2 mb-3">
						<label for="validationCPF">CPF</label> <input type="text" min="11"
							onblur="lengthIgual(this, 11);" name="cpf" class="form-control" id="validationCPF"
							placeholder="99999999999" required>
						<div class="invalid-feedback">Informe CPF com 11 digitos.</div>
					</div>
				</div>
				<div class="form-row">
					<div class="col-md-4 mb-3">
						<label for="validationRG">RG</label> <input type="text" min="5"
							name="rg" class="form-control" id="validationRG"
							placeholder="Nº RG">
					</div>
					<div class="col-md-2 mb-3">
						<label for="validationCTPS">CTPS</label> <input type="text"
							name="ctps" class="form-control" id="validationCTPS"
							placeholder="Nº CTPS">

					</div>
					<div class="col-md-2 mb-3">
						<label for="validationCRN">CRN</label> <input type="text" disabled
							name="crn" class="form-control" id="validationCRN"
							placeholder="Nº CRN">
						<div class="invalid-feedback">Informe o CRN.</div>
					</div>
					<div class="col-md-2 mb-3">
						<label for="exampleInputBirthAdmissao">Data de Admissão</label> <input
							type="date" class="form-control" id="exampleInputBirthAdmissao"
							name="dataAdmissao" required>
						<div class="invalid-feedback">Informe uma Data.</div>
					</div>
					<div class="col-md-2 mb-3">
						<label for="validationSalario">Salário</label> <input type="text"
							name="salario" class="form-control" id="validationSalario"
							placeholder="0.00" required>
						<div class="invalid-feedback">Informe o Salário.</div>
					</div>
				</div>
				<div class="form-row">
					<div class="col-md-4 mb-3">
						<label for="validationCustomUsername">Usuário</label>
						<div class="input-group">
							<div class="input-group-prepend">
								<span class="input-group-text" id="inputGroupPrepend">@</span>
							</div>
							<input type="text" onblur="lengthMinimo(this, 6);" name="acesso.usuario"
								class="form-control" id="validationCustomUsername"
								placeholder="Usuário" aria-describedby="inputGroupPrepend"
								required>
							<div class="invalid-feedback">Informe um usuário com Mínimo 6 digitos.</div>
						</div>
					</div>
					<div class="col-md-4 mb-3">
						<label for="validationSenha">Senha</label> <input type="password"
							onblur="limiteMinimo();" name="acesso.senha" class="form-control"
							id="validationSenha" placeholder="Senha" required>
						<div class="invalid-feedback">Informe a senha com Mínimo 6 digitos.</div>
					</div>
					<div class="col-md-4 mb-3">
						<label for="validationConfirmarSenha">Confirmar Senha</label> <input
							type="password" name="acesso.confirmarSenha"
							class="form-control" id="validationConfirmarSenha"
							placeholder="Confirme Senha" required>
						<div class="invalid-feedback">Senhas Divergem.</div>
					</div>
				</div>
			</div>
			<div class="p-4">
				<div class="form-row">
					<div class="col-md-4 mb-3">
						<label for="validationRua">Endereço</label> <input type="text"
							name="endereco.logradouro" class="form-control"
							id="validationRua" placeholder="Rua">
					</div>
					<div class="col-md-2 mb-3">
						<label for="validationNumero">Número</label> <input type="number"
							name="endereco.numero" class="form-control" id="validationNumero"
							placeholder="Numero">
					</div>
					<div class="col-md-2 mb-3">
						<label for="validationComplemento">Complemento</label> <input
							type="text" name="endereco.complemento" class="form-control"
							id="validationComplemento" placeholder="Ex.: casa">
					</div>

					<div class="col-md-4 mb-3">
						<label for="validationBairro">Bairro</label> <input type="text"
							name="endereco.bairro" class="form-control" id="validationBairro"
							placeholder="Bairro">
					</div>
					<div class="col-md-4 mb-3">
						<label for="validationCidade">Cidade</label> <input type="text"
							name="endereco.cidade" class="form-control" id="validationCidade"
							placeholder="Cidade">
					</div>
					<div class="col-md-4 mb-3">
						<label for="exampleInputCountryUF">Estado</label> <select
							class="form-control" id="exampleInputCountryUF"
							name="endereco.uf">
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
						<label for="validationCEP">CEP</label> <input type="text"
							name="endereco.cep" class="form-control" id="validationCEP"
							placeholder="00000-000">
					</div>
				</div>
			</div>
			<div class="p-4 bg-light rounded">
				<div class="form-row">
					<div class="col-md-2 mb-3">
						<label for="validationFone">Fone</label> <input type="text"
							name="fone" class="form-control" id="validationFone"
							placeholder="000 9999-9999">
					</div>
					<div class="col-md-2 mb-3">
						<label for="validationCelular">Celular</label> <input type="text"
							name="fone2" class="form-control" id="validationCelular"
							placeholder="DDD 9 9999-9999" required>
						<div class="invalid-feedback">Informe um Número para
							contato.</div>
					</div>
					<div class="col-md-4 mb-3">
						<label for="inputFuncao">Função</label>
						<label class="form-control" > ${objetoConfigMetodo.funcao} </label>
							<input type="hidden" name="funcao" value="${objetoConfigMetodo.funcao}" class="form-control"
							id="inputFuncao">
					</div>
					<div class="col-md-4 mb-3">
						<label for="exampleInputCountryNivel">Nível</label> <select
							class="form-control" id="exampleInputCountryNivel" name="nivel"
							required>
							<option value="" selected="selected">Selecione um Nível</option>
							<option value="Operacional">Operacional</option>
							<option value="Coordenador">Coordenador</option>
							<option value="Gerente">Gerente</option>
							<option value="Outro">Outro</option>
						</select>
						<div class="invalid-feedback">Informe a Função.</div>
					</div>
					<div class="col-md-6 mb-3">
						<label for="cbBoxModalidades" id="lblModalidades" hidden="true">Modalidades</label> <select hidden="true"
							class="form-control" id="cbBoxModalidades" name="modalidades"
							>
							<option value="" selected="selected">Modalidades</option>
							<c:forEach items="${listaModalidades}"
								var="modalidade">
								<option value="${modalidade.descricao}">${modalidade.descricao}</option>
							</c:forEach>
						</select>
						
						<button type="button" hidden="true" class="btn btn-outline-primary my-2 my-sm-3" id="btnAdd" onclick="adicionarEspecialidade();">Adicionar ></button>
						<button type="button" hidden="true" class="btn btn-outline-secondary my-2 my-sm-3" id="btnRemove" onclick="removerEspecialidade();">Remover <</button>
						<button type="button" hidden="true" class="btn btn-outline-primary my-2 my-sm-3" id="btnAddAll" onclick="adicionaTudo();">Adicionar >></button>
						<button type="button" hidden="true" class="btn btn-outline-secondary my-2 my-sm-3" id="btnRemoveAll" onclick="removeTudo();">Remover <<</button>
					</div>
					<div class="col-md-6 mb-3">
						<div class="form-group">
							<label  for="listaEspecialidades" id="lblEspecialidades" hidden="true">Especialidades</label>
							<select multiple hidden="true" class="form-control" id="listaEspecialidades" name="especialidades">
							
							</select>
						</div>
					</div>

					<div class="col-md-12 mb-3">
						<label for="validationOBS">Observação</label>
						<textarea name="observacao" class="form-control"
							id="validationOBS" placeholder="Observações" rows="4"></textarea>
					</div>

				</div>
			</div>
			<div class="form-group">
				<div class="form-check">
					<input class="form-check-input" name="statusAtivo" type="checkbox"
						id="invalidCheckAtivo" checked="checked"> <label
						class="form-check-label" for="invalidCheckAtivo"> Ativo </label>
				</div>
			</div>

			<button class="btn btn-primary" type="submit">Salvar</button>
			<a href="<%=request.getContextPath()%>/listarFuncionarios"
				class="btn btn-secondary">Voltar</a>
		</form>
	</div>

	<jsp:include page="/WEB-INF/views/templates/rodapeDark.jsp"></jsp:include>
 
	<div class="modal fade " id="mensagemModal" tabindex="-1"
		role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Atenção!</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form class="needs-validation" novalidate
						action="<%=request.getContextPath()%>/selecionaFuncao"
						method="post">
						<div class="col-md-7 mb-3">
							<p>Opção Inválida ou já adicionada!</p>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-secondary"
								data-dismiss="modal">Fechar</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
	<script	src="<%=request.getContextPath()%>/resources/js/verificarSenhas.js"></script>
	<script src="<%=request.getContextPath()%>/resources/js/novoScript.js"></script>
	<script	src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
	<script	src="<%=request.getContextPath()%>/resources/js/validaFormClienteUser.js"></script>
</body>
</html>