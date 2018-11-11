package br.com.fitNet.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import br.com.fitNet.model.Acesso;

public class AutorizadorInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object controller)
			throws Exception {

		boolean retorno = false; // Variável usada para o retorno do preHandle
		
		Acesso acessoDaSecao = new Acesso();
		
		String uri = request.getRequestURI();
		
		if (uri.endsWith("index") || 
				uri.endsWith("formLoginCorporativo")||
				uri.endsWith("formLoginCliente") ||
				uri.endsWith("logarSistema") || 
				uri.endsWith("logarNaAreaDoCLiente") ||
				uri.endsWith("mostraMensagemAcesso") ||
				uri.contains("resources") ||
				request.getSession().getAttribute("usuarioLogado") != null) {
			
			// Verifica se existe algun usuario na seção, se sim, atribui a 'acessoDaSecao'.
			if(request.getSession().getAttribute("usuarioLogado") != null){
				acessoDaSecao = (Acesso) request.getSession().getAttribute("usuarioLogado");
				request.getSession().setAttribute("usuarioDoAcesso", acessoDaSecao.getUsuario());
				
			}
			
			if(uri.endsWith("formLoginCorporativo") && acessoDaSecao.getIdFuncionario() >= 0){
				response.sendRedirect("telaPrincipalSistema");
			}
			
			if(uri.endsWith("areaClienteLogado") && acessoDaSecao.getIdFuncionario() > 0){
				response.sendRedirect("mostraMensagemAcesso");
			}
			
			// Testa se o IdCliente do acesso da seção existe, ou seja, se for maio que zero Existe.
			if(acessoDaSecao.getIdCliente() > 0){
				
				//Páginas que serão permitidas acessar
				if (uri.endsWith("index") || 
						uri.endsWith("formLoginCliente")||
						uri.endsWith("logarNaAreaDoCLiente")||
						uri.endsWith("mostraMensagemAcesso")||
						uri.endsWith("areaClienteTreino")||
						uri.endsWith("areaClienteLogado")){
					retorno = true;
				
				}
				
				//Se a página à acessar não estiver na lista acima, redireciona para uma mensagem de Erro.	
				else{
					response.sendRedirect("mostraMensagemAcesso");
				}
			}
			retorno = true;
			
		}else if(uri.endsWith("areaClienteLogado") && acessoDaSecao.getIdCliente() < 0){
				response.sendRedirect("formLoginCliente");
			
		}else{
			response.sendRedirect("index"); //Redireciona para index
		}
		
		return retorno; //Retorno final do preHandle
	}
}
