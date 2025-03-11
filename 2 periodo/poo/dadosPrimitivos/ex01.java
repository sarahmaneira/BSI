package dadosPrimitivos;

import java.lang.Math;

public class ex01 {
    public static void main(String[] args) {
            double y = f(3);
            System.out.println("f(x) = " + y);
        }

        public static double f(double x){
           return 2.0 * Math.sin(x) + Math.cos(x)/3.0;
    }
}