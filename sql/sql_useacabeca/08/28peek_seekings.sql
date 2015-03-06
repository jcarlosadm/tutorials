USE headfirst_sql;

ALTER TABLE my_contacts
ADD COLUMN backup_seeking VARCHAR(20),
ADD COLUMN seeking1 VARCHAR(20),
ADD COLUMN seeking2 VARCHAR(20);

UPDATE my_contacts
SET backup_seeking = seeking;

UPDATE my_contacts SET
seeking1 = SUBSTRING_INDEX(seeking, ',',1),
seeking = SUBSTR(seeking, LENGTH(seeking1)+2),
seeking2 = seeking;
