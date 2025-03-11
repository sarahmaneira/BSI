CREATE DATABASE Lab_04;
USE Lab_04;

CREATE TABLE Tab_Depto(
	ID INT AUTO_INCREMENT PRIMARY KEY,
	Nome VARCHAR(60) NOT NULL DEFAULT ('Vendas'), -- NOT NULL + DEFAULT
	Localizacao VARCHAR(60) DEFAULT ('Bloco A'), -- NULL + DEFAULT
	Sala CHAR(3) NOT NULL, -- NOT NULL
    Fone VARCHAR(20) -- NULL
);

INSERT Tab_Depto (Sala, Fone) VALUES ('80', '(41)3021-4040'); -- B.1) tratamento de campos omitidos
INSERT Tab_Depto (Sala) VALUES ('100'); -- B.2) tratamento de campos omitidos
INSERT Tab_Depto (Localizacao, Sala) VALUES (NULL,'200'); -- B.3) tratamento de NULL
INSERT Tab_Depto (Sala) VALUES (NULL); -- B.4) tratamento de NULL
INSERT Tab_Depto (Localizacao, Sala) VALUES (NULL, '300'); -- B.5) tratamento de NULL
SELECT * FROM Tab_Depto; -- b.6) SELECT Tab_Depto povoada
