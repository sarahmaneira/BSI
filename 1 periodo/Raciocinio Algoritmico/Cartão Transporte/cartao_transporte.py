credit = 0
cost = 5

def continuar():
    continuar = input("Deseja continuar? (s/n) ").lower()
    if continuar == "s":
        return True
    else:
        return False
    
print("\nBem-vindo ao sistema de transporte público")
while True:
    print("-"*30)
    admin_or_user = input("1 - Usuário\n2 - Administrador\n3 - Sair\n\nOpção: ")
    if admin_or_user == "1":
        while True:
            print("-"*30)
            option = input("1 - Carregar créditos\n2 - Usar cartão\n3 - Visualizar creditos\n4 - Voltar\n\nOpção: ")
            if option == "1":
                credit += int(input("Quanto você deseja carregar? "))
                print(f"\nRecarga efetuada com sucesso!")
                continuar()
            elif option == "2":
                if credit < cost:
                    print("Créditos insuficientes")
                    print(f"Você possui {credit} créditos e o valor da passagem é {cost}")
                    continuar()
                else:
                    credit -= cost
                    print(f"Créditos restantes: {credit}")
                    continuar()
            elif option == "3":
                print(f"Créditos disponíveis: {credit}")
                continuar()
            elif option == "4":
                break
            else:
                print("Opção inválida")
    elif admin_or_user == "2":
        password = "1234"
        for attempt in range(3):
            password_input = input("\nDigite a senha: ")
            if password_input != password:
                print("Senha incorreta")
            else:
                while True:
                    print("-"*30)
                    option = input("\n1 - Definir valor da passagem\n2 - Visualizar valor da passagem\n3 - Visualizar créditos\n4 - Voltar\n\nOpção:")
                    if option == "1":
                        cost = int(input("\nDigite o valor da passagem: "))
                        print("Valor da passagem alterado com sucesso!\n")
                        continuar()
                    elif option == "2":
                        print(f"Valor da passagem: {cost}")
                        continuar()
                    elif option == "3":
                        print(f"Créditos disponíveis: {credit}")
                        continuar()
                    elif option == "4":
                        break
                    else:
                        print("Opção inválida")
                break
        else:
            print("\nNúmero máximo de tentativas excedido.\nEncerrando processo.")
            exit()
    elif admin_or_user == "3":
        break
    else:
        print("Opção inválida\n")
    continue

