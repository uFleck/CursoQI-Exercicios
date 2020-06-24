CREATE DATABASE bd_atividade25;

USE bd_atividade25;

CREATE TABLE cliente(
	idcliente INT ZEROFILL NOT NULL AUTO_INCREMENT,
    nome VARCHAR(60) NOT NULL,
    cpf CHAR(11) NOT NULL,
    rg VARCHAR(14) NOT NULL,
    telefone VARCHAR(20) NOT NULL,
    CONSTRAINT pk_cliente PRIMARY KEY(idcliente),
	CONSTRAINT uk_cpfcliente UNIQUE KEY(cpf)
);

SHOW TABLES;