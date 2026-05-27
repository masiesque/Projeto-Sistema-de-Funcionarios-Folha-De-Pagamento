package domain;

public class Estagiario extends Funcionario{
    private static final double EXTRA= 500;
    public Estagiario(String name, double salarioBase, String departamento, String cargo) {
        super(name, salarioBase, departamento, cargo);
    }

    @Override
    public double calcularSalario() {
        return this.getSalarioBase() + EXTRA;
    }
}
