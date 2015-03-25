/*
SQLyog Enterprise - MySQL GUI v8.05 
MySQL - 5.5.16 : Database - airbersih
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`airbersih` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `airbersih`;

/*Table structure for table `anggota` */

DROP TABLE IF EXISTS `anggota`;

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

/*Data for the table `anggota` */

insert  into `anggota`(`idanggota`,`namaanggota`,`pekerjaan`,`alamat`,`telp`,`noKTP`,`rt`,`rw`,`dusun`,`desa`,`kota`,`provinsi`,`kecamatan`,`logo`) values ('105314024','Adhi','Pengacara','JL Durian IV','081222333856','3603120109920002',10,8,'Pondok Makmur','Kutabaru','Tangerang','Banten','Pasar Kemis',''),('105314064','Roy','Jual Akik','Jl Paingan','08192231421','3450192210029993',2,1,'Timbulrejo','Depok','Sleman','Yogyakarta','Maguwoharjo','105314064.jpg'),('105314066','Aweng','Mahasiswa','Gang Gori','08192221123','213124213213',1,2,'Timbulrejo','Depok','Sleman','Yogyakarta','Maguwoharjo','');

/*Table structure for table `barang` */

DROP TABLE IF EXISTS `barang`;

CREATE TABLE `barang` (
  `idbarang` varchar(10) NOT NULL,
  `namabarang` varchar(100) NOT NULL,
  `stokbarang` int(100) NOT NULL,
  `totalaset` double NOT NULL,
  PRIMARY KEY (`idbarang`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `barang` */

insert  into `barang`(`idbarang`,`namabarang`,`stokbarang`,`totalaset`) values ('BRG1','Kaporit',14,100000),('BRG2','Filter',102,50000);

/*Table structure for table `login` */

DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`username`,`password`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `login` */

insert  into `login`(`username`,`password`) values ('AIR','AIR');

/*Table structure for table `pemakaian` */

DROP TABLE IF EXISTS `pemakaian`;

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

/*Data for the table `pemakaian` */

insert  into `pemakaian`(`notransaksi`,`idanggota`,`airlunas`,`airterakhir`,`airdibayar`,`bulan`,`jatuhtempo`) values ('105314024-1','105314024',0,20,20,'JANUARI','2015-02-10'),('105314024-2','105314024',20,50,30,'FEBRUARI','2015-03-10'),('105314024-3','105314024',50,0,0,'MARET','2015-04-10'),('105314064-1','105314064',50,50,0,'MARET','2015-04-10'),('105314066-1','105314066',20,20,0,'MARET','2015-04-10'),('123-1','123',0,0,0,'MARET','2015-04-10');

/*Table structure for table `profil` */

DROP TABLE IF EXISTS `profil`;

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

/*Data for the table `profil` */

insert  into `profil`(`idprofil`,`namadesa`,`alamatdesa`,`notelp`,`desa`,`kecamatan`,`kabupaten`,`provinsi`,`email`,`logo`) values (0,'DESA SUKAMUNDUR','JL PAINGAN','081212321211','TIMBULREJO','MAGUWOHARJO','SLEMAN','YOGYAKARTA','airbersih@lulung.com','logodesa.jpg');

/*Table structure for table `transaksi` */

DROP TABLE IF EXISTS `transaksi`;

CREATE TABLE `transaksi` (
  `notransaksi` varchar(20) NOT NULL,
  `idbarang` varchar(10) NOT NULL,
  `idanggota` varchar(10) NOT NULL,
  `tanggaltransaksi` date DEFAULT NULL,
  `jenistransaksi` varchar(10) DEFAULT NULL,
  `jumlah` int(20) DEFAULT NULL,
  `hargasatuan` int(20) DEFAULT NULL,
  `denda` int(40) DEFAULT NULL,
  `total` int(40) DEFAULT NULL,
  PRIMARY KEY (`notransaksi`,`idbarang`,`idanggota`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `transaksi` */

insert  into `transaksi`(`notransaksi`,`idbarang`,`idanggota`,`tanggaltransaksi`,`jenistransaksi`,`jumlah`,`hargasatuan`,`denda`,`total`) values ('105314024-0','-','105314024','2015-01-24','DAFTAR',1,50000,0,50000),('105314064-0','-','105314064','2015-03-19','DAFTAR',1,50000,0,50000),('105314064-1','-','105314064','2015-03-24','PENJUALAN',50,500,0,25000),('105314066-0','-','105314066','2015-03-23','DAFTAR',1,50000,0,50000),('105314066-1','-','105314066','2015-03-23','PENJUALAN',20,500,0,10000),('123-0','-','123','2015-03-25','DAFTAR',1,50000,0,50000),('4613584','BRG1','-','2015-03-02','PEMBELIAN',4,5000,0,20000),('55474511','BRG2','-','2015-03-02','PEMBELIAN',2,10000,0,20000);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
