-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-09-2023 a las 16:23:59
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `exam`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `taxonomy`
--

CREATE TABLE `taxonomy` (
  `code` int(15) NOT NULL,
  `animal` varchar(100) NOT NULL,
  `domain` varchar(255) NOT NULL,
  `kingdom` varchar(255) NOT NULL,
  `phylum` varchar(255) NOT NULL,
  `classA` varchar(255) NOT NULL,
  `orderA` varchar(255) NOT NULL,
  `family` varchar(255) NOT NULL,
  `genus` varchar(255) NOT NULL,
  `species` varchar(255) NOT NULL,
  `subspecies` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `taxonomy`
--

INSERT INTO `taxonomy` (`code`, `animal`, `domain`, `kingdom`, `phylum`, `classA`, `orderA`, `family`, `genus`, `species`, `subspecies`) VALUES
(1, 'Perro', 'Eukaryota', 'Animalio', 'Chordata', 'Mammalia', 'Carnivora', 'Canidae', 'Canis', 'Canis', 'familiaris'),
(3, 'Gato', 'Eukaryota', 'Animalia', 'Chordata', 'Mammalia', 'Carnivora', 'Felidae', 'Felis', 'catus', '');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `taxonomy`
--
ALTER TABLE `taxonomy`
  ADD PRIMARY KEY (`code`),
  ADD UNIQUE KEY `animal` (`animal`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `taxonomy`
--
ALTER TABLE `taxonomy`
  MODIFY `code` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
