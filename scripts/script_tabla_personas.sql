CREATE TABLE `Personas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nroDocumento` numeric(20) NOT NULL,
  `tipoDocumento` varchar(20) NOT NULL,
  `nombres` varchar(200) NOT NULL,
  `apellidos` varchar(200) NOT NULL,
  `fechaNacimiento` date NOT NULL,
   PRIMARY KEY (`id`)
) ENGINE=InnoDB default charset=utf8;