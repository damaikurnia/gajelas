CREATE DATABASE  IF NOT EXISTS `airbersih` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `airbersih`;
-- MySQL dump 10.13  Distrib 5.6.24, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: airbersih
-- ------------------------------------------------------
-- Server version	5.6.24-0ubuntu2

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
-- Table structure for table `akun`
--

DROP TABLE IF EXISTS `akun`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `akun` (
  `kode` varchar(7) NOT NULL,
  `keterangan` varchar(100) DEFAULT NULL,
  `gol_akun` varchar(100) DEFAULT NULL,
  `kel_akun` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`kode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `akun`
--

LOCK TABLES `akun` WRITE;
/*!40000 ALTER TABLE `akun` DISABLE KEYS */;
INSERT INTO `akun` VALUES ('1.1.1','KAS','HARTA_LANCAR','HARTA'),('1.1.2','SURAT BERHARGA','HARTA_LANCAR','HARTA'),('1.1.3','PIUTANG','HARTA_LANCAR','HARTA'),('1.1.4','PERLENGKAPAN','HARTA_LANCAR','HARTA'),('1.2.1','GEDUNG','HARTA_TETAP','HARTA'),('1.2.2','PERALATAN','HARTA_TETAP','HARTA'),('1.2.2.1','AKUM.PENYUSUTAN PERALATAN','AKUMULASI','HARTA'),('1.2.3','TANAH','HARTA_TETAP','HARTA'),('1.2.4','KENDARAAN','HARTA_TETAP','HARTA'),('2.1.1','HUTANG USAHA','HUTANG_LANCAR','HUTANG'),('2.1.2','PEND. DITERIMA DIMUKA','HUTANG_LANCAR','HUTANG'),('2.1.3','BEBAN YG HARUS DIBAYAR','HUTANG_LANCAR','HUTANG'),('3.1.1','MODAL','MODAL_USAHA','MODAL'),('3.2.1','DANA SIMPANAN','PEMBAGIAN_SHU','MODAL'),('3.2.2','DANA SOSIAL','PEMBAGIAN_SHU','MODAL'),('4.1.1','PENDAPATAN AIR','PENDAPATAN_USAHA','PENDAPATAN'),('4.1.2','PENDAPATAN DENDA','PENDAPATAN_USAHA','PENDAPATAN'),('5.1.1','SOLAR','BEBAN_USAHA','BEBAN'),('5.1.2','LISTRIK','BEBAN_USAHA','BEBAN'),('5.1.3','GAJI KARYAWAN','BEBAN_USAHA','BEBAN'),('5.1.4','BIAYA TAK TERDUGA','BEBAN_USAHA','BEBAN'),('5.1.5','BIAYA PERBAIKAN','BEBAN_USAHA','BEBAN'),('5.1.6','BIAYA LAIN LAIN','BEBAN_USAHA','BEBAN'),('5.1.7','BEBAN PERLENGKAPAN','BEBAN_USAHA','BEBAN'),('5.2.1','PAJAK','BEBAN_DILUAR_USAHA','BEBAN');
/*!40000 ALTER TABLE `akun` ENABLE KEYS */;
UNLOCK TABLES;

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
INSERT INTO `anggota` VALUES ('KUL.1','Adhi','Mahasiswa','Durian IV','081222333856','3603120109920002',1,2,'KULON','BLEBERAN','GUNUNGKIDUL','DIY','PLAYEN','KUL.1.jpg');
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
  `kode` varchar(5) NOT NULL,
  `kategori` varchar(45) NOT NULL,
  `tglakumulasi` date DEFAULT NULL,
  `jangkawaktu` int(4) DEFAULT NULL,
  PRIMARY KEY (`idbarang`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `barang`
--

LOCK TABLES `barang` WRITE;
/*!40000 ALTER TABLE `barang` DISABLE KEYS */;
INSERT INTO `barang` VALUES ('BRG-1','Pipa Maspion',9,90000,'1.1.4','PIPA','0000-00-00',0),('BRG-2','Toshiba L635',1,2000000,'1.2.2','KOMPUTER','2016-05-15',2);
/*!40000 ALTER TABLE `barang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `keluhan`
--

DROP TABLE IF EXISTS `keluhan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `keluhan` (
  `idkeluhan` varchar(10) NOT NULL,
  `idanggota` varchar(10) DEFAULT NULL,
  `keterangan` varchar(500) DEFAULT NULL,
  `tglpelaksanaan` date DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idkeluhan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `keluhan`
--

LOCK TABLES `keluhan` WRITE;
/*!40000 ALTER TABLE `keluhan` DISABLE KEYS */;
INSERT INTO `keluhan` VALUES ('KEL-1','KUL.1','Pipa belom dipasang?','2015-05-16','SUDAH');
/*!40000 ALTER TABLE `keluhan` ENABLE KEYS */;
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
-- Table structure for table `neraca`
--

DROP TABLE IF EXISTS `neraca`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `neraca` (
  `no` int(11) NOT NULL AUTO_INCREMENT,
  `kode` varchar(5) DEFAULT NULL,
  `total` decimal(65,0) DEFAULT NULL,
  `tahun` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `neraca`
--

LOCK TABLES `neraca` WRITE;
/*!40000 ALTER TABLE `neraca` DISABLE KEYS */;
/*!40000 ALTER TABLE `neraca` ENABLE KEYS */;
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
INSERT INTO `pemakaian` VALUES ('KUL.1-1','KUL.1',2,2,0,'MEI','2015-06-10');
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
  `namapengeluaran` varchar(100) NOT NULL,
  `kodeakun` varchar(5) NOT NULL,
  PRIMARY KEY (`kode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pengeluaran`
--

LOCK TABLES `pengeluaran` WRITE;
/*!40000 ALTER TABLE `pengeluaran` DISABLE KEYS */;
INSERT INTO `pengeluaran` VALUES ('P-1','Biaya Solar','5.1.1'),('P-2','Biaya Listrik','5.1.2'),('P-3','Gaji Karyawan','5.1.3'),('P-4','Biaya Tak Terduga','5.1.4'),('P-5','Biaya Perbaikan','5.1.5'),('P-6','Biaya Lain Lain','5.1.6');
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
-- Table structure for table `shu`
--

DROP TABLE IF EXISTS `shu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shu` (
  `kode` varchar(5) NOT NULL,
  `persen` int(11) DEFAULT NULL,
  PRIMARY KEY (`kode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shu`
--

LOCK TABLES `shu` WRITE;
/*!40000 ALTER TABLE `shu` DISABLE KEYS */;
INSERT INTO `shu` VALUES ('3.2.1',2),('3.2.2',1),('5.2.1',1);
/*!40000 ALTER TABLE `shu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trans`
--

DROP TABLE IF EXISTS `trans`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `trans` (
  `kodetrans` int(255) NOT NULL AUTO_INCREMENT,
  `kode` varchar(7) DEFAULT NULL,
  `debit` decimal(65,0) DEFAULT NULL,
  `kredit` decimal(65,0) DEFAULT NULL,
  `tanggaltransaksi` date DEFAULT NULL,
  PRIMARY KEY (`kodetrans`)
) ENGINE=InnoDB AUTO_INCREMENT=62 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trans`
--

LOCK TABLES `trans` WRITE;
/*!40000 ALTER TABLE `trans` DISABLE KEYS */;
INSERT INTO `trans` VALUES (1,'1.1.1',1000000,0,'2015-05-15'),(2,'3.1.1',1000000,0,'2015-05-15'),(38,'1.1.1',800000,0,'2015-05-15'),(39,'4.1.1',800000,0,'2015-05-15'),(40,'1.1.4',100000,0,'2015-05-15'),(41,'1.1.1',0,100000,'2015-05-15'),(42,'1.2.2',3000000,0,'2015-05-15'),(43,'2.1.1',3000000,0,'2015-05-15'),(44,'1.1.3',7000,0,'2015-05-16'),(45,'3.1.1',7000,0,'2015-05-16'),(46,'1.1.4',0,10000,'2015-05-16'),(47,'3.1.1',0,10000,'2015-05-16'),(48,'2.1.1',0,3000000,'2015-05-16'),(49,'1.1.1',0,3000000,'2015-05-16'),(50,'5.1.1',100000,0,'2015-05-16'),(51,'1.1.1',0,100000,'2015-05-16'),(52,'3.1.1',0,100000,'2015-05-16'),(53,'1.1.3',0,7000,'2015-05-16'),(54,'4.1.1',7000,0,'2015-05-16'),(55,'1.1.1',7000,0,'2015-05-16'),(56,'3.1.1',0,7000,'2015-05-16'),(57,'1.2.2.1',0,1000000,'2015-05-19'),(58,'3.1.1',0,1000000,'2015-05-19'),(59,'5.1.2',150000,0,'2015-05-19'),(60,'1.1.1',0,150000,'2015-05-19'),(61,'3.1.1',0,150000,'2015-05-19');
/*!40000 ALTER TABLE `trans` ENABLE KEYS */;
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
  `jenistransaksi` varchar(30) DEFAULT NULL,
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
INSERT INTO `transaksi` VALUES ('KUL.1-0','-','KUL.1','2015-05-15','DAFTAR',0,800000,0,800000),('KUL.1-1','-','KUL.1','2015-05-16','PENJUALAN',2,0,0,7000),('P-1-201505','P-1','-','2015-05-16','PENGELUARAN',0,0,0,100000),('P-2-201505','P-2','-','2015-05-19','PENGELUARAN',0,0,0,150000),('P-3-201505','P-3','-','2015-05-16','PENGELUARAN',0,0,0,0),('P-4-201505','P-4','-','2015-05-16','PENGELUARAN',0,0,0,0),('P-5-201505','P-5','-','2015-05-16','PENGELUARAN',0,0,0,0),('P-6-201505','P-6','-','2015-05-16','PENGELUARAN',0,0,0,0),('TB-1','BRG-1','-','2015-05-15','PEMBELIAN',10,0,0,100000),('TB-2','BRG-2','-','2015-05-15','PEMBELIAN',1,0,0,3000000),('TP-1','BRG-1','-','2015-05-16','PEMAKAIAN',1,0,0,10000);
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

-- Dump completed on 2015-05-20 16:41:51
