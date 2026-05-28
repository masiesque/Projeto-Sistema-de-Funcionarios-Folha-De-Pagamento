package service;
import domain.Departamento;
import domain.Funcionario;


public class FolhaPagamento {

    public static void calcularFolhaPagamento(Departamento d)
    {
        double somador = 0;
        System.out.println("\n"+d.getName()+":\n");
        for(Funcionario f : d.getFuncionarios())
        {
            double salarioAtual = f.calcularSalario();
            System.out.println("Funcionário: "+f.getName()+
                    "\nCargo: "+f.getCargo()+
                    "\nSalário: "+salarioAtual+"\n"+
                    "--------------------------------");
            somador = (salarioAtual + somador);
        }


        System.out.println("\nSomatório " +
                "da folha de pagamento" +
                ":\n"+"-------------------------------" +
                "\n"+somador);
    }

}
