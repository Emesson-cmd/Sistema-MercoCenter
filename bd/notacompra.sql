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
-- Estrutura da tabela `notacompra`
--

CREATE TABLE `notacompra` (
  `cod_nota` int(20) NOT NULL,
  `num_nota` int(20) NOT NULL,
  `data` date DEFAULT NULL,
  `valor_total_nota` decimal(10,2) DEFAULT NULL,
  `desconto` decimal(10,2) DEFAULT NULL,
  `funcionario_cod_funcionario` int(20) NOT NULL,
  `nome_fornecedor` varchar(50) NOT NULL,
  `vencimento` date DEFAULT NULL,
  `datacad` date DEFAULT NULL,
  `horacad` time DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `notacompra`
--

INSERT INTO `notacompra` (`cod_nota`, `num_nota`, `data`, `valor_total_nota`, `desconto`, `funcionario_cod_funcionario`, `nome_fornecedor`, `vencimento`, `datacad`, `horacad`) VALUES
(2531, 1, '2021-10-02', '25.50', '21.00', 1, 'jm alimentos', '2022-01-01', '2021-01-01', '21:05:00');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `notacompra`
--
ALTER TABLE `notacompra`
  ADD PRIMARY KEY (`cod_nota`),
  ADD KEY `funcionario_cod_funcionario` (`funcionario_cod_funcionario`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `notacompra`
--
ALTER TABLE `notacompra`
  MODIFY `cod_nota` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2532;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
