USE LAB_04;
CREATE TABLE Empresa (
ID INT PRIMARY KEY AUTO_INCREMENT,
Nome VARCHAR(20),
Atuacao VARCHAR(50),
Cidade VARCHAR(20),
Estado VARCHAR(2)
);

INSERT Empresa (Nome, Atuacao, Cidade, Estado) VALUES
('ACME Corp.','Cartoons','São Paulo','SP'),
('Estrela Ltda.', 'Transporte passageiros','Campinas','SP'),
('Aurora','Panificadora','Belo Horizonte','MG'),
('Azul','Aviação','São Paulo','SP'),
('Leão Ltda.','Bebidas','Curitiba','PR'),
('Petit S.A.','Queijos e frios', 'Uberlândia','MG'),
('Barreados Corp.','Alimentos congelados','Morretes','PR');
SELECT * FROM Empresa;

CREATE TABLE Estoque (
ID INT PRIMARY KEY AUTO_INCREMENT,
Nome VARCHAR(20),
Qtde INT DEFAULT 10,
ValUnit DECIMAL(10,2)
);
INSERT Estoque (Nome, Qtde, ValUnit) 
VALUES
('caderno',200,15.00),
('borracha',50,6.50),
('caneta',300, 5.50),
('régua 30cm',80, 10.00),
('lápis',500, 4.00),
('bloco A4',35, 18.45);
SELECT * FROM Estoque;
