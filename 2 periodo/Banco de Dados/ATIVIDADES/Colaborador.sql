DROP DATABASE TESTEBSI;
CREATE DATABASE TESTEBSI;
USE TESTEBSI;

CREATE TABLE Colaborador (
Matricula INT PRIMARY KEY,
Nome VARCHAR(50),
CPF VARCHAR(20),
Dt_Nascimento DATE
);

CREATE TABLE Dependente (
ID_Dep INT PRIMARY KEY,
Nome VARCHAR(50),
Dt_Nasc DATE,
Parentesco VARCHAR(20),
fk_Colaborador_Matricula INT
);

ALTER TABLE Dependente ADD CONSTRAINT FK_Dependente_2
	FOREIGN KEY (fk_Colaborador_Matricula)
	REFERENCES Colaborador (Matricula)
	ON DELETE CASCADE;

INSERT INTO Colaborador (Matricula, Nome, CPF, Dt_Nascimento)
	VALUES (123, 'Maria', '12345','1990-10-12'),
			(124, 'Pedro', '45678','1992-05-19'),
			(125, 'João', '78904','1995-03-01');
            
INSERT INTO Dependente (ID_Dep, Nome, Dt_Nasc, Parentesco, fk_Colaborador_Matricula)
	VALUES (200, 'Huguinho', '2020-10-12','Filho',123),
			(300, 'Zezinho', '2022-05-19','Filho',123),
			(400, 'Luizinho', '2021-03-01','Enteado',125);

SELECT Matricula, CPF, Nome, Dt_Nascimento,
		TIMESTAMPDIFF(YEAR, Dt_Nascimento, NOW() ) AS Idade
FROM Colaborador;

SELECT ID_Dep, Nome, Dt_Nasc,
	TIMESTAMPDIFF(YEAR, Dt_Nasc, NOW() ) AS 'Idade da Criança',
	fk_Colaborador_Matricula AS 'Mat. Colaborador'
FROM Dependente;

/* CREATE TABLE Colaborador (
    Matricula INT PRIMARY KEY,
    Nome VARCHAR(50),
    CPF VARCHAR(20),
    Dt_Nascimento DATE
);

CREATE TABLE Dependente (
    ID_Dep INT PRIMARY KEY,
    Nome VARCHAR(50),
    Data_Nasc DATE,
    Parentesco VARCHAR(20),
    fk_Colaborador_Matricula INT
);
 
ALTER TABLE Dependente ADD CONSTRAINT FK_Dependente_2
    FOREIGN KEY (fk_Colaborador_Matricula)
    REFERENCES Colaborador (Matricula)
    ON DELETE CASCADE;
    
    
INSERT INTO colaborador (Matricula, Nome, CPF, Dt_Nascimento)
	VALUES 					(123, 'Maria', '12345','1990-10-12'),
							(124, 'Pedro', '45678','1992-05-19'),
                            (125, 'João', '78910','1995-03-01');

    
INSERT INTO Dependente(ID_Dep, Nome, Data_Nasc, Parentesco, fk_Colaborador_Matricula)
	VALUES 				('200', 'Huguinho', '2020-10-12', 'Filho', 123),
						('201', 'Zezinha', '2022-09-19', 'Filho', 123),
                        ('202', 'Luizinho', '2021-03-02', 'Enteado', 125);
                        
SELECT 
    ID_Dep,
    Nome,
    Data_Nasc,
    TIMESTAMPDIFF(YEAR,
        Data_Nasc,
        NOW()) AS 'Idade da Criança', 
        fk_Colaborador_Matricula AS 'MAT.Colaborador'
FROM
    Dependente; */
    
CREATE TABLE Projeto (
    ID_Projeto INT PRIMARY KEY,
    nomeProjeto VARCHAR(50)
);

DROP TABLE Trabalha;
CREATE TABLE Trabalha (
    ID_Trabalho INT PRIMARY KEY,
    DataInicio DATE,
    DataFim DATE NOT NULL,
    fk_Colaborador_Matricula INT NOT NULL,
    fk_Projeto_ID_Projeto INT NOT NULL
);

ALTER TABLE Trabalha ADD CONSTRAINT FK_Trabalha_2
    FOREIGN KEY (fk_Colaborador_Matricula)
    REFERENCES Colaborador (Matricula)
    ON DELETE RESTRICT;
 
ALTER TABLE Trabalha ADD CONSTRAINT FK_Trabalha_3
    FOREIGN KEY (fk_Projeto_ID_Projeto)
    REFERENCES Projeto (ID_Projeto);
    
SELECT Matricula, C.Nome AS Colaborador, 
	TIMESTAMPDIFF(YEAR, C.Dt_Nascimento, NOW()) AS 'Idade Colaborador',
	TIMESTAMPDIFF(YEAR, D.Dt_Nasc, NOW()) AS 'Idade Dependente',
	D.Parentesco

FROM Colaborador AS C, Dependente AS D
WHERE C.Matricula = D.fk_Colaborador_Matricula;
                            
                            
							