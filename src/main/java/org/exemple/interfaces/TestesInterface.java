package org.exemple.interfaces;

public class TestesInterface {
    public static void main(String[] args){
        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.depositar(5000.00);

        contaCorrente.getSaldo();
        System.out.println("Saldo Conta Corrente: " + contaCorrente.getSaldo());

        contaCorrente.sacar(3000.00);
        System.out.println("Saldo Conta Corrente: " + contaCorrente.getSaldo());


        ContaPoupanca contaPoupanca = new ContaPoupanca();

        contaPoupanca.depositar(15000.00);
        contaPoupanca.getSaldo();
        System.out.println("Saldo Conta Poupança: " + contaCorrente.getSaldo());

        contaPoupanca.sacar(1200.00);
        System.out.println("Saldo Conta Poupança: " + contaCorrente.getSaldo());


    }
}
