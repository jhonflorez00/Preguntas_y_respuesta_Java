-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 12-09-2021 a las 23:37:22
-- Versión del servidor: 10.4.20-MariaDB
-- Versión de PHP: 7.3.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `pregunta_y_respuesta`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pregunta`
--

CREATE TABLE `pregunta` (
  `id` int(11) NOT NULL,
  `pregunta` varchar(280) NOT NULL,
  `opciones` varchar(280) NOT NULL,
  `respuesta` int(11) NOT NULL,
  `categoria` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `pregunta`
--

INSERT INTO `pregunta` (`id`, `pregunta`, `opciones`, `respuesta`, `categoria`) VALUES
(1, '¿Cuántos minutos tiene una hora?', '1) 40 minuto ,2) 50 minutos ,3) 60 minutos, 4) 70 minutos', 3, 1),
(2, '¿Cuál es el río más caudaloso del mundo?', '1)Nilo ,2)Amazonas , 3)Rio Misisipi, 4)Danubio', 2, 1),
(3, '¿Cada cuántos años tenemos un año bisiesto?', '1) 2 años ,2) 3 años,3) 5años, 4) 4años', 4, 1),
(4, '¿Cuántos meses tienen 28 días?', '1) febrero,2) los 12 meses,3) 2 meses ,4)ninguno de los anteriares', 2, 1),
(5, '¿Quién fue Cleopatra?', '1)la última faraona de Egipto, 2)una reina, 3)una egipcia, 4)una emperatriz', 1, 1),
(6, '¿Qué planeta es el más cercano al Sol?', '1)Tierra,2)Venus,3)Mercurio,4)Júpiter', 3, 2),
(7, '¿Qué huesos encontramos en el antebrazo?', '1)esternón,2)castillas,3)fémur,4)Cúbito y Radio', 4, 2),
(8, '¿Cuáles son los cinco continentes?', '1)Europa África Asia América y Oceanía,2)Europa África Asia, América y Rusia,3)Colombia, África, Asia, América y SurAmerica,4)EE.UU España UK Africa', 1, 2),
(9, '¿Cuándo termina la Edad Antigua?', '1)En el 475 d.C.,2)En el 500 d.C,3)En el 477 d.C,4) En el 476 d.C.', 4, 2),
(10, '¿Cuáles son los estados de la materia?', '1)Sólido líquido gaseoso plasma,2)Sólido líquido gaseoso,3)Sólido líquido gas,4) Sólido líquido Materia', 1, 2),
(11, ' En música, ¿A cuántos tiempos equivale una blanca?', '1)dos tiempos,2)tres tiempos,3)cuatro tiempos,4) cinco tiempos', 1, 3),
(12, '¿Qué tipo de instrumento es un piano?', '1) instrumento de percusión,2) instrumento de cuerdas,3) instrumento de teclas,4)  instrumento de cuerdas largas', 1, 3),
(13, '¿Qué son los montes Urales?', '1) una montaña ,2) Un sitio de Rusia,3) la frontera entre Europa y Asia,4)  un lugar turístico', 3, 3),
(14, '¿Cómo se llaman los huesecillos del oído en los cuales el sonido rebota hasta llegar a la cóclea?', '1) Clavícula ,2) martillo el yunque y el estribo,3) hioides,4)  humero', 2, 3),
(15, '¿Cuántos kilos son una tonelada?', '1) 100 kilos ,2) 1000 kilos ,3) 10000 kilos,4)  100 kilos', 2, 3),
(16, ' ¿Cuál fue el primer país en aprobar el sufragio femenino?', '1) Nueva Zelanda. ,2) Colombia ,3) España,4)  Rusia', 1, 4),
(17, '¿En qué año llegó el hombre a la Luna?', '1) año 1968 ,2) año 1969.,3) año 1967.,4)  año 1970.', 2, 4),
(18, '¿Qué importante batalla tuvo lugar en 1815?', '1) La batalla de Waterloo. ,2) La batalla de Boyacá,3)La batalla de los 1000 días,4)La batalla de los españoles.', 1, 4),
(19, ' ¿Cuál era la ciudad hogar de Marco Polo?', '1) Mónaco ,2) París,3)Venecia,4)nueva zaleado', 3, 4),
(20, '¿En qué año tuvo lugar el genocidio de Ruanda?', '1)  en el año 1991 ,2)  en el año 1994,3) en el año 1996,4) en el año 1993', 2, 4),
(21, '¿Quién fue el primer presidente de la democracia española después del franquismo?', '1)  Adolfo Angarita,2)  Adolfo Rodríguez,3) Carlos Rojo,4) Adolfo Suárez.', 4, 5),
(22, '¿En qué año se disolvió la Unión Soviética?', '1)  sucedió en el 1900,2)  sucedió en el 1992,3) sucedió en el 1991,4) sucedió en el 1990', 3, 5),
(23, ' ¿De qué país se independizó Eslovenia?', '1)  Suecia,2)  Yugoslavia,3) Turquía,4) París', 2, 5),
(24, ' ¿Qué carabela no regresó del primer viaje de Colón al Nuevo Mundo?', '1)  la Pinta,2)  la Niña,3) La Santa María,4) la Rosa', 3, 5),
(25, ' ¿Quién era el emperador de Roma cuando murió Jesús de Nazaret?', '1)  Marco Aurelio,2)  Nerón.,3) Julio César,4) Tiberio', 4, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `premio`
--

CREATE TABLE `premio` (
  `id` int(11) NOT NULL,
  `nombre` varchar(280) NOT NULL,
  `cc` int(20) NOT NULL,
  `premio` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `pregunta`
--
ALTER TABLE `pregunta`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `premio`
--
ALTER TABLE `premio`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `pregunta`
--
ALTER TABLE `pregunta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT de la tabla `premio`
--
ALTER TABLE `premio`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
