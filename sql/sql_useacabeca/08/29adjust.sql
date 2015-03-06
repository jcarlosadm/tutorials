USE headfirst_sql;

UPDATE my_contacts
SET seeking2 = SUBSTR(seeking2,2);

UPDATE my_contacts
SET seeking2 = 'friends' WHERE seeking2 = 'friend';
