package br.com.db1.polimorfismo;

public class Cliente implements Autenticavel{

	@Override
	public String autenticar() {
		// TODO Auto-generated method stub
		return "CLIENTE AUTENTICANDO";
	}

	@Override
	public Boolean estaLogado() {
		// TODO Auto-generated method stub
		return true;
	}

}
