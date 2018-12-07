package br.com.db1.polimorfismo;

public class Diretor extends Funcionario implements Autenticavel{

	@Override
	public String autenticar() {
		return "DIRETOR AUTENTICANDO";
	}

	@Override
	public Boolean estaLogado() {
		return true;
	}

}
