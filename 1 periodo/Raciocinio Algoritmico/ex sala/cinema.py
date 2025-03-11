qtdeIngressos = int(dadosPrimitivos.input("Digite a quantidade de ingressos que você deseja: "))
valorIngressos = 15

descontoCarteira = int(dadosPrimitivos.input("Digite a quantidade de desconto que você possui: "))
ticketEstacionamento = int(dadosPrimitivos.input("Digite o valor do ticket: "))

valorTotal = valorIngressos * qtdeIngressos - (valorIngressos * qtdeIngressos)*(descontoCarteira/100) - ticketEstacionamento

print("O valor a ser pago será de R$", valorTotal)