n_Linhas = 2
n_Colunas = 2
matriz = [0] * n_Linhas

for linha in range(n_Linhas):
    matriz[linha] = [0] * n_Colunas

for linha in range(n_Linhas):
    for coluna in range(n_Colunas):
        notas = int(dadosPrimitivos.input("Digite as notas: "))
        matriz[coluna].append(notas)
    print(matriz)

for linha in range(n_Linhas):
    media = 0 
    soma