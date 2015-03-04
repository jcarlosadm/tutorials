Comandos que podemos usar com `ALTER`:

- CHANGE: muda o nome e os tipos de dados (você pode perder seus dados) de uma coluna já existente.
- MODIFY: modifica os tipos de dados (você pode perder seus dados) e a posição de uma coluna existente.
- ADD: adiciona uma coluna a sua tabela.
- DROP: elimina uma coluna (você perderá seus dados) da sua tabela.

Você pode usar algumas funções para ajudar em uma consulta sql:

```sql
SELECT RIGHT(local, 2) FROM meus_contatos;
```

O comando anterior retorna os dois últimos caracteres da coluna *local* da tabela *meus_contatos* (para retornar os primeiros caracteres da coluna, use `LEFT`). Outra função:

```sql
SELECT SUBSTRING_INDEX(local, ',', 1) FROM meus_contatos;
```

O comando anterior `SUBSTRING_INDEX` retorna uma uma *substring* do começo da *string* original até encontrar a primeira vírgula (o parâmetro 1 passado). O **SQL** possui muitas funções disponíveis, não apenas para *strings*.

Podemos usar o comando `UPDATE` para atualizar uma tabela, criando uma nova coluna a partir de outra:

```sql
UPDATE meus_contatos
SET estado = RIGHT(local, 2);
```
