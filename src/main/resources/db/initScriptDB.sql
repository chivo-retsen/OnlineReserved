CREATE DATABASE  IF NOT EXISTS `reserved_tickets` DEFAULT CHARACTER SET utf8 ;

USE `reserved_tickets`;

CREATE TABLE `reserved_tickets`.`cinema` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `address` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `reserved_tickets`.`film` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `genre` VARCHAR(100) NOT NULL,
  `country` VARCHAR(100) NOT NULL,
  `duration` INT NOT NULL,
  `year` INT NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `reserved_tickets`.`individual_cabinet` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `login` VARCHAR(45) NOT NULL,
  `firstName` VARCHAR(45) NOT NULL,
  `lastName` VARCHAR(45) NOT NULL,
  `phoneNumber` INT(11) NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `reserved_tickets`.`reserved_ticket` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `code` INT NOT NULL,
  `value` INT NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `reserved_tickets`.`seance` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `date` DATE NOT NULL,
  `time` TIME NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `reserved_tickets`.`seat` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `row` INT NOT NULL,
  `place` INT NOT NULL,
  PRIMARY KEY (`id`));


