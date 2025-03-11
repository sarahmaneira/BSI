matriz = [[],[]]

for linhas in range(2):
    for colunas in range(2):
        valores = int(dadosPrimitivos.input("Digite os valores da matriz: "))
        matriz[linhas].append(valores)
    print(matriz)


for linhas in range(2):
    soma = 0
    for colunas in range(2):
        soma += matriz[linhas][colunas]
    print(soma)

