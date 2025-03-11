massa= float(dadosPrimitivos.input("Digite o valor da massa em grama: "))
tempo = 0 

while massa >= 0.5:
    massa = massa/2
    tempo += 50

print(f"Massa final igual: {massa}, e o tempo em segundos foi de: {tempo}")
