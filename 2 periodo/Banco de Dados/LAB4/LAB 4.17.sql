-- conjunto commandos 1:
SET @resp = -1;
CALL fatorial (0, @resp);
SELECT @resp;
-- conjunto commandos 2:
CALL fatorial (13, @resp);
SELECT @resp;
-- conjunto commandos 3:
CALL fatorial (4, @resp);
SELECT @resp;
-- conjunto commandos 4:
CALL fatorial (-4, @resp);
SELECT @resp;
-- conjunto commandos 5:
CALL fatorial (6, @resp);
SELECT @resp