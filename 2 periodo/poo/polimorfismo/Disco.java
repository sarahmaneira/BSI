package polimorfismo;
import java.util.ArrayList;


public class Disco {
    ArrayList<Pastas> pasta = new ArrayList();
}

class Pastas{
    ArrayList<Arquivo> arquivos = new ArrayList();
}

abstract class Arquivo {
    ArrayList<Documentos> doc = new ArrayList();
//    ArrayList<Compactado> compactados = new ArrayList();
}
class Compactado {
    ArrayList<Arquivo> arquivos = new ArrayList();
}

abstract class Documentos extends Arquivo{

}

class Texto extends Documentos{

}

class Imagem extends Documentos {

}

class Som extends Documentos{

}

class Video extends Documentos{

}

class Planilha extends Documentos{

}

class Apresentacao extends Documentos{

}

