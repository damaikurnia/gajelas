/*
SQLyog Enterprise - MySQL GUI v8.05 
MySQL - 5.5.16 : Database - bumdes
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`bumdes` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `bumdes`;

/*Table structure for table `anggota` */

DROP TABLE IF EXISTS `anggota`;

CREATE TABLE `anggota` (
  `nik` varchar(200) NOT NULL,
  `nama` varchar(200) DEFAULT NULL,
  `ttl` varchar(200) DEFAULT NULL,
  `telp` varchar(20) DEFAULT NULL,
  `alamat` text,
  `tgl_bergabung` varchar(20) DEFAULT NULL,
  `simpananPokok` decimal(50,0) DEFAULT NULL,
  PRIMARY KEY (`nik`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `anggota` */

insert  into `anggota`(`nik`,`nama`,`ttl`,`telp`,`alamat`,`tgl_bergabung`,`simpananPokok`) values ('3603120109920002','Damai Kurnia Adhi','Tangerang,01-Sep-1992','081911098981','JL Melati No 10 Paingan \nTimbulrejo Maguwoharjo\nDepok Sleman Yogyakarta','09-May-2014','200000'),('6106152505900003','Rafael Aweng','Sintang,25-May-1991','085245843743','Jln.MT.Haryono Gg.Sehat No.17 \nSintang Kal-Bar','09-May-2014','200000');

/*Table structure for table `bunga` */

DROP TABLE IF EXISTS `bunga`;

CREATE TABLE `bunga` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `30x` double(10,0) DEFAULT '0',
  `4x` double(10,0) DEFAULT '0',
  `2x` double(10,0) DEFAULT '0',
  `1x` double(10,0) DEFAULT '0',
  `3b` double(10,0) DEFAULT '0',
  `6b` double(10,0) DEFAULT '0',
  `9b` double(10,0) DEFAULT '0',
  `12b` double(10,0) DEFAULT '0',
  `18b` double(10,0) DEFAULT '0',
  `24b` double(10,0) DEFAULT '0',
  `36b` double(10,0) DEFAULT '0',
  `48b` double(10,0) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `bunga` */

insert  into `bunga`(`id`,`30x`,`4x`,`2x`,`1x`,`3b`,`6b`,`9b`,`12b`,`18b`,`24b`,`36b`,`48b`) values (1,1,2,2,2,2,2,2,2,2,2,2,2);

/*Table structure for table `koderekening` */

DROP TABLE IF EXISTS `koderekening`;

CREATE TABLE `koderekening` (
  `noRek` int(5) NOT NULL,
  `Keterangan` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`noRek`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `koderekening` */

insert  into `koderekening`(`noRek`,`Keterangan`) values (1100,'Aset Lancar'),(1111,'Kas Kecil'),(1112,'Kas di Bank'),(1121,'Piutang Dagang'),(1131,'Persediaan Barang Dagangan'),(1141,'Perlengkapan Kantor'),(1200,'Aset Tetap'),(1211,'Peralaran Kantor'),(1212,'Akumulasi Penyusutan Peralatan Kantor'),(1221,'Tanah'),(2111,'Utang Dagang'),(3111,'Modal Usaha'),(4111,'Penjualan Barang Dagangan'),(4112,'Potongan Penjualan'),(4113,'Harga Pokok Penjualan'),(4114,'Pendapatan Jasa Giro Bank'),(5111,'Beban Konsumsi'),(5112,'Beban Listrik'),(5121,'Beban Penyusutan Peralatan Kantor'),(5211,'Beban Administrasi Bank');

/*Table structure for table `login` */

DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `no` varchar(1) NOT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `login` */

insert  into `login`(`no`,`username`,`password`) values ('1','BUMDES','BUMDES');

/*Table structure for table `modal_sp` */

DROP TABLE IF EXISTS `modal_sp`;

CREATE TABLE `modal_sp` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tanggal` date DEFAULT NULL,
  `penerimaanKas` decimal(50,0) DEFAULT NULL,
  `pengeluaranKas` decimal(50,0) DEFAULT NULL,
  `keterangan` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `modal_sp` */

insert  into `modal_sp`(`id`,`tanggal`,`penerimaanKas`,`pengeluaranKas`,`keterangan`) values (2,'2014-06-03','5000000','0','Modal KSM');

/*Table structure for table `per_anggota` */

DROP TABLE IF EXISTS `per_anggota`;

CREATE TABLE `per_anggota` (
  `noIdentitas` varchar(20) NOT NULL,
  `namaAnggota` varchar(100) DEFAULT NULL,
  `alamat` varchar(200) DEFAULT NULL,
  `noTelp` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`noIdentitas`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `per_anggota` */

/*Table structure for table `per_barang` */

DROP TABLE IF EXISTS `per_barang`;

CREATE TABLE `per_barang` (
  `kodeBarang` varchar(10) NOT NULL,
  `namaBarang` varchar(100) DEFAULT NULL,
  `jumlahStok` int(50) DEFAULT NULL,
  `satuanBarang` varchar(10) DEFAULT NULL,
  `HargaSatuan` decimal(50,0) DEFAULT NULL,
  `HrgBarang` decimal(50,0) DEFAULT NULL,
  PRIMARY KEY (`kodeBarang`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `per_barang` */

insert  into `per_barang`(`kodeBarang`,`namaBarang`,`jumlahStok`,`satuanBarang`,`HargaSatuan`,`HrgBarang`) values ('BRG-01','Buku',14,'pcs','10000','140000'),('BRG-02','Pensil',77,'buah','950','73150'),('BRG-03','Sayur',50,'ikat','2000','100000'),('BRG-04','Ayam',200,'ekor','20000','4000000');

/*Table structure for table `per_modal` */

DROP TABLE IF EXISTS `per_modal`;

CREATE TABLE `per_modal` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tanggal` date DEFAULT NULL,
  `penerimaanKas` decimal(50,0) DEFAULT NULL,
  `pengeluaranKas` decimal(50,0) DEFAULT NULL,
  `Keterangan` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `per_modal` */

insert  into `per_modal`(`id`,`tanggal`,`penerimaanKas`,`pengeluaranKas`,`Keterangan`) values (2,'2014-06-19','5000000','0','MODAL PERDAGANGAN');

/*Table structure for table `per_piu` */

DROP TABLE IF EXISTS `per_piu`;

CREATE TABLE `per_piu` (
  `kodeTransaksi` int(30) DEFAULT NULL,
  `tanggal` date DEFAULT NULL,
  `total` decimal(50,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `per_piu` */

/*Table structure for table `per_transaksi` */

DROP TABLE IF EXISTS `per_transaksi`;

CREATE TABLE `per_transaksi` (
  `no` int(30) NOT NULL AUTO_INCREMENT,
  `kodeTransaksi` varchar(30) DEFAULT NULL,
  `idBarang` varchar(10) DEFAULT NULL,
  `jumlah` int(11) DEFAULT NULL,
  `totalPenjualan` decimal(50,0) DEFAULT NULL,
  `idPembeli` varchar(100) DEFAULT NULL,
  `jenisPembayaran` varchar(10) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL,
  `tanggal` date DEFAULT NULL,
  PRIMARY KEY (`no`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

/*Data for the table `per_transaksi` */

/*Table structure for table `per_utg` */

DROP TABLE IF EXISTS `per_utg`;

CREATE TABLE `per_utg` (
  `kodeTransaksi` int(30) NOT NULL,
  `tanggal` date DEFAULT NULL,
  `total` decimal(50,0) DEFAULT NULL,
  PRIMARY KEY (`kodeTransaksi`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `per_utg` */

/*Table structure for table `pinjaman` */

DROP TABLE IF EXISTS `pinjaman`;

CREATE TABLE `pinjaman` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `nik` varchar(200) DEFAULT NULL,
  `pokok_pinjaman` int(50) DEFAULT '0',
  `bunga_pokok` int(50) DEFAULT '0',
  `angsuran_pokok` int(50) DEFAULT '0',
  `angsuran_bunga` int(50) DEFAULT '0',
  `denda` int(50) DEFAULT '0',
  `tgl` date DEFAULT NULL,
  `tgl_berakhir` varchar(20) DEFAULT NULL,
  `lamaPinjam` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

/*Data for the table `pinjaman` */

insert  into `pinjaman`(`id`,`nik`,`pokok_pinjaman`,`bunga_pokok`,`angsuran_pokok`,`angsuran_bunga`,`denda`,`tgl`,`tgl_berakhir`,`lamaPinjam`) values (14,'6106152505900003',2000000,40000,0,0,0,'2014-05-22','22-AUG-2014','3 BULAN');

/*Table structure for table `profil` */

DROP TABLE IF EXISTS `profil`;

CREATE TABLE `profil` (
  `no` varchar(2) NOT NULL,
  `namaBumdes` varchar(100) DEFAULT NULL,
  `alamatBumdes` varchar(100) DEFAULT NULL,
  `NoTelpBumdes` varchar(100) DEFAULT NULL,
  `webbumdes` varchar(100) DEFAULT NULL,
  `emailbumdes` varchar(100) DEFAULT NULL,
  `namadesa` varchar(100) DEFAULT NULL,
  `alamatdesa` varchar(100) DEFAULT NULL,
  `provinsidesa` varchar(100) DEFAULT NULL,
  `kabupaten` varchar(100) DEFAULT NULL,
  `kecamatan` varchar(100) DEFAULT NULL,
  `dewanKomisaris` varchar(100) DEFAULT NULL,
  `direksi` varchar(100) DEFAULT NULL,
  `ka_desa` varchar(100) DEFAULT NULL,
  `badanPengawas` varchar(100) DEFAULT NULL,
  `tahun` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `profil` */

insert  into `profil`(`no`,`namaBumdes`,`alamatBumdes`,`NoTelpBumdes`,`webbumdes`,`emailbumdes`,`namadesa`,`alamatdesa`,`provinsidesa`,`kabupaten`,`kecamatan`,`dewanKomisaris`,`direksi`,`ka_desa`,`badanPengawas`,`tahun`) values ('1','Badan Usaha Wilayah Depok','JL Paingan Maguwoharjo\n Paingan','081911098981','www.usd.ac.id','usd@yahoo.com','DESA SUKAMAJU','JL Melati No 10 Paingan \nTimbulrejo Maguwoharjo\nYogyakarta','Yogyakarta','Sleman','Depok','AWENG','ADHI','ROY','ADIT','2014');

/*Table structure for table `simpanan` */

DROP TABLE IF EXISTS `simpanan`;

CREATE TABLE `simpanan` (
  `noTransaksi` varchar(100) NOT NULL,
  `nik` varchar(200) DEFAULT NULL,
  `setorWajib` decimal(50,0) DEFAULT NULL,
  `setorSukarela` decimal(50,0) DEFAULT NULL,
  `penarikan` decimal(50,0) DEFAULT NULL,
  `tgl` date DEFAULT NULL,
  PRIMARY KEY (`noTransaksi`),
  KEY `nik` (`nik`),
  CONSTRAINT `nik` FOREIGN KEY (`nik`) REFERENCES `anggota` (`nik`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `simpanan` */

insert  into `simpanan`(`noTransaksi`,`nik`,`setorWajib`,`setorSukarela`,`penarikan`,`tgl`) values ('TS1','6106152505900003','100000','50000','0','2014-05-09'),('TS2','6106152505900003','25000','1000000','0','2014-05-15'),('TS3','6106152505900003','0','0','500000','2014-05-15'),('TS4','3603120109920002','0','0','0','2014-05-22'),('TS5','3603120109920002','50000','1500000','0','2014-05-30');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
