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
  `logo` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idanggota`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `anggota`
--

LOCK TABLES `anggota` WRITE;
/*!40000 ALTER TABLE `anggota` DISABLE KEYS */;
INSERT INTO `anggota` VALUES ('105314024','Adhi','Pengacara','JL Durian IV','081222333856','3603120109920002',10,8,'Pondok Makmur','Kutabaru','Tangerang','Banten','Pasar Kemis','105314024.jpg'),('105314031','Agus','Karyawan','JL Paingan 2','081921311231','129839127123',2,10,'Peron','Bleberan','Gunungkidul','DIY','Playen','105314031.jpg'),('105314044','Adit','Pengacara','JL Melati no 10','081922312312','1232173687213',2,1,'Paingan','Depok','Sleman','Yogyakarta','Maguwoharjo','105314044.jpg'),('105314064','Roy','Jual Akik','Jl Paingan','08192231421','3450192210029993',2,1,'Timbulrejo','Depok','Sleman','Yogyakarta','Maguwoharjo','105314064.jpg'),('105314066','Aweng','Mahasiswa','Gang Gori','08192221123','213124213213',1,2,'Timbulrejo','Depok','Sleman','Yogyakarta','Maguwoharjo','105314066.jpg');
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
INSERT INTO `barang` VALUES ('BRG1','Kaporit',14,100000),('BRG2','Filter',102,50000),('BRG3','Pipa',220,400000);
/*!40000 ALTER TABLE `barang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `konfigurasi`
--

DROP TABLE IF EXISTS `konfigurasi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `konfigurasi` (
  `idkonfigurasi` int(11) NOT NULL,
  `abodemen` int(11) NOT NULL,
  `pertama` int(11) NOT NULL,
  `kedua` int(11) NOT NULL,
  `selanjutnya` int(11) NOT NULL,
  `bagimeter` int(11) NOT NULL,
  `tglterakhir` int(11) NOT NULL,
  `denda` int(11) NOT NULL,
  `registrasi` int(11) NOT NULL,
  PRIMARY KEY (`idkonfigurasi`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `konfigurasi`
--

LOCK TABLES `konfigurasi` WRITE;
/*!40000 ALTER TABLE `konfigurasi` DISABLE KEYS */;
INSERT INTO `konfigurasi` VALUES (1,2000,2500,3000,5000,10,10,5000,800000);
/*!40000 ALTER TABLE `konfigurasi` ENABLE KEYS */;
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
  `jatuhtempo` date DEFAULT NULL,
  PRIMARY KEY (`notransaksi`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pemakaian`
--

LOCK TABLES `pemakaian` WRITE;
/*!40000 ALTER TABLE `pemakaian` DISABLE KEYS */;
INSERT INTO `pemakaian` VALUES ('105314024-1','105314024',0,20,20,'JANUARI','2015-02-10'),('105314024-2','105314024',20,50,30,'FEBRUARI','2015-03-10'),('105314024-3','105314024',50,0,0,'MARET','2015-04-10'),('105314031-1','105314031',30,30,0,'MARET','2015-04-10'),('105314031-2','105314031',30,0,0,'APRIL','2015-05-10'),('105314044-1','105314044',10,10,0,'MARET','2015-04-10'),('105314044-2','105314044',10,10,0,'APRIL','2015-05-10'),('105314064-1','105314064',50,50,0,'MARET','2015-04-10'),('105314066-1','105314066',30,30,0,'MARET','2015-04-10');
/*!40000 ALTER TABLE `pemakaian` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pengeluaran`
--

DROP TABLE IF EXISTS `pengeluaran`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pengeluaran` (
  `kode` varchar(4) NOT NULL,
  `namapengeluaran` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`kode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pengeluaran`
--

LOCK TABLES `pengeluaran` WRITE;
/*!40000 ALTER TABLE `pengeluaran` DISABLE KEYS */;
INSERT INTO `pengeluaran` VALUES ('P1','Biaya Solar'),('P2','Biaya Listrik'),('P3','Gaji Karyawan'),('P4','Biaya Tak Terduga'),('P5','Biaya Perbaikan'),('P6','Biaya Lain Lain');
/*!40000 ALTER TABLE `pengeluaran` ENABLE KEYS */;
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
  `notelp` varchar(15) NOT NULL,
  `desa` varchar(45) NOT NULL,
  `kecamatan` varchar(45) NOT NULL,
  `kabupaten` varchar(45) NOT NULL,
  `provinsi` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `logo` varchar(45) NOT NULL,
  PRIMARY KEY (`idprofil`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profil`
--

LOCK TABLES `profil` WRITE;
/*!40000 ALTER TABLE `profil` DISABLE KEYS */;
INSERT INTO `profil` VALUES (0,'BLEBERAN','PADUKUHAN','081212321211','BLEBERAN','PLAYEN','GUNUNGKIDUL','DIY','bleberan@gmail.com','logodesa.jpg');
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
  `jenistransaksi` varchar(15) DEFAULT NULL,
  `jumlah` int(20) DEFAULT NULL,
  `hargasatuan` int(20) DEFAULT NULL,
  `denda` int(40) DEFAULT NULL,
  `total` int(40) DEFAULT NULL,
  PRIMARY KEY (`notransaksi`,`idbarang`,`idanggota`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transaksi`
--

LOCK TABLES `transaksi` WRITE;
/*!40000 ALTER TABLE `transaksi` DISABLE KEYS */;
INSERT INTO `transaksi` VALUES ('105314024-0','-','105314024','2015-01-24','DAFTAR',1,50000,0,50000),('105314031-0','-','105314031','2015-03-31','DAFTAR',0,50000,0,50000),('105314031-1','-','105314031','2015-03-31','PENJUALAN',30,1000,0,30000),('105314044-0','-','105314044','2015-03-25','DAFTAR',1,50000,0,50000),('105314044-1','-','105314044','2015-03-31','PENJUALAN',10,1000,0,10000),('105314064-0','-','105314064','2015-03-19','DAFTAR',1,50000,0,50000),('105314064-1','-','105314064','2015-03-24','PENJUALAN',50,500,0,25000),('105314066-0','-','105314066','2015-03-23','DAFTAR',1,50000,0,50000),('105314066-1','-','105314066','2015-03-31','PENJUALAN',30,1000,0,30000),('217638712','BRG3','-','2015-03-31','PEMBELIAN',20,20000,0,400000),('4613584','BRG1','-','2015-03-02','PEMBELIAN',4,5000,0,20000),('55474511','BRG2','-','2015-03-02','PEMBELIAN',2,10000,0,20000),('P1-201503','P1','-','2015-03-31','PENGELUARAN',0,0,0,100000),('P2-201503','P2','-','2015-03-31','PENGELUARAN',0,0,0,100000),('P3-201503','P3','-','2015-03-28','PENGELUARAN',0,0,0,50000),('P4-201503','P4','-','2015-03-31','PENGELUARAN',0,0,0,5000),('P5-201503','P5','-','2015-03-31','PENGELUARAN',0,0,0,0),('P6-201503','P6','-','2015-03-31','PENGELUARAN',0,0,0,0);
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

-- Dump completed on 2015-04-04  3:30:00
