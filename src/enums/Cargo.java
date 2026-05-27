package enums;

public enum Cargo {
    DEV(1,"Desenvolvedor de sistemas"),
    GERENTE(2,"Gerente"),
    ESTAGIARIO(3,"Estagiário");

    private final int valor;//criando os atributos da classe
    private final String cargo;//criando os atributos da classe
    Cargo (int valor, String cargo)
    {
        this.valor = valor;
        this.cargo = cargo;
    }
    //getters:
    public int getValor() {
        return valor;
    }
    public String getCargo() {
        return cargo;
    }
    //getters:
}
