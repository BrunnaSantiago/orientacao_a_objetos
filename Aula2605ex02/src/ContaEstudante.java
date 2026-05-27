public class ContaEstudante extends Conta {

    public ContaEstudante(int n, double s) {
        super(n, s);
    }

    @Override
    public void cobrarTarifa() {
        this.saldo = this.saldo - 0;
        System.out.println("Conta isenta de taxa.");
    }
}
