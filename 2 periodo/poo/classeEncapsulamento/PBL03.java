package classeEncapsulamento;

class Cliente {
    private String nome;
    private double saldoConta;

    public Cliente(String nome, double saldoConta){
        this.nome = nome;
        this.saldoConta = saldoConta;
    }

    public void depositar(double valorDeposito){
        saldoConta += valorDeposito;
    }

    public void retirar(double valorRetirada){
        if (saldoConta >= valorRetirada){
            saldoConta -= valorRetirada;
        }
    }

    public void imprimir() {
        System.out.printf("Nome: %s Saldo:%s \n", this.nome, this.saldoConta);
    }
}

class Banco{
    public static void main(String[] args){
        Cliente Jandira = new Cliente("Jandira Silva", 2500);
        Cliente Sandra = new Cliente("Sandra Rodrigues", 1800);
        Cliente Luciana = new Cliente("Luciana Teixeira", 5000);

        Jandira.imprimir();
        Sandra.imprimir();
        Luciana.imprimir();

        Jandira.retirar(1000);
        Jandira.imprimir();

        Sandra.retirar(2000);
        Sandra.depositar(500);
        Sandra.imprimir();
        Sandra.retirar(2000);
        Sandra.imprimir();

        Luciana.depositar(1000);
        Luciana.imprimir();
    }

    }
