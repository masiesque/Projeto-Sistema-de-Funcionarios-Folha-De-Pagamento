package app;
import domain.*;
import enums.Cargo;
import service.FolhaPagamento;
//import service.FolhaPagamento;

public class Main{

    public static void main(String[] args) {

        Departamento departamento1 = new Departamento("Centro de tecnologia");
        Departamento departamento2 = new Departamento("RH");
        Dev dev1 = new Dev("Breno",15000,departamento1,Cargo.DEV);
        Dev dev2 = new Dev("Jurema",20000,departamento1,Cargo.DEV);
        Gerente ger1 = new Gerente("Geraldo", 30000,departamento1,Cargo.GERENTE);
        departamento1.addAployees(dev1);
        departamento1.addAployees(dev2);
        departamento1.addAployees(ger1);

        Gerente ger2 = new Gerente("Clodovaldo",5000,departamento2,Cargo.GERENTE);
        Estagiario estagiario = new Estagiario("Robinho",1600,departamento2,Cargo.ESTAGIARIO);
        Estagiario estagiario1 = new Estagiario("Luciene",2000,departamento2,Cargo.ESTAGIARIO);
        departamento2.addAployees(ger2);
        departamento2.addAployees(estagiario1);
        departamento2.addAployees(estagiario);

        /// usando o service:


        FolhaPagamento.calcularFolhaPagamento(departamento1);
        FolhaPagamento.calcularFolhaPagamento(departamento2);


    }
}

