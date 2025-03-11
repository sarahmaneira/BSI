-- Altera delimitador de comando para não conflitar com a SP
DELIMITER $$
CREATE PROCEDURE proc_demo1() -- Cria procedure proc_demo1(), sem parâmetros
BEGIN
	DECLARE i INT DEFAULT 0; -- Declara e inicializa variáveis locais
	DECLARE output VARCHAR(100) DEFAULT 'Saída = ';
	WHILE i < 10 DO
	SET output = CONCAT(output, i , ', ');
	SET i = i + 1;
	END WHILE;
	SELECT output;
END $$
DELIMITER ; -- Retorna ao delimitador padrão da linguagem

CALL proc_demo1(); 