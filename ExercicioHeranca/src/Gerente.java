public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public double calcularBonus() {
        double bonus = this.salario * 0.20;
        return bonus;
    }
}