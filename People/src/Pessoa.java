import java.util.ArrayList;
import java.util.List;

import static java.util.logging.Logger.*;

public class Pessoa {


    private String nome;
    private char sexo;
    private Endereco endereco;
    private List<Telefone> telefones;
    private Pessoa(){

    }

   public Pessoa(String nome, char sexo, Endereco endereco) {
        this.nome = nome;
        this.sexo = sexo;
            if(endereco!=null)
                this.endereco = endereco;

            else
                try {
                    throw new Exception("Endereço invalido");
                } catch (Exception ex){
                }
        this.telefones = new ArrayList<Telefone>();
                }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }
}
