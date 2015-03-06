USE headfirst_sql;

ALTER TABLE my_contacts
ADD COLUMN interest1 VARCHAR(20),
ADD COLUMN interest2 VARCHAR(20),
ADD COLUMN interest3 VARCHAR(20),
ADD COLUMN interest4 VARCHAR(20);

UPDATE my_contacts SET
interest1 = SUBSTRING_INDEX(interests, ',',1),
interests = SUBSTR(interests, LENGTH(interest1)+2),
interest2 = SUBSTRING_INDEX(interests, ',', 1),
interests = SUBSTR(interests, LENGTH(interest2)+2),
interest3 = SUBSTRING_INDEX(interests, ',', 1),
interests = SUBSTR(interests, LENGTH(interest3)+2),
interest4 = interests;
