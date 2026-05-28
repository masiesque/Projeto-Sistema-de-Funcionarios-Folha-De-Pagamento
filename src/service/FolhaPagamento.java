package service;
import domain.Departamento;
import domain.Funcionario;


public class FolhaPagamento {

    public static void calcularFolhaPagamento(Departamento d)
    {
        double somador = 0;

        for(Funcionario f : d.getFuncionarios())
        {
            double salarioAtual = f.calcularSalario();
            System.out.println("Funcionário: "+f.getName()+
                    "\nCargo: "+f.getCargo().name()+
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
