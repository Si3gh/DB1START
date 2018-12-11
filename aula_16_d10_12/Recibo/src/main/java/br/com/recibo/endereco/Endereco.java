package br.com.recibo.endereco;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.db1.cidade.Cidade;
import br.com.db1.pessoa.Pessoa;

@Entity
@Table(name = "endereco")
public class Endereco {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="cidade_id",referencedColumnName="id",nullable=false)
	private Cidade cidade;
	
	@Column(name = "logradouro")
	private String logradouro;
	
	@Column(name = "numero")
	private String numero;
	
	@Column(name = "complemento")
	private String complemento;
	
	@Column(name = "cep")
	private String cep;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_logradouro")
	private TipoLogradouro tipoLogradouro;
	
	@ManyToOne
	@JoinColumn(name = "pessoa",referencedColumnName = "id",nullable = false)
	private Pessoa pessoa;
}
