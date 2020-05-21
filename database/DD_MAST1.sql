/*
Navicat SQL Server Data Transfer

Source Server         : 10.20.34.15
Source Server Version : 110000
Source Host           : 10.20.34.15:1433
Source Database       : RJTH
Source Schema         : dbo

Target Server Type    : SQL Server
Target Server Version : 110000
File Encoding         : 65001

Date: 2020-05-20 16:39:56
*/


-- ----------------------------
-- Table structure for [dbo].[DD_MAST]
-- ----------------------------
DROP TABLE [dbo].[DD_MAST]
GO
CREATE TABLE [dbo].[DD_MAST] (
[id] int NOT NULL IDENTITY(1,1) ,
[kode_bank] varchar(20) NULL ,
[nama_bank] varchar(255) NULL ,
[transdate] varchar(10) NULL ,
[transtime] varchar(10) NULL ,
[no_rek_rjth] varchar(50) NULL ,
[no_rek_bank] varchar(50) NULL ,
[nominal] int NULL ,
[kode_haji] varchar(2) NULL ,
[jenis_haji] varchar(20) NULL ,
[no_identitas] varchar(25) NULL ,
[nama_jamaah] varchar(255) NULL ,
[tempat_lahir] varchar(255) NULL ,
[kode_jenis_kelamin] varchar(2) NULL ,
[jenis_kelamin] varchar(20) NULL ,
[alamat] text NULL ,
[kelurahan] varchar(255) NULL ,
[kecamatan] varchar(255) NULL ,
[provinsi] varchar(255) NULL ,
[kode_pos] varchar(255) NULL ,
[email] varchar(255) NULL ,
[no_tlp] varchar(20) NULL ,
[pekerjaan] varchar(50) NULL ,
[pendidikan] varchar(50) NULL ,
[status_nikah] varchar(50) NULL ,
[nama_ayah] varchar(50) NULL ,
[no_validasi] varchar(50) NULL ,
[no_va] varchar(50) NULL ,
[kode_wilayah] varchar(20) NULL ,
[no_porsi] varchar(50) NULL ,
[tanggal_lahir] varchar(10) NULL 
)


GO
DBCC CHECKIDENT(N'[dbo].[DD_MAST]', RESEED, 21)
GO

-- ----------------------------
-- Records of DD_MAST
-- ----------------------------
SET IDENTITY_INSERT [dbo].[DD_MAST] ON
GO
INSERT INTO [dbo].[DD_MAST] ([id], [kode_bank], [nama_bank], [transdate], [transtime], [no_rek_rjth], [no_rek_bank], [nominal], [kode_haji], [jenis_haji], [no_identitas], [nama_jamaah], [tempat_lahir], [kode_jenis_kelamin], [jenis_kelamin], [alamat], [kelurahan], [kecamatan], [provinsi], [kode_pos], [email], [no_tlp], [pekerjaan], [pendidikan], [status_nikah], [nama_ayah], [no_validasi], [no_va], [kode_wilayah], [no_porsi], [tanggal_lahir]) VALUES (N'21', N'427', N'BANK BNI SYARIAH', N'20200521', N'083021', N'200412345', N'2005914598', N'25000000', N'0', N'Biasa', N'32160601090004', N'Indra Setiawan', N'Bekasi', N'0', N'Laki Laki', N'Kp. Rawa Kalong RT 03/021 ', N'Setia Mekar', N'Tambun Selatan', N'Jawa Barat', N'19519', N'indrasetiawan0103@gmail.com', N'085770515465', N'Wiraswasta', N'Sarjana', N'Menikah', N'Saman', N'2321312312', N'4272006200000001', N'2006', null, N'01031990');
GO
SET IDENTITY_INSERT [dbo].[DD_MAST] OFF
GO

-- ----------------------------
-- Indexes structure for table DD_MAST
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table [dbo].[DD_MAST]
-- ----------------------------
ALTER TABLE [dbo].[DD_MAST] ADD PRIMARY KEY ([id])
GO
