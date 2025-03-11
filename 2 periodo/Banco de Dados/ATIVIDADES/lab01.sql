CREATE DATABASE Carro;
USE Carro;

CREATE TABLE Carro (
    CodCarro INT PRIMARY KEY,
    Marca VARCHAR(100),
    Modelo VARCHAR(100),
    AnoFabricacao INT,
    Kilometragem FLOAT,
    Cor VARCHAR(50)
);

INSERT INTO Carro(CodCarro, Marca, Modelo, AnoFabricacao, Kilometragem, Cor)
VALUES(1, "Volkswagen", "Polo", 2022, 60000, "Branco"),
(2, "Hyundai", "HB20", 2020, 20000, "Azul"),
(3,"Volvo", "XC60", 2024, 0, "Cinza"),
(4,"Ford", "Ka", 2010, 40000, "Vermelho");

SELECT * FROM Carro;

UPDATE Carro
SET Cor = "Rosa"
WHERE CodCarro = 4;

UPDATE Carro
SET AnoFabricacao = "2007"
WHERE CodCarro = 3;

DELETE FROM Carro WHERE CodCarro = 2;