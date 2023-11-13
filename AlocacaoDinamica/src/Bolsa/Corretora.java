package Bolsa;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
public class Corretora {
    private int ordem = 0;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_corretora")
    private Integer idCorretora;

    @Column(name = "CNPJ")
    private String cnpj;

    @Column(name = "Telefone")
    private String telefone;

    @Column(name = "Nome")
    private String nome;

    @Column(name = "nome_fantasia")
    private String nomeFantasia;

    @Column(name = "senha_c")
    private String senhaC;

    @Column(name = "razao_social")
    private String razaoSocial;

    @Column(name = "email")
    private String email;

    @Column(name = "nome_usuario")
    private String nomeUsuario;

    // Getters e Setters

    public Integer getIdCorretora() {
        return idCorretora;
    }

    public void setIdCorretora(Integer idCorretora) {
        this.idCorretora = idCorretora;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getSenhaC() {
        return senhaC;
    }

    public void setSenhaC(String senhaC) {
        this.senhaC = senhaC;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public Corretora(String cnpj, String telefone, String nome, String nomeFantasia, String senhaC, String razaoSocial, String email, String nomeUsuario) {
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.nome = nome;
        this.nomeFantasia = nomeFantasia;
        this.senhaC = senhaC;
        this.razaoSocial = razaoSocial;
        this.email = email;
        this.nomeUsuario = nomeUsuario;
    }

    @Override
    public String toString() {
        return "Corretora{" +
                "idCorretora=" + idCorretora +
                ", cnpj='" + cnpj + '\'' +
                ", telefone='" + telefone + '\'' +
                ", nome='" + nome + '\'' +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                ", senhaC='" + senhaC + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", email='" + email + '\'' +
                ", nomeUsuario='" + nomeUsuario + '\'' +
                '}';
    }
}
