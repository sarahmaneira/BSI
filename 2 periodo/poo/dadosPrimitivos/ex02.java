package dadosPrimitivos;

class teste {
    public static void main(String[] args){
        // Exemplo com inteiro
        int k = 10;
        int r = 2;
        int t = 3;

        k = r * 3 - t;
        System.out.println("k = " + k);

        k = r * (3 - t);
        System.out.println("k = " + k);

        float w = k + ((float) t / 2 / 2.0f);
        // divisão inteira porque os operando são inteiros

        System.out.println("k = " + k);

    }
}