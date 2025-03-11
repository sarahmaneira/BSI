qtdPratos = int(dadosPrimitivos.input("Digite a quantidade de pratos que foram pesados: "))
pesoTotal = 0
contPrato = 0 

for contPratos in range(qtdPratos):
   peso = float(dadosPrimitivos.input("Digite o peso do seu prato em gramas: "))
   pesoTotal += peso 

   if peso > 800:
    contPrato += 1

media = (pesoTotal / qtdPratos)/1000
print(f"\nA média dos pratos foi: {media} quilos\nA quantidade de pratos maiores que 800 gramas foi:{contPrato}")