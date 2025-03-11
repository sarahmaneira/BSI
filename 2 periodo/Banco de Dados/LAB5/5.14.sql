-- Comandos 1) Teste de UPDATE ----
UPDATE Autor SET nome_autor = 'José da Silva'
WHERE ID_autor = 100;
SELECT * FROM Autor;
SELECT * FROM AutorLog;

-- Comandos 2) Teste de INSERT ----
INSERT Autor (nome_autor, dt_nasc, fk_ID_Edit)
VALUES
('Karolina', '1976-06-18', 3),
('Cláudio', '1982-10-28', 4),
('Ricardo', '1990-02-13', 3);
SELECT * FROM Autor;
SELECT * FROM AutorLog;
-- Comandos 3) Teste de DELETE ---
DELETE FROM Autor
WHERE ID_autor = 102 OR ID_autor = 103;
SELECT * FROM Autor;
SELECT * FROM AutorLog;