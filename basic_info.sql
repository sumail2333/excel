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

 Date: 20/11/2018 21:02:29
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for basic_info
-- ----------------------------
DROP TABLE IF EXISTS `basic_info`;
CREATE TABLE `basic_info`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `party_member_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `party_member_sex` int(1) NULL DEFAULT NULL,
  `party_member_category` int(1) NULL DEFAULT NULL,
  `party_member_idcard` varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `party_member_company` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `party_member_number` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `party_member_mail` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `party_member_backup_mail` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `party_member_join_date` date NULL DEFAULT NULL,
  `party_member_change_date` date NULL DEFAULT NULL,
  `party_member_attach` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `party_member_idcard`(`party_member_idcard`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of basic_info
-- ----------------------------
INSERT INTO `basic_info` VALUES (1, '熊钊', 1, 1, '421281199403031717', 'dxc', '13163315679', 'zhao.xiong@dxc.com', 'm13163315679@163.com', '2018-11-13', '2018-11-16', NULL);

SET FOREIGN_KEY_CHECKS = 1;
