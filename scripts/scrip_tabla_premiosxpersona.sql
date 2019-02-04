CREATE TABLE PremioxPersona (
       idPersona int(11) NOT NULL,
       idPremio int(11) NOT NULL,
       FOREIGN KEY (idPersona) REFERENCES Personas(id),
        FOREIGN KEY (idPremio) REFERENCES Premios(codigo));
        
       
        