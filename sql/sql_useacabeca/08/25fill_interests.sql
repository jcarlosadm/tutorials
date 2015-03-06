USE headfirst_sql;

INSERT INTO interests (interest)
SELECT interests_col FROM
    (SELECT interest1 AS interests_col FROM my_contacts
    UNION ALL
        SELECT interest2 FROM my_contacts
    UNION ALL
        SELECT interest3 FROM my_contacts
    UNION ALL
        SELECT interest4 FROM my_contacts) AS my_table
WHERE interests_col IS NOT NULL and interests_col <> ''
GROUP BY interests_col
ORDER BY interests_col;
