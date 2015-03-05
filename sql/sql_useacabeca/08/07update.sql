USE headfirst_sql;

UPDATE my_contacts JOIN professions
    ON my_contacts.profession = professions.profession
SET my_contacts.profession_id = professions.id;
