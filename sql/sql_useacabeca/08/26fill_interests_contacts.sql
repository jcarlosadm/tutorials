USE headfirst_sql;

INSERT interest_contact (id_contact, id_interest)
SELECT my_contacts.id, interests.id_interest FROM my_contacts
INNER JOIN interests
ON my_contacts.interest1 = interests.interest;

INSERT interest_contact (id_contact, id_interest)
SELECT my_contacts.id, interests.id_interest FROM my_contacts
INNER JOIN interests
ON my_contacts.interest2 = interests.interest;

INSERT interest_contact (id_contact, id_interest)
SELECT my_contacts.id, interests.id_interest FROM my_contacts
INNER JOIN interests
ON my_contacts.interest3 = interests.interest;

INSERT interest_contact (id_contact, id_interest)
SELECT my_contacts.id, interests.id_interest FROM my_contacts
INNER JOIN interests
ON my_contacts.interest4 = interests.interest;
