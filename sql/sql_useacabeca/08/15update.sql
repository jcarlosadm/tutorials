USE headfirst_sql;

UPDATE my_contacts
SET location_zipcode = 8 WHERE location_zipcode = 7;

DELETE FROM locations
WHERE city = 'San Fran';
