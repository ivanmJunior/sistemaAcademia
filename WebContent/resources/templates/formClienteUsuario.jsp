<form class="needs-validation" novalidate action="<%=request.getContextPath()%>/ControllerInserirCliente" method="post">
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
      <label for="validationCustom07">Estado</label>
      <input type="text" name="txtEstado" class="form-control" id="validationCustom07" placeholder="Estado">
      <div class="invalid-feedback">
        Por favor informe um Estado.
      </div>
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




