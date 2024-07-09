--CRIAR
create table tb_produto (
                            id BIGINT NOT NULL,
                            nome VARCHAR(60) NOT NULL,
							preco DECIMAL,
							CONSTRAINT pk_id_produto PRIMARY KEY (id)
);

create table tb_pessoa (
                            id BIGINT NOT NULL,
                            nome VARCHAR(60) NOT NULL,
							CONSTRAINT pk_id_pessoa PRIMARY KEY (id)
);

create table tb_venda (
                            id BIGINT NOT NULL,
                            id_cliente BIGINT,
							id_produto BIGINT,
							CONSTRAINT pk_id_venda PRIMARY KEY (id),
							CONSTRAINT fk_pessoa FOREIGN KEY (id_cliente) REFERENCES tb_pessoa(id),
							CONSTRAINT fk_produto FOREIGN KEY (id_produto) REFERENCES tb_produto(id)
);

--INSERIR
INSERT INTO tb_produto values (1, 'Notepad1', 10.0);
INSERT INTO tb_produto values (2, 'Pen', 1.0);
INSERT INTO tb_produto values (3, 'Paper', 30.0);

INSERT INTO tb_pessoa VALUES (1, 'Rafael');
INSERT INTO tb_pessoa VALUES (2, 'Yasminn');
INSERT INTO tb_pessoa VALUES (3, 'Leonardo');

INSERT INTO tb_venda VALUES (1, 1, 1);
INSERT INTO tb_venda VALUES (2, 2, 2);
INSERT INTO tb_venda VALUES (3, 3, 3);

--DATA
select a.id as id_venda, b.nome as nome_cliente, c.nome as produto 
from tb_venda as a 
left join tb_pessoa as b
on a.id_cliente = b.id
left join tb_produto as c
on a.id_produto = c.id


