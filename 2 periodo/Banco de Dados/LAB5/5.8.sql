INSERT INTO ItensVenda (fk_ID_Pedido, fk_ID_Prod, Quantidade) VALUES (1, 123, 30);
INSERT INTO ItensVenda (fk_ID_Pedido, fk_ID_Prod, Quantidade) VALUES (1, 456, 10);
INSERT INTO ItensVenda (fk_ID_Pedido, fk_ID_Prod, Quantidade) VALUES (1, 789, 25);

SELECT * FROM ItensVenda;
SELECT * FROM EstoqueProduto;

DELETE FROM ItensVenda WHERE fk_ID_Pedido = 1 AND fk_ID_Prod = 123;
DELETE FROM ItensVenda WHERE fk_ID_Pedido = 1 AND fk_ID_Prod = 789;

SELECT * FROM ItensVenda;
SELECT * FROM EstoqueProduto;