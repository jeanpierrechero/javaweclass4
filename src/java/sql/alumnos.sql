CREATE DATABASE IF NOT EXISTS `abm`;

USE `abm`;

DROP TABLE IF EXISTS `abm`.`alumnos`;
CREATE TABLE `alumnos` (
  `alumno_id` int(10) unsigned NOT NULL auto_increment,
  `nombre` varchar(45) NOT NULL default '',
  `apellido` varchar(45) NOT NULL default '',
  PRIMARY KEY  (`alumno_id`)
);