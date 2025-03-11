package heranca;

class Imovel{
    protected String endereco;
    protected double preco;

    public Imovel(){
        this.endereco = "Alameda";
        this.preco = 1024;
    }

    public Imovel(String endereco, double preco){
        this.endereco = endereco;
        this.preco = preco;
    }
}

class ImovelNovo extends Imovel{
    public ImovelNovo(String endereco, double preco){
        super(endereco, preco);
    }

    public double getAcrescimo(){
        return this.preco *= 1.1;
    }
}

class ImovelVelho extends Imovel{
    public ImovelVelho(String endereco, double preco){
        super(endereco, preco);
    }

    public double getDesconto(){
        return this.preco *= 0.9;
    }
}

public class heranca02 {
    public static void main(String[] args){
        ImovelNovo in1 = new ImovelNovo("rua 1", 2000);
        ImovelVelho iv1 = new ImovelVelho("rua 2", 2000);

        in1.getAcrescimo();
        System.out.printf("Imovel Novo na rua %s e preço %f\n", in1.endereco, in1.preco );

        iv1.getDesconto();
        System.out.printf("Imovel Velho na rua %s e preço %f", iv1.endereco, iv1.preco   );
    }
}

