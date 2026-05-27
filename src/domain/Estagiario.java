package domain;

import enums.Cargo;

public class Estagiario extends Funcionario{
    private static final double EXTRA= 500;
    public Estagiario(String name, double salarioBase, String departamento, Cargo cargo) {
        super(name, salarioBase, departamento, cargo);
    }

    @Override
    public double calcularSalario() {
        return this.getSalarioBase() + EXTRA;
    }
}
