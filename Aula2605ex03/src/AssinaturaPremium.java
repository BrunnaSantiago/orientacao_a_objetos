public class AssinaturaPremium extends Assinatura{

    public AssinaturaPremium(double pb) {
        super(pb);
    }

    @Override
    public String exibirBeneficios() {
        return "Filmes em 4k + Sem Anúncios";
    }
    
}
