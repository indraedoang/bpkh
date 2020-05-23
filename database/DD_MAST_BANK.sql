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

Date: 2020-05-23 10:18:12
*/


-- ----------------------------
-- Table structure for [dbo].[DD_MAST_BANK]
-- ----------------------------
DROP TABLE [dbo].[DD_MAST_BANK]
GO
CREATE TABLE [dbo].[DD_MAST_BANK] (
[id] int NOT NULL IDENTITY(1,1) ,
[kode_bank] int NULL ,
[nama_bank] varchar(255) NULL ,
[total] int NULL ,
[giro] int NULL ,
[deposito] int NULL 
)


GO

-- ----------------------------
-- Records of DD_MAST_BANK
-- ----------------------------
SET IDENTITY_INSERT [dbo].[DD_MAST_BANK] ON
GO
SET IDENTITY_INSERT [dbo].[DD_MAST_BANK] OFF
GO

-- ----------------------------
-- Indexes structure for table DD_MAST_BANK
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table [dbo].[DD_MAST_BANK]
-- ----------------------------
ALTER TABLE [dbo].[DD_MAST_BANK] ADD PRIMARY KEY ([id])
GO
