CREATE TABLE `dbviajes`.`vuelo` (
                                    `idvuelo` INT NOT NULL AUTO_INCREMENT,
                                    `compañia` VARCHAR(45) NULL,
                                    `fechavuelo` DATE NULL,
                                    `precio` DOUBLE NULL,
                                    `plazasdisponibles` INT NULL,
                                    PRIMARY KEY (`idvuelo`))
    ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
