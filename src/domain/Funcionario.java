package domain;
import enums.Cargo;

public abstract class Funcionario  {
    private String name;
    private double salarioBase;
    private String departamento;
    private Cargo cargo;

    public Funcionario(String name, double salarioBase, String departamento, Cargo cargo) {
        this.name = name;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "name: \'"+this.name+"\' ,\n"+"Salario: "+calcularSalario()+"\n"+"Cargo: "+cargo.getCargo()+ "";
    }

    public abstract double calcularSalario();

    //getters
    public double getSalarioBase()
    {
        return this.salarioBase;
    }
    //getters



}


// O domain são basicamente as entidades do nosso projeto
