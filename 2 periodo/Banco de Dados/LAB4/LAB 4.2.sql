CREATE TABLE Editora
(
ID_edit INT AUTO_INCREMENT PRIMARY KEY, -- Tabela PAI
 Nome_Edit VARCHAR(60) NOT NULL,
 Cidade VARCHAR(60) NOT NULL,
Estado CHAR(2) NOT NULL,
 Pais VARCHAR(50) NOT NULL
);
INSERT Editora (Nome_Edit, Cidade, Estado, Pais) VALUES ('Editora AAA', 'São Paulo', 'SP', 'Brasil');
INSERT Editora (Nome_Edit, Cidade, Estado, Pais) VALUES ('Editora Sul', 'Porto Alegre', 'RS', 'Brasil');
INSERT Editora (Nome_Edit, Cidade, Estado, Pais) VALUES ('LTC', 'São Paulo', 'SP', 'Brasil');
INSERT Editora (Nome_Edit, Cidade, Estado, Pais) VALUES ('CENGAGE', 'Rio de Janeiro', 'RJ', 'Brasil');
INSERT Editora (Nome_Edit, Cidade, Estado, Pais) VALUES ('Três Estrelas', 'Alagoas', 'CE', 'Brasil');
SELECT * FROM Editora;
