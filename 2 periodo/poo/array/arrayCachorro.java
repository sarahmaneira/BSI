package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arrayCachorro {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList <String> cachorro = new ArrayList<>();

        cachorro.add("Pinscher");
        cachorro.add("Bulldog");
        cachorro.add("Golden");
        cachorro.add("Labrador");
        cachorro.add("Boxer");

        while (true) {
            System.out.println("MENU\n");
            System.out.println("(1) ORDENADO");
            System.out.println("(2) NÃO ORDENADO");
            System.out.println("(3) SAIR\n");
            System.out.println("Opção: ");

        int option = s.nextInt();
        switch (option){
            case 1:
                ArrayList <String> ordenada = new ArrayList<>(cachorro);
                    Collections.sort(ordenada);
                        System.out.println(ordenada);
                        break;
            case 2:
                System.out.println(cachorro);
                break;
            case 3:
                System.out.println("Você saiu!");
                return;
            default:
                System.out.println("Digite um número valido!");
        }
        }






    }
}
