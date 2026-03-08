public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void imprimirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: " + this.salario);
    }

    public double calcularBonus() {
        double bonus = this.salario * 0.10;
        return bonus;
    }
}