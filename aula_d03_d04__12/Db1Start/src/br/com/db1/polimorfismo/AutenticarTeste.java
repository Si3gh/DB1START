package br.com.db1.polimorfismo;

import org.junit.Test;

public class AutenticarTeste {

		@Test
		//HERANCA, METODOS, CLASSES CONCRETAS
		public void exemploTest() {
			Cliente cliente = new Cliente();
			System.out.println(cliente.autenticar());
			
			Diretor diretor = new Diretor();
			System.out.println(diretor.autenticar());
			
			Gerente gerente = new Gerente();
			System.out.println(gerente.autenticar());
		}
		
		
		
		
		/*private void exibirMensagem2(Funcionario funcionario) {
			System.out.println("");
		}*/
		
		@Test
		//INTERFACE
		public void exemploInterface() {
			exibirMensagemDeAutenticacao(new Gerente());
			exibirMensagemDeAutenticacao(new Diretor());
			exibirMensagemDeAutenticacao(new Cliente());
			/*Autenticavel autenticavel = new Gerente();
			System.out.println(autenticavel.autenticar());
			
			autenticavel = new Diretor();
			System.out.println(autenticavel.autenticar());
				
			autenticavel = new Cliente();
			System.out.println(autenticavel.autenticar());*/
		}
		
		private void exibirMensagemDeAutenticacao(Autenticavel autenticavel) {
			System.out.println(autenticavel.autenticar());
			
		}
}
