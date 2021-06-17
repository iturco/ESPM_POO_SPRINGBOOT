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

ALTER TABLE `espm.poo.ativo`.`ativo` 
CHANGE COLUMN `idAtivo` `id_ativo` VARCHAR(64) NOT NULL ,
CHANGE COLUMN `txNome` `tx_nome` VARCHAR(64) NOT NULL ,
CHANGE COLUMN `txSimbolo` `tx_simbolo` VARCHAR(45) NOT NULL ;
