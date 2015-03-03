USE greglist;

CREATE TABLE IF NOT EXISTS EASY_DRINKS
(
    NAME VARCHAR(30) NOT NULL,
    MAIN VARCHAR(30) NOT NULL,
    AMOUNT1 FLOAT(10,5) NOT NULL,
    SECOND VARCHAR(30) NOT NULL,
    AMOUNT2 FLOAT(10,5) NOT NULL,
    INSTRUCTIONS TEXT
);

INSERT INTO EASY_DRINKS
VALUES
('Blacktorn', 'água tônica', 1.5, 'suco de abacaxi', 1, 'mexa com gelo, coloque em uma taça de coquetel com limão batido'),
('Blue moon', 'soda', 1.5, 'suco de mirtilo', 0.75, 'mexa com gelo, coloque em uma taça de coquetel com limão batido'),
('Oh my gosh', 'néctar de pêssego', 1, 'suco de abacaxi', 1, 'mexa com gelo, coloque em um copinho de licor'),
('Lime Fizz', 'sprite', 1.5, 'suco de limão', 0.75, 'mexa com gelo e coloque em uma taça de coquetel'),
('Kiss on the Lips', 'suco de cereja', 2, 'néctar de damasco', 7, 'sirva com gelo e canudo'),
('Hot gold', 'néctar de pêssego', 3, 'suco de laranja', 6, 'coloque suco de laranja quente em uma caneca e adicione néctar de pêssego'),
('Lone Tree', 'soda', 1.5, 'suco de cereja', 0.75, 'mexa com gelo, coloque em uma taça de coquetel'),
('Greyhound', 'soda', 1.5,'suco de toranja', 5, 'sirva com gelo, mexa bem'),
('Indian Summer', 'suco de maçã', 2, 'chá quente', 6, 'adicionar o suco em uma caneca e completar o resto com chá quente'),
('Bull Frog', 'chá gelado', 1.5, 'limonada', 5, 'sirva com gelo e fatia de limão'),
('Soda and it', 'soda', 2, 'suco de uva', 1, 'misture em uma taça de coquetel');
