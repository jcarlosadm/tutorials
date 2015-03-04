USE headfirst_sql;

INSERT INTO tabela_filme
(titulo, censura, drama, comedia, acao, horror, ficcao, infantil, desenho, data_compra)
VALUES
('Monster, Inc.', '0', FALSE, TRUE, FALSE, FALSE, FALSE, TRUE, TRUE,'1993-12-10'),
('The Godfather', '18', FALSE, FALSE, TRUE, TRUE, FALSE, FALSE, FALSE,'1993-12-3'),
('Gone with the Wind', '0', TRUE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE,'1993-12-3'),
('American Pie', '18', FALSE, TRUE, FALSE, FALSE, FALSE, FALSE, FALSE,'1993-12-4'),
('Nitghtmare on Elm Street', '18', FALSE, FALSE, TRUE, TRUE, FALSE, FALSE, FALSE,'1992-12-5'),
('Casablanca', '13', TRUE, FALSE, FALSE, FALSE, FALSE, FALSE, FALSE,'1993-12-4');
