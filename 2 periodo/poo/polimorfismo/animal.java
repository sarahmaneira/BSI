package polimorfismo;

public abstract class  animal {
    private float peso;
    private int idade;
    private int membros;

    public animal(float peso, int idade, int membros){
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }

    abstract void locomover();

    abstract void alimentar(String alimento);

    abstract void emitirSom();
}

class mamifero extends animal{
    private String corPelo;

    public mamifero(float peso, int idade, int membros, String corPelo){
        super(peso, idade, membros);
        this.corPelo = corPelo;
    }

    @Override
    void locomover() {

    }

    @Override
    void alimentar(String alimento) {

    }

    @Override
    void emitirSom() {

    }
}

class cachorro extends mamifero{
    public cachorro(float peso, int idade, int membros, String corPelo){
        super(peso, idade, membros, corPelo);
    }

    public void enterrarOsso(){
        System.out.println("Enterrando osso");
    };

    public void abanarRabo(){
        System.out.println("Abanando rabo");
    }


}

class canguru extends mamifero{
    public canguru(float peso, int idade, int membros, String corPelo){
        super(peso, idade, membros, corPelo);
    }

    public void usarBolsa(){
        System.out.println("Usando bolsa");
    }

    public void locomover(){
        System.out.println("Pulando");
    }
}

class reptil extends animal{
    private String corEscama;

    public reptil(float peso, int idade, int membros, String corEscama){
        super (peso, idade, membros);
        this.corEscama = corEscama;
    }

    @Override
    void locomover() {

    }

    @Override
    void alimentar(String alimento) {

    }

    @Override
    void emitirSom() {

    }
}

class cobra extends reptil{
    public cobra(float peso, int idade, int membros, String corEscama){
        super(peso, idade, membros, corEscama);
    }
}

class tartaruga extends reptil{
    public tartaruga(float peso, int idade, int membros, String corEscama){
        super(peso, idade, membros, corEscama);
    }
}

class peixe extends animal{
    private String corEscama;

    public peixe(float peso, int idade, int membros, String corEscama){
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }

    public void soltarBolhas(){
        System.out.println();
    };

    @Override
    void locomover() {

    }

    @Override
    void alimentar(String alimento) {

    }

    @Override
    void emitirSom() {

    }
}

class peixePalhaco extends peixe {
    public peixePalhaco(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }
}

class Kinguyo extends peixe{
    public Kinguyo(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }
}

class ave extends animal{
    private String corPena;

    public ave (float peso, int idade, int membros, String corPena){
        super(peso, idade, membros);
        this.corPena = corPena;
    }


    @Override
    void locomover() {

    }

    @Override
    void alimentar(String alimento) {

    }

    @Override
    void emitirSom() {

    }
}

class galinha extends ave{
    public galinha(float peso, int idade, int membros, String corPena){
        super(peso, idade, membros, corPena);
    }

}

class arara extends ave {
    public arara(float peso, int idade, int membros, String corPena) {
        super(peso, idade, membros, corPena);
    }

    @Override
    void emitirSom() {
        System.out.println("arara");
    }
}