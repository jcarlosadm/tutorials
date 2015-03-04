-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: 04-Mar-2015 às 20:14
-- Versão do servidor: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `headfirst_sql`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `clown_info`
--

CREATE TABLE IF NOT EXISTS `clown_info` (
  `name` varchar(50) DEFAULT NULL,
  `last_seen` varchar(50) DEFAULT NULL,
  `appearance` varchar(50) DEFAULT NULL,
  `activities` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `clown_info`
--

INSERT INTO `clown_info` (`name`, `last_seen`, `appearance`, `activities`) VALUES
('Elsie', 'Cherry Hill Senior Center', 'F, red hair, green dress, huge feet', 'balloons'),
('Pickles', 'Jack Green''s party', 'M, orange hair, blue suit, huge feet', 'mime'),
('Snuggles', 'Ball Mart', 'F, yellow shirt, baggy red pants', 'horn, umbrella'),
('Mr. Hobo', 'Party for Eric Gray', 'M, cigar, black hair, tiny hat', 'violin'),
('Scooter', 'Oakland Hospital', 'M, blue hair, red suit, huge nose', 'balloons'),
('Zippo', 'Millstone Mall', 'F, orange suit, baggy pants', 'dancing'),
('Babe', 'Earl''s Autos', 'F, all pink and sparkly', 'balancing, little car'),
('Bonzo', '', 'M, in drag, polka dotted dress', 'singing, dancing'),
('Sniffles', 'Tracy''s', 'M, green and purple suit, pointy nose', ''),
('Clarabelle', 'Centro da terceira idade Belmont', 'F, cabelo rosa, flores gigantes, vestido azul', 'dançar');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cookie_sales`
--

CREATE TABLE IF NOT EXISTS `cookie_sales` (
`ID` int(11) NOT NULL,
  `first_name` varchar(20) NOT NULL,
  `sales` decimal(4,2) NOT NULL,
  `sale_date` date NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cookie_sales`
--

INSERT INTO `cookie_sales` (`ID`, `first_name`, `sales`, `sale_date`) VALUES
(1, 'Lindsey', '32.02', '2007-03-12'),
(2, 'Nicole', '26.53', '2007-03-12'),
(3, 'Britney', '11.25', '2007-03-12'),
(4, 'Ashley', '18.96', '2007-03-12'),
(5, 'Lindsey', '9.16', '2007-03-11'),
(6, 'Nicole', '1.52', '2007-03-11'),
(7, 'Britney', '43.21', '2007-03-11'),
(8, 'Ashley', '8.05', '2007-03-11'),
(9, 'Lindsey', '17.62', '2007-03-10'),
(10, 'Nicole', '24.19', '2007-03-10'),
(11, 'Britney', '3.40', '2007-03-10'),
(12, 'Ashley', '15.21', '2007-03-10'),
(13, 'Lindsey', '0.00', '2007-03-09'),
(14, 'Nicole', '31.99', '2007-03-09'),
(15, 'Britney', '2.58', '2007-03-09'),
(16, 'Ashley', '0.00', '2007-03-09'),
(17, 'Lindsey', '2.34', '2007-03-08'),
(18, 'Nicole', '13.44', '2007-03-08'),
(19, 'Britney', '8.78', '2007-03-08'),
(20, 'Ashley', '26.82', '2007-03-08'),
(21, 'Lindsey', '3.71', '2007-03-07'),
(22, 'Nicole', '0.56', '2007-03-07'),
(23, 'Britney', '34.19', '2007-03-07'),
(24, 'Ashley', '7.77', '2007-03-07'),
(25, 'Lindsey', '16.23', '2007-03-06'),
(26, 'Nicole', '0.00', '2007-03-06'),
(27, 'Britney', '4.50', '2007-03-06'),
(28, 'Ashley', '19.22', '2007-03-06');

-- --------------------------------------------------------

--
-- Estrutura da tabela `EASY_DRINKS`
--

CREATE TABLE IF NOT EXISTS `EASY_DRINKS` (
  `NAME` varchar(30) NOT NULL,
  `MAIN` varchar(30) NOT NULL,
  `AMOUNT1` float(10,5) NOT NULL,
  `SECOND` varchar(30) NOT NULL,
  `AMOUNT2` float(10,5) NOT NULL,
  `INSTRUCTIONS` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `EASY_DRINKS`
--

INSERT INTO `EASY_DRINKS` (`NAME`, `MAIN`, `AMOUNT1`, `SECOND`, `AMOUNT2`, `INSTRUCTIONS`) VALUES
('Blacktorn', 'água tônica', 1.50000, 'suco de abacaxi', 1.00000, 'mexa com gelo, coloque em uma taça de coquetel com limão batido'),
('Blue moon', 'soda', 1.50000, 'suco de mirtilo', 0.75000, 'mexa com gelo, coloque em uma taça de coquetel com limão batido'),
('Oh my gosh', 'néctar de pêssego', 1.00000, 'suco de abacaxi', 1.00000, 'mexa com gelo, coloque em um copinho de licor'),
('Lime Fizz', 'sprite', 1.50000, 'suco de limão', 0.75000, 'mexa com gelo e coloque em uma taça de coquetel'),
('Kiss on the Lips', 'suco de cereja', 2.00000, 'néctar de damasco', 7.00000, 'sirva com gelo e canudo'),
('Hot gold', 'néctar de pêssego', 3.00000, 'suco de laranja', 6.00000, 'coloque suco de laranja quente em uma caneca e adicione néctar de pêssego'),
('Lone Tree', 'soda', 1.50000, 'suco de cereja', 0.75000, 'mexa com gelo, coloque em uma taça de coquetel'),
('Greyhound', 'soda', 1.50000, 'suco de toranja', 5.00000, 'sirva com gelo, mexa bem'),
('Indian Summer', 'suco de maçã', 2.00000, 'chá quente', 6.00000, 'adicionar o suco em uma caneca e completar o resto com chá quente'),
('Bull Frog', 'chá gelado', 1.50000, 'limonada', 5.00000, 'sirva com gelo e fatia de limão'),
('Soda and it', 'soda', 2.00000, 'suco de uva', 1.00000, 'misture em uma taça de coquetel');

-- --------------------------------------------------------

--
-- Estrutura da tabela `meus_contatos`
--

CREATE TABLE IF NOT EXISTS `meus_contatos` (
`id_contato` int(11) NOT NULL,
  `SOBRENOME` varchar(30) NOT NULL DEFAULT 'nobody',
  `PRIMEIRO_NOME` varchar(20) NOT NULL DEFAULT 'nobody',
  `EMAIL` varchar(50) DEFAULT NULL,
  `SEXO` char(1) DEFAULT NULL,
  `ANIVERSARIO` date DEFAULT NULL,
  `PROFISSAO` varchar(50) DEFAULT NULL,
  `ESTADO_CIVIL` varchar(20) DEFAULT NULL,
  `INTERESSES` varchar(100) DEFAULT NULL,
  `PROCURA` varchar(100) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `meus_contatos`
--

INSERT INTO `meus_contatos` (`id_contato`, `SOBRENOME`, `PRIMEIRO_NOME`, `EMAIL`, `SEXO`, `ANIVERSARIO`, `PROFISSAO`, `ESTADO_CIVIL`, `INTERESSES`, `PROCURA`) VALUES
(1, 'Anderson', 'Jillian', 'Jill_anderson@breakneckpizza.com', 'F', '1980-09-05', 'Escritora Técnica', 'Solteiro', 'Caiaque, répteis', 'Relacionamentos, amigos'),
(2, 'nobody', 'Pat', 'patpost@breakneckpizza.com', NULL, NULL, 'Carteiro(a)', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tabela_filme`
--

CREATE TABLE IF NOT EXISTS `tabela_filme` (
`id_filme` int(11) NOT NULL,
  `titulo` varchar(30) NOT NULL,
  `censura` varchar(3) NOT NULL,
  `data_compra` date NOT NULL,
  `categoria` varchar(30) DEFAULT 'diversos'
) ENGINE=InnoDB AUTO_INCREMENT=94 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tabela_filme`
--

INSERT INTO `tabela_filme` (`id_filme`, `titulo`, `censura`, `data_compra`, `categoria`) VALUES
(1, 'Monster, Inc.', '0', '1993-12-10', 'comédia'),
(2, 'The Godfather', '18', '1993-12-03', 'ação'),
(3, 'Gone with the Wind', '0', '1993-12-03', 'drama'),
(4, 'American Pie', '18', '1993-12-04', 'comédia'),
(5, 'Nitghtmare on Elm Street', '18', '1992-12-05', 'ação'),
(6, 'Casablanca', '13', '1993-12-04', 'drama'),
(84, 'Greg: The Untold Story', '13', '2001-02-05', 'ação'),
(85, 'Mad Clowns', '18', '1999-11-20', 'terror'),
(86, 'Paraskavedekatriaphobia', '18', '2003-04-19', 'ação'),
(87, 'Rat named Darcy, A', '0', '2003-04-19', 'famíla'),
(88, 'End od the Line', '18', '2001-02-05', 'diversos'),
(89, 'Shiny Things, The', '13', '2002-03-06', 'drama'),
(90, 'Take it Back', '18', '2001-02-05', 'comédia'),
(91, 'Shark Bait', '0', '1999-11-20', 'diversos'),
(92, 'Angry Pirate', '13', '2003-04-19', 'diversos'),
(93, 'Potentially Habitable Planet', '13', '2001-02-05', 'ficção');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cookie_sales`
--
ALTER TABLE `cookie_sales`
 ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `meus_contatos`
--
ALTER TABLE `meus_contatos`
 ADD PRIMARY KEY (`id_contato`);

--
-- Indexes for table `tabela_filme`
--
ALTER TABLE `tabela_filme`
 ADD PRIMARY KEY (`id_filme`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cookie_sales`
--
ALTER TABLE `cookie_sales`
MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=29;
--
-- AUTO_INCREMENT for table `meus_contatos`
--
ALTER TABLE `meus_contatos`
MODIFY `id_contato` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `tabela_filme`
--
ALTER TABLE `tabela_filme`
MODIFY `id_filme` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=94;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
