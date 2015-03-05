USE headfirst_sql;

ALTER TABLE boys
ADD COLUMN id_toy INT;

UPDATE boys
SET id_toy = id_toys;
