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
-- Estrutura da tabela `itemvenda`
--

CREATE TABLE `itemvenda` (
  `cod_item_venda` int(20) NOT NULL,
  `notavenda_cod_venda` int(20) NOT NULL,
  `valor` decimal(10,2) DEFAULT NULL,
  `datacad` date DEFAULT NULL,
  `horacad` time DEFAULT NULL,
  `quantidade` int(11) DEFAULT NULL,
  `valor_total` decimal(10,2) DEFAULT NULL,
  `produto_cod_produto` int(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `itemvenda`
--

INSERT INTO `itemvenda` (`cod_item_venda`, `notavenda_cod_venda`, `valor`, `datacad`, `horacad`, `quantidade`, `valor_total`, `produto_cod_produto`) VALUES
(30956, 0, '15.00', '2021-10-21', '12:26:05', 1, '15.00', 2),
(30957, 0, '15.00', '2021-10-21', '12:26:21', 1, '15.00', 2),
(30958, 0, '15.00', '2021-10-21', '12:28:26', 1, '15.00', 2),
(30959, 197245732, '15.00', '2021-10-21', '12:38:20', 1, '15.00', 1),
(30960, 85825808, '15.00', '2021-10-21', '12:45:39', 1, '15.00', 2),
(30961, 33520240, '15.00', '2021-10-21', '12:52:40', 23, '345.00', 2),
(30962, 759168730, '15.00', '2021-10-21', '13:10:21', 2, '30.00', 1);

--
-- Acionadores `itemvenda`
--
DELIMITER $$
CREATE TRIGGER `itemvenda_AFTER_INSERT` AFTER INSERT ON `itemvenda` FOR EACH ROW BEGIN
update produto INNER JOIN itemvenda 
on produto.cod_produto = itemvenda.produto_cod_produto 
set produto.quantidade = -itemvenda.quantidade 
where produto.cod_produto = itemvenda.produto_cod_produto ;
END
$$
DELIMITER ;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `itemvenda`
--
ALTER TABLE `itemvenda`
  ADD PRIMARY KEY (`cod_item_venda`),
  ADD KEY `notavenda_cod_venda` (`notavenda_cod_venda`),
  ADD KEY `produto_cod_produto` (`produto_cod_produto`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `itemvenda`
--
ALTER TABLE `itemvenda`
  MODIFY `cod_item_venda` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30963;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
