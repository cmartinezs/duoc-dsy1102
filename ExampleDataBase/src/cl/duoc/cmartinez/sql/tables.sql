/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  cmartinezs
 * Created: Nov 22, 2024
 */

CREATE TABLE `libreria`.`libro` (
  `idlibro` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(45) NOT NULL,
  `autor` VARCHAR(45) NOT NULL,
  `publicacion` DATE NOT NULL,
  `precio` INT NOT NULL,
  `disponible` BIT(1) NOT NULL,
  PRIMARY KEY (`idlibro`)
);


