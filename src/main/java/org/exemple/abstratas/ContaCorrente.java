package org.exemple.abstratas;

public class ContaCorrente extends Conta {
    @Override
    public void imprimeExtrato(){
        System.out.println("Extrato da conta Corrente");
    }
}
