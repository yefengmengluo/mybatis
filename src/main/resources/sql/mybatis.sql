/*
Navicat MySQL Data Transfer

Source Server         : personal
Source Server Version : 50153
Source Host           : localhost:3306
Source Database       : mybatis

Target Server Type    : MYSQL
Target Server Version : 50153
File Encoding         : 65001

Date: 2016-02-16 11:49:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for address
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `country` varchar(255) DEFAULT NULL COMMENT '国家',
  `province` varchar(10) NOT NULL COMMENT '省',
  `city` varchar(15) NOT NULL COMMENT '市',
  `area` varchar(20) NOT NULL COMMENT '区(县)',
  `detail` varchar(6) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) NOT NULL,
  `gender` char(1) NOT NULL,
  `age` int(4) NOT NULL,
  `address_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for picture
-- ----------------------------
DROP TABLE IF EXISTS `picture`;
CREATE TABLE `picture` (
  `id` int(11) NOT NULL,
  `picture_name` varchar(22) DEFAULT NULL COMMENT '图片名称',
  `picture_suffix` varchar(8) DEFAULT NULL COMMENT '图片后缀',
  `category` int(2) DEFAULT NULL COMMENT '图片类型：1，头像  2，相册',
  `picture_position` varchar(36) DEFAULT NULL COMMENT '图片地址',
  `picture_size` bigint(16) DEFAULT NULL COMMENT '图片大小',
  `person_id` int(11) DEFAULT NULL COMMENT '所属人id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
