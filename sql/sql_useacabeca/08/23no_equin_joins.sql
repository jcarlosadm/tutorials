USE headfirst_sql;

SELECT boys.boy, toys.toy
FROM boys INNER JOIN toys
ON boys.id_toy <> toys.id_toy
ORDER BY toys.toy;
