-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 21-Out-2021 às 21:07
-- Versão do servidor: 10.4.18-MariaDB
-- versão do PHP: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `bancomercado`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `notavenda`
--

CREATE TABLE `notavenda` (
  `cod_venda` int(20) NOT NULL,
  `valor` decimal(10,2) DEFAULT NULL,
  `data` date DEFAULT NULL,
  `valor_total` decimal(10,2) DEFAULT NULL,
  `datacad` date DEFAULT NULL,
  `horacad` time DEFAULT NULL,
  `quantidade` int(11) DEFAULT NULL,
  `funcionaio_cod_funcionario` int(20) NOT NULL,
  `cliente_cod_cliente` int(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `notavenda`
--

INSERT INTO `notavenda` (`cod_venda`, `valor`, `data`, `valor_total`, `datacad`, `horacad`, `quantidade`, `funcionaio_cod_funcionario`, `cliente_cod_cliente`) VALUES
(759168730, '30.00', '2021-10-21', '30.00', '2021-10-21', '13:10:21', 2, 1, 0),
(33520240, '345.00', '2021-10-21', '345.00', '2021-10-21', '12:52:40', 23, 1, 0),
(85825808, '15.00', '2021-10-21', '15.00', '2021-10-21', '12:45:39', 1, 1, 0),
(197245732, '15.00', '2021-10-21', '15.00', '2021-10-21', '12:38:20', 1, 1, 0),
(129619833, '15.00', '2021-10-21', '15.00', '2021-10-21', '12:28:26', 1, 1, 0),
(175853665, '15.00', '2021-10-21', '15.00', '2021-10-21', '12:26:21', 1, 1, 0);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `notavenda`
--
ALTER TABLE `notavenda`
  ADD PRIMARY KEY (`cod_venda`),
  ADD KEY `funcionaio_cod_funcionario` (`funcionaio_cod_funcionario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
