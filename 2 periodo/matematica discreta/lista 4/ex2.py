individuos = int(input("Digite o número de indivíduos: "))

alturas = []

for i in range(individuos):
    alturas.append(float(input(f"Digite a altura do indivíduo {i+1}: ")))

media = sum(alturas) / individuos
print(f"A média das alturas é {media:.2f}")
