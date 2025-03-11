fatorial = 1
num = int(dadosPrimitivos.input("Digite um valor: "))

if num >= 1:
    contador = num
    while contador > 1:
        fatorial = fatorial * contador
        contador = contador - 1
    print("Fatorial = ", fatorial) 
else:
    if num == 0:
        print("Fatorial = ", num)
    else:
        print("numero negativo!")