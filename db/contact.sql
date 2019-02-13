-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Feb 13, 2019 at 10:58 AM
-- Server version: 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `contact`
--
CREATE DATABASE IF NOT EXISTS `contact` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
USE `contact`;

-- --------------------------------------------------------

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
CREATE TABLE IF NOT EXISTS `address` (
`id` int(11) NOT NULL,
  `identificationid` int(11) NOT NULL,
  `type` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT 'Type of address;',
  `number` int(11) DEFAULT NULL,
  `street` varchar(150) COLLATE utf8_bin DEFAULT NULL,
  `unit` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `city` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `state` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `zip` varchar(20) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=2 ;

--
-- Dumping data for table `address`
--

INSERT INTO `address` (`id`, `identificationid`, `type`, `number`, `street`, `unit`, `city`, `state`, `zip`) VALUES
(1, 1, 'Home', 25, 'Missing one', 'Unkown.', 'Somewhere', 'calamity', 'RAR');

-- --------------------------------------------------------

--
-- Table structure for table `communication`
--

DROP TABLE IF EXISTS `communication`;
CREATE TABLE IF NOT EXISTS `communication` (
`id` int(11) NOT NULL,
  `identificationid` int(11) DEFAULT NULL,
  `type` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `value` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `preferred` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=2 ;

--
-- Dumping data for table `communication`
--

INSERT INTO `communication` (`id`, `identificationid`, `type`, `value`, `preferred`) VALUES
(1, 1, 'Personal', '1234556', 1);

-- --------------------------------------------------------

--
-- Table structure for table `identification`
--

DROP TABLE IF EXISTS `identification`;
CREATE TABLE IF NOT EXISTS `identification` (
`id` int(11) NOT NULL,
  `dob` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `firstname` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `gender` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `lastname` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `title` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=6 ;

--
-- Dumping data for table `identification`
--

INSERT INTO `identification` (`id`, `dob`, `firstname`, `gender`, `lastname`, `title`) VALUES
(1, '1987-02-21', 'Jeremias', 'M', 'caras', 'Mr.'),
(2, '1987-02-21', 'Jeremias', 'M', 'caras', 'Mr.'),
(3, '1987-01-21', 'Jeremy', 'M', 'Caras', 'Mr.'),
(4, '1987-01-21', 'Jery', 'M', 'Caras', 'Mr.'),
(5, '1987-01-22', 'Jc', 'M', 'Caras', 'Mr.');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `address`
--
ALTER TABLE `address`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `communication`
--
ALTER TABLE `communication`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `identification`
--
ALTER TABLE `identification`
 ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `address`
--
ALTER TABLE `address`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `communication`
--
ALTER TABLE `communication`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `identification`
--
ALTER TABLE `identification`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
