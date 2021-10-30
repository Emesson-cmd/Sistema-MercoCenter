-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 21-Out-2021 às 21:06
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
  `rg` int(11) DEFAULT NULL,
  `sexo` varchar(9) DEFAULT NULL,
  `telefone` varchar(50) DEFAULT NULL,
  `uf` varchar(3) DEFAULT NULL,
  `bairro` varchar(100) DEFAULT NULL,
  `cidade` varchar(100) DEFAULT NULL,
  `cep` varchar(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`cod`, `celular`, `cpf`, `datanasc`, `email`, `endereco`, `nome`, `datacad`, `horacad`, `nume`, `rg`, `sexo`, `telefone`, `uf`, `bairro`, `cidade`, `cep`) VALUES
(1, '35320996', '20160345678', '2000-02-12', 'salan123@gmail.com', 'Rua josé bernardino', 'Alan nacimento Torres', '2021-08-02', '21:06:00', '352', 2016011230, 'M', '98978904', 'CE', 'ciro', 'Barbalha', '63180000'),
(2, '35320996', '20160345678', '2000-02-12', 'sala23@gmail.com', 'Rua josé bernardino', 'jonas nacimento melo', '2021-08-02', '21:06:00', '352', 2016011230, 'M', '98978904', 'CE', 'ciro', 'Barbalha', '63180000'),
(3, '35320996', '20160345678', '2000-02-12', 'salan123@gmail.com', 'Rua josé bernardino', 'Emanuel nacimento Torres', '2021-08-02', '21:06:00', '352', 2016011230, 'M', '98978904', 'CE', 'ciro', 'Barbalha', '63180000');

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
  MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
