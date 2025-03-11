import java.util.ArrayList;

class Banco{
    private String nome;
    private ArrayList<contaCorrente> contas = new ArrayList<>();

    public Banco (String nome){
        this.nome = nome;
    }

    public void criarConta(int numero, String senha, double saldo){
        contaCorrente c = new contaCorrente(numero, senha, saldo);
        contas.add(c);
        System.out.println();
    }

    public void sacar(int numero, String senha, double valor){
        for (contaCorrente c : contas){
            if(c.getnumero() != numero) \\ excessao
        }
        System.out.println();
    }
}

class contaCorrente{
    private int numero;
    private String senha;
    private double saldo;

    public contaCorrente(int numero, String senha, double saldo){
        this.numero = numero;
        this.senha = senha;
        this.saldo = saldo;
    }

    public void retirar(double valor, String senha){
        System.out.println();
    }
}