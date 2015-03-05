USE headfirst_sql;

SELECT my_contacts.first_name, my_contacts.last_name, locations.city, locations.state
FROM my_contacts INNER JOIN locations
ON my_contacts.location_zipcode = locations.zipcode
ORDER BY my_contacts.first_name;
