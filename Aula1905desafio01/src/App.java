public class App {
    public static void main(String[] args) throws Exception {

        Funcionario func1 = new Funcionario();

        func1.nome = "Ana";
        func1.salario = 2500.0;

        Funcionario func2 = new Funcionario();
        func2.nome = "Carlos";
        func2.salario = 2300.0;

        func1.receberAumento(150);
        System.out.println("O novo salário de Ana é: " + func1.salario);

        func2.receberAumento(200);
        System.out.println("O novo salário de Carlos é: " + func2.salario);
    }
}
