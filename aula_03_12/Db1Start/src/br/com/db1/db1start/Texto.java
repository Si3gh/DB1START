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
}
