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

/*Table structure for table `akun` */

DROP TABLE IF EXISTS `akun`;

CREATE TABLE `akun` (
  `kode` varchar(5) NOT NULL,
  `keterangan` varchar(100) DEFAULT NULL,
  `gol_akun` varchar(100) DEFAULT NULL,
  `kel_akun` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`kode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `akun` */

insert  into `akun`(`kode`,`keterangan`,`gol_akun`,`kel_akun`) values ('1.1.1','KAS','HARTA_LANCAR','HARTA'),('1.1.2','SURAT BERHARGA','HARTA_LANCAR','HARTA'),('1.1.3','PIUTANG','HARTA_LANCAR','HARTA'),('1.1.4','PERLENGKAPAN','HARTA_LANCAR','HARTA'),('1.2.1','GEDUNG','HARTA_TETAP','HARTA'),('1.2.2','PERALATAN','HARTA_TETAP','HARTA'),('1.2.3','TANAH','HARTA_TETAP','HARTA'),('1.2.4','KENDARAAN','HARTA_TETAP','HARTA'),('2.1.1','HUTANG USAHA','HUTANG_LANCAR','HUTANG'),('2.1.2','PEND. DITERIMA DIMUKA','HUTANG_LANCAR','HUTANG'),('2.1.3','BEBAN YG HARUS DIBAYAR','HUTANG_LANCAR','HUTANG'),('3.1.1','MODAL','MODAL_USAHA','MODAL'),('4.1.1','PENDAPATAN AIR','PENDAPATAN_USAHA','PENDAPATAN'),('5.1.1','SOLAR','BEBAN_USAHA','BEBAN'),('5.1.2','LISTRIK','BEBAN_USAHA','BEBAN'),('5.1.3','GAJI KARYAWAN','BEBAN_USAHA','BEBAN'),('5.1.4','BIAYA TAK TERDUGA','BEBAN_USAHA','BEBAN'),('5.1.5','BIAYA PERBAIKAN','BEBAN_USAHA','BEBAN'),('5.1.6','BIAYA LAIN LAIN','BEBAN_USAHA','BEBAN'),('5.1.7','BEBAN PERLENGKAPAN','BEBAN_USAHA','BEBAN'),('5.2.1','PAJAK','BEBAN_DILUAR_USAHA','BEBAN');

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

insert  into `anggota`(`idanggota`,`namaanggota`,`pekerjaan`,`alamat`,`telp`,`noKTP`,`rt`,`rw`,`dusun`,`desa`,`kota`,`provinsi`,`kecamatan`,`logo`) values ('105314024','Adhi','Pengacara','JL Durian IV','081222333856','3603120109920002',10,8,'Pondok Makmur','Kutabaru','Tangerang','Banten','Pasar Kemis','105314024.jpg'),('105314031','Agus','Karyawan','JL Paingan 2','081921311231','129839127123',2,10,'Peron','Bleberan','Gunungkidul','DIY','Playen','105314031.jpg'),('105314044','Adit','Pengacara','JL Melati no 10','081922312312','1232173687213',2,1,'Paingan','Depok','Sleman','Yogyakarta','Maguwoharjo','105314044.jpg'),('105314064','Roy','Jual Akik','Jl Paingan','08192231421','3450192210029993',2,1,'Timbulrejo','Depok','Sleman','Yogyakarta','Maguwoharjo','105314064.jpg'),('105314066','Aweng','Mahasiswa','Gang Gori','08192221123','213124213213',1,2,'Timbulrejo','Depok','Sleman','Yogyakarta','Maguwoharjo','105314066.jpg'),('test1234','coba','Pengangguran','Dagen','081223123412','21312312',2,1,'Maguwoharjo','BLEBERAN','GUNUNGKIDUL','DIY','PLAYEN','test1234.jpg');

/*Table structure for table `barang` */

DROP TABLE IF EXISTS `barang`;

CREATE TABLE `barang` (
  `idbarang` varchar(10) NOT NULL,
  `namabarang` varchar(100) NOT NULL,
  `stokbarang` int(100) NOT NULL,
  `totalaset` double NOT NULL,
  `kode` varchar(5) NOT NULL,
  PRIMARY KEY (`idbarang`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `barang` */

insert  into `barang`(`idbarang`,`namabarang`,`stokbarang`,`totalaset`,`kode`) values ('BRG-1','Pipa',60,240000,'1.1.4'),('BRG-2','Kaporit',10,5000,'1.1.4'),('BRG-3','Komputer',2,8000000,'1.2.2');

/*Table structure for table `keluhan` */

DROP TABLE IF EXISTS `keluhan`;

CREATE TABLE `keluhan` (
  `idkeluhan` varchar(10) NOT NULL,
  `idanggota` varchar(10) DEFAULT NULL,
  `keterangan` varchar(500) DEFAULT NULL,
  `tglpelaksanaan` date DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idkeluhan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `keluhan` */

insert  into `keluhan`(`idkeluhan`,`idanggota`,`keterangan`,`tglpelaksanaan`,`status`) values ('KEL-1','105314024','bocor boocor','2015-04-09','BELUM'),('KEL-2','105314024','lalalalalal','2015-04-09','BELUM');

/*Table structure for table `konfigurasi` */

DROP TABLE IF EXISTS `konfigurasi`;

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

/*Data for the table `konfigurasi` */

insert  into `konfigurasi`(`idkonfigurasi`,`abodemen`,`pertama`,`kedua`,`selanjutnya`,`bagimeter`,`tglterakhir`,`denda`,`registrasi`) values (1,2000,2500,3000,5000,10,10,5000,800000);

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

insert  into `pemakaian`(`notransaksi`,`idanggota`,`airlunas`,`airterakhir`,`airdibayar`,`bulan`,`jatuhtempo`) values ('105314024-1','105314024',0,20,20,'JANUARI','2015-02-10'),('105314024-2','105314024',20,50,30,'FEBRUARI','2015-03-10'),('105314024-3','105314024',50,0,0,'MARET','2015-04-10'),('105314031-1','105314031',30,30,0,'MARET','2015-04-10'),('105314031-2','105314031',30,0,0,'APRIL','2015-05-10'),('105314044-1','105314044',10,10,0,'MARET','2015-04-10'),('105314044-2','105314044',10,10,0,'APRIL','2015-05-10'),('105314064-1','105314064',50,50,0,'MARET','2015-04-10'),('105314066-1','105314066',30,30,0,'MARET','2015-04-10'),('105314066-2','105314066',30,43,13,'APRIL','2015-05-10');

/*Table structure for table `pengeluaran` */

DROP TABLE IF EXISTS `pengeluaran`;

CREATE TABLE `pengeluaran` (
  `kode` varchar(4) NOT NULL,
  `namapengeluaran` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`kode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `pengeluaran` */

insert  into `pengeluaran`(`kode`,`namapengeluaran`) values ('P-1','Biaya Solar'),('P-2','Biaya Listrik'),('P-3','Gaji Karyawan'),('P-4','Biaya Tak Terduga'),('P-5','Biaya Perbaikan'),('P-6','Biaya Lain Lain');

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

insert  into `profil`(`idprofil`,`namadesa`,`alamatdesa`,`notelp`,`desa`,`kecamatan`,`kabupaten`,`provinsi`,`email`,`logo`) values (0,'BLEBERAN','PADUKUHAN','081212321211','BLEBERAN','PLAYEN','GUNUNGKIDUL','DIY','bleberan@gmail.com','logodesa.jpg');

/*Table structure for table `transaksi` */

DROP TABLE IF EXISTS `transaksi`;

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
  `kode` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`notransaksi`,`idbarang`,`idanggota`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `transaksi` */

insert  into `transaksi`(`notransaksi`,`idbarang`,`idanggota`,`tanggaltransaksi`,`jenistransaksi`,`jumlah`,`hargasatuan`,`denda`,`total`,`kode`) values ('105314024-0','-','105314024','2015-01-24','DAFTAR',1,50000,0,50000,NULL),('105314031-0','-','105314031','2015-03-31','DAFTAR',0,50000,0,50000,NULL),('105314031-1','-','105314031','2015-03-31','PENJUALAN',30,1000,0,30000,NULL),('105314044-0','-','105314044','2015-03-25','DAFTAR',1,50000,0,50000,NULL),('105314044-1','-','105314044','2015-03-31','PENJUALAN',10,1000,0,10000,NULL),('105314064-0','-','105314064','2015-03-19','DAFTAR',1,50000,0,50000,NULL),('105314064-1','-','105314064','2015-03-24','PENJUALAN',50,500,0,25000,NULL),('105314066-0','-','105314066','2015-03-23','DAFTAR',1,50000,0,50000,NULL),('105314066-1','-','105314066','2015-03-31','PENJUALAN',30,1000,0,30000,NULL),('P-1-201503','P-1','-','2015-03-31','PENGELUARAN',0,0,0,100000,NULL),('P-1-201504','P-1','-','2015-04-07','PENGELUARAN',0,0,0,10000,NULL),('P-2-201503','P-2','-','2015-03-31','PENGELUARAN',0,0,0,100000,NULL),('P-2-201504','P-2','-','2015-04-07','PENGELUARAN',0,0,0,50000,NULL),('P-3-201503','P-3','-','2015-03-28','PENGELUARAN',0,0,0,50000,NULL),('P-3-201504','P-3','-','2015-04-07','PENGELUARAN',0,0,0,1000000,NULL),('P-4-201503','P-4','-','2015-03-31','PENGELUARAN',0,0,0,5000,NULL),('P-4-201504','P-4','-','2015-04-07','PENGELUARAN',0,0,0,15000,NULL),('P-5-201503','P-5','-','2015-03-31','PENGELUARAN',0,0,0,0,NULL),('P-5-201504','P-5','-','2015-04-07','PENGELUARAN',0,0,0,100000,NULL),('P-6-201503','P-6','-','2015-03-31','PENGELUARAN',0,0,0,0,NULL),('P-6-201504','P-6','-','2015-04-07','PENGELUARAN',0,0,0,5000,NULL),('TP-1','BRG-1','-','2015-04-14','PEMAKAIAN',1,0,0,4000,'5.1.7');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
