numeros = []

for i in range(5):
    num = float(input(f"Digite o número {i+1}: "))
    numeros.append(num)


numeros_invertidos = tuple(numeros[::-1])

for i, num in enumerate(numeros_invertidos):
    print(f"{i+1} -> {num}")
