package org.exemple.anonimas;

public class CarteiraContas {
    Conta contaCorrente = new Conta(){
        @Override
        public void imprimetipoConta() {
            System.out.println("Conta Corrente");
        }
    };
    Conta contaPoupanca = new Conta(){
        @Override
        public void imprimetipoConta(){
            System.out.println("Conta Poupança");
        }
    };
}
