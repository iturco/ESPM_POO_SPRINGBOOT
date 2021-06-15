CREATE TABLE `espm.poo.ativo`.`cotacao` (
  `idCotacao` VARCHAR(64) NOT NULL,
  `idAtivo` VARCHAR(64) NOT NULL,
  `nrValor` DECIMAL(12,2) NOT NULL,
  `dtData` DATE NOT NULL,
  PRIMARY KEY (`idCotacao`));
