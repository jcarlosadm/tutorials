-- equijoin: testa a igualdade

USE headfirst_sql;

SELECT boys.boy, toys.toy
FROM boys
    INNER JOIN
    toys
    ON boys.id_toys = toys.id_toy;
