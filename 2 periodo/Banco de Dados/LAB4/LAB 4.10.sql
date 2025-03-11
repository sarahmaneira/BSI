SET @nome_produto = 'none'; -- Declara e inicializa variáveis de sessão
SET @total_produtos = -1; 

SELECT nome INTO @nome_produto -- Atribui valor à variável de sessão
FROM Estoque 
WHERE ID = 3; 

SELECT COUNT(*) INTO @total_produtos -- Atribui valor à variável de sessão
FROM Estoque; 

SELECT @nome_produto AS 'Produto com ID = 3';
SELECT @total_produtos AS 'Total de Produtos Cadastrados';