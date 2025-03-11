horaEntrada = int(dadosPrimitivos.input("Digite a hora de entrada: "))
minutoEntrada = int(dadosPrimitivos.input("Digite os minutos de entrada: "))
horaSaida = int(dadosPrimitivos.input("Digite a hora de saída: "))
minutoSaida = int(dadosPrimitivos.input("Digite os minutos de saída: "))

minutosEntradaDecorridas = horaEntrada * 60 + minutoEntrada
minutosSaidaDecorridas = horaSaida * 60 + minutoSaida

diferenca = minutosSaidaDecorridas - minutosEntradaDecorridas
print ("Se passaram" , diferenca, "minutos!")
