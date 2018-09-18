-- MySQL dump 10.13  Distrib 5.5.38, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: d569869
-- ------------------------------------------------------
-- Server version	5.5.38-0ubuntu0.14.04.1

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
-- Table structure for table `ADDRESS`
--
/*We still need to add the foreign keys for the tables*/
DROP TABLE IF EXISTS `ADDRESS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ADDRESS` (
  `ADDRESS_ID` int(11) NOT NULL,
  `PATIENT_ID` int(11) NOT NULL,
  `ADDRESS_LINE_1` varchar(5) NOT NULL,
  `ADDRESS_LINE_2` varchar(10) NOT NULL,
  `ADDRESS_LINE_3` varchar(10) DEFAULT NULL,
  `CITY` varchar(20) NOT NULL,
  `PROVINCE` varchar(20) NOT NULL,
  `POSTAL_CODE` int(11) NOT NULL,
  PRIMARY KEY (`ADDRESS_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ADDRESS`
--

LOCK TABLES `ADDRESS` WRITE;
/*!40000 ALTER TABLE `ADDRESS` DISABLE KEYS */;
/*!40000 ALTER TABLE `ADDRESS` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ADMINISTRATOR`
--

DROP TABLE IF EXISTS `ADMINISTRATOR`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ADMINISTRATOR` (
  `ADMIN_ID` int(11) NOT NULL,
  `PASSWORD` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ADMINISTRATOR`
--

LOCK TABLES `ADMINISTRATOR` WRITE;
/*!40000 ALTER TABLE `ADMINISTRATOR` DISABLE KEYS */;
/*!40000 ALTER TABLE `ADMINISTRATOR` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `APPOINTMENT`
--

DROP TABLE IF EXISTS `APPOINTMENT`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `APPOINTMENT` (
  `APPOINTMENT_ID` int(11) NOT NULL AUTO_INCREMENT,
  `PATIENT_ID` int(11) NOT NULL,
  `DOCTOR_ID` int(11) NOT NULL,
  `RECEPTIONIST_ID` int(11) NOT NULL,
  `DATE` varchar(10) NOT NULL,
  `CHECKIN` varchar(10) NOT NULL,
  `CHECKOUT` varchar(10) NOT NULL,
  PRIMARY KEY (`APPOINTMENT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `APPOINTMENT`
--

LOCK TABLES `APPOINTMENT` WRITE;
/*!40000 ALTER TABLE `APPOINTMENT` DISABLE KEYS */;
/*!40000 ALTER TABLE `APPOINTMENT` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `AUTHORIZATION`
--

DROP TABLE IF EXISTS `AUTHORIZATION`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `AUTHORIZATION` (
  `ADMIN_ID` int(11) NOT NULL,
  `DOCTOR_ID` int(11) NOT NULL,
  `RECEPTIONIST_ID` int(11) NOT NULL,
  `LOG_DETAILS` varchar(20) NOT NULL,
  PRIMARY KEY (`ADMIN_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `AUTHORIZATION`
--

LOCK TABLES `AUTHORIZATION` WRITE;
/*!40000 ALTER TABLE `AUTHORIZATION` DISABLE KEYS */;
/*!40000 ALTER TABLE `AUTHORIZATION` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CONSULTATION`
--

DROP TABLE IF EXISTS `CONSULTATION`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CONSULTATION` (
  `CONSULTATION_ID` int(11) NOT NULL,
  `APPOINTMENT_ID` int(11) NOT NULL,
  `INVOICE_ID` int(11) NOT NULL,
  PRIMARY KEY (`CONSULTATION_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CONSULTATION`
--

LOCK TABLES `CONSULTATION` WRITE;
/*!40000 ALTER TABLE `CONSULTATION` DISABLE KEYS */;
/*!40000 ALTER TABLE `CONSULTATION` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `DOCTOR`
--

DROP TABLE IF EXISTS `DOCTOR`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `DOCTOR` (
  `DOCTOR_ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(20) DEFAULT NULL,
  `SURNAME` varchar(20) DEFAULT NULL,
  `EMAIL` varchar(20) DEFAULT NULL,
  `SPECIALIZATION` varchar(20) DEFAULT NULL,
  `PASSWORD` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`DOCTOR_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `DOCTOR`
--

LOCK TABLES `DOCTOR` WRITE;
/*!40000 ALTER TABLE `DOCTOR` DISABLE KEYS */;
/*!40000 ALTER TABLE `DOCTOR` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `INVOICE`
--

DROP TABLE IF EXISTS `INVOICE`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `INVOICE` (
  `INVOICE_ID` int(11) NOT NULL,
  `DESCRIPTION` varchar(50) NOT NULL,
  `COST` varchar(20) NOT NULL,
  PRIMARY KEY (`INVOICE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `INVOICE`
--

LOCK TABLES `INVOICE` WRITE;
/*!40000 ALTER TABLE `INVOICE` DISABLE KEYS */;
/*!40000 ALTER TABLE `INVOICE` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `MEDICAL_CONDTION`
--

DROP TABLE IF EXISTS `MEDICAL_CONDTION`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `MEDICAL_CONDTION` (
  `MED_CONDITION_ID` int(11) NOT NULL,
  `PATIENT_ID` int(11) NOT NULL,
  `HEART_CONDITION` tinyint(1) NOT NULL DEFAULT '0',
  `EPILEPSY` tinyint(1) NOT NULL DEFAULT '0',
  `ALLERGIES` varchar(20) NOT NULL,
  `DENTAL_SEDATION` tinyint(1) NOT NULL DEFAULT '0',
  `BLEEDING_DISORDER` tinyint(1) NOT NULL DEFAULT '0',
  `TEETH_SENSITIVE` tinyint(1) NOT NULL DEFAULT '0',
  `MEDICATION` varchar(100) NOT NULL,
  `SORES_IN_MOUTH` tinyint(1) NOT NULL DEFAULT '0',
  `TOUNGE_DIAGNOSIS` tinyint(1) NOT NULL DEFAULT '0',
  `HIV_AIDS` tinyint(1) NOT NULL DEFAULT '0',
  `MEDICAL_AID_NAME` varchar(20) DEFAULT NULL,
  `MEDICAL_AID_NUMBER` varchar(20) DEFAULT NULL,
  `FAMILY_DR_NAME` varchar(20) DEFAULT NULL,
  `FAMILY_DR_CONTACT` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`MED_CONDITION_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `MEDICAL_CONDTION`
--

LOCK TABLES `MEDICAL_CONDTION` WRITE;
/*!40000 ALTER TABLE `MEDICAL_CONDTION` DISABLE KEYS */;
/*!40000 ALTER TABLE `MEDICAL_CONDTION` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `RECEPTIONIST`
--

DROP TABLE IF EXISTS `RECEPTIONIST`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `RECEPTIONIST` (
  `RECEPTIONIST_ID` int(11) NOT NULL,
  `NAME` varchar(20) NOT NULL,
  `SURNAME` varchar(20) NOT NULL,
  `PASSWORD` varchar(20) NOT NULL,
  PRIMARY KEY (`RECEPTIONIST_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `RECEPTIONIST`
--

LOCK TABLES `RECEPTIONIST` WRITE;
/*!40000 ALTER TABLE `RECEPTIONIST` DISABLE KEYS */;
/*!40000 ALTER TABLE `RECEPTIONIST` ENABLE KEYS */;


/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-09-16 17:16:41
