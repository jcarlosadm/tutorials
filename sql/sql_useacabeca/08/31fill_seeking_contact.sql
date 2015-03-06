USE headfirst_sql;

INSERT seeking_contact (id_contact, id_seeking)
SELECT my_contacts.id, seekings.id_seeking FROM my_contacts
INNER JOIN seekings
ON my_contacts.seeking1 = seekings.seeking;

INSERT seeking_contact (id_contact, id_seeking)
SELECT my_contacts.id, seekings.id_seeking FROM my_contacts
INNER JOIN seekings
ON my_contacts.seeking2 = seekings.seeking;
