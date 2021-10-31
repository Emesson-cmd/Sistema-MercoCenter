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
-- Estrutura da tabela `itemcompra`
--

CREATE TABLE `itemcompra` (
  `cod_item_compra` int(20) NOT NULL,
  `nota_compra_cod_venda` int(20) NOT NULL,
  `valor_total` decimal(10,2) DEFAULT NULL,
  `quantidade` int(11) DEFAULT NULL,
  `valor` decimal(10,2) DEFAULT NULL,
  `produto_cod_produto` int(20) NOT NULL,
  `datacad` date DEFAULT NULL,
  `horacad` time DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `itemcompra`
--
ALTER TABLE `itemcompra`
  ADD PRIMARY KEY (`cod_item_compra`),
  ADD KEY `nota_compra_cod_venda` (`nota_compra_cod_venda`),
  ADD KEY `produto_cod_produto` (`produto_cod_produto`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
