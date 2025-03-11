peso = float(dadosPrimitivos.input("Digite o seu peso: "))

if peso < 50:
    print("Você pertence a categoria: Palha!")
elif 50 <= peso < 60:
    print("Você pertence a categoria: Pluma")
elif 60 <= peso < 76:
    print("Você pertence a categoria: Leve")
elif 76 <= peso < 88:
    print("Você pertence a categoria: Pesado")
else:
    print("Você pertence a categoria: Super pesado!")

