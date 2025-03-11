DROP TRIGGER IF EXISTS AutorLogInsert;
-- Cria Trigger Tgr_ItensVenda_Insert
DELIMITER $$
CREATE TRIGGER AutorLogInsert
AFTER INSERT -- A Trigger dispara após o INSERT
ON Autor
FOR EACH ROW
BEGIN
 INSERT INTO -- Insere registro na tabela AutorLog
 AutorLog (Operation, ChangeDate, UserName, NewID_Autor, NewAutor, NewDtNasc, NewID_Edit)
 SELECT 'Insert', NOW(), CURRENT_USER(), NEW.ID_autor, NEW.nome_autor, NEW.dt_nasc, NEW.fk_ID_edit;
END $$
DELIMITER ;

DROP TRIGGER IF EXISTS AutorLogDelete;
-- Cria Trigger Tgr_ItensVenda_Delete
DELIMITER $$
CREATE TRIGGER AutorLogDelete
AFTER DELETE -- A Trigger dispara após o DELETE
ON Autor
FOR EACH ROW
BEGIN
 INSERT INTO -- Insere registro na tabela AutorLog
 AutorLog (Operation, ChangeDate, UserName, OldID_Autor, OldAutor, OldDtNasc, OldID_Edit)
 SELECT 'Delete', NOW(), CURRENT_USER(), OLD.ID_autor, OLD.nome_autor, OLD.dt_nasc, OLD.fk_ID_edit;
END $$
DELIMITER ;