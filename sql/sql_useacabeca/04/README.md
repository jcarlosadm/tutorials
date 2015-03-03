#Tabelas normais

##Dados atômicos

**Dados atômicos**: dados que já foram divididos até o menor pedaço de dados que não pode ou não deve ser dividido.

- Regra 1: uma coluna com dados atômicos não pode conter muitos valores do mesmo tipo de dados naquela coluna.
- Regra 2: uma tabela com dados atômicos não pode conter múltiplas colunas com o mesmo tipo de dados.

Fazer dados atômicos é o primeiro passo para criar uma tabela **normal**.

##Chave primária

O outro passo para ter uma tabela normal é ela possuir uma **chave primária**. Uma chave primária é uma coluna da tabela que torna o seus registros únicos.

A chave primária não pode ser nula, deve ser atríbuída no momento de criação do registro, aconselhável ser compacta e não pode ser alterada.

Em geral, o melhor é criar uma nova coluna na sua tabela, que possa guardar um identificador único para cada linha.

Para especificar a chave primária na criação da tabela, em primeiro lugar crie uma coluna *NOT NULL* e depois especifique que a chave primária é esta coluna:

```sql
CREATE TABLE PRODUTOS
(
    ID INT NOT NULL,
    PRODUTO VARCHAR(30) NOT NULL,
    PRECO FLOAT(10,2),
    QUANT INT,
    PRIMARY KEY (ID)
);
```

A coluna `ID` anterior poderia ser autoincrementada com a palavra reservada `AUTO_INCREMENT`.

Para inserir uma chave primária depois de criar a tabela, use `ALTER`:

```sql
ALTER TABLE MEUS_CONTATOS
ADD COLUMN id_contato INT NOT NULL AUTO_INCREMENT FIRST,
ADD PRIMARY KEY (id_contato);
```

