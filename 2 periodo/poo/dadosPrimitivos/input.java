package dadosPrimitivos;

import java.util.Scanner;

public class input {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();

        System.out.print("Seu nome é " + nome + " e sua idade é " + idade + "\n");
    }
}
