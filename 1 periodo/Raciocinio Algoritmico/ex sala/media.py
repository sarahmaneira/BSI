notaFinal = 0
for c in range(4):
    nota = int(dadosPrimitivos.input("Digite a sua nota: "))
    notaFinal = notaFinal + nota
    media = notaFinal / 4
print('media de ', media)