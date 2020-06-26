CREATE DATABASE bd_atividade26;

USE bd_atividade26;

CREATE TABLE insalubridade(
	idinsalubridade INT NOT NULL AUTO_INCREMENT,
    tipo VARCHAR(15) NOT NULL,
    CONSTRAINT pk_insalubridade PRIMARY KEY(idinsalubridade)
);

CREATE TABLE cargos(
	idcargos INT NOT NULL AUTO_INCREMENT,
    cargo VARCHAR(60) NOT NULL,
    CONSTRAINT pk_insalubridade PRIMARY KEY(idcargos)
);

CREATE TABLE funcionario(
	idfuncionario INT NOT NULL AUTO_INCREMENT,
	nome VARCHAR(60) NOT NULL,
    cpf CHAR(11) NOT NULL UNIQUE,
    idcargos INT NOT NULL, 
    valorHora INT NOT NULL,
    quantidadeHoras INT NOT NULL,
    horasExtras50 INT NULL,
    horasExtras100 INT NULL,
    dependentes TINYINT NULL,
    idinsalubridade INT NOT NULL,
    CONSTRAINT pk_funcionario PRIMARY KEY(idfuncionario),
    CONSTRAINT fk_insFuncionario FOREIGN KEY(idinsalubridade) 
		REFERENCES insalubridade(idinsalubridade),
	CONSTRAINT fk_cargFuncionario FOREIGN KEY(idcargos)
		REFERENCES cargos(idcargos)
);

INSERT INTO cargos(cargo)
	VALUES ('Dev Júnior'),
		   ('Dev Pleno'),
           ('Dev Sênior'),
           ('Analista Pleno'),
           ('Testador de Software'),
           ('Gestor de Projetos');

INSERT INTO insalubridade(tipo)
	VALUES ('Nenhuma'),
		   ('Mínima'),
		   ('Média'),
           ('Máxima');
           
INSERT INTO funcionario(nome, cpf, idcargos, valorHora, quantidadeHoras, 
						horasExtras50, horasExtras100, dependentes, 
                        idinsalubridade)
	VALUES ('Bruno', '12345678910', 1, 40, 220, 20, 10, 2, 1),
		   ('Camilly', '12345678911', 1, 40, 220, 20, 10, 2, 1),
           ('José', '12345678912', 2, 20, 263, 31, 32, 1, 1),
           ('Marlin', '12345678913', 2, 35, 254, 25, 54, 3, 3),
           ('Rodrigo', '12345678914', 3, 95, 314, 12, 12, 0, 1),
           ('Maria', '12345678915', 3, 15, 15, 14, 16, 0, 1),
           ('Michell', '12345678916', 4, 55, 142, 15, 3, 2, 2),
           ('Minhoca', '12345678917', 4, 36, 234, 32, 32, 3, 2),
           ('Padaria', '12345678918', 5, 65, 361, 32, 34, 3, 1),
           ('Batata', '12345679819', 5, 26, 325, 12, 45, 2, 4),
           ('Frango', '12345678920', 6, 25, 65, 95, 65, 1, 4),
           ('Hipopotamo', '12345678921', 6, 24, 65, 5, 34, 1, 4);
    
DELETE FROM funcionario WHERE nome = 'Maria';

UPDATE funcionario SET nome = 'Rodolfo' WHERE idfuncionario = 12;

SELECT * FROM funcionario;