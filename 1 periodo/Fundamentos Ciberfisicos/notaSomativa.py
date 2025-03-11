print("Média das Avaliações Somativas")

AS01 = float(dadosPrimitivos.input("Entre a nota da AS01: "))
AS02 = float(dadosPrimitivos.input("Entre a nota da AS02: "))
AS03 = float(dadosPrimitivos.input("Entre a nota da AS03: "))
AS04 = float(dadosPrimitivos.input("Entre a nota da AS04: "))

Nota_RA01 = AS01*(25/100)+AS02*(60/100)+AS03*(15/100)
Nota_RA02 = AS02
Nota_RA03 = AS04

media = (Nota_RA01+Nota_RA02+Nota_RA03)/3

print("Média: ", media)

