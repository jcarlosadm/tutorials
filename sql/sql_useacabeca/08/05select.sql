USE headfirst_sql;

SELECT b.toy, g.boy
FROM toys AS b
    CROSS JOIN
    boys AS g;
