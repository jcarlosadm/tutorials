-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: 03-Mar-2015 às 23:20
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
-- Estrutura da tabela `MEUS_CONTATOS`
--

CREATE TABLE IF NOT EXISTS `MEUS_CONTATOS` (
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
-- Extraindo dados da tabela `MEUS_CONTATOS`
--

INSERT INTO `MEUS_CONTATOS` (`id_contato`, `SOBRENOME`, `PRIMEIRO_NOME`, `EMAIL`, `SEXO`, `ANIVERSARIO`, `PROFISSAO`, `ESTADO_CIVIL`, `INTERESSES`, `PROCURA`) VALUES
(1, 'Anderson', 'Jillian', 'Jill_anderson@breakneckpizza.com', 'F', '0000-00-00', 'Escritora Técnica', 'Solteiro', 'Caiaque, répteis', 'Relacionamentos, amigos'),
(2, 'nobody', 'Pat', 'patpost@breakneckpizza.com', NULL, NULL, 'Carteiro(a)', NULL, NULL, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `MEUS_CONTATOS`
--
ALTER TABLE `MEUS_CONTATOS`
 ADD PRIMARY KEY (`id_contato`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `MEUS_CONTATOS`
--
ALTER TABLE `MEUS_CONTATOS`
MODIFY `id_contato` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
