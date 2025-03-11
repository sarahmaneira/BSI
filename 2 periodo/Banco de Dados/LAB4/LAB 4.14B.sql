-- Funções trigonométricas usam ângulos em radianos:
SET @angle = PI()/4; -- 45º em rad
SELECT CONCAT( 'O SENO do ângulo: ' ,
 CONVERT(ROUND(@angle,3), CHAR) ,
 ' rad = ' ,
CONVERT(ROUND(SIN(@angle),3), CHAR)) AS 'SENO 45º (ou PI/4 rad)';

select pi()/4;
