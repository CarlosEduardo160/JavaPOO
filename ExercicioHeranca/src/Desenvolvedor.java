public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, double salario){
        super(nome, salario);
    }

    public double calcularBonus() {
        double bonus = this.salario * 0.15;
        return bonus;
    }
}