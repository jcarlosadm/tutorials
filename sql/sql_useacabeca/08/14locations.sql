USE headfirst_sql;

ALTER TABLE my_contacts
ADD COLUMN city VARCHAR(20);
ALTER TABLE my_contacts
ADD COLUMN state VARCHAR(20);

UPDATE my_contacts
SET state = RIGHT(location, 2);

UPDATE my_contacts
SET city = SUBSTRING_INDEX(location, ',', 1);

CREATE TABLE IF NOT EXISTS locations
(
    zipcode INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    city VARCHAR(20),
    state VARCHAR(20)
)AS
    SELECT city, state FROM my_contacts
    GROUP BY city
    ORDER BY city;
    
ALTER TABLE my_contacts
ADD COLUMN location_zipcode INT;

UPDATE my_contacts JOIN locations
    ON my_contacts.city = locations.city
SET my_contacts.location_zipcode = locations.zipcode;

ALTER TABLE my_contacts
ADD CONSTRAINT locations_zipcode_fk
    FOREIGN KEY (location_zipcode)
    REFERENCES locations (zipcode);
