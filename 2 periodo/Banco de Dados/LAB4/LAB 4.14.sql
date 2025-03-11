SELECT nome, Atuacao, Cidade, Estado 
FROM Empresa
WHERE
((Cidade <> 'São Paulo' AND Estado <> 'SP')
OR
(Cidade <> 'Morretes' AND Estado <> 'PR')
);

SELECT nome, Atuacao, Cidade, Estado 
FROM Empresa
WHERE NOT (
((Cidade = 'São Paulo' AND Estado = 'SP')
OR
(Cidade = 'Morretes' AND Estado = 'PR'))
);
