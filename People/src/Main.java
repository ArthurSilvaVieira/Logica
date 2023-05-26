import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

         List<Telefone> fones = new ArrayList<Telefone>();
        LinkedList<Pessoa> pessoas = new LinkedList<Pessoa>();
    Pessoa p = new Pessoa("a", 'b', new Endereco("c", "Bairro", "323", "3"));
    fones.add(1, new Telefone("55", "2141421"));
      p.setTelefones(fones);

    pessoas.add(p);


}
}