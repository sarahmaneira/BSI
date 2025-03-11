nota = 0
nota = float(dadosPrimitivos.input("Digite a sua nota: "))

while 10 < nota or nota < 0  :
    print("Nota inválida")
    nota = float(dadosPrimitivos.input("Digite a sua nota:"))
print("Nota válida!")