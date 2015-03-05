USE headfirst_sql;

CREATE TABLE IF NOT EXISTS interests
(
    id_interest INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    interest VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS interest_contact
(
    id_interest INT NOT NULL,
    id_contact INT NOT NULL,
    PRIMARY KEY (id_contact, id_interest),
    CONSTRAINT interests_id_interest_fk
    FOREIGN KEY (id_interest)
    REFERENCES interests (id_interest),
    CONSTRAINT my_contacts_id_fk
    FOREIGN KEY (id_contact)
    REFERENCES my_contacts (id)
);

CREATE TABLE IF NOT EXISTS seekings
(
    id_seeking INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    seeking VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS seeking_contact
(
    id_seeking INT NOT NULL,
    id_contact INT NOT NULL,
    PRIMARY KEY (id_seeking, id_contact),
    CONSTRAINT seekings_id_seeking_fk
    FOREIGN KEY (id_seeking)
    REFERENCES seekings (id_seeking),
    CONSTRAINT my_contacts_id_fk_2
    FOREIGN KEY (id_contact)
    REFERENCES my_contacts (id)
);
