DROP PROCEDURE IF EXISTS proc_demo2;

DELIMITER \\

CREATE PROCEDURE proc_demo2(IN angle FLOAT, OUT output VARCHAR (100)) 
BEGIN
	SET output = '';
	SET output = CONCAT (output,
		' [ ANGULO_GRAUS = ', CONVERT(ROUND(@angle * 180 / PI (), 3), CHAR), ']',
		' [ ANGULO_RAD = ', CONVERT(ROUND(@angle, 3 ), CHAR), ']',
		' [ SENO = ', CONVERT(ROUND(SIN(@angle),3 ), CHAR), ']',
		' [ COSSENO = ', CONVERT(ROUND(COS(@angle),3 ), CHAR), ']', 
		' [ TANGENTE = ', CONVERT(ROUND(TAN(@angle),3 ), CHAR), ']');
END \\
DELIMITER ;

SET @angle = PI()/3;
SET @resp = '';
CALL proc_demo2(@angle, @resp);
SELECT @resp AS 'RESPOSTA';

SET @angle = PI()/4;
SET @resp = '';
CALL proc_demo2(@angle, @resp);
SELECT @resp AS 'RESPOSTA';

SET @angle = PI()/6;
SET @resp = '';
CALL proc_demo2(@angle, @resp);
SELECT @resp AS 'RESPOSTA';

