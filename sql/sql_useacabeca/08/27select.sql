USE headfirst_sql;

SELECT my_contacts.first_name, my_contacts.last_name, interests.interest
FROM my_contacts
JOIN interest_contact ON my_contacts.id = interest_contact.id_contact
JOIN interests ON interests.id_interest = interest_contact.id_interest

ORDER BY my_contacts.first_name;
