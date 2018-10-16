
	var combo = document.querySelector('#cbBoxModalidades');
	
function adicionarEspecialidade() {
	var existe = false;
	var itemSelecionado = combo.options[combo.selectedIndex].text;
	var opcao = document.createElement('option');
	document.querySelector('#listaEspecialidades').appendChild(opcao);
	var lista = document.querySelector('#listaEspecialidades');
	
	for(i = 0; i < lista.options.length; i++){
		if(lista.options[i].text == itemSelecionado){
			existe = true;
			document.querySelector('#listaEspecialidades').remove(lista.options.length-1);
			$('#mensagemModal').modal();
			break;
		}else if(combo.options[combo.selectedIndex].value == ""){
			existe = true;
			document.querySelector('#listaEspecialidades').remove(lista.options.length-1);
			$('#mensagemModal').modal();
			break;
		}
	}
	if(!existe){
		lista.options[lista.options.length-1].text = itemSelecionado;
	}
}

function removerEspecialidade() {
	
	var lista = document.querySelector('#listaEspecialidades');
	lista.remove(lista.selectedIndex);
	
}