-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 05-Dez-2021 às 23:57
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

DELIMITER $$
--
-- Procedimentos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `atualizarestoque` (`quantidade` INT)  update produto INNER JOIN itemvenda 
on produto.cod_produto = itemvenda.produto_cod_produto 
set produto.quantidade = produto.quantidade - quantidade
where produto.cod_produto = itemvenda.produto_cod_produto$$

DELIMITER ;

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
(5, '(88)99999-9999', '028.030.348-05', '2000-10-01', 'Jose21p@gmail.com', 'Rusa salvador divino 4', 'José da Silva', '2021-10-01', '20:21:00', '234', '7878888-8', 'masculino', '(88)88888-8888', 'CE', 'socego', 'Mirandópolis', '68189-000', 'caixa', 'ativo'),
(4, '(88)99999-9999', '028.030.678-09', '2000-10-01', 'alassss@gmail.com', 'Rua dos milagres 356', 'Emanuel da Lima', '2021-11-14', '21:50:50', '234', '7388878-7', 'masculino', '(88)88888-8888', 'CE', 'rota', 'Mirandópolis', '68189-000', 'almoxarife', 'ativo'),
(3, '(88)99999-9342', '028.550.238-09', '2000-10-01', 'Saramu12s@gmail.com', 'rua da rota 452', 'Samuel da Costa', '2021-12-04', '18:22:42', '234', '7146878-9', 'masculino', '(88)87777-8888', 'CE', 'centro', 'Sacomã ', '68189-000', 'almoxarife', 'ativo'),
(2, '(88)99999-9999', '028.030.678-09', '2000-10-01', 'alassss@gmail.com', 'rua domirante 364', 'Alana da Lima', '2021-10-01', '20:21:00', '234', '7878110-7', 'feminino', '(88)88888-8888', 'CE', 'centro', 'Barra do Ceará', '68189-000', 'gerente', 'ativo'),
(1, '(88)95599-9999', '033.030.587-09', '2000-10-01', 'sam@gmail.com', 'rua santo Andre 895', 'Samara da Lima', '2021-11-14', '21:50:50', '234', '7822890-7', 'feminino', '(88)88822-8888', 'CE', 'zona alta', 'Barra do Ceará', '68189-000', 'caixa', 'ativo');

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
(31034, 285364646, '5.08', '2021-12-05', '19:35:57', 1, '5.08', 2),
(31035, 285364646, '6.08', '2021-12-05', '19:35:57', 1, '6.08', 59),
(31036, 285364646, '17.00', '2021-12-05', '19:35:57', 2, '34.00', 61),
(31037, 285364646, '8.00', '2021-12-05', '19:35:57', 20, '160.00', 62),
(31038, 243262155, '28.00', '2021-12-05', '19:52:21', 1, '28.00', 63);

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
(285364646, '205.16', '2021-12-05', '205.16', '2021-12-05', '19:35:57', 24, 0, 0),
(243262155, '28.00', '2021-12-05', '28.00', '2021-12-05', '19:52:21', 1, 0, 0);

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
(2, 'arroz', 'Alimentos armazenado em embalagem de 1kg', '2.00', '5.08', -1, 'Alimentos', '2021-12-05', '19:43:21', 20, '2021-12-12'),
(59, 'feijão', 'Alimentos armazenado em embalagem de 1kg', '4.00', '4.00', 3, 'Alimentos', '2021-12-05', '19:56:11', 20, '2021-12-14'),
(60, 'frango', 'Alimentos armazenado em temperatura baixa', '20.00', '25.00', 30, 'Alimentos congelado', '2021-12-05', '19:32:07', 20, '2021-12-14'),
(61, 'pizza', 'Alimentos armazenado em temperatura baixa', '13.00', '17.00', -2, 'Alimentos congelado', '2021-12-05', '19:43:00', 20, '2021-12-14'),
(62, 'hambúrguer', 'Alimentos armazenado em temperatura baixa', '5.00', '8.00', -20, 'Alimentos congelado', '2021-12-05', '19:43:07', 20, '2021-12-14'),
(63, 'costela', 'Alimentos armazenado em temperatura baixa', '20.00', '28.00', -1, 'Alimentos congelado', '2021-12-05', '19:42:50', 20, '2021-12-14');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `cod_usuario` int(20) NOT NULL,
  `senha` varchar(32) DEFAULT NULL,
  `permissao` varchar(20) DEFAULT NULL,
  `funcionario_cod_funcionario` int(20) DEFAULT NULL,
  `nome` varchar(20) DEFAULT NULL,
  `ativo` int(1) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`cod_usuario`, `senha`, `permissao`, `funcionario_cod_funcionario`, `nome`, `ativo`) VALUES
(1234, '1234', 'adm', 0, 'Usuário Padrão', 1),
(6666, '3532', 'adm', 0, 'Alan', 1),
(9934, '2122', 'caixa', 5, 'José', 1),
(2523, '3532', 'almoxarife', 4, 'Emanuel', 1),
(2122, '3532', 'gerente', 2, 'Alana', 1),
(3532, '3532', 'caixa', 1, 'Samara', 1),
(2524, '3532', 'almoxarife', 3, 'Samuel', 1);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`cod`);

--
-- Índices para tabela `itemcompra`
--
ALTER TABLE `itemcompra`
  ADD PRIMARY KEY (`cod_item_compra`),
  ADD KEY `nota_compra_cod_venda` (`nota_compra_cod_venda`),
  ADD KEY `produto_cod_produto` (`produto_cod_produto`);

--
-- Índices para tabela `itemvenda`
--
ALTER TABLE `itemvenda`
  ADD PRIMARY KEY (`cod_item_venda`),
  ADD KEY `notavenda_cod_venda` (`notavenda_cod_venda`),
  ADD KEY `produto_cod_produto` (`produto_cod_produto`);

--
-- Índices para tabela `notacompra`
--
ALTER TABLE `notacompra`
  ADD PRIMARY KEY (`cod_nota`),
  ADD KEY `funcionario_cod_funcionario` (`funcionario_cod_funcionario`);

--
-- Índices para tabela `notavenda`
--
ALTER TABLE `notavenda`
  ADD PRIMARY KEY (`cod_venda`),
  ADD KEY `funcionaio_cod_funcionario` (`funcionaio_cod_funcionario`);

--
-- Índices para tabela `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`cod_produto`);

--
-- Índices para tabela `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`cod_usuario`),
  ADD KEY `funcionario_cod_funcionario` (`funcionario_cod_funcionario`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de tabela `itemvenda`
--
ALTER TABLE `itemvenda`
  MODIFY `cod_item_venda` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31039;

--
-- AUTO_INCREMENT de tabela `notacompra`
--
ALTER TABLE `notacompra`
  MODIFY `cod_nota` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2532;

--
-- AUTO_INCREMENT de tabela `produto`
--
ALTER TABLE `produto`
  MODIFY `cod_produto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=64;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
