DROP TABLE IF EXISTS EstoqueProduto;

-- Cria Tabela EstoqueProduto
CREATE TABLE EstoqueProduto (
ID_Prod INT PRIMARY KEY,
Nome_Prod VARCHAR(20) NOT NULL UNIQUE,
Estoque INT NOT NULL
);

INSERT INTO EstoqueProduto (ID_Prod, Nome_prod, Estoque) VALUES (123, 'Caderno', 100);
INSERT INTO EstoqueProduto (ID_Prod, Nome_prod, Estoque) VALUES (456, 'Bloco A4', 50);
INSERT INTO EstoqueProduto (ID_Prod, Nome_prod, Estoque) VALUES (789, 'Caneta', 200);
SELECT * FROM EstoqueProduto;

DROP TABLE IF EXISTS ItensVenda;

-- Cria Tabela ItensVenda
CREATE TABLE ItensVenda (
ID_Venda INT AUTO_INCREMENT PRIMARY KEY,
fk_ID_Pedido INT, -- Tab Pedido não criada nesta demonstração
fk_ID_Prod INT NOT NULL REFERENCES EstoqueProduto(ID_Prod), -- FK
Quantidade INT NOT NULL,UNIQUE (fk_ID_Pedido, fk_ID_Prod)
);
SELECT * FROM ItensVenda;