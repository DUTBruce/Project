/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80016
Source Host           : localhost:3306
Source Database       : database

Target Server Type    : MYSQL
Target Server Version : 80016
File Encoding         : 65001

Date: 2020-07-02 10:09:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for contract
-- ----------------------------
DROP TABLE IF EXISTS `contract`;
CREATE TABLE `contract` (
  `custom_id` int(11) NOT NULL,
  `goods_id` int(11) NOT NULL,
  `saler_id` int(11) NOT NULL,
  `number` int(11) NOT NULL COMMENT '购买数量',
  `price` double(10,2) NOT NULL COMMENT '谈判后的价格',
  `time` datetime DEFAULT NULL COMMENT '完成时间',
  PRIMARY KEY (`custom_id`,`goods_id`,`saler_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of contract
-- ----------------------------

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `custom_id` int(11) NOT NULL AUTO_INCREMENT,
  `custom_name` varchar(255) NOT NULL,
  `custom_phon` decimal(11,0) DEFAULT NULL,
  `custom_addr` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`custom_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1002 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('1001', 'adas', '18742035960', null);

-- ----------------------------
-- Table structure for demand
-- ----------------------------
DROP TABLE IF EXISTS `demand`;
CREATE TABLE `demand` (
  `custom_id` int(11) NOT NULL,
  `goods_id` int(11) NOT NULL,
  `goods_name` varchar(255) NOT NULL,
  `current_state` varchar(255) NOT NULL,
  `saler_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`custom_id`,`goods_id`),
  KEY `demand_ibfk_2` (`goods_id`),
  CONSTRAINT `demand_ibfk_1` FOREIGN KEY (`custom_id`) REFERENCES `customer` (`custom_id`) ON DELETE CASCADE,
  CONSTRAINT `demand_ibfk_2` FOREIGN KEY (`goods_id`) REFERENCES `goods` (`goods_id`) ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of demand
-- ----------------------------
INSERT INTO `demand` VALUES ('1001', '1', '23', '23', '23');

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `goods_id` int(11) NOT NULL,
  `goods_name` varchar(255) NOT NULL,
  `goods_price` double(10,2) NOT NULL COMMENT '成本价格',
  `goods_amount` int(11) DEFAULT NULL COMMENT '库存数量',
  `supply_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`goods_id`),
  KEY `supply_id` (`supply_id`),
  CONSTRAINT `goods_ibfk_1` FOREIGN KEY (`supply_id`) REFERENCES `supply` (`supply_id`) ON DELETE SET NULL ON UPDATE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('1', '鐢佃', '100.10', '1000', null);

-- ----------------------------
-- Table structure for saler
-- ----------------------------
DROP TABLE IF EXISTS `saler`;
CREATE TABLE `saler` (
  `saler_id` int(11) NOT NULL,
  `saler_name` varchar(255) NOT NULL,
  `saler_phone` decimal(11,0) DEFAULT NULL,
  PRIMARY KEY (`saler_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of saler
-- ----------------------------

-- ----------------------------
-- Table structure for saletask
-- ----------------------------
DROP TABLE IF EXISTS `saletask`;
CREATE TABLE `saletask` (
  `custom_id` int(11) NOT NULL,
  `goods_id` int(11) NOT NULL,
  `saler_id` int(11) NOT NULL,
  `phase` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`custom_id`,`goods_id`,`saler_id`),
  KEY `goods_id` (`goods_id`),
  KEY `saler_id` (`saler_id`),
  CONSTRAINT `saletask_ibfk_1` FOREIGN KEY (`custom_id`) REFERENCES `customer` (`custom_id`) ON DELETE RESTRICT,
  CONSTRAINT `saletask_ibfk_2` FOREIGN KEY (`goods_id`) REFERENCES `goods` (`goods_id`) ON DELETE RESTRICT,
  CONSTRAINT `saletask_ibfk_3` FOREIGN KEY (`saler_id`) REFERENCES `saler` (`saler_id`) ON DELETE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of saletask
-- ----------------------------

-- ----------------------------
-- Table structure for supply
-- ----------------------------
DROP TABLE IF EXISTS `supply`;
CREATE TABLE `supply` (
  `supply_id` int(11) NOT NULL,
  `supply_name` varchar(255) DEFAULT NULL,
  `goods_id` int(11) NOT NULL,
  `goods_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`supply_id`,`goods_id`),
  KEY `supply_id` (`supply_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of supply
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userid` int(11) NOT NULL,
  `password` varchar(255) NOT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`userid`,`password`),
  CONSTRAINT `user_ibfk_1` FOREIGN KEY (`userid`) REFERENCES `saler` (`saler_id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of user
-- ----------------------------
