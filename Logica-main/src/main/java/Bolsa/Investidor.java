package Bolsa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
public class Investidor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_investidor")
    private Integer idInvestidor;

    @Column(name = "Dinheiro")
    private Double dinheiro;

    @Temporal(TemporalType.DATE)
    @Column(name = "Data_nascimento")
    private Date dataNascimento;

    @Column(name = "Nome")
    private String nome;

    @Column(name = "Num_celular")
    private String numCelular;

    @Column(name = "senha_inv")
    private String senhaInv;

    @Column(name = "nome_usuario")
    private String nomeUsuario;

    public Integer getIdInvestidor() {
        return idInvestidor;
    }

    public void setIdInvestidor(Integer idInvestidor) {
        this.idInvestidor = idInvestidor;
    }

    public Double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(Double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
    }

    public String getSenhaInv() {
        return senhaInv;
    }

    public void setSenhaInv(String senhaInv) {
        this.senhaInv = senhaInv;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public Investidor(Double dinheiro, Date dataNascimento, String nome, String numCelular, String senhaInv, String nomeUsuario) {
        this.dinheiro = dinheiro;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.numCelular = numCelular;
        this.senhaInv = senhaInv;
        this.nomeUsuario = nomeUsuario;
    }

    @Override
    public String toString() {
        return "Investidor{" +
                "idInvestidor=" + idInvestidor +
                ", dinheiro=" + dinheiro +
                ", dataNascimento=" + dataNascimento +
                ", nome='" + nome + '\'' +
                ", numCelular='" + numCelular + '\'' +
                ", senhaInv='" + senhaInv + '\'' +
                ", nomeUsuario='" + nomeUsuario + '\'' +
                '}';
    }
    // Getters e Setters
}

