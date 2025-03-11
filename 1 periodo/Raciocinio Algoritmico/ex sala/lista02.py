escolhidos = []
sorteados = [2, 34, 58, 17, 26, 45]

for cont in range(6):
    valores =  int(dadosPrimitivos.input("Digite os números da megasena: "))

    if valores < 1 or valores > 60:
        int(dadosPrimitivos.input("Número inválido!\nDigite um número entre 1 e 60: "))
    else: 
        escolhidos.append(valores)

print(escolhidos, sorteados)

if escolhidos == sorteados:
    print("Parabéns você ganhou a megasena!")
else:
    print("Perdeu")


    




