USE headfirst_sql;

SELECT my_contacts.id, my_contacts.first_name, my_contacts.last_name, seekings.seeking
FROM my_contacts
JOIN seeking_contact ON my_contacts.id = seeking_contact.id_contact
JOIN seekings ON seekings.id_seeking = seeking_contact.id_seeking

ORDER BY my_contacts.id;
