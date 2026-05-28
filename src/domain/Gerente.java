package domain;
import interfaces.Antenticacao;
import enums.Cargo;

public class Gerente extends Funcionario implements Antenticacao {
    private static final double EXTRA = 3000;
    public Gerente(String name, double salarioBase, Departamento departamento, Cargo cargo) {
        super(name, salarioBase, departamento, cargo);
    }

    @Override
    public boolean login(String password) {
        return false;
    }

    @Override
    public double calcularSalario() {
        return this.getSalarioBase() + EXTRA;
    }
}
