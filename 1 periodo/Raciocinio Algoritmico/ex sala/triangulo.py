firstValue = float(dadosPrimitivos.input("Digite o primeiro valor: "))
secondValue = float(dadosPrimitivos.input("Digite o segundo valor: "))
thirdValue = float(dadosPrimitivos.input("Digite o terceiro valor: "))

if (firstValue + secondValue) > thirdValue and (secondValue + thirdValue) > firstValue and (thirdValue + firstValue) > secondValue:

    if firstValue < 0 or secondValue < 0 or thirdValue < 0:
        print("Isso não é um triangulo!")
    elif firstValue == secondValue == thirdValue:
        print("Isso é um triangulo equilatero!")
    elif firstValue == secondValue or firstValue == thirdValue or secondValue == thirdValue:
        print("Isso é um triangulo isosceles!")
    elif firstValue != secondValue != thirdValue:
        print("Isso é um triangulo escaleno!")

else:
    print("Isso não é um triangulo!")