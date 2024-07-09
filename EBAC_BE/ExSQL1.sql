--CRIAR
create table tb_produto (
                            id BIGSERIAL PRIMARY KEY,
                            nome VARCHAR(60)
);

--ALTERAR
ALTER TABLE tb_produto ADD COLUMN quantidade int;

--DELETAR
DROP TABLE tb_produto;



--INSERIR
INSERT INTO tb_produto values (0, 'Notepad1', 1);
--ALTERAR
UPDATE tb_produto SET id = 1;

--DELETAR
INSERT INTO tb_produto values (2, 'Notepad1', 3);
DELETE FROM tb_produto where quantidade = 3;