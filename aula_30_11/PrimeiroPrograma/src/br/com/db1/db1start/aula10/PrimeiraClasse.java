package br.com.db1.db1start.aula10;

public class PrimeiraClasse {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		
		Integer numeroASerVerificado = 3;
		boolean eVerdade = numeroASerVerificado == 3;
		
		boolean eVerdadeNumImpar = numeroASerVerificado % 2 > 0;
		System.out.println(eVerdade);
		System.out.println(eVerdadeNumImpar);
		
		Integer vNmr1 = 8;
		Integer vNmr2 = 4;
		
		//Integer soma = valorA + valorB;
		//Integer subtr = valorA - valorB;
		System.out.println("Valor A: " + vNmr1 + "\nValor B: " + vNmr2);
		//System.out.println("Soma: " + soma + "\nSubtracao: " + subtr);
	
		Integer resultaDaSoma = PrimeiraClasse.soma(vNmr1, vNmr2);
		Integer resultaDaSubtr = PrimeiraClasse.subtrai(vNmr1, vNmr2);
		Integer resultaDaMultp = PrimeiraClasse.multiplica(vNmr1, vNmr2);
		//double resultaDaDivisao= PrimeiraClasse.divisao(vNmr1, vNmr2);
		System.out.println("Soma: " );PrimeiraClasse.imprimiInt(resultaDaSoma);
		System.out.println("Subtr: ");PrimeiraClasse.imprimiInt(resultaDaSubtr);
		System.out.println("Multp: ");PrimeiraClasse.imprimiInt(resultaDaMultp);
	//	System.out.println("Divisao: ");PrimeiraClasse.imprimiDouble(resultaDaDivisao);
		//System.out.println("Soma: " + resultaDaSoma);
	}
	
	public static Integer soma(Integer valorA, Integer valorB) {
		return valorA + valorB;
		
	}
	public static Integer subtrai(Integer valorA, Integer valorB) {
		return valorA - valorB;
		
	}
	public static Integer multiplica(Integer valorA, Integer valorB) {
		return valorA * valorB;
		
	}
	public static Integer divisao(Integer valorA, Integer valorB) {
		return valorA / valorB;
		
	}
	
	
	
	public static void imprimiInt(Integer valor) {
		System.out.print(valor);
	}
	public static void imprimiDouble(double valor) {
		System.out.print(valor);
	}
	
	
	
}
