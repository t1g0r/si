# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.5.5-10.1.35-MariaDB)
# Database: pemrogramanweb
# Generation Time: 2018-09-22 06:37:48 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table mbiodata
# ------------------------------------------------------------

DROP TABLE IF EXISTS `mbiodata`;

CREATE TABLE `mbiodata` (
  `NIP` varchar(10) NOT NULL DEFAULT '',
  `NamaLengkap` varchar(50) DEFAULT NULL,
  `JenisKelamin` char(1) DEFAULT 'P',
  `Alamat` text,
  `Password` varchar(16) DEFAULT NULL,
  `NomorKTP` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`NIP`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `mbiodata` WRITE;
/*!40000 ALTER TABLE `mbiodata` DISABLE KEYS */;

INSERT INTO `mbiodata` (`NIP`, `NamaLengkap`, `JenisKelamin`, `Alamat`, `Password`, `NomorKTP`)
VALUES
	('00000','Badriyah','P','Bekasi','222222','777777777'),
	('11111','Tigor Mangatur Manurung','L','Joglo Baru','12345','123456789'),
	('22222','Badi','L','Kebayoran','12345','987654321'),
	('33333','Jeki','L','Kebayoran','12345','999999999'),
	('44444','Ana','P','Bogor','12345','888888888'),
	('55555','Ayu','P','Bekasi','12345','777777777'),
	('66666','Joko','L','Joglo Baru','12345','123456789'),
	('77777','Saptono','L','Kebayoran','12345','987654321'),
	('88888','Widodo','L','Kebayoran','12345','999999999'),
	('99999','Siti','P','Bogor','12345','888888888');

/*!40000 ALTER TABLE `mbiodata` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
