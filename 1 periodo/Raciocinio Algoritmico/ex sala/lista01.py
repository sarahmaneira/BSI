inteiros = []

for cont in range(10):
    valores = int(dadosPrimitivos.input("Digite um número: "))
    inteiros.append(valores)  

print(inteiros)
pesquisa = int(dadosPrimitivos.input("Digite qual número você deseja buscar: "))

if inteiros.count(pesquisa) == 0:
    print("Não está no vetor.")
else:
    print(f"Dado encontrado na posição: ", {inteiros.index(pesquisa)}) 