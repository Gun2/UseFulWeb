
# Spring 채팅 예제 및 연습 프로젝트
 

> websocket을 활용한 채팅 페이지와 4개의 빈 페이지로 구성되어 있음

![AnyConv com__채팅예제](https://user-images.githubusercontent.com/32568291/128261797-05ef2369-882d-4ef9-b83a-8b056eeb962e.gif)


## Tech
- Spring framework 4.3.4.RELEASE
- Mybatis 3.4.1
- javax.websocket-api 1.1
- MariaDB 10.*


## Database Create Sql
```sh
DROP DATABASE IF EXISTS `web_test`;
CREATE DATABASE IF NOT EXISTS `web_test` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `web_test`;


DROP TABLE IF EXISTS `msg_result`;
CREATE TABLE IF NOT EXISTS `msg_result` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `msg` varchar(255) CHARACTER SET utf8 DEFAULT '',
  `own` varchar(255) DEFAULT '',
  `sdate` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `sdate` (`sdate`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC COMMENT='실시간 채팅을 위한 테이블';
```
