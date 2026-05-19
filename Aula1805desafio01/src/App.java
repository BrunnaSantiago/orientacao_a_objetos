public class App {
    public static void main(String[] args) throws Exception {
       
        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 1500.0;
        p1.quantidadeEstoque = 25;

        System.out.println("Valor em estoque de P1: " + p1.preco * p1.quantidadeEstoque);

        Produto p2 = new Produto();
        p2.nome = "Mouse";
        p2.preco = 100.0;
        p2.quantidadeEstoque = 25;

        System.out.println("Valor em estoque de P2: " + p2.preco * p2.quantidadeEstoque);

        p1.adicionarEstoque(15);
        System.out.println("Quantidade estoque P1: " + p1.quantidadeEstoque);

         p1.adicionarEstoque(50);
        System.out.println("Quantidade estoque P1: " + p1.quantidadeEstoque);

         p2.adicionarEstoque(10);
        System.out.println("Quantidade estoque P2: " + p2.quantidadeEstoque);

    }
}
