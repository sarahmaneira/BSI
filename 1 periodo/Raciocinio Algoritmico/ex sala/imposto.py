salario = float(dadosPrimitivos.input("Digite o seu salário: "))

if 1257.13 < salario < 2512.08:
    print(salario - (salario* 15/100))
    print((salario*15)/100)
elif salario > 2512.08:
    print(salario - (salario* 27.5/100))
else:
    print("Isento de imposto!")