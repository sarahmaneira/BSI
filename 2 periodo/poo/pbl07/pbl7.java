abstract class personagem{
    private boolean vivo;
    protected float posicao_x;
    protected float posicao_y;
    protected float posicao_z;
    protected int cor;

    public personagem(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor){
        this.vivo = vivo;
        this.posicao_x = posicao_x;
        this.posicao_y = posicao_y;
        this.posicao_z = posicao_z;
        this.cor = cor;
    }

    public abstract void correr();
    public abstract void saltar();
    public abstract void atirar();
    public void morrer(){}
}

abstract class Heroi extends personagem{
    public Heroi(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor){
        super(vivo, posicao_x, posicao_y, posicao_z, cor);
    }

    @Override
    public void correr(){
        System.out.println("Heroi está correndo");
    };

    @Override
    public void saltar(){
        System.out.println("Heroi está saltando");
    }
}

class batman extends Heroi implements camuflagem{
    public batman(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor){
        super(vivo, posicao_x, posicao_y, posicao_z, cor);
    }

    @Override
    public void atirar() {
        System.out.println("Batman atirando");
    }

    public void camuflar(int cor){
        System.out.printf("Batman camuflado de", cor );
    }
}

class jamesBond extends Heroi {
    public jamesBond(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor) {
        super(vivo, posicao_x, posicao_y, posicao_z, cor);
    }

    @Override
    public void atirar() {
        System.out.println("James Bond atirando powpow");
    }

    @Override
    public void saltar() {
        System.out.println("James Bond pulando");
    }
}

abstract class vilao extends personagem{
    public vilao(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor){
        super(vivo, posicao_x, posicao_y, posicao_z, cor);
    }

    public void correr(){
        System.out.println("Vilão está correndo");
    }
}

abstract class ladrao extends vilao{
    public ladrao(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor){
        super(vivo, posicao_x, posicao_y, posicao_z, cor);
    }

    public void saltar(){
        System.out.println("Ladrão saltando");
    }
}

class coringa extends ladrao{
    public coringa(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor){
        super(vivo, posicao_x, posicao_y, posicao_z, cor);
    }

    public void atirar(){
        System.out.println("Coringa atirando powpow");
    }
}

class pinguim extends ladrao{
    public pinguim(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor){
        super(vivo, posicao_x, posicao_y, posicao_z, cor);
    }

    public void atirar(){
        System.out.println("Pinguim está atirando powpow");
    }

    public void correr(){
        System.out.println("Pinguim correndo");
    }
}

abstract class terrorista extends vilao{
    public terrorista(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor){
        super(vivo, posicao_x, posicao_y, posicao_z, cor);
    }

    public void atirar(){
        System.out.println("Terrorista atirando pow pow");
    }
}

class drno extends terrorista{
    public drno(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor){
        super(vivo, posicao_x, posicao_y, posicao_z, cor);
    }

    public void saltar(){
        System.out.println("DrNo saltando");
    }
    public void atirar(){
        System.out.println("DrNo está atirando pow pow");
    }
    public void correr(){
        System.out.println("DrNo correndo");
    }

}

class goldFinger extends terrorista implements personificacao{
    private Heroi heroi;

    public goldFinger(boolean vivo, float posicao_x, float posicao_y, float posicao_z, int cor, Heroi heroi){
        super(vivo, posicao_x, posicao_y, posicao_z, cor);
        this.heroi = heroi;
    }

    public void saltar(){
        System.out.println("GoldFinger esta saltando");
    }

    public void camuflar(int cor){
        System.out.printf("GoldFinger camuflado de ", cor);
    }

    public void personificar(Heroi h){
        this.heroi = h;
        System.out.println("GoldFinger personificando");
    }
}

interface camuflagem {
    public void camuflar(int cor);
}
interface personificacao extends camuflagem{
    public void personificar(Heroi h);
}