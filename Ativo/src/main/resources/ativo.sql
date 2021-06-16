CREATE TABLE `espm.poo.ativo`.`ativo` (
  `idAtivo` VARCHAR(64) NOT NULL,
  `txNome` VARCHAR(64) NOT NULL,
  `txSimbolo` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idAtivo`));

  INSERT INTO ativo
(idAtivo,
txNome,
txSimbolo)
VALUES
("8cefc390-ce46-11eb-b8bc-0242ac130003","Petrobras",PETR4.SA);