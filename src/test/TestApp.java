package test;

import domain.Dev;
import domain.Funcionario;
import enums.Cargo;


public class TestApp {
    public static void main(String[] args) {
        Funcionario f1 = new Dev("Breno",30000,"TI", Cargo.DEV);
        System.out.println(f1);
    }
}
