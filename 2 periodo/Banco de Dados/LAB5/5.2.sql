DELIMITER $$
CREATE FUNCTION CalcSalario (valor_inicial INT)
RETURNS INT
DETERMINISTIC
BEGIN
	DECLARE salario INT DEFAULT 0;
	WHILE salario <= 3000 DO
	SET salario = salario + valor_inicial;
	END WHILE;
	RETURN salario;
END; $$
DELIMITER ;
SELECT CalcSalario(2000) AS 'Salário Final';