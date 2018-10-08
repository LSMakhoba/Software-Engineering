-- phpMyAdmin SQL Dump
-- version 4.6.6deb5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Oct 08, 2018 at 01:01 PM
-- Server version: 5.7.23-0ubuntu0.18.04.1
-- PHP Version: 7.2.10-0ubuntu0.18.04.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `testDB`
--
CREATE DATABASE IF NOT EXISTS `testDB` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `testDB`;

-- --------------------------------------------------------

--
-- Table structure for table `ADDRESS`
--

DROP TABLE IF EXISTS `ADDRESS`;
CREATE TABLE `ADDRESS` (
  `ADDRESS_ID` int(11) NOT NULL,
  `ADDRESS_LINE_1` varchar(20) NOT NULL,
  `ADDRESS_LINE_2` varchar(20) NOT NULL,
  `ADDRESS_LINE_3` varchar(20) DEFAULT NULL,
  `CITY` varchar(20) NOT NULL,
  `PROVINCE` varchar(20) NOT NULL,
  `POSTAL_CODE` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ADDRESS`
--

INSERT INTO `ADDRESS` (`ADDRESS_ID`, `ADDRESS_LINE_1`, `ADDRESS_LINE_2`, `ADDRESS_LINE_3`, `CITY`, `PROVINCE`, `POSTAL_CODE`) VALUES
(1, '65 empire road', 'Parktown', 'Yale Village', 'Johannesburg', 'Gauteng', 2193),
(2, '33 Fourie street', 'Westonaria', 'central', 'Johannesburg', 'Gauteng', 1779),
(3, '74 Main reef', 'Soweto', 'Jabulani', 'Johannesburg', 'Gauteng', 1723),
(4, '74 Main reef', 'Soweto', 'Jabulani', 'Johannesburg', 'Gauteng', 1723),
(5, '37 fouirier street', 'market', 'Westonarie', 'Johannesburg', 'Gauteng', 2779),
(6, '11 dekorte street', 'braamfontetein', 'parkstation', 'Johannesburg', 'Gauteng', 2177),
(7, '75 west street', 'durban centre', 'Phoenix', 'Durban', 'KwaZulu-Natal', 4000);

-- --------------------------------------------------------

--
-- Table structure for table `ADMINISTRATOR`
--

DROP TABLE IF EXISTS `ADMINISTRATOR`;
CREATE TABLE `ADMINISTRATOR` (
  `ADMIN_ID` varchar(20) NOT NULL,
  `ADMIN_PASS` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `APPOINTMENT`
--

DROP TABLE IF EXISTS `APPOINTMENT`;
CREATE TABLE `APPOINTMENT` (
  `APPOINTMENT_ID` int(11) NOT NULL,
  `DATE` varchar(15) NOT NULL,
  `CHECKIN` varchar(10) NOT NULL,
  `CHECKOUT` varchar(10) NOT NULL,
  `DOCTOR_ID` int(11) NOT NULL,
  `PATIENT_ID` int(11) NOT NULL,
  `RECEPTIONIST_ID` int(11) DEFAULT NULL,
  `CHARGE` varchar(10) NOT NULL DEFAULT 'uncharged'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `APPOINTMENT`
--

INSERT INTO `APPOINTMENT` (`APPOINTMENT_ID`, `DATE`, `CHECKIN`, `CHECKOUT`, `DOCTOR_ID`, `PATIENT_ID`, `RECEPTIONIST_ID`, `CHARGE`) VALUES
(3, '08/10/2018', '07AM', '08AM', 101, 5552, NULL, 'charged'),
(4, '09/10/2018', '07AM', '09AM', 101, 5552, NULL, 'charged'),
(5, '18/10/2018', '10AM', '12PM', 102, 5551, 1431, 'charged'),
(6, '10/10/2018', '07AM', '08AM', 102, 5551, NULL, 'uncharged'),
(13, '11/10/2018', '07AM', '08AM', 102, 5551, NULL, 'uncharged'),
(14, '11/10/2018', '07AM', '08AM', 102, 5551, NULL, 'uncharged'),
(15, '10/10/2018', '07AM', '08AM', 102, 5551, NULL, 'uncharged'),
(16, '11/10/2018', '07AM', '08AM', 102, 5551, NULL, 'uncharged'),
(17, '10/10/2018', '07AM', '08AM', 102, 5551, NULL, 'uncharged'),
(18, '04/10/2018', '07AM', '08AM', 102, 5551, NULL, 'uncharged'),
(19, '11/10/2018', '07AM', '08AM', 102, 5551, NULL, 'uncharged'),
(20, '11/10/2018', '07AM', '08AM', 102, 5551, NULL, 'uncharged'),
(21, '10/10/2018', '07AM', '08AM', 102, 5551, NULL, 'uncharged'),
(22, '17/10/2018', '07AM', '08AM', 102, 5551, 1431, 'uncharged'),
(23, '11/10/2018', '07AM', '08AM', 102, 5551, 1431, 'uncharged'),
(24, '11/10/2018', '07AM', '08AM', 102, 5551, NULL, 'uncharged');

-- --------------------------------------------------------

--
-- Table structure for table `AUTHORIZATION`
--

DROP TABLE IF EXISTS `AUTHORIZATION`;
CREATE TABLE `AUTHORIZATION` (
  `ADMIN_ID` int(11) NOT NULL,
  `LOG_DETAILS` varchar(20) NOT NULL,
  `DOCTOR_ID` int(11) NOT NULL,
  `RECEPTIONIST` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `CONSULTATION`
--

DROP TABLE IF EXISTS `CONSULTATION`;
CREATE TABLE `CONSULTATION` (
  `CONSULTATION_ID` int(11) NOT NULL,
  `DESCRIPTION` varchar(200) NOT NULL,
  `COST` double NOT NULL,
  `TIME` time(6) NOT NULL,
  `DATE` date NOT NULL,
  `APPOINTMENT_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `CONSULTATION`
--

INSERT INTO `CONSULTATION` (`CONSULTATION_ID`, `DESCRIPTION`, `COST`, `TIME`, `DATE`, `APPOINTMENT_ID`) VALUES
(22, 'done', 670, '06:08:50.000000', '2018-10-06', 4),
(23, 'checking', 700, '06:49:55.000000', '2018-10-06', 3),
(24, 'almost there', 430, '06:59:18.000000', '2018-10-06', 3),
(25, 'Teeht cleaning', 250, '20:51:52.000000', '2018-10-06', 4),
(26, 'fitting', 750, '20:53:20.000000', '2018-10-06', 5);

-- --------------------------------------------------------

--
-- Table structure for table `DOCTOR`
--

DROP TABLE IF EXISTS `DOCTOR`;
CREATE TABLE `DOCTOR` (
  `DOCTOR_ID` int(11) NOT NULL,
  `NAME` varchar(20) NOT NULL,
  `SURNAME` varchar(20) NOT NULL,
  `PRACTICE_NUMBER` varchar(20) NOT NULL,
  `SPECIALIZATION` varchar(30) NOT NULL,
  `PASSWORD` varchar(20) NOT NULL,
  `AUTHORIZED` varchar(5) DEFAULT 'false'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `DOCTOR`
--

INSERT INTO `DOCTOR` (`DOCTOR_ID`, `NAME`, `SURNAME`, `PRACTICE_NUMBER`, `SPECIALIZATION`, `PASSWORD`, `AUTHORIZED`) VALUES
(101, 'Nhonipho', 'Mkhize', 'A524', 'Umpopoli', 'nhlo@12', 'true'),
(102, 'Mzoneli', 'Klein', 'A525', 'teeth', 'mzo@1', 'true'),
(103, 'Joseph', 'Adams', 'A526', 'cleaning', 'adam', 'false');

-- --------------------------------------------------------

--
-- Table structure for table `MEDICAL_CONDTION`
--

DROP TABLE IF EXISTS `MEDICAL_CONDTION`;
CREATE TABLE `MEDICAL_CONDTION` (
  `MED_CONDITION_ID` int(11) NOT NULL,
  `HEART_CONDITION` varchar(100) DEFAULT '0',
  `EPILEPSY` varchar(100) DEFAULT '0',
  `ALLERGIES` varchar(100) NOT NULL,
  `DENTAL_SEDATION` varchar(100) DEFAULT '0',
  `BLEEDING_DISORDER` varchar(100) DEFAULT '0',
  `TEETH_SENSITIVE` varchar(100) DEFAULT '0',
  `MEDICATION` varchar(100) NOT NULL,
  `SORES_IN_MOUTH` varchar(100) DEFAULT '0',
  `TOUNGE_DIAGNOSIS` varchar(100) DEFAULT '0',
  `HIV_AIDS` varchar(100) DEFAULT '0',
  `MEDICAL_AID_NAME` varchar(20) DEFAULT NULL,
  `MEDICAL_AID_NUMBER` int(6) DEFAULT '0',
  `FAMILY_DR_NAME` varchar(20) DEFAULT NULL,
  `FAMILY_DR_CONTACT` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `MEDICAL_CONDTION`
--

INSERT INTO `MEDICAL_CONDTION` (`MED_CONDITION_ID`, `HEART_CONDITION`, `EPILEPSY`, `ALLERGIES`, `DENTAL_SEDATION`, `BLEEDING_DISORDER`, `TEETH_SENSITIVE`, `MEDICATION`, `SORES_IN_MOUTH`, `TOUNGE_DIAGNOSIS`, `HIV_AIDS`, `MEDICAL_AID_NAME`, `MEDICAL_AID_NUMBER`, `FAMILY_DR_NAME`, `FAMILY_DR_CONTACT`) VALUES
(9, 'heart attack', 'clonic seizures', 'Bonding Material', 'Intravenous (IV) Sedation', 'plaque removal', 'Gum recession', 'Analgesics: reducing pain', 'Herpes simplex', 'tongue problems ', 'Negative', 'Discover Health', 12233, 'Samuel', '082 910 0885'),
(10, 'heart valve', 'myoclonic seizures', 'peanuts', 'Oral sedation', 'Von Willebrand\'s disease', 'Gum recession', 'acetaminophen (Tylenol)', 'Herpes simplex', 'tongue problems ', 'Positive', 'Bonitas', 24509, 'John', '072 451 6321'),
(11, 'heart valve', 'myoclonic seizures', 'peanuts', 'Oral sedation', 'Von Willebrand\'s disease', 'Gum recession', 'acetaminophen (Tylenol)', 'Herpes simplex', 'tongue problems ', 'Positive', 'Bonitas', 24509, 'John', '072 451 6321'),
(12, 'beating', 'byhogiod', 'meet', 'teethously', 'orgelous', 'sensoiud', 'Crysperious', 'moutnymys', 'dygoiusis', 'negative', 'Discovery', 2153, 'Johannes', '078 567 3245'),
(13, 'goruis', 'poisui', 'gernaso', 'sedacolo', 'bleed', 'terth', 'Grouisiou', 'wounds', 'fsas', 'positve', 'nyway', 1324, 'Bruce', '060 563 8103');

-- --------------------------------------------------------

--
-- Table structure for table `PATIENT`
--

DROP TABLE IF EXISTS `PATIENT`;
CREATE TABLE `PATIENT` (
  `PATIENT_ID` int(11) NOT NULL,
  `NAME` varchar(20) NOT NULL,
  `SURNAME` varchar(20) NOT NULL,
  `DOB` varchar(15) NOT NULL,
  `ID_OR_PASSORT_NUMBER` varchar(20) NOT NULL,
  `GENDER` varchar(10) NOT NULL,
  `MOBILE_NUMBER` varchar(11) NOT NULL,
  `EMAIL` varchar(20) NOT NULL,
  `PASSWORD` varchar(20) NOT NULL DEFAULT '123',
  `OCCUPATION` varchar(20) NOT NULL,
  `ADDRESS_ID` int(11) NOT NULL,
  `MED_CONDITION_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `PATIENT`
--

INSERT INTO `PATIENT` (`PATIENT_ID`, `NAME`, `SURNAME`, `DOB`, `ID_OR_PASSORT_NUMBER`, `GENDER`, `MOBILE_NUMBER`, `EMAIL`, `PASSWORD`, `OCCUPATION`, `ADDRESS_ID`, `MED_CONDITION_ID`) VALUES
(5551, 'Khethelo', 'Mbokazi', '10-11-1994', '9411108965081', 'Female', '0817658896', 'mboka@gmail.com', 'KHETH@2', 'System Analyst', 5, 10),
(5552, 'John', 'Chalos', '03-05-1996', '9605035689084', 'Male', '0737358947', 'john@gmail.com', 'mypass', 'Administrator', 4, 10),
(5553, 'Roberto', 'Carlos', '10/03/1993', '9303105689084', 'Male', '0795674423', 'carlo1@yahoo', 'carlos', 'Administrator', 4, 10);

-- --------------------------------------------------------

--
-- Table structure for table `RECEPTIONIST`
--

DROP TABLE IF EXISTS `RECEPTIONIST`;
CREATE TABLE `RECEPTIONIST` (
  `RECEPTIONIST_ID` int(11) NOT NULL,
  `NAME` varchar(20) NOT NULL,
  `SURNAME` varchar(20) NOT NULL,
  `EMAIL` varchar(20) NOT NULL,
  `PASSWORD` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `RECEPTIONIST`
--

INSERT INTO `RECEPTIONIST` (`RECEPTIONIST_ID`, `NAME`, `SURNAME`, `EMAIL`, `PASSWORD`) VALUES
(1, 'Zanele', 'Mathe', 'zanale@gmail.com', 'Mathen1@23'),
(1431, 'Jenny', 'Williams', 'jenny@gmail.com', 'my_jeccy'),
(1432, 'Amanda', 'Clock', 'amanad@gmail.com', 'clockamanda3'),
(1433, 'Thuba', 'Mngomezulu', 'thuba@gmail.com', 'thuba@2'),
(1434, 'Sabelo', 'Gazu', 'sabelo@gmail.com', 'sabelo@2'),
(1435, 'Moses', 'Mohamed', 'mohamed@gmail.com', '123moses'),
(1436, 'Thobile', 'Nxele', 'thobile@gmail.com', 'nxele123'),
(1437, 'Proud', 'Sachinda', 'sachind@gmail.com', 'sachinda'),
(1438, 'Lungile', 'Duma', 'duma@gmail.com', 'lungie123'),
(1439, 'thembi', 'Zulu', 'thembi@gmail.com', 'zu123'),
(1440, 'luyanda', 'Makhoba', 'luyanda@gmail.com', '12');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ADDRESS`
--
ALTER TABLE `ADDRESS`
  ADD PRIMARY KEY (`ADDRESS_ID`);

--
-- Indexes for table `ADMINISTRATOR`
--
ALTER TABLE `ADMINISTRATOR`
  ADD PRIMARY KEY (`ADMIN_ID`);

--
-- Indexes for table `APPOINTMENT`
--
ALTER TABLE `APPOINTMENT`
  ADD PRIMARY KEY (`APPOINTMENT_ID`),
  ADD KEY `DOCTOR_ID` (`DOCTOR_ID`),
  ADD KEY `RECEPTIONIST_ID` (`RECEPTIONIST_ID`),
  ADD KEY `PATIENT_ID` (`PATIENT_ID`);

--
-- Indexes for table `AUTHORIZATION`
--
ALTER TABLE `AUTHORIZATION`
  ADD PRIMARY KEY (`ADMIN_ID`),
  ADD KEY `DOCTOR_ID` (`DOCTOR_ID`);

--
-- Indexes for table `CONSULTATION`
--
ALTER TABLE `CONSULTATION`
  ADD PRIMARY KEY (`CONSULTATION_ID`),
  ADD KEY `APPOINTMENT_ID` (`APPOINTMENT_ID`);

--
-- Indexes for table `DOCTOR`
--
ALTER TABLE `DOCTOR`
  ADD PRIMARY KEY (`DOCTOR_ID`),
  ADD UNIQUE KEY `PRACTICE_NUMBER` (`PRACTICE_NUMBER`);

--
-- Indexes for table `MEDICAL_CONDTION`
--
ALTER TABLE `MEDICAL_CONDTION`
  ADD PRIMARY KEY (`MED_CONDITION_ID`);

--
-- Indexes for table `PATIENT`
--
ALTER TABLE `PATIENT`
  ADD PRIMARY KEY (`PATIENT_ID`),
  ADD UNIQUE KEY `EMAIL` (`EMAIL`),
  ADD UNIQUE KEY `ID_OR_PASSORT_NUMBER` (`ID_OR_PASSORT_NUMBER`),
  ADD KEY `PATIENT_ibfk_2` (`MED_CONDITION_ID`),
  ADD KEY `ADDRESS_ID` (`ADDRESS_ID`);

--
-- Indexes for table `RECEPTIONIST`
--
ALTER TABLE `RECEPTIONIST`
  ADD PRIMARY KEY (`RECEPTIONIST_ID`),
  ADD UNIQUE KEY `EMAIL` (`EMAIL`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `ADDRESS`
--
ALTER TABLE `ADDRESS`
  MODIFY `ADDRESS_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `APPOINTMENT`
--
ALTER TABLE `APPOINTMENT`
  MODIFY `APPOINTMENT_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;
--
-- AUTO_INCREMENT for table `CONSULTATION`
--
ALTER TABLE `CONSULTATION`
  MODIFY `CONSULTATION_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;
--
-- AUTO_INCREMENT for table `DOCTOR`
--
ALTER TABLE `DOCTOR`
  MODIFY `DOCTOR_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=104;
--
-- AUTO_INCREMENT for table `MEDICAL_CONDTION`
--
ALTER TABLE `MEDICAL_CONDTION`
  MODIFY `MED_CONDITION_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT for table `PATIENT`
--
ALTER TABLE `PATIENT`
  MODIFY `PATIENT_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5554;
--
-- AUTO_INCREMENT for table `RECEPTIONIST`
--
ALTER TABLE `RECEPTIONIST`
  MODIFY `RECEPTIONIST_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1441;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `APPOINTMENT`
--
ALTER TABLE `APPOINTMENT`
  ADD CONSTRAINT `APPOINTMENT_ibfk_2` FOREIGN KEY (`DOCTOR_ID`) REFERENCES `DOCTOR` (`DOCTOR_ID`),
  ADD CONSTRAINT `APPOINTMENT_ibfk_3` FOREIGN KEY (`RECEPTIONIST_ID`) REFERENCES `RECEPTIONIST` (`RECEPTIONIST_ID`),
  ADD CONSTRAINT `APPOINTMENT_ibfk_4` FOREIGN KEY (`PATIENT_ID`) REFERENCES `PATIENT` (`PATIENT_ID`);

--
-- Constraints for table `AUTHORIZATION`
--
ALTER TABLE `AUTHORIZATION`
  ADD CONSTRAINT `AUTHORIZATION_ibfk_1` FOREIGN KEY (`DOCTOR_ID`) REFERENCES `DOCTOR` (`DOCTOR_ID`);

--
-- Constraints for table `CONSULTATION`
--
ALTER TABLE `CONSULTATION`
  ADD CONSTRAINT `CONSULTATION_ibfk_1` FOREIGN KEY (`APPOINTMENT_ID`) REFERENCES `APPOINTMENT` (`APPOINTMENT_ID`);

--
-- Constraints for table `PATIENT`
--
ALTER TABLE `PATIENT`
  ADD CONSTRAINT `PATIENT_ibfk_2` FOREIGN KEY (`MED_CONDITION_ID`) REFERENCES `MEDICAL_CONDTION` (`MED_CONDITION_ID`),
  ADD CONSTRAINT `PATIENT_ibfk_3` FOREIGN KEY (`ADDRESS_ID`) REFERENCES `ADDRESS` (`ADDRESS_ID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
