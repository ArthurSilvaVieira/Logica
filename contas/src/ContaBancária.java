 public abstract class ContaBancária {
    protected double saldo;

    protected String dono;

    public ContaBancária(double saldo, String dono) {
        this.saldo = saldo;
        this.dono = dono;
    }

    public void sacar(double qtd) {
        if(qtd <= saldo && qtd > 0)
            saldo=saldo-qtd;

    }


    public void depositar(double qtd) {
        if(qtd > 0)
            saldo=saldo+qtd;
    }


    public void transferir(ContaBancária outraConta, double qtd) {
        if(qtd <= saldo && qtd > 0) {
            saldo = saldo - qtd;

            outraConta.depositar(qtd);
        }
    }


    public double getSaldo() {
        return saldo;
    }
}
