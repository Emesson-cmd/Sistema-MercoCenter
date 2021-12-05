-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 21-Nov-2021 às 23:21
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
-- Estrutura da tabela `produto`
--

CREATE TABLE `produto` (
  `cod_produto` int(11) NOT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `descricao` varchar(50) DEFAULT NULL,
  `valor_compra` decimal(10,2) DEFAULT NULL,
  `valor_venda` decimal(10,2) DEFAULT NULL,
  `quantidade` int(11) DEFAULT NULL,
  `tipo` varchar(50) DEFAULT NULL,
  `datacad` date DEFAULT NULL,
  `horacad` time DEFAULT NULL,
  `quantidade_minima` int(11) DEFAULT NULL,
  `datavalidade` date DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `produto`
--

INSERT INTO `produto` (`cod_produto`, `nome`, `descricao`, `valor_compra`, `valor_venda`, `quantidade`, `tipo`, `datacad`, `horacad`, `quantidade_minima`, `datavalidade`) VALUES
(2, 'Manga', 'descrição', '8.40', '20.00', 20, 'perecivel', '2021-11-21', '19:16:51', 20, '2021-12-12'),
(54, 'caja', 'descrição', '9.00', '10.90', 19, 'perecivel', '2021-11-21', '19:16:37', 5, '2021-11-05'),
(3, 'Cajú', 'produto da marca santa clara', '10.40', '12.00', 20, 'perecivel', '2021-11-21', '19:16:32', 10, '2021-12-01'),
(4, 'lazanha', 'descrição', '8.40', '10.90', 10, 'perecivel', '2021-11-21', '19:16:46', 5, '2021-12-12'),
(6, 'chocolate', 'descrição', '9.00', '10.90', 20, 'perecivel', '2021-11-21', '19:16:10', 5, '2021-11-05'),
(7, 'castanha', 'descrição', '8.40', '10.90', 10, 'perecivel', '2021-11-04', '14:38:10', 5, '2021-12-12'),
(9, 'lata', 'descrição', '8.40', '10.90', 30, 'perecivel', '2021-11-21', '19:16:27', 5, '2021-12-12'),
(56, 'suco', 'descrição', '8.40', '20.00', 20, 'perecivel', '2021-11-21', '19:17:08', 20, '2021-12-12'),
(55, 'suco', 'descrição', '8.40', '20.00', 20, 'perecivel', '2021-11-21', '19:17:05', 20, '2021-12-12'),
(51, 'laranja', 'descrição', '9.00', '10.90', 15, 'perecivel', '2021-11-21', '19:16:20', 5, '2021-11-05');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`cod_produto`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `produto`
--
ALTER TABLE `produto`
  MODIFY `cod_produto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=57;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
