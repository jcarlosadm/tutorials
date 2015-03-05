USE headfirst_sql;

CREATE TABLE IF NOT EXISTS professions
(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    profession VARCHAR(20)
)AS
    SELECT profession AS mc_prof FROM my_contacts -- você não precisa usar AS
    GROUP BY mc_prof
    ORDER BY mc_prof;
