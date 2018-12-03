package br.com.db1.db1start;

public class Texto {


	public String textoMaisculo(String texto) {
		return texto.toUpperCase();	
	}
	public String textoMinusculo(String texto) {
		return texto.toLowerCase();		
	}
	public Integer tamanhoTexto(String texto) {
		return texto.length();
	}
	public Integer tamanhoTextoEspacoso(String texto) {
		return texto.length();
	}
	public Integer tamanhoTextoSemEspaco(String texto) {
		texto = texto.replaceAll(" ", "");
		return texto.length();
	}
	
	public String primeiraQuatroLetras(String texto) {
		return texto.substring(0, 4); //texto.lenght - 4 ??
	}
	
	public String aPartirDaTerceiraLetra(String texto) {
		return texto.substring(2);
		
	}
	public String ultimasQuatroLetras(String texto) {
		return texto.substring(texto.length() - 4);
	}
	
	/*public String[] substituiNomePorAluno(String texto) {
		String c;
		for (int i = 0; i < texto.length(); i++) {
			c = texto[i];
			if (c == " ") {
				
			}
		}
		texto.
		return ;
		
	}*/
	
	
}
