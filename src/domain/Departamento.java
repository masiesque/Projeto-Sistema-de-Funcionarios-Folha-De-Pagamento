package domain;
import java.util.ArrayList;

public class Departamento {

    private String name;
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();


    public Departamento(String name)
    {
        this.name = name;
    }

    public void addAployees(Funcionario funca)
    {
        funcionarios.add(funca);

    }

    public void listArray()
    {
        for(Funcionario f: funcionarios)
        {
            System.out.println(f);
        }
    }

    public ArrayList<Funcionario> getFuncionarios()
    {
        return  funcionarios;
    }

}
