# 연습용 Spring 프로젝트


# Database create

-- web_test 데이터베이스 구조 내보내기
DROP DATABASE IF EXISTS `web_test`;
CREATE DATABASE IF NOT EXISTS `web_test` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `web_test`;

-- 테이블 web_test.msg_result 구조 내보내기
DROP TABLE IF EXISTS `msg_result`;
CREATE TABLE IF NOT EXISTS `msg_result` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `msg` varchar(255) CHARACTER SET utf8 DEFAULT '',
  `own` varchar(255) DEFAULT '',
  `sdate` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `sdate` (`sdate`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC COMMENT='실시간 채팅을 위한 테이블';

