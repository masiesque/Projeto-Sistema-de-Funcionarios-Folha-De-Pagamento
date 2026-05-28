package domain;
import enums.Cargo;

public class Dev extends Funcionario{
    private  final double COMISSAO =1000;

    public Dev(String name, double salarioBase, Departamento departamento, Cargo cargo) {
        super(name, salarioBase, departamento, cargo);
    }

    @Override
    public double calcularSalario() {
        return this.getSalarioBase() + COMISSAO;
    }
}
