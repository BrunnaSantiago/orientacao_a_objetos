public class App {
    public static void main(String[] args) throws Exception {
       
        Animal animal1 = new Animal("Animal", 3);

        animal1.dormir();

        Cachorro animal2 = new Cachorro("Dog", 5);

        animal2.dormir();
        animal2.latir();

        Gato animal3 = new Gato("Gatinho", 1);

        animal3.dormir();
        animal3.miar();

    }
}
