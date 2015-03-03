USE headfirst_sql;
-- use % para indicar que existe texto antes e/ou depois de uma palavra (isso indica que uma palavra pode estar no começo, no final ou no começo)
-- use _ para indicar um caractere qualquer

SELECT NAME, MAIN, INSTRUCTIONS FROM EASY_DRINKS WHERE INSTRUCTIONS LIKE '%coquetel%';
