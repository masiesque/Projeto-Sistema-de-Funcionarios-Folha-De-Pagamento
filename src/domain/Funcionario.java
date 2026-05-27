package domain;

public abstract class Funcionario {
    private String name;
    private double salarioBase;
    private String departamento;
    private String Cargo;

    public Funcionario(String name, double salarioBase, String departamento, String cargo) {
        this.name = name;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
        Cargo = cargo;
    }

    public abstract double calcularSalario();

    //getters
    public double getSalarioBase()
    {
        return this.salarioBase;
    }
    //getters



}
