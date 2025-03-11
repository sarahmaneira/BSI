caixa = int(dadosPrimitivos.input("Digite a quantidade de caixas: "))
livros = int(dadosPrimitivos.input("Digite a quantidade de livros por caixa: "))
pesoLivro = int(dadosPrimitivos.input("Digite quanto pesa cada livro (em kg): "))

qtdeLivros = caixa * livros
print("A quantidade de livros é igual a ", qtdeLivros)

pesoTotal = qtdeLivros * pesoLivro 
print("O peso total transportado é de ", pesoTotal)