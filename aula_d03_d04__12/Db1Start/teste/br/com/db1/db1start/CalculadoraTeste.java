package br.com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTeste {

	@Test
	public void deveSomar() {
		Calculadora calculadora = new Calculadora();
		int valorDaSoma = calculadora.soma(12, 13);
		System.out.println(valorDaSoma);
		
		Assert.assertEquals(25, valorDaSoma);
				
	}
	
	@Test 
	public void deveSubtrair() {
		Calculadora calculadora = new Calculadora();
		int valorDaSubtracao= calculadora.subtrai(10, 5);
		
		System.out.println(valorDaSubtracao);
		
		Assert.assertEquals(5, valorDaSubtracao);
		
		
	}
	
	@Test
	public void deveMultiplicar() {
		Calculadora calculadora = new Calculadora();
		int valorDaMultiplicacao= calculadora.multiplica(2, 9);
		System.out.println(valorDaMultiplicacao);
		
		Assert.assertEquals(18, valorDaMultiplicacao);
		
	}
	
	@Test
	public void deveDividir() {
		Calculadora calculadora = new Calculadora();
		float valorDaDivisao= calculadora.divide(10, 5);
		System.out.println(valorDaDivisao);
		
		Assert.assertEquals(2f, valorDaDivisao, 0.001);
		
	}
	
	@Test
	public void deveDizerEhParImpar() {
		Calculadora calculadora = new Calculadora();
		boolean valorEhPar = calculadora.ehPar(28);
		System.out.println(valorEhPar);
	
		Assert.assertTrue(valorEhPar);
	}
	
	@Test
	public void deveDizerMaiorNumero() {
		Calculadora calculadora = new Calculadora();
		int maiorValor = calculadora.maiorNumero(20, 10);
		System.out.println("Maior valor � : " + maiorValor);
		Assert.assertEquals(20, maiorValor);
	}
	@Test
	public void deveDizerNumeroDeImparesAte100() {
		Calculadora calculadora = new Calculadora();
		int qntdImpares = calculadora.numeroImpares(1);
		System.out.println("Qntd nmros Impares de 1 at� 100: "+ qntdImpares);
		Assert.assertEquals(50, qntdImpares);
	}
	
	@Test 
	public void deveDizerMenorNumeroDouble() {
		Calculadora calculadora = new Calculadora();
		double menorValor = calculadora.menorValorDouble(50.20, 50.50);
		System.out.println("Menor valor double �: " + menorValor);
		Assert.assertEquals(50.20, menorValor,0.0);
	}
	
	@Test
	public void deveDizerMenorNumeroDouble2() {
		Calculadora calculadora = new Calculadora();
		double menorValor = calculadora.menorValorDouble(50.10, 50.50, 50.60);
		System.out.println("Menor valor double �: " + menorValor);
		Assert.assertEquals(50.10, menorValor,0.0);
	}
	
	@Test
	public void deveRetornarMediaDouble() {
		Calculadora calculadora = new Calculadora();
		double media = calculadora.mediaDouble(10.0, 10.0, 10.0);
		System.out.println("Media: " + media);
		Assert.assertEquals(10.0, media,0.0);
	}
	
	@Test 
	public void deveRetornarAreaTriangulo() {
		Calculadora calculadora = new Calculadora();
		double areaTriangulo = calculadora.areaTriangulo(10.00, 10.00);
		System.out.println("Menor valor double �: " + areaTriangulo);
		Assert.assertEquals(50.00, areaTriangulo,0.0);
	}
}
