package dadosPrimitivos;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class pbl {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanho da lista: ");
        int x = input.nextInt();


        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            list.add(rand.nextInt(0,100));
            if(list.get(i) % 3 == 0){
                System.out.println(list.get(i) + " - É múltiplo de 3");
            }
            else if(list.get(i) % 2 == 0){
                System.out.println(list.get(i) + " - É par");
            }
            else {
                System.out.println(list.get(i) + " - É ímpar");
            }
        }
    }
}