package array;

import java.util.ArrayList;

public class arrayFilme {
    public static void main(String[] args){
        ArrayList <Filme> filmes = new ArrayList<>();
        filmes.add(new Filme("Como treinar seu dragão", 2010));
        filmes.add(new Filme("Enrolados", 2010));
        filmes.add(new Filme("Divertidamente 2 ", 2024));
        filmes.add(new Filme("Moana", 2016));
        filmes.add(new Filme("Lilo & Stitch", 2002));

        for (Filme filme : filmes){
            filme.imprimir();
        }
    }
}

class Filme{
    private String titulo;
    private int anoLancamento;

    public Filme (String titulo, int anoLancamento){
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
    }

    public void imprimir(){
        System.out.printf("Filmes: %s - Ano Lançamento: %d\n", this.titulo, this.anoLancamento);
    }

}
