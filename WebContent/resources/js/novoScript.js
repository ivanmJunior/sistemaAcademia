
$(document).ready(habilitaComponente());
var campo = document.querySelector('#validationSenha');
var combo = document.querySelector('#cbBoxModalidades');
var primeiraOpcaoLista = 0;

function adicionarEspecialidade() {
	var existe = false;
	var itemSelecionado = combo.options[combo.selectedIndex].text;
	var opcao = document.createElement('option');
	
	document.querySelector('#listaEspecialidades').appendChild(opcao);
	var lista = document.querySelector('#listaEspecialidades');
	
	for(i = 0; i < lista.options.length; i++){
		if(lista.options[i].text == itemSelecionado){
			existe = true;
			lista.remove(lista.options.length-1);
			$('#mensagemModal').modal();
			break;
		}else if(combo.options[combo.selectedIndex].value == ""){
			existe = true;
			lista.remove(lista.options.length-1);
			$('#mensagemModal').modal();
			break;
		}
	}
	if(!existe){
		lista.options[lista.options.length-1].text = itemSelecionado;
		$.get("adcionaEspecialidade?especialidades="+itemSelecionado);
	}
}

function removerEspecialidade() {
	primeiraOpcaoLista = 0;
	var lista = document.querySelector('#listaEspecialidades');
	var itemSelecionadoLista = lista.options[lista.selectedIndex].text;
	
	$.get("removeEspecialidade?especialidades="+itemSelecionadoLista);
	lista.remove(lista.selectedIndex);
}

function adicionaTudo(){
	var existe = false;
	
	if(primeiraOpcaoLista == 0){
		var opcao = document.createElement('option');
		document.querySelector('#listaEspecialidades').appendChild(opcao);
	}
	
	var lista = document.querySelector('#listaEspecialidades');
	var posicaoLista = -1;
	for(i = 0; i < combo.options.length; i++){
		
			for(y = 0; y < lista.options.length; y++){
				if(lista.options[y].text == combo.options[i].text){
					existe = true;
					break;
				}
				posicaoLista = lista.options[y].index;
			}
			if(!existe){
				if(combo.options[i].value != ""){
					lista.options[posicaoLista].text = combo.options[i].text;
					opcao = document.createElement('option');
					lista.appendChild(opcao);
					primeiraOpcaoLista = 1;
					$.get("adcionaEspecialidade?especialidades="+combo.options[i].text);
				}
			}
		}
	lista.remove(lista.options.length-1);
}

function removeTudo() {
	primeiraOpcaoLista = 0;
	var lista = document.querySelector('#listaEspecialidades');
	
	for(i = lista.options.length; i >= 0; i--){
		lista.remove(i);
	}
	$.get("limparListaEspecialidades");
}


function habilitaComponente(){
	var funcao = document.querySelector('#inputFuncao');
	if(funcao.value == "NUTRICIONISTA"){
	        $(document.querySelector('#validationCRN')).prop("disabled", false);
	        $(document.querySelector('#validationCRN')).prop("required", true);
	    }
		else if(funcao.value == "INSTRUTOR"){
			$(document.querySelector('#cbBoxModalidades')).prop("hidden", false);
			$(document.querySelector('#btnAdd')).prop("hidden", false);
			$(document.querySelector('#btnRemove')).prop("hidden", false);
			$(document.querySelector('#btnAddAll')).prop("hidden", false);
			$(document.querySelector('#btnRemoveAll')).prop("hidden", false);
			$(document.querySelector('#listaEspecialidades')).prop("hidden", false);
			$(document.querySelector('#lblModalidades')).prop("hidden", false);
			$(document.querySelector('#lblEspecialidades')).prop("hidden", false)
	    }
		else{
			$(document.querySelector('#cbBoxModalidades')).prop("hidden", true);
			$(document.querySelector('#btnAdd')).prop("hidden", true);
			$(document.querySelector('#btnRemove')).prop("hidden", true);
			$(document.querySelector('#btnAddAll')).prop("hidden", true);
			$(document.querySelector('#btnRemoveAll')).prop("hidden", true);
			$(document.querySelector('#listaEspecialidades')).prop("hidden", true);
			$(document.querySelector('#lblEspecialidades')).prop("hidden", true);
			$(document.querySelector('#lblEspecialidades')).prop("hidden", true);
			$(document.querySelector('#validationCRN')).prop("disabled", true);
		}
}

function lengthMinimo(objeto, tamanhoMin){
	
	var valor = objeto.value;
	var tamanhoObj = valor.length;
	
	if(tamanhoObj < tamanhoMin){
		objeto.setCustomValidity("tamanho minimo é: "+tamanhoMin);
	}else{
		objeto.setCustomValidity("");
	}
	objeto.onkeyup = lengthMinimo;
}

function lengthMaximo(objeto, tamanhoMax){
	
	var valor = objeto.value;
	var tamanhoObj = valor.length;
	
	if(tamanhoObj > tamanhoMax){
		objeto.setCustomValidity("tamanho maximo é: "+tamanhoMax);
	}else{
		objeto.setCustomValidity("");
	}
	objeto.onkeyup = lengthMaximo;
}

function lengthIgual(objeto, tamanhoIgual){
	
	var valor = objeto.value;
	var tamanhoObj = valor.length;
	
	if(tamanhoObj != tamanhoIgual){
		objeto.setCustomValidity("tamanho deve ser igual a: "+tamanhoIgual);
	}else{
		objeto.setCustomValidity("");
	}
	objeto.onkeyup = lengthIgual;
}

function lengthIntervalo(objeto, tamanhoMin, tamanhoMax){
	
	var valor = objeto.value;
	var tamanhoObj = valor.length;
	
	if(tamanhoObj < tamanhoMin || tamanhoObj > tamanhoMax){
		objeto.setCustomValidity("tamanho deve ser emtre a: "+tamanhoMin + " e " +tamanhoMax);

	}else{
		objeto.setCustomValidity("");
	}
	objeto.onkeyup = lengthIntervalo;
}

function limiteMinimo(){
	
	var valorCampo = campo.value;
	var tamanho = valorCampo.length;
	
	if(tamanho < 6){
		campo.setCustomValidity("tamanho minimo é 6");
	}else{
		campo.setCustomValidity("");
	}
}

campo.onkeyup = limiteMinimo;



