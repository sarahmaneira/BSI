alturaTanque = float(dadosPrimitivos.input("Digite a altura do seu tanque: "))
raioTanque = float(dadosPrimitivos.input("Digite o raio do seu tanque: "))

areaTanque = (2* 3.14 * raioTanque * raioTanque) + (2 * 3.14 * raioTanque * alturaTanque)
qtdeLatas = areaTanque/15
custo = qtdeLatas *50

print("O custo será de", custo, "e a quantidade de latas necessárias será de" , qtdeLatas)