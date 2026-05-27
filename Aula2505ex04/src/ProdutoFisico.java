public class ProdutoFisico extends Produto {

    public ProdutoFisico(String nome, double precoBase) {
        super(nome, precoBase);
    }

    @Override
    public double calcularPrecoFinal() {
        return this.precoBase + this.precoBase * 0.1 + 50.0;
    }
    
}
