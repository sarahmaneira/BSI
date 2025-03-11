package heranca;

import java.util.ArrayList;
import java.util.Scanner;

public class PBL05{
    static boolean encontrar (Pessoa p, String escolha) {
        if (p.GetNome().equals(escolha)){
            return true;
        } else { return false;}

    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        Aluno a1 = new Aluno("Zé", 18, "ze@ze.com", "123", "BSI");
        Professor p1 = new Professor("Maria", 40, "maria@pucpr.edu.br", "POO", 4000.00);
        Funcionario f1 = new Funcionario("Cleitinho", 32, "cleitinho@pucpr.edu.br", "THE DRIPPER", 10, 20);
        Monitor m1 = new Monitor("Bruno", 24, "bruno@pucpr.edu.br", "124", "BSI", 5);

        ArrayList <Pessoa> pessoas = new ArrayList<>();
        pessoas.add(a1);
        pessoas.add(p1);
        pessoas.add(f1);
        pessoas.add(m1);

        while (true){
            for (Pessoa p:pessoas){
                System.out.println(p.nome );
            }
            System.out.println("\nDigite o nome de quem você deseja visualizar:\n");
            String escolha = s.nextLine();

            boolean pessoaEncontrada = false;
            for (Pessoa p : pessoas) {
                if (encontrar(p, escolha)) {
                    p.apresentar();
                    pessoaEncontrada = true;
                    break;
                }
            }
                if (!pessoaEncontrada){
                    System.out.printf("Essa pessoa n existe\n");
            }break;
        }
    }

}


class Pessoa {
    protected String nome;
    protected int idade;
    protected String email;

    public Pessoa (String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public Pessoa () {
        this.nome = "Sarah";
        this.idade = 18;
        this.email = "sarahmaneira17@gmail.com";
    }

    public String GetNome () {
        return this.nome;
    }

    public void apresentar(){
        System.out.printf("Nome: %s \nIdade: %d \nE-mail: %s", this.nome, this.idade, this.email);
    }
}

class Aluno extends Pessoa{
    protected String matricula;
    protected String curso;

    public Aluno(String nome, int idade, String email, String matricula, String curso){
        super(nome, idade, email);
        this.matricula = matricula;
        this.curso = curso;
    }

    public void apresentar(){
        System.out.printf("Nome: %s \nIdade: %d \nEmail: %s " +
                "\nMatricula: %s \nCurso: %s", this.nome, this.idade, this.email, this.matricula, this.curso);
    }
}

class Professor extends Pessoa{
    protected String disciplina;
    protected double salario;

    public Professor(String nome, int idade, String email, String disciplina, double salario){
        super(nome, idade, email);
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public void apresentar(){
        System.out.printf("Nome: %s \nIdade: %d \nEmail: %s \nDisciplina: %s",
                        this.nome, this.idade, this.email, this.disciplina);
    }

    public void bonus(){
        double valorBonus = this.salario * 1.1;
    }
}

class Funcionario extends Pessoa{
    protected String departamento;
    protected int horasTrabalhadas;
    protected double salarioHora;

    public Funcionario(String nome, int idade, String email, String departamento, int horasTrabalhadas, double salarioHora){
        super(nome, idade, email);
        this.departamento = departamento;
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioHora = salarioHora;
    }

    public double calcularPagamento(){
        double salarioTotal = horasTrabalhadas * salarioHora;
        return salarioTotal;
    }
}

class Monitor extends Aluno{
    protected int horasMonitoria;

    public Monitor(String nome, int idade, String email, String matricula, String curso, int horasMonitoria){
        super(nome, idade, email, matricula, curso);
        this.horasMonitoria = horasMonitoria;
    }

    public void apresentar(){
        System.out.printf("Nome: %s \nIdade: %d \nEmail: %s " +
                "\nMatricula: %s \nCurso: %s \nHoras de Monitoria: %d", this.nome, this.idade, this.email,
                                                                this.matricula, this.curso, this.horasMonitoria);
    }

    public double calcularPgmtoMoni(){
        double salarioMonitoria = horasMonitoria * 10;
        return salarioMonitoria;
    }




}
