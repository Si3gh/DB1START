package br.com.db1.db1start;

public class Calculadora {

	public Integer soma(int valorA, int valorB) {
		int soma = valorA + valorB;
		return soma;
	}
	
	public Integer subtrai(int valorA, int valorB) {
		int subtracao = valorA - valorB;
		return subtracao;
	}
	
	public Integer multiplica(Integer valorA, Integer valorB) {
		int multiplicacao = valorA * valorB;
		return multiplicacao;
	}

	public float divide(int valorA, int valorB) {
		return valorA / valorB;
	}
	
	public boolean ehPar(int valorA) {
		return valorA % 2  == 0;
	}
	
	public Integer maiorNumero(int valorA, int valorB) {
        int valorEscolhido;
        // Aqui o maior valor � o valorA = 20
        valorEscolhido = valorA > valorB ?valorA: valorB;
       return valorEscolhido;
    
	}
	
	public Integer numeroImpares(int vInic) {
		int quantidade=0;
        for (int j = vInic; j < 100; j++) {
        	if (j%2 == 1) {
        		quantidade ++;
			}
		}
        return quantidade;
	}
	public double menorValorDouble(double valor1, double valor2) {
		// double maiorValor;
	    // maiorValor = valor1 > valor2 ?valor1: valor2;
	     return valor1 < valor2 ?valor1: valor2;
	}
	
	public double menorValorDouble(double num1, double num2, double num3) {
		// double maiorValor;
	    // maiorValor = valor1 > valor2 ?valor1: valor2;
	     return  num3 < (num1 < num2 ? num1:num2) ? num3:(num1 < num2 ? num1:num2);
	}
			
}
