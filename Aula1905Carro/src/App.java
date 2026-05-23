public class App {
    public static void main(String[] args) throws Exception {
       
        Carro carro1 = new Carro("Creta", "Hyndai", 2024, "Preto" );

        System.out.println("Modelo do carro 1: " + carro1.modelo);
        System.out.println("Ano do carro 1: " + carro1.ano);

        carro1.setMarca("ford");
        carro1.setAno(2022);

        System.out.println("Novo modelo carro 1: " + carro1.getMarca());
        System.out.println("Novo ano carro 1: " + carro1.getAno());

    }
}

