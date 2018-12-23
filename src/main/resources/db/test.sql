/*
Navicat MySQL Data Transfer

Source Server         : MySql
Source Server Version : 50536
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50536
File Encoding         : 65001

Date: 2018-12-23 21:17:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '唯一ID',
  `age` int(11) NOT NULL COMMENT '年齡',
  `name` varchar(255) DEFAULT NULL COMMENT '姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '32', '李修改');
INSERT INTO `user` VALUES ('4', '233', '诸葛连弩');
INSERT INTO `user` VALUES ('5', '25', '李测试');
