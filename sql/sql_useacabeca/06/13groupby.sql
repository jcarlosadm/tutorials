USE headfirst_sql;

SELECT first_name, AVG(sales),MAX(sales),MIN(sales),COUNT(sale_date) FROM cookie_sales GROUP BY first_name;
