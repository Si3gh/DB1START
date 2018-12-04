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
	/**/
	@Test
	public void deveRetornarPrimeirasQuatroLetras() {
		Texto texto = new Texto();
		String valorTexto = texto.primeiraQuatroLetras("Jo�o Pedro Broietti Pissolito");
		System.out.println(valorTexto);
		Assert.assertEquals("Jo�o", valorTexto);
	}
	/**/
	@Test
	public void deveRetornarTextoAPartirDaTerceiraLetra() {
		Texto texto = new Texto();
		String valorTexto = texto.aPartirDaTerceiraLetra("Jo�o Pedro Broietti Pissolito");
		System.out.println(valorTexto);
		Assert.assertEquals("�o Pedro Broietti Pissolito", valorTexto);
	}
	@Test
	public void deveRetornarUltimasQuatroLetras() {
		Texto texto = new Texto();
		String valorTexto = texto.ultimasQuatroLetras("Jo�o Pedro Broietti Pissolito");
		System.out.println(valorTexto);
		Assert.assertEquals("lito", valorTexto);
	}
	
	@Test
	public void deveRetornarAlunoEmVezDePrimeiroNome() {
		Texto texto = new Texto();
		String valorTexto = texto.substituiNomePorAluno("Jo�o Pedro Broietti Pissolito");
		System.out.println(valorTexto);
		Assert.assertEquals("Aluno Pedro Broietti Pissolito", valorTexto);
	}
	
	@Test
	public void deveRetornarStringSemVirgula() {
		Texto texto = new Texto();
		String[] textoSeparado = texto.separaTextoComVirgula("banana, ma��, melancia");
		String[] textoEsperado = {"banana", " ma��", " melancia"};
		System.out.println("Texto -sem virgula -sOutput");
		Assert.assertArrayEquals(textoSeparado,textoEsperado);
	}
	
	@Test
	public void deveRetornarQntdVogais() {
		Texto texto = new Texto();
		int qntdVogais =texto.contaVogal("Abacaxi") ;
		System.out.println(qntdVogais);
		Assert.assertEquals(4, qntdVogais);
	}
	
	@Test
	
	public void deveRetornarStringInvertida() {
		Texto texto = new Texto();
		String strInvertida = texto.inverteString("awar") ;
		Assert.assertEquals("rawa", strInvertida);
	}
	
	
}
