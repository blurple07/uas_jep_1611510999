# Host: localhost  (Version 5.5.5-10.1.38-MariaDB)
# Date: 2019-06-16 22:40:18
# Generator: MySQL-Front 6.1  (Build 1.26)


#
# Structure for table "categories"
#

DROP TABLE IF EXISTS `categories`;
CREATE TABLE `categories` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(80) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `subcategory` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

#
# Data for table "categories"
#

INSERT INTO `categories` VALUES (1,'Komputer','Buku Komputer','PHP'),(2,'Agama','Buku Agama','Islam');

#
# Structure for table "books"
#

DROP TABLE IF EXISTS `books`;
CREATE TABLE `books` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(150) NOT NULL,
  `author` varchar(50) DEFAULT NULL,
  `publisher` varchar(50) DEFAULT NULL,
  `category_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `category_id` (`category_id`),
  CONSTRAINT `category_id` FOREIGN KEY (`category_id`) REFERENCES `categories` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

#
# Data for table "books"
#

INSERT INTO `books` VALUES (1,'Pemrograman PHP','Faisal','Erlangga',1,NULL),(2,'Permograman ASP','Luthfi','Erlangga',1,NULL),(3,'Belajar Shola','Faisal Luthfi','Mizan',2,NULL);
