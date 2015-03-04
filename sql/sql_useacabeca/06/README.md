Você pode usar `CASE` do mesmo modo que `switch` em algumas linguagens de programação:

```sql
UPDATE tabela
SET nova_coluna = 
CASE
    WHEN coluna1 = valor1 THEN novo_valor1
    WHEN coluna2 = valor2 THEN novo_valor2
    ELSE novo_valor3
END;
```


