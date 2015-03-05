USE headfirst_sql;

ALTER TABLE my_contacts
ADD CONSTRAINT professions_id_fk
    FOREIGN KEY (profession_id)
    REFERENCES professions (id);
