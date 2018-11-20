/*
 Navicat MySQL Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50723
 Source Host           : localhost:3306
 Source Schema         : excel

 Target Server Type    : MySQL
 Target Server Version : 50723
 File Encoding         : 65001

 Date: 20/11/2018 21:02:46
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for cash_info
-- ----------------------------
DROP TABLE IF EXISTS `cash_info`;
CREATE TABLE `cash_info`  (
  `party_member_depart` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `party_member_idcard` varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `party_member_in_date` date NULL DEFAULT NULL,
  `party_member_out_date` date NULL DEFAULT NULL,
  `party_member_monthly_cash` decimal(10, 0) NULL DEFAULT NULL,
  `party_member_cash_date` date NULL DEFAULT NULL,
  INDEX `FK_basicinfo_party_member_idcard`(`party_member_idcard`) USING BTREE,
  CONSTRAINT `FK_basicinfo_party_member_idcard` FOREIGN KEY (`party_member_idcard`) REFERENCES `basic_info` (`party_member_idcard`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
