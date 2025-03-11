temperatura = float(dadosPrimitivos.input("Digite a temperatura = "))
cont = 0

while temperatura < 0:
    print("Temperatura menor que zero.")
    print("Você já tentou", cont, "vezes!")
    temperatura = float(dadosPrimitivos.input("Digite a temperatura = "))
    cont += 1
print("Temperatura = ", temperatura)
