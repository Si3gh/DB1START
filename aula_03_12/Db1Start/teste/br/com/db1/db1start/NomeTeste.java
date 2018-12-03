package br.com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

public class NomeTeste {
	
	@Test
	public void deveTransformarParaLetraMaiscula() {
		Nome nome = new Nome();
		String valorTransformado = nome.transformarParaLetraMaiuscula("jo�o pedro broietti pissolito");
		System.out.println(valorTransformado);
		//falha 
		//Assert.assertEquals("JO�O PEDRO BROIETTI PISSOLITO", valorTransformado);
		Assert.assertEquals("JO�O PEDRO BROIETTI PISSOLITO", valorTransformado);
	}
	
	@Test
	public void deveRetornarTamanhoDoNome() {
		Nome nome = new Nome();
		int tamanhoDoNome = nome.tamanhoDoNome("JO�O PEDRO");
		Assert.assertEquals(10, tamanhoDoNome);
		System.out.println(tamanhoDoNome);
	}
}
