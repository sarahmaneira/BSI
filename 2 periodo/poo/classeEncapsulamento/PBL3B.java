package classeEncapsulamento;

class funcionario {
    private String nome;
    private String cargo;
    private String genero;
    private int idade;
    public double salario;

    public funcionario() {
        this.nome = "Sarah";
        this.cargo = "Programador";
        this.genero = "Feminino";
        this.idade = 18;
        this.salario = 1000;

    }
    public funcionario(int idade){
        this.nome = "Livia";
        this.cargo = "Junior";
        this.genero = "Feminino";
        this.idade = idade;
        this.salario = 1200;
    }
    public funcionario(int idade, String genero){
        this.nome = "Lucas";
        this.cargo = "Pleno";
        this.genero = genero;
        this.idade = idade;
        this.salario = 1300;
    }

    // %f = double;
    // %d = int;
    public void imprimir(){
        System.out.printf("Nome: %s\nCargo: %s\nGenero:%s\nIdade:%d\nSalário:%f \n\n", this.nome, this.cargo, this.genero, this.idade, this.salario);
    }
}

class PBL3B{
    public static void main(String[] args){
        funcionario Lucas = new funcionario(18);
        funcionario Livia = new funcionario();
        funcionario Enzo = new funcionario(17,"Masc");
        funcionario Sarah = new funcionario(19);
        funcionario Giovani = new funcionario();

        Lucas.imprimir();
        Livia.imprimir();
        Enzo.imprimir();
        Sarah.imprimir();
        Giovani.imprimir();

        System.out.println(Lucas.salario + Livia.salario + Enzo.salario + Sarah.salario + Giovani.salario);
    }


}

