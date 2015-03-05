USE headfirst_sql;

ALTER TABLE boys
ADD CONSTRAINT toys_id_toy_fk
    FOREIGN KEY (id_toys)
    REFERENCES toys (id_toy);
