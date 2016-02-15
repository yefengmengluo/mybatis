/*
Navicat MySQL Data Transfer

Source Server         : personal
Source Server Version : 50153
Source Host           : localhost:3306
Source Database       : vote_system

Target Server Type    : MYSQL
Target Server Version : 50153
File Encoding         : 65001

Date: 2016-02-15 15:26:09
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_sequence
-- ----------------------------
DROP TABLE IF EXISTS `sys_sequence`;
CREATE TABLE `sys_sequence` (
  `seq_name` varchar(45) NOT NULL COMMENT '序列名称不能重复',
  `seq_current_val` bigint(20) NOT NULL DEFAULT '1' COMMENT '当前值',
  `seq_incre_factor` smallint(6) NOT NULL DEFAULT '100' COMMENT '增长因子，该值越大性能越好',
  PRIMARY KEY (`seq_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='生成序列';

-- ----------------------------
-- Table structure for vote_advertising
-- ----------------------------
DROP TABLE IF EXISTS `vote_advertising`;
CREATE TABLE `vote_advertising` (
  `adv_id` bigint(20) NOT NULL COMMENT 'id (主键)',
  `v_id` bigint(20) DEFAULT NULL COMMENT '投票主题id',
  `cop_id` bigint(20) DEFAULT NULL COMMENT '会员id',
  `channel_name` int(11) DEFAULT NULL COMMENT '频道名称',
  `position_name` varchar(32) DEFAULT NULL COMMENT '广告位标识名',
  `adv_tag` varchar(32) DEFAULT NULL COMMENT '广告位标签',
  `adv_type` int(11) DEFAULT NULL COMMENT '广告类型',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `end_time` datetime DEFAULT NULL COMMENT '结束时间',
  `adv_num` int(11) DEFAULT NULL COMMENT '广告条数',
  `tlength` int(11) DEFAULT NULL COMMENT '显示字数',
  `gwidth` double(6,2) DEFAULT NULL COMMENT '广告位宽度',
  `gheight` double(6,2) DEFAULT NULL COMMENT '广告位高度',
  `gpwidth` double(6,2) DEFAULT NULL COMMENT '广告位图片宽度',
  `gpheight` double(6,2) DEFAULT NULL COMMENT '广告位图片高度',
  `adv_order` int(11) DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`adv_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for vote_comment
-- ----------------------------
DROP TABLE IF EXISTS `vote_comment`;
CREATE TABLE `vote_comment` (
  `com_id` bigint(20) NOT NULL COMMENT 'id (主键)',
  `vi_id` bigint(20) DEFAULT NULL COMMENT '投票公司的id',
  `com_content` varchar(1000) DEFAULT NULL COMMENT '评论内容',
  `com_time` datetime DEFAULT NULL COMMENT '评论时间',
  `com_ip` varchar(16) DEFAULT NULL COMMENT '评论ip',
  `com_static` int(11) DEFAULT NULL COMMENT '评论状态(0正常状态)',
  `user_id` bigint(20) DEFAULT NULL COMMENT '管理员id',
  `top` int(11) DEFAULT NULL,
  `ip_name` varchar(100) DEFAULT NULL,
  `droop` int(11) DEFAULT NULL,
  PRIMARY KEY (`com_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for vote_company
-- ----------------------------
DROP TABLE IF EXISTS `vote_company`;
CREATE TABLE `vote_company` (
  `cop_id` bigint(20) NOT NULL COMMENT 'id (主键)',
  `cop_name` varchar(64) DEFAULT NULL COMMENT '公司名称',
  `cop_brand` varchar(64) DEFAULT NULL COMMENT '品牌名称',
  `industry` int(11) DEFAULT NULL COMMENT '所属行业',
  `cop_url` varchar(512) DEFAULT NULL COMMENT '企业网站',
  `cop_address` varchar(64) DEFAULT NULL COMMENT '企业地址',
  `brand_industry` varchar(32) DEFAULT NULL COMMENT '品牌行业',
  `cop_summary` varchar(1000) DEFAULT NULL COMMENT '公司简介',
  `cop_events` varchar(5000) DEFAULT NULL COMMENT '企业大事记',
  `logo` varchar(512) DEFAULT NULL COMMENT '公司logo',
  `weixin_pic` varchar(512) DEFAULT NULL COMMENT '官方微信',
  `weibo_pic` varchar(512) DEFAULT NULL COMMENT '官方微博',
  `erweima_pic` varchar(512) DEFAULT NULL COMMENT '手机投票二维码',
  `add_time` datetime DEFAULT NULL COMMENT '添加时间',
  `status` int(11) DEFAULT NULL COMMENT '状态(0未参与/1参与)',
  `vi_id` bigint(20) DEFAULT NULL COMMENT '投票选项id',
  `user_id` bigint(20) DEFAULT NULL COMMENT '管理员id',
  PRIMARY KEY (`cop_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for vote_item_table
-- ----------------------------
DROP TABLE IF EXISTS `vote_item_table`;
CREATE TABLE `vote_item_table` (
  `id` bigint(20) NOT NULL COMMENT '主键id',
  `v_id` bigint(20) DEFAULT NULL COMMENT '投票主题id',
  `item_sort` int(11) DEFAULT NULL COMMENT '排序',
  `item_last_sort` int(11) DEFAULT NULL COMMENT '上次排序',
  `vd_title` varchar(200) DEFAULT NULL COMMENT '详细标题',
  `vd_detail` text COMMENT '内容，最好无限大',
  `vd_other` text COMMENT '内容，最好无限大',
  `vd_count` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for vote_picture
-- ----------------------------
DROP TABLE IF EXISTS `vote_picture`;
CREATE TABLE `vote_picture` (
  `pic_id` bigint(20) NOT NULL COMMENT 'id (主键)',
  `adv_id` bigint(20) DEFAULT NULL COMMENT '广告位id',
  `pic_url` varchar(512) DEFAULT NULL COMMENT '图片Url',
  `target_url` varchar(512) DEFAULT NULL COMMENT '目标url',
  `pic_name` varchar(64) DEFAULT NULL COMMENT '图片名称',
  `title` varchar(64) DEFAULT NULL COMMENT '标题',
  `text` varchar(2000) DEFAULT NULL COMMENT '文本',
  `pic_type` int(11) DEFAULT NULL COMMENT '图/文类型（0图1文）',
  `alt` varchar(1000) DEFAULT NULL COMMENT '图片描述',
  `starttime` datetime DEFAULT NULL COMMENT '开始时间',
  `endtime` datetime DEFAULT NULL COMMENT '结束时间	',
  `comment` varchar(1000) DEFAULT NULL COMMENT '备注',
  `pic_order` int(11) DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`pic_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for vote_result_table
-- ----------------------------
DROP TABLE IF EXISTS `vote_result_table`;
CREATE TABLE `vote_result_table` (
  `id` bigint(20) NOT NULL COMMENT 'id(主键)',
  `vi_id` bigint(20) DEFAULT NULL COMMENT '投票选项id',
  `v_id` bigint(20) DEFAULT NULL COMMENT '投票主题id',
  `ip_add` varchar(100) DEFAULT NULL COMMENT 'Ip地址',
  `ip_name` varchar(100) DEFAULT NULL COMMENT 'IP所在地',
  `vote_add_time` datetime DEFAULT NULL COMMENT '提交时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for vote_table
-- ----------------------------
DROP TABLE IF EXISTS `vote_table`;
CREATE TABLE `vote_table` (
  `id` bigint(20) NOT NULL COMMENT 'id (主键)',
  `v_subject` varchar(500) DEFAULT NULL COMMENT '投票名称',
  `v_summary` varchar(5000) DEFAULT NULL COMMENT '备注',
  `v_forever` tinyint(4) DEFAULT NULL COMMENT '是否是永久',
  `begin_time` datetime DEFAULT NULL COMMENT '开始时间',
  `end_time` datetime DEFAULT NULL COMMENT '结束时间',
  `data_status` tinyint(4) DEFAULT NULL COMMENT '投票状态',
  `data_add_time` datetime DEFAULT NULL COMMENT '添加时间',
  `data_modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  `limit_time` datetime DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL COMMENT '管理员id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for vote_user
-- ----------------------------
DROP TABLE IF EXISTS `vote_user`;
CREATE TABLE `vote_user` (
  `user_id` bigint(20) NOT NULL COMMENT 'id (主键)',
  `account` varchar(32) DEFAULT NULL COMMENT '账户名',
  `password` varchar(64) DEFAULT NULL COMMENT '密码',
  `real_name` varchar(16) DEFAULT NULL COMMENT '添加人姓名',
  `mobile` varchar(16) DEFAULT NULL COMMENT '电话',
  `site_name` varchar(64) DEFAULT NULL COMMENT '站点名称',
  `site_nickname` varchar(64) DEFAULT NULL COMMENT '站点别名',
  `web_url` varchar(521) DEFAULT NULL COMMENT '网址',
  `user_power` int(11) DEFAULT NULL COMMENT '管理员等级（0超级管理员）',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
