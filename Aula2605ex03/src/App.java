public class App {
    public static void main(String[] args) throws Exception {
       
        Assinatura filme1 = new Assinatura(20);
        System.out.println(filme1.exibirBeneficios());

        AssinaturaPremium filme2 = new AssinaturaPremium(40);
        System.out.println(filme2.exibirBeneficios());
        }
}
