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

Date: 2020-05-23 10:18:20
*/


-- ----------------------------
-- Table structure for [dbo].[DD_TEMP]
-- ----------------------------
DROP TABLE [dbo].[DD_TEMP]
GO
CREATE TABLE [dbo].[DD_TEMP] (
[id] int NOT NULL IDENTITY(1,1) ,
[kode_bank] int NULL ,
[nama_bank] varchar(255) NULL ,
[transdate] varchar(10) NULL ,
[transtime] varchar(10) NULL ,
[no_rek_rjth] varchar(50) NULL ,
[no_rek_bank] varchar(50) NULL ,
[nominal] int NULL ,
[kode_haji] varchar(2) NULL ,
[jenis_haji] varchar(20) NULL ,
[no_indentitas] varchar(25) NULL ,
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
[kode_wilayah] varchar(20) NULL 
)


GO

-- ----------------------------
-- Records of DD_TEMP
-- ----------------------------
SET IDENTITY_INSERT [dbo].[DD_TEMP] ON
GO
SET IDENTITY_INSERT [dbo].[DD_TEMP] OFF
GO
