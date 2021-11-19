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
-- Table structure for table `itemVenda`
--

DROP TABLE IF EXISTS `itemVenda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `itemVenda` (
  `cod_item_venda` int NOT NULL AUTO_INCREMENT,
  `notavenda_cod_venda` int NOT NULL,
  `valor` decimal(10,2) DEFAULT NULL,
  `datacad` date DEFAULT NULL,
  `horacad` time DEFAULT NULL,
  `quantidade` int DEFAULT NULL,
  `valor_total` decimal(10,2) DEFAULT NULL,
  `produto_cod_produto` int NOT NULL,
  PRIMARY KEY (`cod_item_venda`),
  KEY `notavenda_cod_venda` (`notavenda_cod_venda`),
  KEY `produto_cod_produto` (`produto_cod_produto`)
) ENGINE=MyISAM AUTO_INCREMENT=30963 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `itemVenda`
--

LOCK TABLES `itemVenda` WRITE;
/*!40000 ALTER TABLE `itemVenda` DISABLE KEYS */;
INSERT INTO `itemVenda` VALUES (30956,0,15.00,'2021-10-21','12:26:05',1,15.00,2),(30957,0,15.00,'2021-10-21','12:26:21',1,15.00,2),(30958,0,15.00,'2021-10-21','12:28:26',1,15.00,2),(30959,197245732,15.00,'2021-10-21','12:38:20',1,15.00,1),(30960,85825808,15.00,'2021-10-21','12:45:39',1,15.00,2),(30961,33520240,15.00,'2021-10-21','12:52:40',23,345.00,2),(30962,759168730,15.00,'2021-10-21','13:10:21',2,30.00,1);
/*!40000 ALTER TABLE `itemVenda` ENABLE KEYS */;
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
