USE headfirst_sql;

SELECT mc.last_name, mc.first_name, p.profession
FROM my_contacts AS mc
    INNER JOIN
    professions AS p
    ON mc.profession_id = p.id;
