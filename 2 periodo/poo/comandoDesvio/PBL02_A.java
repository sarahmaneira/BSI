package comandoDesvio;

import java.lang.Math;
import java.util.Scanner;

public class PBL02_A {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        double a = input.nextDouble();
        System.out.println("Digite o valor de b: ");
        double b = input.nextDouble();

        if(a <= b){
            System.out.print("Digite o valor de n: ");
            int n = input.nextInt();
            if (n > 0){
                double areaTotal = 0;
                double x = a;
                double h = (b-a) / n;
                double y1 = f(x);
                int i = 0;
                while(i < n){
                    x += h;
                    double y2 = f(x);
                    double trapezioArea = ((y1 +y2) / 2 ) * h;
                    areaTotal += trapezioArea;
                    y1 = y2;
                    i++;
                }
                System.out.println(areaTotal);
            }
            else
                System.out.println("N deve ser positivo");
        }
        else
            System.out.println("O valor de a deve ser menor ou igual ao b");

    }
    public static double f(double x) {return 2*Math.sin(x) + Math.cos(x) / 3; }
}