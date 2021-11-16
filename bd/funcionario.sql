-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 15-Nov-2021 às 01:57
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
-- Estrutura da tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `cod` int(11) NOT NULL,
  `celular` varchar(50) DEFAULT NULL,
  `cpf` varchar(50) DEFAULT NULL,
  `datanasc` date DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `endereco` varchar(50) DEFAULT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `datacad` date DEFAULT NULL,
  `horacad` time DEFAULT NULL,
  `nume` varchar(20) DEFAULT NULL,
  `rg` varchar(15) DEFAULT NULL,
  `sexo` varchar(9) DEFAULT NULL,
  `telefone` varchar(50) DEFAULT NULL,
  `uf` varchar(3) DEFAULT NULL,
  `bairro` varchar(100) DEFAULT NULL,
  `cidade` varchar(100) DEFAULT NULL,
  `cep` varchar(11) DEFAULT NULL,
  `cargo` varchar(20) DEFAULT NULL,
  `situacao` varchar(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`cod`, `celular`, `cpf`, `datanasc`, `email`, `endereco`, `nome`, `datacad`, `horacad`, `nume`, `rg`, `sexo`, `telefone`, `uf`, `bairro`, `cidade`, `cep`, `cargo`, `situacao`) VALUES
(8, '(88)99999-9999', '028.030.678-09', '2000-10-01', 'alassss@gmail.com', 'sdhsgdhsgdjhsd', 'Emanuel da Lima', '2021-10-01', '20:21:00', '234', '7878787878-7', 'feminino', '(88)88888-8888', 'SP', 'sfasgfhsg', 'alameda', '68189-000', 'almoxarife', 'inativo'),
(9, '(88)99999-9999', '028.030.678-09', '2000-10-01', 'alassss@gmail.com', 'sdhsgdhsgdjhsd', 'Emanuel da Lima', '2021-11-14', '21:50:50', '234', '7878787878-7', NULL, '(88)88888-8888', 'SP', 'sfasgfhsg', 'alameda', '68189-000', 'almoxarife', 'inativo');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`cod`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
