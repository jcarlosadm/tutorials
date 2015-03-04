USE headfirst_sql;

SELECT first_name,COUNT(DISTINCT sale_date) FROM cookie_sales WHERE sales <> 0 GROUP BY first_name ORDER BY COUNT(DISTINCT sale_date) DESC;
