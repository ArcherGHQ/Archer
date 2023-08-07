/*
 Navicat Premium Data Transfer

 Source Server         : BookSystem
 Source Server Type    : MySQL
 Source Server Version : 80032 (8.0.32)
 Source Host           : localhost:3306
 Source Schema         : booksystem

 Target Server Type    : MySQL
 Target Server Version : 80032 (8.0.32)
 File Encoding         : 65001

 Date: 06/07/2023 14:19:29
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for books
-- ----------------------------
DROP TABLE IF EXISTS `books`;
CREATE TABLE `books`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '编码',
  `bookname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '书名',
  `author` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '作者',
  `price` double NULL DEFAULT NULL COMMENT '价格',
  `number` int NULL DEFAULT NULL COMMENT '库存数量',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10030 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of books
-- ----------------------------
INSERT INTO `books` VALUES (10006, '123', '123', 1231.2, 2132);
INSERT INTO `books` VALUES (10008, '123123', '1231231求大神', 0, 0);
INSERT INTO `books` VALUES (10009, NULL, '333', NULL, NULL);
INSERT INTO `books` VALUES (10010, NULL, NULL, 1223, NULL);
INSERT INTO `books` VALUES (10011, NULL, '123', NULL, NULL);
INSERT INTO `books` VALUES (10012, 'qweq', 'qweq', 12, 11);
INSERT INTO `books` VALUES (10013, '123123', '1231231求大神带我去', 0, 0);
INSERT INTO `books` VALUES (10015, '', '', 0, 0);
INSERT INTO `books` VALUES (10016, '', '', 0, 0);
INSERT INTO `books` VALUES (10018, '', '', 0, 0);
INSERT INTO `books` VALUES (10019, '', '', 0, 0);
INSERT INTO `books` VALUES (10022, '', '', 0, 0);
INSERT INTO `books` VALUES (10023, '', '', 0, 0);
INSERT INTO `books` VALUES (10024, '', '', 0, 0);
INSERT INTO `books` VALUES (10025, '', '', 0, 0);
INSERT INTO `books` VALUES (10026, '', '', 0, 0);
INSERT INTO `books` VALUES (10027, '', '', 0, 0);
INSERT INTO `books` VALUES (10028, '', '', 0, 0);
INSERT INTO `books` VALUES (10029, '123123', '1231231求大神带我去', 123, 11);

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '密码',
  `ac` int NOT NULL DEFAULT 0 COMMENT '管理权限认证',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 37 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, 'Archer', '1330', 2);
INSERT INTO `users` VALUES (2, 'qmm', '123', 0);
INSERT INTO `users` VALUES (4, 'qwe', '123', 1);
INSERT INTO `users` VALUES (5, '12', 'qwe', 0);
INSERT INTO `users` VALUES (6, '   123', '123', 0);
INSERT INTO `users` VALUES (7, 'ghq', '123', 0);
INSERT INTO `users` VALUES (36, 'chen', '123', 1);

SET FOREIGN_KEY_CHECKS = 1;
