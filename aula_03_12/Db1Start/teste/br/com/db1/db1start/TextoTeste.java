package br.com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

public class TextoTeste {
	
	@Test
	public void deveTransformarParaLetraMaiscula() {
		Texto texto = new Texto();
		String textoTransformado = texto.textoMaisculo("jo�o pedro broietti pissolito");
		System.out.println(textoTransformado);
	
		Assert.assertEquals("JO�O PEDRO BROIETTI PISSOLITO", textoTransformado);
	}
	
	@Test
	public void deveTransformarParaLetraMinuscula() {
		Texto texto = new Texto();
		String textoTransformado = texto.textoMinusculo("Jo�o Pedro Broietti Pissolito");
		System.out.println(textoTransformado);
	
		Assert.assertEquals("jo�o pedro broietti pissolito", textoTransformado);
	}
	
	
	@Test
	public void deveRetornarTamanhoDoTexto() {
		Texto texto = new Texto();
		int tamanhoDoTexto = texto.tamanhoTexto("DB1START");
		
		System.out.println(tamanhoDoTexto);
		Assert.assertEquals(8, tamanhoDoTexto);
	}
	
	@Test
	public void deveRetornarTamanhoDoTextoComEspaco() {
		Texto texto = new Texto();
		int tamanhoDoTexto = texto.tamanhoTexto(" DB1START ");
		
		System.out.println(tamanhoDoTexto);
		Assert.assertEquals(10, tamanhoDoTexto);
	}
	@Test
	public void deveRetornarTamanhoDoTextoSemEspaco() {
		Texto texto = new Texto();
		int tamanhoDoTexto = texto.tamanhoTextoSemEspaco(" DB1START ");
		System.out.println(tamanhoDoTexto);
		Assert.assertEquals(8, tamanhoDoTexto);
	}
}
