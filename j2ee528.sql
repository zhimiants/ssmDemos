/*
Navicat MySQL Data Transfer

Source Server         : 1234
Source Server Version : 50540
Source Host           : localhost:3306
Source Database       : j2ee528

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2023-07-13 17:57:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `528_user`
-- ----------------------------
DROP TABLE IF EXISTS `528_user`;
CREATE TABLE `528_user` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `username` varchar(20) DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  `avatar` varchar(200) DEFAULT NULL COMMENT '头像',
  `last_ip` varchar(20) DEFAULT NULL COMMENT '最后出现的ip',
  `last_at` datetime DEFAULT NULL COMMENT '最后出现的地点',
  `status` tinyint(1) DEFAULT NULL COMMENT '状态',
  `fail_times` tinyint(3) DEFAULT NULL COMMENT '失败次数',
  `lock_expire_time` int(10) DEFAULT NULL COMMENT '锁定时间戳',
  `balance` decimal(10,2) DEFAULT NULL COMMENT '余额',
  `create_at` datetime DEFAULT NULL COMMENT '创建时所在的地点',
  `create_ip` varchar(20) DEFAULT '' COMMENT '创建时所在的ip',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of 528_user
-- ----------------------------
INSERT INTO `528_user` VALUES ('1', null, null, null, null, null, null, null, null, null, null, '');
INSERT INTO `528_user` VALUES ('2', 'user2', 'password2', 'avatar2.jpg', '192.168.0.2', '2023-07-10 09:45:00', '1', '0', null, '150.50', '2023-07-10 09:45:00', '192.168.0.2');
INSERT INTO `528_user` VALUES ('3', 'user3', 'password3', 'avatar3.jpg', '192.168.0.3', '2023-07-10 10:15:00', '1', '0', null, '200.75', '2023-07-10 10:15:00', '192.168.0.3');
INSERT INTO `528_user` VALUES ('4', 'user4', 'password4', 'avatar4.jpg', '192.168.0.4', '2023-07-10 11:20:00', '1', '0', null, '75.25', '2023-07-10 11:20:00', '192.168.0.4');
INSERT INTO `528_user` VALUES ('5', 'user5', 'password5', 'avatar5.jpg', '192.168.0.5', '2023-07-10 12:10:00', '1', '0', null, '300.00', '2023-07-10 12:10:00', '192.168.0.5');
INSERT INTO `528_user` VALUES ('6', 'user6', 'password6', 'avatar6.jpg', '192.168.0.6', '2023-07-10 13:45:00', '1', '0', null, '50.50', '2023-07-10 13:45:00', '192.168.0.6');
INSERT INTO `528_user` VALUES ('7', 'user7', 'password7', 'avatar7.jpg', '192.168.0.7', '2023-07-10 14:30:00', '1', '0', null, '125.75', '2023-07-10 14:30:00', '192.168.0.7');
INSERT INTO `528_user` VALUES ('8', 'user8', 'password8', 'avatar8.jpg', '192.168.0.8', '2023-07-10 15:15:00', '1', '0', null, '80.25', '2023-07-10 15:15:00', '192.168.0.8');
INSERT INTO `528_user` VALUES ('9', 'user9', 'password9', 'avatar9.jpg', '192.168.0.9', '2023-07-10 16:00:00', '1', '0', null, '175.00', '2023-07-10 16:00:00', '192.168.0.9');
INSERT INTO `528_user` VALUES ('10', null, null, null, null, null, null, null, null, null, null, null);
