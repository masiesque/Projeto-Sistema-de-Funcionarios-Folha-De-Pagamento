package interfaces;

public interface Antenticacao {

public abstract boolean login(String password);
// o unico que vai acessar essa função será o gerente;
}


//As interfaces funcionam como uma espécie de contrato(uma regra estática) para as classes

