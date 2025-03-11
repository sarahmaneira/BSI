package comandoDesvio;

import java.util.Scanner;

public class PBL02_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro termo da PA: ");
        double a1 = input.nextDouble();
        System.out.print("Digite a razão da PA: ");
        double r = input.nextDouble();
        System.out.print("Digite o número de termos da PA: ");
        double h = input.nextDouble();

        double aN = a1 + (h-1) + r;
        System.out.print("Ultimo termo da PA: ");
        System.out.print(aN);

        double sN = (a1 + aN) * h / 2;
        System.out.print("Soma de todos os termos da PA: ");
        System.out.println(sN);

    }
}