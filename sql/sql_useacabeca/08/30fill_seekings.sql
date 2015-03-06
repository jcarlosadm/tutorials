USE headfirst_sql;

INSERT INTO seekings (seeking)
SELECT seeking_col FROM
    (SELECT seeking1 AS seeking_col FROM my_contacts
    UNION ALL
        SELECT seeking2 FROM my_contacts) AS my_table
WHERE seeking_col IS NOT NULL and seeking_col <> ''
GROUP BY seeking_col
ORDER BY seeking_col;
