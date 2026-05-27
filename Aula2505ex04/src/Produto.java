public class Produto {
    
    protected String nome;
    protected double precoBase;

    public Produto(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public double calcularPrecoFinal() {
        return this.precoBase + this.precoBase * 0.1;
    }
}
