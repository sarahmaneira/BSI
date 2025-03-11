-- B
DROP TRIGGER IF EXISTS Tgr_ItensVenda_Insert;

-- Cria Trigger Tgr_ItensVenda_Insert
DELIMITER $$
CREATE TRIGGER Tgr_ItensVenda_Insert
AFTER INSERT -- A Trigger dispara após o INSERT
ON ItensVenda
FOR EACH ROW
BEGIN
	UPDATE EstoqueProduto
	SET Estoque = Estoque - NEW.Quantidade
	WHERE ID_Prod = NEW.fk_ID_Prod;
END $$
DELIMITER ;

-- C
DROP TRIGGER IF EXISTS Tgr_ItensVenda_Delete;

-- Cria Trigger Tgr_ItensVenda_Insert
DELIMITER $$
CREATE TRIGGER Tgr_ItensVenda_Delete
AFTER DELETE -- A Trigger dispara após o DELETE
ON ItensVenda
FOR EACH ROW
BEGIN
	UPDATE EstoqueProduto
	SET Estoque = Estoque + OLD.Quantidade
	WHERE ID_Prod = OLD.fk_ID_Prod;
END $$
DELIMITER ;
