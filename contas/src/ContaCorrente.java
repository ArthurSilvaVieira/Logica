public class ContaCorrente extends ContaBancária {
    public ContaCorrente(double saldo, String dono) {
        super(saldo, dono);
    }
    public void mostrarNome() {
        System.out.println(this.dono);
    }
}
