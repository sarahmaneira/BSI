package polimorfismo;

class comida {
    public static void main(String[] args){
        pizza p1 = new pizza ("marguerita");
        pizza p2 = new pizza ("milho");
        carne c1 = new carne ("mignon");
        carne c2 = new carne ("picanha");
        pao pao1 = new pao ("frances");
        pao pao2  = new pao ("bisnaguinha");

        assar(p1);
        assar(p2);
        assar(c2);
        assar(c1);
        assar(pao1);
        assar(pao2);
    }

    public static void assar(pizza p){
        System.out.println("Assando - ");
        p.mostrarMensagem();

    }
    public static void assar(carne c){
        System.out.println("Assando - ");
        c.mostrarMensagem();
    }
    public static void assar(pao p){
        System.out.println("Assando - ");
        p.mostrarMensagem();
    }
}

class pizza{
    private String sabor;

    public pizza (String sabor){
        this.sabor = sabor;
    }

    public void mostrarMensagem(){
        System.out.printf("Pizza sabor: %s\n", sabor);
    }
}

class carne{
    private String corte;

    public carne(String corte){
        this.corte = corte;
    }

    public void mostrarMensagem(){
        System.out.printf("Carne corte: %s\n", corte);
    }
}

class pao{
    private String tipo;

    public pao(String tipo){
        this.tipo = tipo;
    }

    public void mostrarMensagem(){
        System.out.printf("Pão do tipo : %s\n", tipo);
    }
}