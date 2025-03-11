package array;

import java.util.ArrayList;
import java.util.Scanner;

public class PBL04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Prateleira prateleira1 = new Prateleira(1);
        prateleira1.listalivros.add(new Livro(1, "É Assim que Acaba: 1", 2018, "Colleen Hoover", 318, false));
        prateleira1.listalivros.add(new Livro(2, "É assim que começa: 2", 2022, "Colleen Hoover", 336, false));
        prateleira1.listalivros.add(new Livro(3, "Todas as suas (im)perfeições", 2019, "Colleen Hoover", 304, false));

        Prateleira prateleira2 = new Prateleira(2);
        prateleira2.listalivros.add(new Livro(4, "Até o verão terminar", 2021, "Colleen Hoover", 336, false));
        prateleira2.listalivros.add(new Livro(5, "Verity", 2020, "Colleen Hoover", 320, false));
        prateleira2.listalivros.add(new Livro(6, "O lado feio do amor", 2015, "Colleen Hoover", 336, false));

        Prateleira prateleira3 = new Prateleira(3);
        prateleira3.listalivros.add(new Livro(7, "O Pequeno Príncipe", 1943, "Antoine de Saint-Exupéry", 96, false));
        prateleira3.listalivros.add(new Livro(8, "Dom Quixote", 1605, "Miguel de Cervantes", 1072, true));
        prateleira3.listalivros.add(new Livro(9, "Cem Anos de Solidão", 1967, "Gabriel García Márquez", 448, false));

        Prateleira prateleira4 = new Prateleira(4);
        prateleira4.listalivros.add(new Livro(10, "Orgulho e Preconceito", 1813, "Jane Austen", 279, true));
        prateleira4.listalivros.add(new Livro(11, "O Nome da Rosa", 1980, "Umberto Eco", 512, false));
        prateleira4.listalivros.add(new Livro(12, "O Hobbit", 1937, "J.R.R. Tolkien", 310, true));

        Biblioteca biblioteca1 = new Biblioteca();
        biblioteca1.listaPrateleira.add(prateleira1);
        biblioteca1.listaPrateleira.add(prateleira2);

        Biblioteca biblioteca2 = new Biblioteca();
        biblioteca2.listaPrateleira.add(prateleira3);
        biblioteca2.listaPrateleira.add(prateleira4);

        while (true) {
            System.out.println("\n(1) Entrar na biblioteca.\n(2) Sair.\n\nOpção: ");
            int option = s.nextInt();

            switch (option) {
                case 1:
                    System.out.println("(1) array.Biblioteca 1\n(2) array.Biblioteca 2\n(3) Mostrar todas\n(4) Sair\n\nOpção:");
                    option = s.nextInt();
                    switch (option) {
                        case 1:
                            System.out.println("(1) array.Prateleira 1\n(2) array.Prateleira 2\n(3) Mostrar todos\n(4) Sair\n\nOpção:");
                            int option1 = s.nextInt();
                            switch (option1) {
                                case 1:
                                    System.out.printf("array.Prateleira 1:\n - %s | %d\n - %s | %d\n - %s | %d\n", prateleira1.listalivros.get(0).titulo, prateleira1.listalivros.get(0).cod, prateleira1.listalivros.get(1).titulo, prateleira1.listalivros.get(1).cod, prateleira1.listalivros.get(2).titulo, prateleira1.listalivros.get(2).cod);

                                    break;
                                case 2:
                                    System.out.printf("array.Prateleira 2:\n - %s\n - %s\n - %s\n", prateleira2.listalivros.get(0).titulo, prateleira2.listalivros.get(0).cod, prateleira2.listalivros.get(1).titulo, prateleira2.listalivros.get(0).cod,prateleira2.listalivros.get(2).titulo);
                                    break;
                                case 3:
                                    System.out.printf("array.Prateleira 1:\n - %s\n - %s\n - %s\n\n", prateleira1.listalivros.get(0).titulo, prateleira1.listalivros.get(1).titulo, prateleira1.listalivros.get(2).titulo);
                                    System.out.printf("array.Prateleira 2:\n - %s\n - %s\n - %s\n", prateleira2.listalivros.get(0).titulo, prateleira2.listalivros.get(1).titulo, prateleira2.listalivros.get(2).titulo);
                                    break;
                                case 4:
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("(1) array.Prateleira 3\n(2) array.Prateleira 4\n(3) Mostrar todos\n(4) Sair\n\nOpção:");
                            int option2 = s.nextInt();
                            switch (option2) {
                                case 1:
                                    System.out.printf("array.Prateleira 3:\n - %s\n - %s\n - %s\n", prateleira3.listalivros.get(0).titulo, prateleira3.listalivros.get(1).titulo, prateleira3.listalivros.get(2).titulo);
                                    break;
                                case 2:
                                    System.out.printf("array.Prateleira 4:\n - %s\n - %s\n - %s\n", prateleira4.listalivros.get(0).titulo, prateleira4.listalivros.get(1).titulo, prateleira4.listalivros.get(2).titulo);
                                    break;
                                case 3:
                                    System.out.printf("array.Prateleira 3:\n - %s\n - %s\n - %s\n\n", prateleira3.listalivros.get(0).titulo, prateleira3.listalivros.get(1).titulo, prateleira3.listalivros.get(2).titulo);
                                    System.out.printf("array.Prateleira 4:\n - %s\n - %s\n - %s\n", prateleira4.listalivros.get(0).titulo, prateleira4.listalivros.get(1).titulo, prateleira4.listalivros.get(2).titulo);
                                    break;
                                case 4:
                                    break;
                            }
                            break;
                        case 3:
                            System.out.printf("array.Prateleira 1:\n - %s\n - %s\n - %s\n\n", prateleira1.listalivros.get(0).titulo, prateleira1.listalivros.get(1).titulo, prateleira1.listalivros.get(2).titulo);
                            System.out.printf("array.Prateleira 2:\n - %s\n - %s\n - %s\n", prateleira2.listalivros.get(0).titulo, prateleira2.listalivros.get(1).titulo, prateleira2.listalivros.get(2).titulo);
                            System.out.printf("array.Prateleira 3:\n - %s\n - %s\n - %s\n\n", prateleira3.listalivros.get(0).titulo, prateleira3.listalivros.get(1).titulo, prateleira3.listalivros.get(2).titulo);
                            System.out.printf("array.Prateleira 4:\n - %s\n - %s\n - %s\n", prateleira4.listalivros.get(0).titulo, prateleira4.listalivros.get(1).titulo, prateleira4.listalivros.get(2).titulo);
                            break;
                        case 4:
                            break;
                    }
                    break;
                case 2:
                    return; // Encerra o programa


            }
        }
    }
}

class Biblioteca {
    public ArrayList<Prateleira> listaPrateleira = new ArrayList<>();
    public boolean emprestarLivro(int codLivro) {
        for (Prateleira prateleira : listaPrateleira) {
            for (Livro livro : prateleira.listalivros) {
                if (livro.cod == codLivro && !livro.isEmprestado()) {
                    livro.setEmprestado(true);
                    return true;
                }
            }
        }
        return false; // array.Livro não encontrado ou já emprestado
    }

    public boolean devolverLivro(int codLivro) {
        for (Prateleira prateleira : listaPrateleira) {
            for (Livro livro : prateleira.listalivros) {
                if (livro.cod == codLivro && livro.isEmprestado()) {
                    livro.setEmprestado(false);
                    return true;
                }
            }
        }
        return false; // array.Livro não encontrado ou não estava emprestado
    }

}

class Prateleira {
    private int codPrateleira;
    public ArrayList<Livro> listalivros = new ArrayList<Livro>();

    public Prateleira(int codPrateleira) {
        this.codPrateleira = codPrateleira;
    }
}

class Livro {
    int cod;
    String titulo;
    private int anoPublicacao;
    private String autor;
    private int qtdPaginas;
    private boolean emprestado;

    public Livro(int cod, String titulo, int anoPublicacao, String autor, int qtdPaginas, boolean emprestado) {
        this.cod = cod;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
        this.qtdPaginas = qtdPaginas;
        this.emprestado = emprestado;
    }
    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
}
