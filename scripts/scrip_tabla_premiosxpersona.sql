CREATE TABLE PremioxPersona (
		`id` int(11) NOT NULL AUTO_INCREMENT,
       `idPersona` int(11) NOT NULL,
       `idPremio` int(11) NOT NULL,
       PRIMARY KEY (`id`),
       FOREIGN KEY (`idPersona`) REFERENCES Personas(`id`),
        FOREIGN KEY (`idPremio`) REFERENCES Premios(`codigo`));
        
       
        