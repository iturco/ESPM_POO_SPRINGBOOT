CREATE TABLE `espm.poo.carteira`.`transacaocarteira` (
  `id_transacaocarteira` VARCHAR(64) NOT NULL,
  `id_carteira` VARCHAR(64) NOT NULL,
  `id_cotacao` VARCHAR(64) NOT NULL,
  `dt_data` DATETIME NOT NULL,
  `nr_qtd` DECIMAL(14,4) NOT NULL,
  `nr_tipo` INT NOT NULL,
  PRIMARY KEY (`id_transacaocarteira`));
