package revisao;

import java.util.ArrayList;

class Books{
    private int cod;
    private String titulo;
    private int anoPublicacao;
    private String editora;
    private String autor;
    private int qtdePag;
    private boolean emprestado;

    public Books(int cod, String titulo, int anoPublicacao, String editora, String autor, int qtdePag, boolean emprestado){
        this.cod = cod;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.editora = editora;
        this.autor = autor;
        this.qtdePag = qtdePag;
        this.emprestado = emprestado;
    }
}

class Prateleira{
    private int prateleiraID;
    private ArrayList <Books> livro = new ArrayList<>();

    public Prateleira(int prateleiraID){
        this.prateleiraID = prateleiraID;
    }

    public int getPrateleiraID(){
        return this.prateleiraID;
    }

    public void addBooks(Books livro){
        this.livro.add(livro);
    }



}

public class bibliotecas {
}
