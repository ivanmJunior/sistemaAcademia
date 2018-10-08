<!-- Modal Formulário de Cadoastro de Cliente -->
	
	<div class="modal fade " id="cadastrarClienteUsuario" tabindex="-1"
		role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Cadastrar-se</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form class="needs-validation"
						action="<%=request.getContextPath()%>/adicionaClientesUsuario"
						method="post">
						<div class="form-row">
							<div class="col-md-12 mb-2">
								<label for="validationCustom01">Nome</label> 
								<input  type="text" min="10"
									name="nome" class="form-control" id="validationCustom01"
									placeholder="Nome cmopleto" required >
								<div class="valid-feedback">OK!</div>
							</div>
						</div>
						<div class="form-row">
							<div class="col-md-12 mb-2">
								<label for="validationCustom02">Email</label> <input type="email"
									name="email" class="form-control" id="validationCustom02"
									placeholder="Email" required autofocus>
								<div class="invalid-feedback">Por favor informe o email.</div>
							</div>
						</div>
						<div class="form-row">
							<div class="col-md-12 mb-2">
								<label for="exampleInputBirth">Data de Nascimento</label> <input
									type="date" class="form-control" id="exampleInputBirth"
									name="dataNascimento">
							</div>
						</div>
						<div class="form-row">
							<div class="col-md-12 mb-2">
								<label for="validationCPF">CPF</label> <input type="text"
									name="cpf" class="form-control" id="validationCPF"
									placeholder="Apenas Números" required="required">
								<div class="invalid-feedback">Por favor informe um Número
									de CPF.</div>
							</div>
						</div>
						<div class="form-row">
							<div class="col-md-12 mb-2">
								<label for="validationCustomUsername">Usuário</label>
								<div class="input-group">
									<div class="input-group-prepend">
										<span class="input-group-text" id="inputGroupPrepend">@</span>
									</div>
									<input type="text" min="6" name="acesso.usuario" class="form-control"
										id="validationCustomUsername" placeholder="Usuário"
										aria-describedby="inputGroupPrepend" required>
									<div class="invalid-feedback">Por favor informe um nome
										de usuário.</div>
								</div>
							</div>
						</div>
						<div class="form-row">
							<div class="col-md-12 mb-2">
								<label for="validationCustom04">Senha</label> <input
									type="password" min="6" name="acesso.senha" class="form-control"
									id="validationCustom04" placeholder="Senha" required>
								<div class="invalid-feedback">Por favor informe a senha.</div>
							</div>
						</div>
						<div class="form-row">
							<div class="col-md-12 mb-2">
								<label for="validationCustom11">Confirmar Senha</label> <input
									type="password" name="acesso.confirmarSenha"
									class="form-control" id="validationCustom11"
									placeholder="Confirme Senha" required>
								<div class="invalid-feedback">Por favor informe novamente
									senha.</div>
							</div>
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-secondary"
								data-dismiss="modal">Fechar</button>
							<button type="submit" class="btn btn-success">Confirmar</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>