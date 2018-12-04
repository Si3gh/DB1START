package br.com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

public class NomeTeste {
	
	@Test
	public void deveTransformarParaLetraMaiscula() {
		Nome nome = new Nome();
		String valorTransformado = nome.transformarParaLetraMaiuscula("joão pedro broietti pissolito");
		System.out.println(valorTransformado);
		//falha 
		//Assert.assertEquals("JOÃO PEDRO BROIETTI PISSOLITO", valorTransformado);
		Assert.assertEquals("JOÃO PEDRO BROIETTI PISSOLITO", valorTransformado);
	}
	
	@Test
	public void deveRetornarTamanhoDoNome() {
		Nome nome = new Nome();
		int tamanhoDoNome = nome.tamanhoDoNome("JOÃO PEDRO");
		Assert.assertEquals(10, tamanhoDoNome);
		System.out.println(tamanhoDoNome);
	}
}
