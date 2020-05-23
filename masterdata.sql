/*
Navicat PGSQL Data Transfer

Source Server         : postgres
Source Server Version : 101200
Source Host           : localhost:5432
Source Database       : labelities
Source Schema         : public

Target Server Type    : PGSQL
Target Server Version : 101200
File Encoding         : 65001

Date: 2020-05-26 19:36:10
*/


-- ----------------------------
-- Table structure for masterdata
-- ----------------------------
DROP TABLE IF EXISTS "public"."masterdata";
CREATE TABLE "public"."masterdata" (
"id" int2 DEFAULT nextval('masterdata_id_seq'::regclass) NOT NULL,
"kode_bank" int2,
"nama_bank" varchar(255) COLLATE "default",
"transdate" varchar(8) COLLATE "default",
"transtime" varchar(8) COLLATE "default",
"no_rek_rjth" varchar(50) COLLATE "default",
"no_va" varchar(20) COLLATE "default",
"no_rek_bank" varchar(50) COLLATE "default",
"jenis_haji" varchar(50) COLLATE "default",
"nama_jamaah" varchar(255) COLLATE "default",
"no_identitas" varchar(50) COLLATE "default",
"tempat_lahir" varchar(50) COLLATE "default",
"tanggal_lahir" varchar(10) COLLATE "default",
"jenis_kelamin" varchar(20) COLLATE "default",
"alamat" text COLLATE "default",
"kelurahan" varchar(255) COLLATE "default",
"kecamatan" varchar(255) COLLATE "default",
"provinsi" varchar(255) COLLATE "default",
"kode_pos" varchar(20) COLLATE "default",
"email" varchar(255) COLLATE "default",
"no_tlp" varchar(50) COLLATE "default",
"pekerjaan" varchar(255) COLLATE "default",
"pendidikan" varchar(255) COLLATE "default",
"status_nikah" varchar(20) COLLATE "default",
"nama_ayah" varchar(150) COLLATE "default",
"tahun_keberangkatan" varchar(10) COLLATE "default",
"no_validasi" varchar(255) COLLATE "default",
"no_porsi" varchar(255) COLLATE "default",
"embarkasi" varchar(50) COLLATE "default",
"kloter" varchar(50) COLLATE "default",
"status_talangan" varchar(255) COLLATE "default",
"no_registrasi_khusus" varchar(50) COLLATE "default",
"responsecode" varchar(2) COLLATE "default",
"creation_date" date,
"kode_wilayah" varchar(6) COLLATE "default",
"kode_jenis_haji" varchar(1) COLLATE "default",
"kode_jenis_kelamin" varchar(1) COLLATE "default"
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of masterdata
-- ----------------------------
INSERT INTO "public"."masterdata" VALUES ('2', '506', 'Mega Syariah', '20200521', '083021', '200412345', '5062006200000025', '2005914598', 'Biasa', 'Indra Setiawan', '32160601090004', 'Bekasi', '01031990', 'Laki Laki', 'Kp. Rawa Kalong RT 03/021 ', 'Setia Mekar', 'Tambun Selatan', 'Jawa Barat', '19519', 'indrasetiawan0103@gmail.com', '085770515465', 'Wiraswasta', 'Sarjana', 'Menikah', 'Saman', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO "public"."masterdata" VALUES ('3', '506', null, null, null, null, '5062006200000026', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO "public"."masterdata" VALUES ('4', '506', 'Mega Syariah', '20200521', '083021', '200412345', '5062006200000027', '2005914598', 'Biasa', 'Indra Setiawan', '32160601090004', 'Bekasi', '01031990', 'Laki Laki', 'Kp. Rawa Kalong RT 03/021 ', 'Setia Mekar', 'Tambun Selatan', 'Jawa Barat', '19519', 'indrasetiawan0103@gmail.com', '085770515465', 'Wiraswasta', 'Sarjana', 'Menikah', 'Saman', null, '2321312312', null, null, null, null, null, null, null, '2006', '0', '0');

-- ----------------------------
-- Alter Sequences Owned By 
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table masterdata
-- ----------------------------
ALTER TABLE "public"."masterdata" ADD PRIMARY KEY ("id");
