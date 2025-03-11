-- FAÇA O DROP E NOVAMENTE O CREATE E INSERT DE TODOS OS VALORES ORIGINAIS DA TABELA EDITORA DA PRÁTICA 4.2
-- FAÇA O DROP DA TABELA AUTOR
-- Alterando Tabela Autor
CREATE TABLE Autor -- Alterando Tabela Autor
(
ID_Autor INT AUTO_INCREMENT PRIMARY KEY, -- Tabela FILHO
 Nome_Autor VARCHAR(60) NOT NULL,
 Dt_Nasc DATE NOT NULL,
fk_ID_Edit INT NULL
);

ALTER TABLE Autor ADD CONSTRAINT FK_Autor_Editora FOREIGN KEY(fk_ID_edit)
REFERENCES Editora (ID_edit)
ON UPDATE RESTRICT
ON DELETE RESTRICT ;

ALTER TABLE Autor AUTO_INCREMENT = 100; -- Seed = 100 (início do AUTO_INCREMENT) 

INSERT Autor (Nome_Autor, Dt_Nasc, fk_ID_Edit) VALUES ('José', '1956-09-08', 1);
INSERT Autor (Nome_Autor, Dt_Nasc, fk_ID_Edit) VALUES ('Maria', '1975-04-18', 2);
INSERT Autor (Nome_Autor, Dt_Nasc, fk_ID_Edit) VALUES ('Antônia', '1954-12-10', 3);
INSERT Autor (Nome_Autor, Dt_Nasc, fk_ID_Edit) VALUES ('Armínio', '1976-07-28', 5);
INSERT Autor (Nome_Autor, Dt_Nasc, fk_ID_Edit) VALUES ('Luiza', '1945-11-09', 5);

SELECT * FROM Autor;
