public class ContaPoupanca extends Conta{
    
    public ContaPoupanca(String titular) {
        super(titular);
    }

    public void renderJuros() {
        double juros = this.saldo * 0.05;
        this.saldo = this.saldo + juros;
        System.out.println("Juros rendendo!");
    }
}
