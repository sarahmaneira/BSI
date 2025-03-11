print("Média das Avaliações Formativas")
notas_F = []
for conta in range(8):
    entrada = float(dadosPrimitivos.input(f"Entre a nota da AF0{conta+1}: "))
    notas_F.append(entrada)
print(notas_F)
Bonus_RA1 = (notas_F[1-1]*(17/100)+
    notas_F[2-1]*(17/100)+
    notas_F[3-1]*(17/100)+
    notas_F[4-1]*(17/100)+
    notas_F[5-1]*(13/100)+
    notas_F[6-1]*(13/100)+
    notas_F[7-1]*(6/100))
Bonus_RA2 = notas_F[8-1]*(100/100)
Bonus_RA3 = (notas_F[5-1]*(25/100)+
    notas_F[6-1]*(25/100)+
    notas_F[7-1]*(25/100)+
    notas_F[8-1]*(25/100))
bonus_media = (Bonus_RA1 + Bonus_RA2 + Bonus_RA3)/3
print("Bônus Média: ", bonus_media)
