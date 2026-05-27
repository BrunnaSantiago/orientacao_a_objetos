public class App {
    public static void main(String[] args) throws Exception {
       

        Produto p1 = new Produto("TV", 2000);
        System.out.println("Preço p1: R$" + p1.calcularPrecoFinal());

        ProdutoFisico p2 = new ProdutoFisico("Celular", 3000);
        System.out.println("Preço p2: R$"+ p2.calcularPrecoFinal());

        ProdutoDigital p3 = new ProdutoDigital("E-book", 100);
        System.out.println("Preço p3: R$" + p3.calcularPrecoFinal());

    }
}
