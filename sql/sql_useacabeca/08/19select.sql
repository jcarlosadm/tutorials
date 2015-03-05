use headfirst_sql;

SELECT my_contacts.last_name, my_contacts.first_name, status_table.status
FROM my_contacts INNER JOIN status_table
ON my_contacts.status_id = status_table.id
ORDER BY my_contacts.last_name;
