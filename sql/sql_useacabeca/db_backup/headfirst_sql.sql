-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: 05-Mar-2015 às 01:27
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
-- Estrutura da tabela `interests`
--

CREATE TABLE IF NOT EXISTS `interests` (
`id_interest` int(11) NOT NULL,
  `interest` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `interest_contact`
--

CREATE TABLE IF NOT EXISTS `interest_contact` (
  `id_interest` int(11) NOT NULL,
  `id_contact` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `my_contacts`
--

CREATE TABLE IF NOT EXISTS `my_contacts` (
`id` int(11) NOT NULL,
  `last_name` varchar(30) DEFAULT NULL,
  `first_name` varchar(20) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `gender` char(1) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `profession` varchar(50) DEFAULT NULL,
  `location` varchar(50) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  `interests` varchar(100) DEFAULT NULL,
  `seeking` varchar(100) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `my_contacts`
--

INSERT INTO `my_contacts` (`id`, `last_name`, `first_name`, `email`, `gender`, `birthday`, `profession`, `location`, `status`, `interests`, `seeking`) VALUES
(1, 'Anderson', 'Jillian', 'jill_anderson@ \nbreakneckpizza.com', 'F', '1980-09-05', 'Technical Writer', 'Palo Alto, CA', 'single', 'kayaking, reptiles', 'relationship, friends'),
(2, 'Kenton', 'Leo', 'lkenton@starbuzzcoffee.com', 'M', '1974-01-10', 'Manager', 'San Francisco, CA', 'divorced', 'women', 'women to date'),
(3, 'McGavin', 'Darrin', ' captainlove@headfirsttheater.com', 'M', '1966-01-23', 'Cruise Ship Captain', 'San Diego, CA', 'single', 'sailing, fishing, yachting', 'women for casual relationships'),
(4, 'Franklin', 'Joe', 'joe_franklin@leapinlimos.com', 'M', '1977-04-28', 'Software Sales', 'Dallas, TX', 'married', 'fishing, drinking', 'new job'),
(5, 'Hamilton', 'Jamie', 'dontbother@starbuzzcoffee.com', 'F', '1964-09-10', 'System Administrator', 'Princeton, NJ', 'married', 'RPG', 'nothing'),
(6, 'Chevrolet', 'Maurice', 'bookman4u@objectville.net', 'M', '1962-07-01', 'Bookshop Owner', 'Mountain View, CA', 'married', 'collecting books, scuba diving', 'friends'),
(7, 'Kroger', 'Renee', 'poorrenee@mightygumball.net', 'F', '1976-12-03', 'Unemployed', 'San Francisco, CA', 'divorced', 'cooking', 'employment'),
(8, 'Mendoza', 'Angelina', 'angelina@starbuzzcoffee.com', 'F', '1979-08-19', 'UNIX Sysadmin', 'San Francisco, CA', 'married', 'acting, dancing', 'new job'),
(9, 'Murphy', 'Donald', 'padraic@tikibeanlounge.com', 'M', '1967-01-23', 'Computer Programmer', 'New York City, NY', 'committed relationsh', 'RPG, anime', 'friends'),
(10, 'Spatner', 'John', 'jpoet@objectville.net', 'M', '1963-04-18', 'Salesman', 'Woodstock, NY', 'married', 'poetry, screenwriting', 'nothing'),
(11, 'Toth', 'Anne', 'Anne_Toth@leapinlimos.com', 'F', '1969-11-18', 'Artist', 'San Fran, CA', NULL, NULL, NULL),
(12, 'Manson', 'Anne', 'am86@objectville.net', 'F', '1977-08-09', 'Baker', 'Seattle, WA', NULL, NULL, NULL),
(13, 'Hardy', 'Anne', 'anneh@b0tt0msup.com', 'F', '1963-04-18', 'Teacher', 'San Fran, CA', NULL, NULL, NULL),
(14, 'Parker', 'Anne', 'annep@starbuzzcoffee.com', 'F', '1983-01-10', 'Student', 'San Fran, CA', NULL, NULL, NULL),
(15, 'Blunt', 'Anne', 'anneblunt@breakneckpizza.com', 'F', '1959-10-09', 'Web Designer', 'San Fran, CA', NULL, NULL, NULL),
(16, 'Jacobs', 'Anne', 'anne99@objectville.net', 'F', '1968-02-05', 'Computer Programmer', 'San Jose, CA', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `seekings`
--

CREATE TABLE IF NOT EXISTS `seekings` (
`id_seeking` int(11) NOT NULL,
  `seeking` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `seeking_contact`
--

CREATE TABLE IF NOT EXISTS `seeking_contact` (
  `id_seeking` int(11) NOT NULL,
  `id_contact` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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
-- Indexes for table `interests`
--
ALTER TABLE `interests`
 ADD PRIMARY KEY (`id_interest`);

--
-- Indexes for table `interest_contact`
--
ALTER TABLE `interest_contact`
 ADD PRIMARY KEY (`id_contact`,`id_interest`), ADD KEY `interests_id_interest_fk` (`id_interest`);

--
-- Indexes for table `my_contacts`
--
ALTER TABLE `my_contacts`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `seekings`
--
ALTER TABLE `seekings`
 ADD PRIMARY KEY (`id_seeking`);

--
-- Indexes for table `seeking_contact`
--
ALTER TABLE `seeking_contact`
 ADD PRIMARY KEY (`id_seeking`,`id_contact`), ADD KEY `my_contacts_id_fk_2` (`id_contact`);

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
-- AUTO_INCREMENT for table `interests`
--
ALTER TABLE `interests`
MODIFY `id_interest` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `my_contacts`
--
ALTER TABLE `my_contacts`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=17;
--
-- AUTO_INCREMENT for table `seekings`
--
ALTER TABLE `seekings`
MODIFY `id_seeking` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tabela_filme`
--
ALTER TABLE `tabela_filme`
MODIFY `id_filme` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=94;
--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `interest_contact`
--
ALTER TABLE `interest_contact`
ADD CONSTRAINT `interests_id_interest_fk` FOREIGN KEY (`id_interest`) REFERENCES `interests` (`id_interest`),
ADD CONSTRAINT `my_contacts_id_fk` FOREIGN KEY (`id_contact`) REFERENCES `my_contacts` (`id`);

--
-- Limitadores para a tabela `seeking_contact`
--
ALTER TABLE `seeking_contact`
ADD CONSTRAINT `my_contacts_id_fk_2` FOREIGN KEY (`id_contact`) REFERENCES `my_contacts` (`id`),
ADD CONSTRAINT `seekings_id_seeking_fk` FOREIGN KEY (`id_seeking`) REFERENCES `seekings` (`id_seeking`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
