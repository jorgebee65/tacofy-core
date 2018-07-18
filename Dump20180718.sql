CREATE DATABASE  IF NOT EXISTS `tacofy_op` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `tacofy_op`;
-- MySQL dump 10.13  Distrib 8.0.11, for Win64 (x86_64)
--
-- Host: localhost    Database: tacofy_op
-- ------------------------------------------------------
-- Server version	8.0.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `amenidad`
--

DROP TABLE IF EXISTS `amenidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `amenidad` (
  `amenidad_id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(45) NOT NULL,
  PRIMARY KEY (`amenidad_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `amenidad`
--

LOCK TABLES `amenidad` WRITE;
/*!40000 ALTER TABLE `amenidad` DISABLE KEYS */;
INSERT INTO `amenidad` VALUES (1,'Acceso especial'),(2,'Alcohol'),(3,'Buffet'),(4,'Estacionamiento'),(5,'Exterior'),(6,'Música'),(7,'Ofertas'),(8,'Pet Friendly'),(9,'Postre'),(10,'Reservaciones'),(11,'Terjeta de crédito'),(12,'Wifi');
/*!40000 ALTER TABLE `amenidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `amenidadpo`
--

DROP TABLE IF EXISTS `amenidadpo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `amenidadpo` (
  `amenidad_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`amenidad_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `amenidadpo`
--

LOCK TABLES `amenidadpo` WRITE;
/*!40000 ALTER TABLE `amenidadpo` DISABLE KEYS */;
/*!40000 ALTER TABLE `amenidadpo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `red_social`
--

DROP TABLE IF EXISTS `red_social`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `red_social` (
  `red_soc_id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`red_soc_id`),
  UNIQUE KEY `descripcion_UNIQUE` (`descripcion`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `red_social`
--

LOCK TABLES `red_social` WRITE;
/*!40000 ALTER TABLE `red_social` DISABLE KEYS */;
INSERT INTO `red_social` VALUES (1,'facebook'),(2,'instagram'),(4,'web'),(3,'whatsapp');
/*!40000 ALTER TABLE `red_social` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `taco_tipo`
--

DROP TABLE IF EXISTS `taco_tipo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `taco_tipo` (
  `taco_tipo_id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(45) NOT NULL,
  PRIMARY KEY (`taco_tipo_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Tipos de tacos: suadero, macisa, birria, carnitas, maricos... etc';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `taco_tipo`
--

LOCK TABLES `taco_tipo` WRITE;
/*!40000 ALTER TABLE `taco_tipo` DISABLE KEYS */;
INSERT INTO `taco_tipo` VALUES (1,'Barbacoa'),(2,'Pastor'),(3,'Suadero'),(4,'Guisado'),(5,'Canasta'),(6,'Tripa'),(7,'Asada'),(8,'Mariscos'),(9,'Veganos');
/*!40000 ALTER TABLE `taco_tipo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `taqueria`
--

DROP TABLE IF EXISTS `taqueria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `taqueria` (
  `taq_id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `ubicacion` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `calificacion` decimal(2,0) DEFAULT NULL,
  `fecha_creacion` datetime DEFAULT NULL,
  `taq_tipo_id` int(11) DEFAULT NULL,
  `latitud` decimal(11,8) DEFAULT NULL,
  `longitud` decimal(11,8) DEFAULT NULL,
  PRIMARY KEY (`taq_id`),
  KEY `taq_tipo_id_idx` (`taq_tipo_id`),
  CONSTRAINT `FK8vngn7v6grjo5fbi1bmb0udnm` FOREIGN KEY (`taq_tipo_id`) REFERENCES `taqueria_tipo` (`taq_tipo_id`),
  CONSTRAINT `taq_tipo_id_fk` FOREIGN KEY (`taq_tipo_id`) REFERENCES `taqueria_tipo` (`taq_tipo_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Información relacionada a los retaurantes/locales que estarán registrados en la aplicación.';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `taqueria`
--

LOCK TABLES `taqueria` WRITE;
/*!40000 ALTER TABLE `taqueria` DISABLE KEYS */;
INSERT INTO `taqueria` VALUES (1,'Amaranto','Carr Ixhuatlanpulco 73','272 72771178',5,NULL,3,18.86908500,-97.11399700),(4,'Taqueria 2','Lazaro Cardenas 321','55 5522 4411',NULL,'2018-07-13 03:30:02',3,18.86908500,-97.11399700),(5,'Tacontento','Avenida Siempre Viva 89','66 5522 4411',NULL,'2018-07-13 03:39:31',3,18.86908500,-97.11399700);
/*!40000 ALTER TABLE `taqueria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `taqueria_amenidad`
--

DROP TABLE IF EXISTS `taqueria_amenidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `taqueria_amenidad` (
  `taq_id` int(11) NOT NULL,
  `amenidad_id` int(11) NOT NULL,
  PRIMARY KEY (`taq_id`,`amenidad_id`),
  KEY `amenidad_id_fk_idx` (`amenidad_id`),
  CONSTRAINT `FK2cq5eq4asuq13ujl3jpd8alfw` FOREIGN KEY (`amenidad_id`) REFERENCES `amenidad` (`amenidad_id`),
  CONSTRAINT `FKscy1qtwel71ue1axhktmm24ad` FOREIGN KEY (`taq_id`) REFERENCES `taqueria` (`taq_id`),
  CONSTRAINT `amenidad_id_fk` FOREIGN KEY (`amenidad_id`) REFERENCES `amenidad` (`amenidad_id`),
  CONSTRAINT `taq_id_fk` FOREIGN KEY (`taq_id`) REFERENCES `taqueria` (`taq_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `taqueria_amenidad`
--

LOCK TABLES `taqueria_amenidad` WRITE;
/*!40000 ALTER TABLE `taqueria_amenidad` DISABLE KEYS */;
INSERT INTO `taqueria_amenidad` VALUES (1,2),(4,2),(5,2),(1,6),(1,7),(4,7),(5,7);
/*!40000 ALTER TABLE `taqueria_amenidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `taqueria_comentario`
--

DROP TABLE IF EXISTS `taqueria_comentario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `taqueria_comentario` (
  `taq_com_id` int(11) NOT NULL AUTO_INCREMENT,
  `taq_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `comentario` varchar(250) NOT NULL,
  `calificacion` smallint(1) NOT NULL,
  PRIMARY KEY (`taq_com_id`),
  KEY `taq_id_fk4_idx` (`taq_id`),
  KEY `user_id_fk_idx` (`user_id`),
  CONSTRAINT `taq_id_fk4` FOREIGN KEY (`taq_id`) REFERENCES `taqueria` (`taq_id`),
  CONSTRAINT `user_id_fk` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `taqueria_comentario`
--

LOCK TABLES `taqueria_comentario` WRITE;
/*!40000 ALTER TABLE `taqueria_comentario` DISABLE KEYS */;
INSERT INTO `taqueria_comentario` VALUES (1,1,2,'Buenos tacos, buen sazón, los recomiendo saliendo de la cantina, la salsa roja esta muy chida.',4);
/*!40000 ALTER TABLE `taqueria_comentario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `taqueria_fotos`
--

DROP TABLE IF EXISTS `taqueria_fotos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `taqueria_fotos` (
  `taq_foto_id` int(11) NOT NULL AUTO_INCREMENT,
  `taq_id` int(11) NOT NULL,
  `ruta` varchar(300) NOT NULL,
  `taqueria` tinyblob,
  PRIMARY KEY (`taq_foto_id`),
  KEY `taq_id_fk5_idx` (`taq_id`),
  CONSTRAINT `FKosbs1ctwp4n8jdt8oakiou5xk` FOREIGN KEY (`taq_id`) REFERENCES `taqueria` (`taq_id`),
  CONSTRAINT `taq_id_fk5` FOREIGN KEY (`taq_id`) REFERENCES `taqueria` (`taq_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `taqueria_fotos`
--

LOCK TABLES `taqueria_fotos` WRITE;
/*!40000 ALTER TABLE `taqueria_fotos` DISABLE KEYS */;
INSERT INTO `taqueria_fotos` VALUES (1,1,'https://blog.tacoguru.com/wp-content/uploads/2017/02/shutterstock_116861986.jpg',NULL);
/*!40000 ALTER TABLE `taqueria_fotos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `taqueria_horario`
--

DROP TABLE IF EXISTS `taqueria_horario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `taqueria_horario` (
  `taq_hor_id` int(11) NOT NULL AUTO_INCREMENT,
  `taq_id` int(11) NOT NULL,
  `dia` tinyint(1) NOT NULL,
  `hor_desde` time NOT NULL,
  `hor_hasta` time NOT NULL,
  PRIMARY KEY (`taq_hor_id`),
  UNIQUE KEY `taq_id_UNIQUE` (`taq_id`,`dia`),
  KEY `taq_id_fk6_idx` (`taq_id`),
  CONSTRAINT `taq_id_fk6` FOREIGN KEY (`taq_id`) REFERENCES `taqueria` (`taq_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `taqueria_horario`
--

LOCK TABLES `taqueria_horario` WRITE;
/*!40000 ALTER TABLE `taqueria_horario` DISABLE KEYS */;
INSERT INTO `taqueria_horario` VALUES (1,1,1,'18:00:00','23:00:00'),(2,1,2,'19:00:00','23:00:00'),(4,1,9,'10:01:00','11:11:00');
/*!40000 ALTER TABLE `taqueria_horario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `taqueria_red`
--

DROP TABLE IF EXISTS `taqueria_red`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `taqueria_red` (
  `taq_id` int(11) NOT NULL,
  `red_soc_id` int(11) NOT NULL,
  `url` varchar(300) NOT NULL,
  PRIMARY KEY (`taq_id`,`red_soc_id`),
  KEY `red_soc_id_idx` (`red_soc_id`),
  CONSTRAINT `red_soc_id_fk` FOREIGN KEY (`red_soc_id`) REFERENCES `red_social` (`red_soc_id`),
  CONSTRAINT `taq_id_fk2` FOREIGN KEY (`taq_id`) REFERENCES `taqueria` (`taq_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `taqueria_red`
--

LOCK TABLES `taqueria_red` WRITE;
/*!40000 ALTER TABLE `taqueria_red` DISABLE KEYS */;
INSERT INTO `taqueria_red` VALUES (1,1,'https://www.facebook.com/pages/Taqueria-Amaranto/232767187127939');
/*!40000 ALTER TABLE `taqueria_red` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `taqueria_taco_tipo`
--

DROP TABLE IF EXISTS `taqueria_taco_tipo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `taqueria_taco_tipo` (
  `taq_id` int(11) NOT NULL,
  `taco_tipo_id` int(11) NOT NULL,
  PRIMARY KEY (`taq_id`,`taco_tipo_id`),
  KEY `taco_tipo_id_fk_idx` (`taco_tipo_id`),
  CONSTRAINT `FKlt0iad1ap0r42msvqk4de91t4` FOREIGN KEY (`taq_id`) REFERENCES `taqueria` (`taq_id`),
  CONSTRAINT `FKs3cn658lt7fturettepppkmck` FOREIGN KEY (`taco_tipo_id`) REFERENCES `taco_tipo` (`taco_tipo_id`),
  CONSTRAINT `taco_tipo_id_fk` FOREIGN KEY (`taco_tipo_id`) REFERENCES `taco_tipo` (`taco_tipo_id`),
  CONSTRAINT `taq_id_fk3` FOREIGN KEY (`taq_id`) REFERENCES `taqueria` (`taq_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Los tipos de tacos que puede ofrecer una taqueria';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `taqueria_taco_tipo`
--

LOCK TABLES `taqueria_taco_tipo` WRITE;
/*!40000 ALTER TABLE `taqueria_taco_tipo` DISABLE KEYS */;
INSERT INTO `taqueria_taco_tipo` VALUES (1,2),(4,2),(5,2),(1,3),(1,4),(1,7),(4,7),(5,7);
/*!40000 ALTER TABLE `taqueria_taco_tipo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `taqueria_tipo`
--

DROP TABLE IF EXISTS `taqueria_tipo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `taqueria_tipo` (
  `taq_tipo_id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`taq_tipo_id`),
  UNIQUE KEY `descripcion_UNIQUE` (`descripcion`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Tipos de taquerias, ejemplo: locales, restaurantes, puestos.';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `taqueria_tipo`
--

LOCK TABLES `taqueria_tipo` WRITE;
/*!40000 ALTER TABLE `taqueria_tipo` DISABLE KEYS */;
INSERT INTO `taqueria_tipo` VALUES (3,'local'),(2,'puesto'),(1,'restaurante');
/*!40000 ALTER TABLE `taqueria_tipo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `taqueriapo`
--

DROP TABLE IF EXISTS `taqueriapo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `taqueriapo` (
  `taq_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `calificacion` decimal(19,2) DEFAULT NULL,
  `fecha_creacion` datetime DEFAULT NULL,
  `latitud` decimal(19,2) DEFAULT NULL,
  `longitud` decimal(19,2) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `telefono` varchar(255) DEFAULT NULL,
  `ubicacion` varchar(255) DEFAULT NULL,
  `taq_tipo_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`taq_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `taqueriapo`
--

LOCK TABLES `taqueriapo` WRITE;
/*!40000 ALTER TABLE `taqueriapo` DISABLE KEYS */;
/*!40000 ALTER TABLE `taqueriapo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `name` varchar(200) NOT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `username_UNIQUE` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (2,'jorgebee','Jorge Dominguez');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-07-18  8:23:17
