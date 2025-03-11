package classeEncapsulamento;

public class Album {
    String genero;
    int ano;
    String nome;
    String artista;
    Musica[] musicas = new Musica [5];

    // Criar um construtor que inicialize TODOS os atributos
    public Album(String genero, int ano, String nome, String artista, Musica[] musicas){
        this.genero = genero;
        this.ano = ano;
        this.nome = nome;
        this.artista = artista;
        this.musicas = musicas;
    }

    // Criar um método que mostre as informações do album
    public void descricao(){
        System.out.printf("classeEncapsulamento.Album: %s, ano: %d, genero: %s, artista:%s \n", this.nome, this.ano, this.genero, this.artista);
    }
}

class Musica {
    String titulo;
    int duracao;

    // Criar um construtor que inicialize TODOS os atributos
    public Musica(String titulo, int duracao){
        //this.nome -> atributo
        //nome -> parametro

        this.titulo = titulo;
        this.duracao = duracao;
    }
    public void tocarMusica(){
        System.out.printf("Música %s está tocando (duração de %d minutos)\n", this.titulo, this.duracao);
    }
}

class Spotify {
    public static void main(String[] args){
        Musica[] musicas = new Musica[5];

        musicas[0] = new Musica("3:00 AM",3);
        musicas[1] = new Musica("My Love Mine All Mine",2);
        musicas[2] = new Musica("Atlantis",4);
        musicas[3] = new Musica("I love you so",3);
        musicas[4] = new Musica("Fall in Love with You",2);

        Album a = new Album(
                "pop",2024,"a","Bruno Mars", musicas);

        a.descricao();

        for (int i = 0; i < musicas.length; i++){
            Musica m = musicas[i];
            m.tocarMusica();
        }
    }
}
