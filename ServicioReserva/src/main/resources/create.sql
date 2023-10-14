CREATE TABLE `dbviajes`.`reserva` (
                                      `idreserva` INT NOT NULL AUTO_INCREMENT,
                                      `nombrecliente` VARCHAR(45) NULL,
                                      `dni` VARCHAR(45) NULL,
                                      `idhotel` INT NULL,
                                      `idvuelo` INT NULL,
                                      PRIMARY KEY (`idreserva`))
    ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
