public class App {
    public static void main(String[] args) throws Exception {
       
        PagamentoBoleto pb1 = new PagamentoBoleto(1000.0);
        PagamentoCartao pc1 = new PagamentoCartao(1500.0);

        pb1.processarPagamento();
        pc1.processarPagamento();
    }
}
