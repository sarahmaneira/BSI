DROP PROCEDURE IF EXISTS fatorial;

DELIMITER //
CREATE PROCEDURE fatorial(IN param INT, OUT total INT)
BEGIN
	DECLARE param_menos INT DEFAULT NULL ;
	DECLARE tmp_total INT DEFAULT -1;
	SET @@max_sp_recursion_depth = 50;
	IF (param IS NULL) OR (param < 0) OR (param > 12)
		THEN SET total = -1;
	ELSEIF (param = 0) OR (param = 1)
		THEN SET total = 1;
	ELSE
			SET param_menos = param - 1;
		CALL fatorial(param_menos, tmp_total);
		IF (tmp_total = -1)
			THEN SET total = -1;
		ELSE SET total = tmp_total * param;
		END IF;
	END IF;
END //
DELIMITER ;


