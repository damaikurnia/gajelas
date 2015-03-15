CREATE DATABASE  IF NOT EXISTS `airbersih` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `airbersih`;
-- MySQL dump 10.13  Distrib 5.5.41, for debian-linux-gnu (x86_64)
--
-- Host: 127.0.0.1    Database: airbersih
-- ------------------------------------------------------
-- Server version	5.5.41-0ubuntu0.14.04.1

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
-- Table structure for table `anggota`
--

DROP TABLE IF EXISTS `anggota`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `anggota` (
  `idanggota` varchar(10) NOT NULL,
  `namaanggota` varchar(100) DEFAULT NULL,
  `pekerjaan` varchar(100) DEFAULT NULL,
  `alamat` varchar(200) DEFAULT NULL,
  `telp` varchar(20) DEFAULT NULL,
  `noKTP` varchar(20) NOT NULL,
  `rt` int(3) DEFAULT NULL,
  `rw` int(3) DEFAULT NULL,
  `dusun` varchar(50) DEFAULT NULL,
  `desa` varchar(50) DEFAULT NULL,
  `kota` varchar(50) DEFAULT NULL,
  `provinsi` varchar(50) DEFAULT NULL,
  `kecamatan` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idanggota`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `anggota`
--

LOCK TABLES `anggota` WRITE;
/*!40000 ALTER TABLE `anggota` DISABLE KEYS */;
INSERT INTO `anggota` VALUES ('105314024','Damai Kurnia Adhi','Pengacara','JL Durian IV No 19','081222333856','3603120109920002',10,8,'Pondok Makmur','Kutabaru','Tangerang','Banten','Pasarkemis'),('105314044','Adit','Pengacara','JL Melati','08192231421','1231242131355',2,10,'Pondok Indah','Kutabaru','Tangerang','Banten','Pasarkemis'),('105314064','Roy','Ngasah Akik','Jl Paingan','081922231124','4422118827312',1,2,'Timbulrejo','Depok','Sleman','Yogyakarta','Maguwoharjo'),('105314066','Aweng','Mahasiswa','Gang Gori','081222313242','7782736288192',4,1,'Timbulrejo','Depok','Sleman','Yogyakarta','Maguwoharjo');
/*!40000 ALTER TABLE `anggota` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `barang`
--

DROP TABLE IF EXISTS `barang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `barang` (
  `idbarang` varchar(10) NOT NULL,
  `namabarang` varchar(100) NOT NULL,
  `stokbarang` int(100) NOT NULL,
  `totalaset` double NOT NULL,
  PRIMARY KEY (`idbarang`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `barang`
--

LOCK TABLES `barang` WRITE;
/*!40000 ALTER TABLE `barang` DISABLE KEYS */;
INSERT INTO `barang` VALUES ('BRG1','Kaporit',14,100000),('BRG2','Filter',102,50000);
/*!40000 ALTER TABLE `barang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`username`,`password`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES ('AIR','AIR');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pemakaian`
--

DROP TABLE IF EXISTS `pemakaian`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pemakaian` (
  `notransaksi` varchar(50) NOT NULL,
  `idanggota` varchar(30) DEFAULT NULL,
  `airlunas` double DEFAULT NULL,
  `airterakhir` double DEFAULT NULL,
  `airdibayar` double DEFAULT NULL,
  `bulan` varchar(10) DEFAULT NULL,
  `tahun` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`notransaksi`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pemakaian`
--

LOCK TABLES `pemakaian` WRITE;
/*!40000 ALTER TABLE `pemakaian` DISABLE KEYS */;
INSERT INTO `pemakaian` VALUES ('105314024-1','105314024',0,150,150,'MARET','2015'),('105314024-2','105314024',150,0,0,'MARET','2015'),('105314044-1','105314044',0,500,500,'MARET','2015'),('105314044-2','105314044',500,0,0,'MARET','2015'),('105314064-1','105314064',0,0,0,'MARET','2015'),('105314066-1','105314066',0,0,0,'MARET','2015');
/*!40000 ALTER TABLE `pemakaian` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profil`
--

DROP TABLE IF EXISTS `profil`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `profil` (
  `idprofil` int(11) NOT NULL,
  `namadesa` varchar(100) NOT NULL,
  `alamatdesa` varchar(200) NOT NULL,
  `notelp` varchar(45) NOT NULL,
  PRIMARY KEY (`idprofil`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profil`
--

LOCK TABLES `profil` WRITE;
/*!40000 ALTER TABLE `profil` DISABLE KEYS */;
INSERT INTO `profil` VALUES (0,'DESA SUKAMUNDUR','JL PAINGAN MAGUWOHARJO','081212321211');
/*!40000 ALTER TABLE `profil` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transaksi`
--

DROP TABLE IF EXISTS `transaksi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `transaksi` (
  `notransaksi` varchar(20) NOT NULL,
  `idbarang` varchar(10) NOT NULL,
  `idanggota` varchar(10) NOT NULL,
  `tanggaltransaksi` date DEFAULT NULL,
  `jenistransaksi` varchar(10) DEFAULT NULL,
  `jumlah` int(20) DEFAULT NULL,
  `hargasatuan` int(20) DEFAULT NULL,
  `total` int(40) DEFAULT NULL,
  PRIMARY KEY (`notransaksi`,`idbarang`,`idanggota`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transaksi`
--

LOCK TABLES `transaksi` WRITE;
/*!40000 ALTER TABLE `transaksi` DISABLE KEYS */;
INSERT INTO `transaksi` VALUES ('105314024-1','-','105314024','2015-03-09','PENJUALAN',150,500,75000),('105314044-1','-','105314044','2015-03-10','PENJUALAN',500,500,250000),('4613584','BRG1','-','2015-03-02','PEMBELIAN',4,5000,20000),('55474511','BRG2','-','2015-03-02','PEMBELIAN',2,10000,20000);
/*!40000 ALTER TABLE `transaksi` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-03-15 17:35:16
