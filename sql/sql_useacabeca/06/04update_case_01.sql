USE headfirst_sql;

UPDATE tabela_filme
SET categoria =
CASE
    WHEN drama = TRUE THEN 'drama'
    WHEN comedia = TRUE THEN 'comédia'
    WHEN acao = TRUE THEN 'ação'
    WHEN horror = TRUE THEN 'horror'
    WHEN ficcao = TRUE THEN 'ficção'
    WHEN infantil = TRUE THEN 'família'
    WHEN desenho = TRUE AND censura = '0' THEN 'família'
    ELSE 'diversos'
END;

