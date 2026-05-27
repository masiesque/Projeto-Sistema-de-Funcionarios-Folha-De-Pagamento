package domain;

public class Gerente extends Funcionario{
    private static final double EXTRA = 3000;
    public Gerente(String name, double salarioBase, String departamento, String cargo) {
        super(name, salarioBase, departamento, cargo);
    }

    @Override
    public double calcularSalario() {
        return this.getSalarioBase() + EXTRA;
    }
}
