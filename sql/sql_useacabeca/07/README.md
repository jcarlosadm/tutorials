#Projeto Multi Tabelas

A representação de todas as estruturas bem como a forma como se conectam é chamada de **esquema**.

##Chave Estrangeira

Uma **Foreign Key** (chave estrangeira, tambpem conhecida como **Parent key**) é uma coluna em uma tabela que faz referência à **Primary Key** de outra tabela (**Parent Table**).

Os valores de uma chave estrangeira podem ser nulos.

##Relacionamento entre tabelas

Existem três padrões de dados entre tabelas: um-a-um, um-para-muitos e muitos-para-muitos.

###um-a-um

Um registro na tabela A deve ter apenas um registro compatível na tabela B.

Por exemplo, digamos que uma tabela tenha informações básicas dos funcionário e outra tabela tenha informações sobre os ganhos destes funcionários. Cada funcionário listado na tabela de informações básicas tem uma linha correspondente na tabela de ganhos. Ele não pode ter mais de um tipo de ganho.

###um-para-muitos

Quer dizer que um registro na tabela A pode ter vários registros na tabela B relacionados, mas cada registro na tabela B tem apenas um registro na tabela A relacionado.

Por exemplo, uma tabela de profissões associa cada profissão a diversas pessoas na tabela pessoas. E cada pessoa da tabela pessoas associa apenas uma profissão na tabela profissões.

###muitos-para-muitos

Cada registro da tabela A se relaciona com vários registros da tabela B. Da mesma forma, cada registro da tabela B se relaciona com vários registros da tabela A.

Este caso em especial pode gerar dados duplicados na tabela, por isso o ideal é usar o que conhecemos por junção de tabelas.

##Junção de tabelas

A junção de tabelas permite alterar um padrão muitos-para-muitos para um padrão um-para-muitos. Basta usar uma tabela intermediária, com duas chaves estrangeiras, cada qual apontando para uma das tabelas originais.

##Primeira forma normal ou 1FN

- Regra 1: Colunas contém apenas dados atômicos
- Regra 2: Não há grupos de dados repetidos

##Chave composta

Uma chave composta usa mais de uma coluna para formar uma chave primária.

##Dependência Funcional

Quando os dados de uma coluna A dependem dos dados de outra coluna B, dizemos que a coluna A é **funcionalmente dependente** da coluna B.

Nós podemos descrever uma dependência funcional da seguinte forma:

T.x ->; T.y

Isso nos diz que, na tabela T, a coluna y é dependente funcional da coluna x.

###Dependência funcional parcial

Uma dependência funcional é parcial quando depende de uma ou mais colunas que formam a chave composta, mas não todas.

###Dependência funcional transitória

Se uma alteração em uma coluna não chave poderia levar a uma alteração em outras colunas não chave, você tem uma dependência transitória.

Uma dependência funcional transitória acontece quando qualquer coluna não chave é relacionada a qualquer coluna não chave.

##Segunda forma normal ou 2FN

- Regra 1: ser 1FN
- Regra 2: Não ter dependências funcionais parciais.

##Terceira forma normal

- Regra 1: ser 2FN
- Regra 2: não ter dependências funcionais transitórias.
