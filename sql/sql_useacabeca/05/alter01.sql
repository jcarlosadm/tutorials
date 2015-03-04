USE headfirst_sql;

-- Você não precisa usar apenas FIRST ou AFTER. Também pode usar:  BEFORE, LAST, SECOND, THIRD

ALTER TABLE MEUS_CONTATOS
ADD COLUMN telefone VARCHAR(10) AFTER PRIMEIRO_NOME;
