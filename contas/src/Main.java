public class Main {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente(1_000_000_000, "Astolfo");
        ContaInvestimento cc2 = new ContaInvestimento(1_000, "Astolfo");
        ContaPoupança cc3 = new ContaPoupança(1_000, "Astolfo");

        cc1.transferir(cc2, 50_000_000);
        cc1.transferir(cc3, 50_000_000);

        System.out.println(cc1.getSaldo());
        System.out.println(cc2.getSaldo());
        System.out.println(cc3.getSaldo());
    }
}
