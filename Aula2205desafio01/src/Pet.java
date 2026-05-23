public class Pet {
    
    private String nome;
    private int energia;

    public Pet(String nomePet) {
        this.nome = nomePet;
        this.energia = 100;
    }

    public void brincar() {
        this.energia = this.energia - 20;
        if (this.energia < 20) {
            System.out.println("O pet está muito cansado para brincar");
        } else {
            System.out.println(this.nome + " continua com energia");
        }
    }

    public void dormir() {
        this.energia = 100;
        System.out.println("O pet dormiu!");
    }
}
