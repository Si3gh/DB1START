package br.com.db1.recibo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recibo")
public class Recibo {
	
	@Id	
	@Column(name = "valor",precision = 14,scale = 2,nullable = false)
	private double valor;
	
	@Column(name = "dataEmissao",nullable = false)
	private Date dataEmissao;
	
}
