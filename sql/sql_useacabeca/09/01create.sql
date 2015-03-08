USE headfirst_sql;

CREATE TABLE IF NOT EXISTS current_job
(
    contact_id INT NOT NULL PRIMARY KEY,
    job VARCHAR(30),
    payment DOUBLE(10,3),
    date_begin DATE
);

CREATE TABLE IF NOT EXISTS desire_job
(
    contact_id INT NOT NULL PRIMARY KEY,
    job VARCHAR(30),
    payment_min DOUBLE(10, 3),
    payment_max DOUBLE(10, 3),
    availability TEXT,
    xp_years INT
);

CREATE TABLE IF NOT EXISTS list_jobs
(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    job VARCHAR(30),
    payment DOUBLE(10, 3),
    id_location INT,
    description VARCHAR(30)
);
