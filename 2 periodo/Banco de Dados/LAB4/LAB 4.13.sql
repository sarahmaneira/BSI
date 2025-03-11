-- CASE: retorna valor que pode ser atribuído
-- SINTAXE: 
-- CASE
-- WHEN condition1 THEN result1
-- WHEN condition2 THEN result2
-- WHEN conditionN THEN resultN
-- ELSE result
-- END;
INSERT INTO Estoque (Nome, ValUnit) VALUES ('cola bastão', 15.00); -- 1º. INSERT
INSERT INTO Estoque (Nome, Qtde, ValUnit) VALUES ('tesoura', NULL, 15.00); -- 2º. INSERT
SELECT ID AS 'Código', Nome, Qtde AS 'Quantidade',
 CASE
 WHEN Qtde < 100 THEN 'BAIXO'
WHEN Qtde BETWEEN 100 AND 300 THEN 'OK'
 WHEN Qtde > 300 THEN 'ALTO'
 ELSE 'DESCONHECIDO'
 END AS 'Nível Estoque'
FROM Estoque
ORDER BY Nome;
