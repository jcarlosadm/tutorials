USE headfirst_sql;

UPDATE my_contacts
SET interest2 = SUBSTR(interest2,2);
