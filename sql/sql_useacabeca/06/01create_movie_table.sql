
USE headfirst_sql;

CREATE TABLE IF NOT EXISTS tabela_filme
(
    id_filme INT NOT NULL AUTO_INCREMENT,
    titulo VARCHAR(30) NOT NULL,
    censura VARCHAR(3) NOT NULL,
    drama BOOLEAN NOT NULL,
    comedia BOOLEAN NOT NULL,
    acao BOOLEAN NOT NULL,
    horror BOOLEAN NOT NULL,
    ficcao BOOLEAN NOT NULL,
    infantil BOOLEAN NOT NULL,
    desenho BOOLEAN NOT NULL,
    data_compra DATE NOT NULL,
    PRIMARY KEY (id_filme)
);

