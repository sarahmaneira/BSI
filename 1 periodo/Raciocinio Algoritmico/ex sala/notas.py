nota1 = float(dadosPrimitivos.input("Digite a nota 1: "))
nota2 = float(dadosPrimitivos.input("Digite a nota 2: "))
nota3 = float(dadosPrimitivos.input("Digite a nota 3: "))
nota4 = float(dadosPrimitivos.input("Digite a nota 4: "))
nota5 = float(dadosPrimitivos.input("Digite a nota 5: "))

media = ((nota1 + nota2 + nota3 + nota4 + nota5)/5)

print("Sua média final foi:", media, "!")

if media >= 7 :
    print("Você foi aprovado!")
else: 
    print("Você foi reprovado.")
