idade = int(dadosPrimitivos.input("Digite a sua idade: "))
if idade >= 18:
    print("Você pode dirigir!")
elif idade < 18:
    meses = (18 - idade)*12
    print("Faltam" ,meses,"meses para que você possa dirigir!")