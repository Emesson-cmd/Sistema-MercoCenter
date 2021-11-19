-- MySQL dump 10.13  Distrib 8.0.26, for Linux (x86_64)
--
-- Host: localhost    Database: bancomercado
-- ------------------------------------------------------
-- Server version	8.0.26-0ubuntu0.20.04.2

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `funcionario`
--

DROP TABLE IF EXISTS `funcionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `funcionario` (
  `cod` int NOT NULL AUTO_INCREMENT,
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
  `situacao` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`cod`)
) ENGINE=MyISAM AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionario`
--

LOCK TABLES `funcionario` WRITE;
/*!40000 ALTER TABLE `funcionario` DISABLE KEYS */;
INSERT INTO `funcionario` VALUES (8,'(00)00000-0000','000.000.000-00','2002-02-02','emersson@gmail.com','ABC','Emesson','2002-10-10','10:10:10','109','0000000000-0','masculino','(00)00000-0000','UF','DEF','ABC','109  -   ','adm','inativo'),(9,'(00)00000-0000','000.000.000-00','1999-02-28','jeova@gmail.com','jeova','Jeová','2021-11-13','21:00:06','2131231','0000000000-0','Masculino','(00)00000-0000','CE','000000000','Jua','00000-000','caixa','inativo'),(10,'(99)99999-9999','999.999.999-99','2002-02-02','9999999999999','aaaaaaaaaaaa','João Gomes','2021-11-13','21:22:42','123','9999999999-9','Masculino','(99)99999-9999','ab','111111111111','11111','11111-111','adm','inativo'),(11,'(33)33333-3333','333.333.333-33','2003-03-03','maria@gmail.com','cccc','Maria','2021-11-13','21:28:03','333','3333333333-3','Feminino','(33)33333-3333','ccc','ccc','ccc','33333-333','adm','ativo'),(12,'(66)66666-6666','666.666.666-66','2006-06-06','seis@email.com','Rua Seis','seix','2021-11-14','17:53:07','600','6666666666-6',NULL,'(66)66666-6666','66','Seisenos','Seislandia','66666-666','almoxarife','férias'),(13,'(77)77777-7777','777.777.777-77','2007-07-07','sete@email.com','Rua Sete','Sete','2021-11-14','17:55:56','77','7777777777-7',NULL,'(77)77777-7777','SE','Setiano','Setenta','77777-777','gerente','inativo'),(14,'(88)88888-8888','888.888.888-88','2008-08-08','oito@email.com','Rua Oito','Oito','2021-11-14','18:00:57','888','8888888888-8',NULL,'(88)88888-8888','OI','Oitenta','Oitocentos','88888-888','caixa','férias'),(15,'(20)20202-0202','202.020.202-02','2002-02-20','mateus@email.com','Rua 200','Matheus','2021-11-14','18:03:16','2020','2020202020-2',NULL,'(20)20202-0202','AAA','2020','2020','20202-020','almoxarife','inativo'),(16,'(10)10101-0101','101.010.101-01','2001-10-10','guilherme@email.com','Rua Binario','Guilherme','2021-11-14','18:03:30','10101010','1010101010-1',NULL,'(10)10101-0101','10','1010','101010','10101-010','adm','ativo'),(17,'(89)65584-2841','541.649.849-49','2002-12-20','rafaela.bezerra..pinto2022@gmail.com','Rua do Desespero','Rafaela de Bezerra Pinto Bacharel','2021-11-15','13:13:08','109','9798984949-4',NULL,'(87)94184-9489','CE','Felicianos','Paraibeneses','87556-925','recursos humanos','ativo'),(18,'(89)65584-2841','541.649.849-49','2002-10-10','rafaela.bezerra..pinto2022@gmail.com','Rua do Desespero','Rafaela de Bezerra Pinto Bacharel','2021-11-15','13:15:34','109','9798984949-4',NULL,'(87)94184-9489','CE','Felicianos','Paraibeneses','87556-925','recursos humanos','ativo'),(19,'(11)11111-1111','111.111.111-11','2002-10-31','a','a','a','2021-11-15','14:19:54','1','1111111111-1',NULL,'(11)11111-1111','a','a','a','     -   ','caixa','ativo'),(20,'(11)11111-1111','111.111.111-11','2002-10-31','a','a','b','2021-11-15','14:30:28','1','1111111111-1',NULL,'(11)11111-1111','a','a','a','00000-000','caixa','ativo');
/*!40000 ALTER TABLE `funcionario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-11-18 17:12:43
