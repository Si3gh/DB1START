-- 1  faça insert na tabela UF com todas as siglas dos estados do Brasil.
INSERT INTO UF(NOME) VALUES	('PR'), ('MR'), ('MG'), ('AC'), ('AL'), ('AP'), ('AM'), ('BA'), 
							('CE'), ('DF'), ('ES'), ('GO'), ('MA'), ('MT'), ('MS'), ('PA'), 
                            ('PB'), ('PE'), ('PI'), ('RJ'), ('RN'), ('RS'), ('RO'), ('RR'),
                            ('SC'), ('SP'), ('SE'), ('TO');

 /*2 insira as seguintes cidades:
Para o SC
* Chapecó
* Blumenau
* Joinville

Para o PR
* Curitiba
* Maringá
* Lunardeli
* Apucarana
* Santa fé
* São Miguel do Iguaçu
* Arapongas
* Ponta Grossa
* Jandaia do Sul

Para o SP
*Ribeirão Preto
*/
INSERT INTO CIDADE(NOME,UF_ID)
VALUES	('Ribeirão Preto',26),
		('Curitiba',1),
        ('Maringá',1),
        ('Lunardeli',1),
        ('Apucarana',1),
        ('Santa fé',1),
        ('São Miguel do Iguaçu',1),
        ('Arapongas',1),
        ('Ponta Grossa',1),
        ('Jandaia do Sul',1),
		('Chapecó',25),
        ('Blumenau',25),
        ('Joinville',25);


-- 3 Realize a remoção dos estados que não tem cidades
SELECT UF_ID FROM CIDADE;
DELETE FROM UF WHERE ID NOT IN (SELECT UF_ID FROM CIDADE);

-- 4 Insira novas cidades no estado de SP
INSERT INTO CIDADE(NOME , UF_ID) 
VALUES ('São paulo',26),('R',26);

/* 5 Realize a atualização do nome das cidades:
* Lunardeli para Lunardelli
* Jandaia do Sul para Jandaia
* Maringá para Cidade Canção
*/

update cidade set nome = 'Lunardelli' where nome = 'Lunardeli';
update cidade set nome = 'Jandaia' where nome = 'Jandaia do Sul';
update cidade set nome = 'Cidade Canção' where nome = 'Maringá';

/*6 - Faça um select que retorne o nome das cidades e seus respectivos estados. 
Ordene por estados e posteriomente pelo nome das cidades */
Select C.nome, U.nome
from Cidade as C inner join UF as U
on C.uf_id = U.id
order by U.nome , C.nome;

/*7 Retorne quantas cidades cada estado possui :) (não expliquei ainda)
dica: veja group by e count()*/
Select  count(U.nome) as Quantidade, U.nome
from Cidade as C inner join UF as U
on C.uf_id = U.id
group by U.id;

/*8 - Insira tres pessoas na base de dados.
 Cada uma destas pessoas deve ter dois enderecos (um comercial e outro residencial). 
 As cidades que devem ser usadas são do estado do PR (você escolhe).*/
desc Pessoa;
insert into Pessoa(nome)
values
('Bruno'),
('Jurandir'),
('Marcia'); 


desc endereco;
select * from cidade;
insert into endereco(logradouro,cep,Cidade_id,tipo)
values
('Avenida Guedner',87050390,2,'Residencial'),
('Rua Antonio Carlos',19570000,3,'Comercial'),
('Avenida Loca',19570001,3,'Comercial'),
('Bairro inexistente',87050391,2,'Residencial'),
('Avenida Augusto Gomes de Oliveira',85065-130,6,'Residencial');

select * from endereco;
desc pessoa_has_endereco;
insert into pessoa_has_endereco(Pessoa_id,Endereco_id)
values 
(1,1),
(1,4),
(2,2),
(2,4),
(3,3),
(3,5);

/*9 -Insira duas pessoas na base de dados. Cada uma destas pessoas deve ter dois enderecos 
(um comercial e outro residencial). As cidades que devem ser usadas são do estado de SP (você escolhe).*/
desc pessoa;
insert into pessoa(nome)
values('Fuska'),('Maiko');

select * from cidade;
desc endereco;
insert into endereco(logradouro,cep,cidade_id,tipo)
values
('Rua Jalisco',03343030,14,'Comercial'),
('Rua Adolfo DÁvila',03344080,14,'Residencial'),
('Rua Baguassu',03344015,14,'Residencial');

select * from endereco;
desc pessoa_has_endereco;
insert into pessoa_has_endereco(Pessoa_id,Endereco_id)
values
(4,6),
(4,7),
(5,6),
(5,8);

/*10 - Insira duas pessoas na base de dados. Cada uma destas pessoas deve ter um endereco do tipo comercial.
 As cidades que devem ser usadas são do estado de SC (você escolhe).*/
 desc pessoa;
 insert into pessoa(nome)
 values 
 ('marvin'),
 ('thomas');

select * from cidade;
desc endereco;
insert into endereco(logradouro,cep,cidade_id,tipo)
values
('Rua Adelia Sill',89288560,11,'Comercial'),
('Rua Adolfo Grosl',89286262,11,'Comercial');

select * from endereco;
insert into pessoa_has_endereco(Pessoa_id,Endereco_id)
values
(6,11),
(7,12);

/*11 - Faça um select que retorne o nome das pessoas e seus respectivos enderecos (com cidade e estado). 
Ordene por nome de pessoa, nome do estado e nome da cidade*/
desc endereco;
desc cidade;
desc uf;
desc pessoa_has_endereco;
select p.nome Nome_Pessoa, e.logradouro endereco, e.cep cep, e.tipo tipo, c.nome cidade, u.nome
from Pessoa as p inner join endereco as e inner join cidade as c inner join uf as u inner join pessoa_has_endereco as pe
on pe.pessoa_id = p.id and pe.endereco_id = e.id and e.cidade_id = c.id and c.Uf_id = u.id
order by p.nome , e.logradouro , c.nome;


-- 12 - remova todos as pessoas que tem endereço da cidade de Ribeirão Preto
desc endereco;
delete from pessoa 
where id = (select p.id from
						pessoa as p inner join endereco as e inner join pessoa_has_endereco as pe inner join cidade as c
                        where p.id = pe.pessoa_id and 
						pe.endereco_id = e.id and 
						e.cidade_id = c.id and 
						c.nome = 'Ribeirão Preto');
                        
-- 13 - Mude todos os endereços residenciais do sistema. Eles devem ter cep 00000000
desc endereco;
update endereco set cep = 00000000 where tipo = 'Residencial';

-- 14 - altere o nome da coluna prestador_fk para cliente_fk. 
desc recibo;
alter table recibo change prestador cliente_fk int(11);

/*15 - Insira dois recibos sendo que eles devem ter clientes residentes no PR e o prestador de servico deve ser o mesmo (não importando o estado).
 Exemplo: 
* cliente fusca, da cidade curitiba, no PR. Prestador: DB1, estado PR.
* cliente tamara, da cidade maringá, no PR. Prestador: DB1, estado PR.*/
desc recibo;
select * from pessoa;
insert into recibo(cliente,cliente_fk,valor,dataEmissao)
values
(1,4,1200,NOW()),
(2,4,100,NOW());


/*16 - Insira dois recibos sendo que eles devem ter clientes residentes no PR e prestadores de serviços diferentes. Exemplo: 
* cliente fusca, da cidade curitiba, no PR. Prestador: FCV, estado PR.
* cliente tamara, da cidade maringá, no PR. Prestador: USP, estado SP.*/
insert into recibo(cliente,cliente_fk,valor,dataEmissao)
values
(2,4,1100,NOW()),
(3,5,1230,NOW());

/*17 - Realize uma consulta na base de dados e exiba os seguintes dados:		
* numero do recibo
* data emissao do recibo
* valor do recibo
* nome do cliente 
* estado do cliente
* nome do emitente
* estado do emitente*/
desc cidade;

select 	distinct r.numero numero, r.dataEmissao data_Emissao, r.valor valor, c.nome nome_cliente, 
		uc.nome estado_cliente, p.nome nome_emitente, up.nome estado_emitente
		from recibo as r 
        inner join pessoa as c 	-- Cliente
        inner join pessoa as p 	-- Funcionario
        inner join pessoa_has_endereco as phc -- Ligacao cliente
        inner join pessoa_has_endereco as php -- Ligação prestador
        inner join endereco as ep	 -- Endereco prestador 
        inner join endereco as ec	 -- Endereco  cliente
        inner join cidade as cp		 -- Cidade prestador
        inner join cidade as cc 	 -- Cidade cliente
        inner join uf as uc 		 -- Uf cliente 
        inner join uf as up 		 -- Uf Funcionario ; prestador de serviço
        
	on 	r.cliente = c.id and 
			r.cliente_fk = p.id and 
			c.id = phc.Pessoa_id and
            p.id = php.Pessoa_id and
            phc.Endereco_id = ec.id and
            php.Endereco_id = ep.id and
            ec.Cidade_id = cc.id and
            ep.Cidade_id = cp.id and
            cc.Uf_id = uc.id and
            cp.Uf_id = up.id
            
	order by r.dataEmissao , c.nome , p.nome;
    
    
/*18 - Faça uma consulta que mostre:
* quantidade de recibos emitidos no PR
* valor total de recibos emitidos no PR*/
desc cidade;
Select count(r.numero) quantidade, sum(r.valor) Valor_total
	from 	recibo as r 
			inner join pessoa as c 
			inner join pessoa_has_endereco as pe
			inner join endereco as e
			inner join cidade as cd
			inner join uf as u
	
    on 		r.cliente = c.id 
			and pe.Pessoa_id = c.id
            and pe.Endereco_id = e.id
            and e.Cidade_id = cd.id
            and cd.Uf_id = u.id
            and u.nome = 'PR';