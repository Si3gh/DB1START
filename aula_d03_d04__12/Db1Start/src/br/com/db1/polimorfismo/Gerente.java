package br.com.db1.polimorfismo;

public class Gerente extends Funcionario implements Autenticavel{

	@Override
	public String autenticar() {
		for (int i = 0; i < 10; i++) {
			System.out.println("" + i);
		}
		return "GERENTE AUTENTICANDO";
	}

	@Override
	public Boolean estaLogado() {
		return true;
	}

}
