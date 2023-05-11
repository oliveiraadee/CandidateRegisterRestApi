-- MySQL dump 10.13  Distrib 8.0.33, for macos11.7 (x86_64)
--
-- Host: localhost    Database: database_candidates
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `user_candidate`
--

DROP TABLE IF EXISTS `user_candidate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_candidate` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `backend` int NOT NULL,
  `camunda` int NOT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `database_exp` int NOT NULL,
  `frontend` int NOT NULL,
  `health` int NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_candidate`
--

LOCK TABLES `user_candidate` WRITE;
/*!40000 ALTER TABLE `user_candidate` DISABLE KEYS */;
INSERT INTO `user_candidate` VALUES (1,3,2,'yyy',3,3,2,'Deyse','83838838'),(2,3,2,'fff',3,3,2,'ddddd','6656ff');
/*!40000 ALTER TABLE `user_candidate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `UserCandidate`
--

DROP TABLE IF EXISTS `UserCandidate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `UserCandidate` (
  `id` int DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `option1` int DEFAULT NULL,
  `option2` int DEFAULT NULL,
  `option3` int DEFAULT NULL,
  `camunda` int DEFAULT NULL,
  `health` int DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `UserCandidate`
--

LOCK TABLES `UserCandidate` WRITE;
/*!40000 ALTER TABLE `UserCandidate` DISABLE KEYS */;
/*!40000 ALTER TABLE `UserCandidate` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-10 22:16:12
