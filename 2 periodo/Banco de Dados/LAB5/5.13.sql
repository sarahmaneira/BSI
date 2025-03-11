DROP TRIGGER IF EXISTS AutorLogUpdate;
-- Cria Trigger Tgr_ItensVenda_Update
DELIMITER $$
CREATE TRIGGER AutorLogUpdate
AFTER UPDATE -- A Trigger dispara após o UPDATE
ON Autor
FOR EACH ROW
BEGIN
 INSERT INTO -- Insere registro na tabela AutorLog
 AutorLog (Operation, ChangeDate, UserName, OldID_Autor, NewID_Autor, OldAutor, NewAutor,OldDtNasc,NewDtNasc, OldID_Edit, NewID_Edit)
 SELECT 'Update', NOW(), CURRENT_USER(), OLD.ID_autor, NEW.ID_autor, OLD.nome_autor, NEW.nome_autor, OLD.dt_nasc, NEW.dt_nasc, OLD.fk_ID_edit, NEW.fk_ID_edit;
END $$
DELIMITER ;