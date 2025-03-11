DROP TABLE IF EXISTS AutorLog;

-- Tabela de LOG (rastreamento) referente à Tabela Autor
CREATE TABLE AutorLog (
	ID_log INT AUTO_INCREMENT PRIMARY KEY,
	Operation CHAR(6) NOT NULL, -- Operação realizada
	ChangeDate DATETIME NOT NULL, -- Data da realização da operação
	UserName VARCHAR(20) NOT NULL, -- Usuário de BD que realizou a operção
	OldID_Autor INT NULL, -- Valor antigo para ID_Autor
	NewID_autor INT NULL, -- Valor novo para ID_Autor
	OldAutor VARCHAR(50) NULL, -- Valor antigo para Nome de Autor
	NewAutor VARCHAR(50) NULL, -- Valor novo para Nome de Autor
	OldDtNasc DATE NULL, -- Valor antigo para Data de Nascimento do Autor
	NewDtNasc DATE NULL, -- Valor novo para Data de Nascimento do Autor
	OldID_Edit INT NULL, -- Valor antigo para ID do Editor do Autor
	NewID_Edit INT NULL -- Valor novo para ID do Editor do Autor
);

SELECT * FROM AutorLog;