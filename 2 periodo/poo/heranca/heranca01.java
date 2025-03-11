package heranca;

class Animal{
    private String nome;
    private String raca;

    public Animal(){
        this.nome = "Rex";
        this.raca = "Vira-lata";
    }

    public Animal(String nome){
        this.nome = nome;
        this.raca = "Vira-lata";
    }

    public void caminhar(){
        System.out.printf("%s está caminhando", this.nome);
    }

    public String getName(){
        return this.nome;
    }
}
class Cachorro extends Animal{
    public Cachorro(String nome){
        super(nome);
    }
    public void latir(){
        System.out.println("latindo " + getName());
    }
}

class Gato extends Animal{
    public Gato(){
        super();
    }
    public Gato(String nome){
        super(nome);
    }
    public void miar(){
        System.out.println("miando " + getName());
}

public class heranca01 {
    public static void main(String[] args){
        Cachorro c1 = new Cachorro("Totó");
        Gato g1 = new Gato("Garfield");
        Gato g2 = new Gato("Rex");


        c1.latir();
        g1.miar();
        g2.miar();

        c1.caminhar();
    }
}
}



