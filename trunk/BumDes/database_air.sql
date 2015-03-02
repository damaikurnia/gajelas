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
  PRIMARY KEY (`idanggota`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `anggota` */

insert  into `anggota`(`idanggota`,`namaanggota`,`pekerjaan`,`alamat`,`telp`,`noKTP`,`rt`,`rw`,`dusun`,`desa`,`kota`,`provinsi`) values ('105314022','Adit','Mahasiswa','JL Melati no 10 paingan timbulrejo','08122134212','01123124214214',1,2,'Timbulrejo','Maguwoharjo','Yogyakarta','DIY Yogyakarta'),('105314024','DAMAI KURNIA ADHI','PENGACARA','CONDONG CATUR DEPOK SLEMAN YOGYA','081222333856','3603120109920002',0,0,' ',' ',' ',' ');

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

insert  into `barang`(`idbarang`,`namabarang`,`stokbarang`,`totalaset`) values ('BRG1','Kaporit',10,100000);

/*Table structure for table `login` */

DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`username`,`password`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `login` */

insert  into `login`(`username`,`password`) values ('AIR','AIR');

/*Table structure for table `pegawai` */

DROP TABLE IF EXISTS `pegawai`;

CREATE TABLE `pegawai` (
  `idpegawai` varchar(10) NOT NULL,
  `namapegawai` varchar(100) DEFAULT NULL,
  `jabatan` varchar(100) DEFAULT NULL,
  `alamat` varchar(200) DEFAULT NULL,
  `telp` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idpegawai`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `pegawai` */

/*Table structure for table `profil` */

DROP TABLE IF EXISTS `profil`;

CREATE TABLE `profil` (
  `idprofil` int(11) NOT NULL,
  `namadesa` varchar(100) NOT NULL,
  `alamatdesa` varchar(200) NOT NULL,
  `notelp` varchar(45) NOT NULL,
  PRIMARY KEY (`idprofil`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `profil` */

insert  into `profil`(`idprofil`,`namadesa`,`alamatdesa`,`notelp`) values (0,'DESA SUKAMUNDUR','JL PAINGAN MAGUWOHARJO','081212321211');

/*Table structure for table `transaksi` */

DROP TABLE IF EXISTS `transaksi`;

CREATE TABLE `transaksi` (
  `notransaksi` varchar(10) NOT NULL,
  `idbarang` varchar(10) NOT NULL,
  `idanggota` varchar(10) NOT NULL,
  `tanggaltransaksi` date DEFAULT NULL,
  `jenistransaksi` varchar(10) DEFAULT NULL,
  `jumlah` int(20) DEFAULT NULL,
  `hargasatuan` int(20) DEFAULT NULL,
  `total` int(40) DEFAULT NULL,
  PRIMARY KEY (`notransaksi`,`idbarang`,`idanggota`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `transaksi` */

insert  into `transaksi`(`notransaksi`,`idbarang`,`idanggota`,`tanggaltransaksi`,`jenistransaksi`,`jumlah`,`hargasatuan`,`total`) values ('123123','Kaporit','-','2015-02-24','PEMBELIAN',2,2500,5000),('123456','Kaporit','-','2015-02-24','PEMBELIAN',1,10000,10000),('516245','Kapas','-','2015-02-24','PEMBELIAN',100,500,50000);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;