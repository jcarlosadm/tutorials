USE headfirst_sql;

CREATE TABLE IF NOT EXISTS status_table
(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    status VARCHAR(20)
)AS
    SELECT status FROM my_contacts
    WHERE status IS NOT NULL
    GROUP BY status
    ORDER BY status;
    
ALTER TABLE my_contacts
ADD COLUMN status_id INT;

UPDATE my_contacts JOIN status_table
    ON my_contacts.status = status_table.status
SET my_contacts.status_id = status_table.id;

ALTER TABLE my_contacts
ADD CONSTRAINT status_table_id_fk
    FOREIGN KEY (status_id)
    REFERENCES status_table (id);
