-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-09-2023 a las 02:00:20
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
-- Base de datos: `universidadejemplo`
--
CREATE DATABASE IF NOT EXISTS `universidadejemplo` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `universidadejemplo`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno`
--

CREATE TABLE `alumno` (
  `idAlumno` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `fechaNacimiento` date NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `alumno`
--

INSERT INTO `alumno` (`idAlumno`, `dni`, `apellido`, `nombre`, `fechaNacimiento`, `estado`) VALUES
(1, 2341235, 'Perez', 'José', '2000-05-25', 1),
(2, 2244335, 'Acosta', 'Mariano', '2001-09-10', 1),
(3, 3244875, 'Godoy', 'Martín', '2003-01-16', 1),
(4, 46526846, 'Chiguay', 'Gisel', '1993-03-23', 1),
(5, 16440902, 'Richard ', 'Rodolfo  ', '1963-02-25', 0),
(6, 25698741, 'Gerez', 'Miryam del Carmen', '2005-09-15', 1),
(7, 40000650, 'Botello', 'Ruben', '1997-09-25', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inscripcion`
--

CREATE TABLE `inscripcion` (
  `idInscripto` int(11) NOT NULL,
  `nota` double NOT NULL,
  `idAlumno` int(11) NOT NULL,
  `idMateria` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `inscripcion`
--

INSERT INTO `inscripcion` (`idInscripto`, `nota`, `idAlumno`, `idMateria`) VALUES
(5, 9, 3, 3),
(6, 4, 3, 1),
(45, 0, 4, 2),
(47, 0, 4, 3),
(49, 7, 1, 3),
(50, 0, 3, 4),
(51, 8, 1, 1),
(52, 5, 2, 2),
(53, 5, 2, 4),
(54, 0, 2, 1),
(55, 0, 5, 15),
(56, 0, 5, 6),
(57, 8, 3, 10),
(58, 5, 7, 2),
(59, 4, 7, 20),
(60, 9, 7, 9),
(62, 2, 7, 24);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia`
--

CREATE TABLE `materia` (
  `idMateria` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `año` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `materia`
--

INSERT INTO `materia` (`idMateria`, `nombre`, `año`, `estado`) VALUES
(1, 'Matemáticas Financiera', 2, 0),
(2, 'Electrotecnia Basica', 3, 1),
(3, 'Educación Funcional', 2, 0),
(4, 'Inglés tecnico', 4, 0),
(5, 'mecanica tecnica', 5, 1),
(6, 'matematica III', 5, 1),
(8, 'informatica Uno', 4, 0),
(9, 'filosofia', 4, 1),
(10, 'Analisis Matematico', 5, 1),
(11, 'base de datos', 4, 1),
(12, 'fisiologia', 4, 1),
(14, 'informatica Dos', 5, 1),
(15, 'Base de datos Dos', 5, 1),
(16, 'electrotecnio', 3, 1),
(17, 'seguridad industrial', 4, 1),
(18, 'astronomia', 5, 1),
(19, 'matematica aplicada', 5, 1),
(20, 'electrotecnia superior', 4, 1),
(21, 'teoria de maquinas', 5, 1),
(22, 'ingenieria legal', 3, 1),
(23, 'quimica inorganica', 4, 1),
(24, 'fisiologia vegetal', 4, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumno`
--
ALTER TABLE `alumno`
  ADD PRIMARY KEY (`idAlumno`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  ADD PRIMARY KEY (`idInscripto`),
  ADD KEY `inscripcion_ibfk_1` (`idAlumno`),
  ADD KEY `inscripcion_ibfk_2` (`idMateria`);

--
-- Indices de la tabla `materia`
--
ALTER TABLE `materia`
  ADD PRIMARY KEY (`idMateria`),
  ADD UNIQUE KEY `nombre` (`nombre`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alumno`
--
ALTER TABLE `alumno`
  MODIFY `idAlumno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  MODIFY `idInscripto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=63;

--
-- AUTO_INCREMENT de la tabla `materia`
--
ALTER TABLE `materia`
  MODIFY `idMateria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  ADD CONSTRAINT `inscripcion_ibfk_1` FOREIGN KEY (`idAlumno`) REFERENCES `alumno` (`idAlumno`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `inscripcion_ibfk_2` FOREIGN KEY (`idMateria`) REFERENCES `materia` (`idMateria`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
