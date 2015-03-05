USE headfirst_sql;

SELECT my_contacts.first_name, my_contacts.last_name, my_contacts.email, professions.profession
FROM my_contacts INNER JOIN professions
ON my_contacts.profession_id = professions.id
ORDER BY my_contacts.first_name;
