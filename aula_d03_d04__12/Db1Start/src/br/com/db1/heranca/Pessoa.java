package br.com.db1.heranca;

import java.util.Date;
import java.util.List;

public abstract class Pessoa {
	private String nome;
	private Date dataNascimento;
	private Double peso;
	List <Endereco> enderecos;
	//Recibo recibo 2 = new Recibo(pessoa);
	/*Teste
	 * Feijoada feijoada = 
	 * 			new Feijoada(new Feijao(), new Bacon()){}
	 * 
	 * */
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	

	
	
}
