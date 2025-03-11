-- IF: testa de uma CONDIÇÃO é TRUE ou FALSE, apenas
-- SINTAXE: IF(condition, value_if_true, value_if_false)
SELECT IF (WEEKDAY(NOW()) IN (5, 6), 'É FIM de semana', 'É DIA de semana') AS 'DIA DE HOJE';
SELECT IF (WEEKDAY('2023-09-24') IN (5, 6), 'É FIM de semana', 'É DIA de semana') AS '24/09/2023';

SELECT ID AS 'Código', Nome, 
 Qtde AS 'Quantidade', 
 IF (Qtde < 100, 'Baixo (menor que 100)', 'Em boa quantidade') AS 'Nível Estoque'
FROM Estoque;