USE greglist;

-- você pode usar NOT em uma série de situações, como NOT BETWEEN ou NOT LIKE

SELECT NAME, MAIN, AMOUNT1 FROM EASY_DRINKS WHERE MAIN NOT IN('SODA', 'NÉCTAR DE PÊSSEGO');
