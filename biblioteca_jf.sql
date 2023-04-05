-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 05-11-2022 a las 04:08:10
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `biblioteca_jf`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `autores`
--

CREATE TABLE `autores` (
  `id_Autor` int(11) NOT NULL,
  `nombre_Autor` varchar(60) NOT NULL,
  `Nacionalidad` varchar(30) NOT NULL,
  `Sexo` int(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `autores_libros`
--

CREATE TABLE `autores_libros` (
  `Libro_id` int(11) NOT NULL,
  `Autor_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ejemplares`
--

CREATE TABLE `ejemplares` (
  `id_Ejemplar` int(11) NOT NULL,
  `Localizacion` varchar(60) NOT NULL,
  `Libro_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ejemplares_usuarios`
--

CREATE TABLE `ejemplares_usuarios` (
  `Fecha_Prestamo` date NOT NULL,
  `Fecha_Devolucion` date NOT NULL,
  `Estado_Prestamo` varchar(30) NOT NULL,
  `Ejemplar_id` int(11) NOT NULL,
  `Usuario_Cedula` int(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libros`
--

CREATE TABLE `libros` (
  `id_Libro` int(12) NOT NULL,
  `Titulo` varchar(80) NOT NULL,
  `N°_Paginas` int(11) NOT NULL,
  `Editorial` varchar(60) NOT NULL,
  `Categoria` text NOT NULL,
  `Fecha_Lanzamiento` varchar(12) NOT NULL,
  `Stock` int(11) NOT NULL,
  `Disponibilidad` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `Cedula_Usuario` int(12) NOT NULL,
  `Nombres_Usuario` varchar(60) NOT NULL,
  `Telefono` varchar(15) NOT NULL,
  `Correo` varchar(60) NOT NULL,
  `Sexo` varchar(20) NOT NULL,
  `Fecha_Nacimiento` varchar(12) NOT NULL,
  `Direccion` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`Cedula_Usuario`, `Nombres_Usuario`, `Telefono`, `Correo`, `Sexo`, `Fecha_Nacimiento`, `Direccion`) VALUES
(103666857, 'sara ', '3012264543', 'comunicadora.saraguerra@gmail.com', 'Femenino', '23/06/1996', 'sabaneta'),
(123456789, 'Camilo', '3228524987', 'camilo@gmail.com', 'No definifinido', '12/01/1998', 'calle 12 Itagui'),
(654987321, 'Juan Diego', '4569871', 'diego@gmail.com', 'Sin Especificar', '18/08/2000', 'calle 12'),
(1017210403, 'jhon Fredy Mneidtea Suarez', '3012264543', 'jhonfcompu@gmail.com', 'Masculino', '23/03/1993', 'av47 #63-17'),
(1036668573, 'Sara Guerra Serna', '3105435777', 'comunicadora.saraguerra@gmail.com', 'Femenino', '23/06/1996', 'sabaneta Calle larga');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `autores`
--
ALTER TABLE `autores`
  ADD PRIMARY KEY (`id_Autor`);

--
-- Indices de la tabla `autores_libros`
--
ALTER TABLE `autores_libros`
  ADD UNIQUE KEY `id_Libro` (`Libro_id`,`Autor_id`),
  ADD KEY `id_Autor` (`Autor_id`);

--
-- Indices de la tabla `ejemplares`
--
ALTER TABLE `ejemplares`
  ADD PRIMARY KEY (`id_Ejemplar`),
  ADD UNIQUE KEY `id_Libro` (`Libro_id`);

--
-- Indices de la tabla `ejemplares_usuarios`
--
ALTER TABLE `ejemplares_usuarios`
  ADD UNIQUE KEY `id_Ejemplar` (`Ejemplar_id`,`Usuario_Cedula`),
  ADD UNIQUE KEY `Usuario_Cedula` (`Usuario_Cedula`);

--
-- Indices de la tabla `libros`
--
ALTER TABLE `libros`
  ADD PRIMARY KEY (`id_Libro`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`Cedula_Usuario`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `autores_libros`
--
ALTER TABLE `autores_libros`
  ADD CONSTRAINT `autores_libros_ibfk_1` FOREIGN KEY (`Autor_id`) REFERENCES `autores` (`id_Autor`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `ejemplares`
--
ALTER TABLE `ejemplares`
  ADD CONSTRAINT `ejemplares_ibfk_1` FOREIGN KEY (`id_Ejemplar`) REFERENCES `ejemplares_usuarios` (`Ejemplar_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ejemplares_ibfk_2` FOREIGN KEY (`Libro_id`) REFERENCES `libros` (`id_Libro`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `ejemplares_usuarios`
--
ALTER TABLE `ejemplares_usuarios`
  ADD CONSTRAINT `ejemplares_usuarios_ibfk_1` FOREIGN KEY (`Usuario_Cedula`) REFERENCES `usuarios` (`Cedula_Usuario`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `libros`
--
ALTER TABLE `libros`
  ADD CONSTRAINT `libros_ibfk_1` FOREIGN KEY (`id_Libro`) REFERENCES `autores_libros` (`Libro_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
