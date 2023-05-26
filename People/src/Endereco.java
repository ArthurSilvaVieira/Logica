public class Endereco {
    private String nome;
    private String numero;
    private String Bairro;
    private String cep;

    public Endereco(String nome, String numero, String bairro, String cep) {
        this.nome = nome;
        this.numero = numero;
        Bairro = bairro;
        this.cep = cep;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String bairro) {
        Bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
