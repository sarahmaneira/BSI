contador = 1
soma = 0

numero = int(dadosPrimitivos.input("Numero para calculo da tabuada: "))
                   
while contador < 11:
    soma = numero * contador
    print("Valor = ", soma)
    contador = contador + 1