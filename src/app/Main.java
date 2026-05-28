package app;
import domain.*;
import enums.Cargo;

public class Main{

    public static void main(String[] args) {

        Departamento departamento1 = new Departamento("Centro de tecnologia");
        Dev dev1 = new Dev("Breno",15000,departamento1,Cargo.DEV);
        Dev dev2 = new Dev("Jurema",20000,departamento1,Cargo.DEV);
        Gerente ger1 = new Gerente("Geraldo", 30000,departamento1,Cargo.GERENTE);

        departamento1.addAployees(dev1);
        departamento1.addAployees(dev2);
        departamento1.addAployees(ger1);

        departamento1.listArray();

    }
}

