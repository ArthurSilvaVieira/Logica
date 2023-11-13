package Bolsa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
public class Ativos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_ativos")
    private Integer idAtivos;

    @Column(name = "Ticker")
    private String ticker;

    @Column(name = "Cotacao")
    private Double cotacao;

    @Column(name = "dt_valor_inicial")
    private Double dtValorInicial;

    @Column(name = "dt_valor_final")
    private Double dtValorFinal;

    private int compras;

    public int getCompras() {
        return compras;
    }

    public void setCompras(int compras) {
        this.compras = compras;
    }

    public Integer getIdAtivos() {
        return idAtivos;
    }

    public void setIdAtivos(Integer idAtivos) {
        this.idAtivos = idAtivos;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public Double getCotacao() {
        return cotacao;
    }

    public void setCotacao(Double cotacao) {
        this.cotacao = cotacao;
    }

    public Double getDtValorInicial() {
        return dtValorInicial;
    }

    public void setDtValorInicial(Double dtValorInicial) {
        this.dtValorInicial = dtValorInicial;
    }

    public Double getDtValorFinal() {
        return dtValorFinal;
    }

    public void setDtValorFinal(Double dtValorFinal) {
        this.dtValorFinal = dtValorFinal;
    }

    public Ativos(String ticker, Double cotacao, Double dtValorInicial, ) {
        this.ticker = ticker;
        this.cotacao = cotacao;
        this.dtValorInicial = dtValorInicial;
    }

    @Override
    public String toString() {
        return "Ativos{" +
                "idAtivos=" + idAtivos +
                ", ticker='" + ticker + '\'' +
                ", cotacao=" + cotacao +
                ", dtValorInicial=" + dtValorInicial +
                ", dtValorFinal=" + dtValorFinal +
                '}';
    }
}

