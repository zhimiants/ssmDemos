/*
 Navicat Premium Data Transfer

 Source Server         : myTest
 Source Server Type    : MySQL
 Source Server Version : 80031 (8.0.31)
 Source Host           : localhost:3306
 Source Schema         : j2ee528

 Target Server Type    : MySQL
 Target Server Version : 80031 (8.0.31)
 File Encoding         : 65001

 Date: 20/07/2023 14:32:01
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for 528_user
-- ----------------------------
DROP TABLE IF EXISTS `528_user`;
CREATE TABLE `528_user`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `username` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT '密码',
  `avatar` varchar(200) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT '头像',
  `last_ip` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT '最后出现的ip',
  `last_at` datetime NULL DEFAULT NULL COMMENT '最后出现的地点',
  `status` tinyint(1) NULL DEFAULT NULL COMMENT '状态',
  `fail_times` tinyint NULL DEFAULT NULL COMMENT '失败次数',
  `lock_expire_time` int NULL DEFAULT NULL COMMENT '锁定时间戳',
  `balance` decimal(10, 2) NULL DEFAULT NULL COMMENT '余额',
  `create_at` datetime NULL DEFAULT NULL COMMENT '创建时所在的地点',
  `create_ip` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT '' COMMENT '创建时所在的ip',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of 528_user
-- ----------------------------
INSERT INTO `528_user` VALUES (1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '');
INSERT INTO `528_user` VALUES (2, 'user2', 'password2', 'avatar2.jpg', '192.168.0.2', '2023-07-10 09:45:00', 1, 0, NULL, 150.50, '2023-07-10 09:45:00', '192.168.0.2');
INSERT INTO `528_user` VALUES (3, 'user3', 'password3', 'avatar3.jpg', '192.168.0.3', '2023-07-10 10:15:00', 1, 0, NULL, 200.75, '2023-07-10 10:15:00', '192.168.0.3');
INSERT INTO `528_user` VALUES (4, 'user4', 'password4', 'avatar4.jpg', '192.168.0.4', '2023-07-10 11:20:00', 1, 0, NULL, 75.25, '2023-07-10 11:20:00', '192.168.0.4');
INSERT INTO `528_user` VALUES (5, 'user5', 'password5', 'avatar5.jpg', '192.168.0.5', '2023-07-10 12:10:00', 1, 0, NULL, 300.00, '2023-07-10 12:10:00', '192.168.0.5');
INSERT INTO `528_user` VALUES (6, 'user6', 'password6', 'avatar6.jpg', '192.168.0.6', '2023-07-10 13:45:00', 1, 0, NULL, 50.50, '2023-07-10 13:45:00', '192.168.0.6');
INSERT INTO `528_user` VALUES (7, 'user7', 'password7', 'avatar7.jpg', '192.168.0.7', '2023-07-10 14:30:00', 1, 0, NULL, 125.75, '2023-07-10 14:30:00', '192.168.0.7');
INSERT INTO `528_user` VALUES (8, 'user8', 'password8', 'avatar8.jpg', '192.168.0.8', '2023-07-10 15:15:00', 1, 0, NULL, 80.25, '2023-07-10 15:15:00', '192.168.0.8');
INSERT INTO `528_user` VALUES (9, 'updatedUsername', 'password9', 'avatar9.jpg', '192.168.0.9', '2023-07-10 16:00:00', 1, 0, NULL, 175.00, '2023-07-10 16:00:00', '192.168.0.9');
INSERT INTO `528_user` VALUES (10, 'updatedName', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for 528_user_orders
-- ----------------------------
DROP TABLE IF EXISTS `528_user_orders`;
CREATE TABLE `528_user_orders`  (
  `order_id` int NOT NULL AUTO_INCREMENT COMMENT '订单id',
  `user_id` int NOT NULL COMMENT '用户id',
  `order_date` datetime NULL DEFAULT NULL COMMENT '订单日期',
  `total_amount` decimal(10, 2) NULL DEFAULT NULL COMMENT '订单总金额',
  `shipping_address` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT '收货地址',
  PRIMARY KEY (`order_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of 528_user_orders
-- ----------------------------
INSERT INTO `528_user_orders` VALUES (1, 1, '2023-07-10 09:00:00', 100.00, '123 Main St');
INSERT INTO `528_user_orders` VALUES (2, 1, '2023-07-11 14:30:00', 50.00, '123 Main St');
INSERT INTO `528_user_orders` VALUES (3, 2, '2023-07-10 11:45:00', 200.00, '456 Elm St');
INSERT INTO `528_user_orders` VALUES (4, 3, '2023-07-11 10:15:00', 75.00, '789 Oak Ave');
INSERT INTO `528_user_orders` VALUES (5, 2, '2023-07-10 16:20:00', 30.00, '321 Maple Ln');

-- ----------------------------
-- Table structure for 528_user_permissions
-- ----------------------------
DROP TABLE IF EXISTS `528_user_permissions`;
CREATE TABLE `528_user_permissions`  (
  `user_id` int NOT NULL COMMENT '用户id',
  `permission_id` int NOT NULL COMMENT '权限id',
  PRIMARY KEY (`user_id`, `permission_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of 528_user_permissions
-- ----------------------------
INSERT INTO `528_user_permissions` VALUES (1, 1);
INSERT INTO `528_user_permissions` VALUES (1, 2);
INSERT INTO `528_user_permissions` VALUES (2, 2);
INSERT INTO `528_user_permissions` VALUES (3, 1);
INSERT INTO `528_user_permissions` VALUES (3, 3);

-- ----------------------------
-- Table structure for 528_user_profile
-- ----------------------------
DROP TABLE IF EXISTS `528_user_profile`;
CREATE TABLE `528_user_profile`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '用户资料id',
  `user_id` int NOT NULL COMMENT '用户id',
  `full_name` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT '全名',
  `email` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT '电子邮件',
  `phone` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT '电话号码',
  `address` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of 528_user_profile
-- ----------------------------
INSERT INTO `528_user_profile` VALUES (1, 1, 'John Doe', 'johndoe@example.com', '1234567890', '123 Main St');
INSERT INTO `528_user_profile` VALUES (2, 2, 'Jane Smith', 'janesmith@example.com', '9876543210', '456 Elm St');
INSERT INTO `528_user_profile` VALUES (3, 3, 'Mike Johnson', 'mikejohnson@example.com', '5555555555', '789 Oak Ave');
INSERT INTO `528_user_profile` VALUES (4, 4, 'Emily Davis', 'emilydavis@example.com', '1112223333', '321 Maple Ln');
INSERT INTO `528_user_profile` VALUES (5, 5, 'Chris Wilson', 'chriswilson@example.com', '4445556666', '654 Pine Rd');

-- ----------------------------
-- Table structure for 528_user_roles
-- ----------------------------
DROP TABLE IF EXISTS `528_user_roles`;
CREATE TABLE `528_user_roles`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '关联id',
  `user_id` int NOT NULL COMMENT '用户id',
  `role_id` int NOT NULL COMMENT '角色id',
  `create_at` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_at` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of 528_user_roles
-- ----------------------------
INSERT INTO `528_user_roles` VALUES (1, 1, 1, '2023-07-10 09:00:00', '2023-07-10 09:00:00');
INSERT INTO `528_user_roles` VALUES (2, 1, 2, '2023-07-10 09:00:00', '2023-07-10 09:00:00');
INSERT INTO `528_user_roles` VALUES (3, 2, 1, '2023-07-10 09:00:00', '2023-07-10 09:00:00');
INSERT INTO `528_user_roles` VALUES (4, 3, 2, '2023-07-10 09:00:00', '2023-07-10 09:00:00');
INSERT INTO `528_user_roles` VALUES (5, 4, 1, '2023-07-10 09:00:00', '2023-07-10 09:00:00');

SET FOREIGN_KEY_CHECKS = 1;
