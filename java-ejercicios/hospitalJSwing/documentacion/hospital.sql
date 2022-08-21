CREATE DATABASE  IF NOT EXISTS `hospital` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `hospital`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: hospital
-- ------------------------------------------------------
-- Server version	5.7.16-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
--
-- Table structure for table `operaciones`
--

DROP TABLE IF EXISTS `operaciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `operaciones` (
  `cod_operacion` char(5) NOT NULL,
  `descripcion` char(20) DEFAULT NULL,
  `fecha` datetime(6) DEFAULT NULL,
  `tipo` char(12) DEFAULT NULL,
  `dni` char(10) NOT NULL,
  `cod_quirofano` char(5) DEFAULT NULL,
  PRIMARY KEY (`cod_operacion`),
  KEY `FK_Operaciones_Personas` (`dni`),
  KEY `FK__operacion__cod_q__59063A47` (`cod_quirofano`),
  CONSTRAINT `FK_Operaciones_Personas` FOREIGN KEY (`dni`) REFERENCES `personas` (`dni`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK__operacion__cod_q__59063A47` FOREIGN KEY (`cod_quirofano`) REFERENCES `quirofanos` (`cod_quirofano`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `operaciones`
--

LOCK TABLES `operaciones` WRITE;
/*!40000 ALTER TABLE `operaciones` DISABLE KEYS */;
INSERT INTO `operaciones` VALUES ('A1234','corazon','2004-03-21 00:00:00.000000','extraccion','987654324J','1'),('A1235','corazon','2004-03-21 00:00:00.000000','transplante','987654323D','1'),('A1236','hernia','2004-03-22 00:00:00.000000','general','987654322B','2'),('A1237','limpieza pulmon','2004-03-15 00:00:00.000000','general','17','3'),('A1238','piedras riñon','2003-03-17 00:00:00.000000','general','17','3'),('B123','NUEVA','2017-01-17 00:00:00.000000','GENERAL','987654324J','5');
/*!40000 ALTER TABLE `operaciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `personas`
--

DROP TABLE IF EXISTS `personas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `personas` (
  `dni` char(10) NOT NULL,
  `nombre` char(10) DEFAULT NULL,
  `apellidos` char(20) DEFAULT NULL,
  `direccion` char(20) DEFAULT NULL,
  `fecha_naci` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personas`
--

LOCK TABLES `personas` WRITE;
/*!40000 ALTER TABLE `personas` DISABLE KEYS */;
INSERT INTO `personas` VALUES ('17','Pedro','Reverte','C/salvadillo','1912-12-12 00:00:00.000000'),('987654322B','Jaime','Lopez','Avda.la Torre','1972-08-05 00:00:00.000000'),('987654323D','Alicia','Martinez','C/Fonseca','1989-06-12 00:00:00.000000'),('987654324J','Juan','Rodriguez','C/Tempranillo','1953-05-01 00:00:00.000000'),('987654325Z','Carlos','Fernandez','C/Rojas','1985-05-05 00:00:00.000000');
/*!40000 ALTER TABLE `personas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quirofanos`
--

DROP TABLE IF EXISTS `quirofanos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `quirofanos` (
  `cod_quirofano` char(5) NOT NULL,
  `descripcion` char(10) DEFAULT NULL,
  `planta` char(10) DEFAULT NULL,
  PRIMARY KEY (`cod_quirofano`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quirofanos`
--

LOCK TABLES `quirofanos` WRITE;
/*!40000 ALTER TABLE `quirofanos` DISABLE KEYS */;
INSERT INTO `quirofanos` VALUES ('1','skjkds','2'),('2','fkjdkd','1'),('3','aaa','3'),('5',NULL,NULL);
/*!40000 ALTER TABLE `quirofanos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-26  8:37:25
