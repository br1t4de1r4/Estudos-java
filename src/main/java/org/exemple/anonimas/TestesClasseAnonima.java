package org.exemple.anonimas;

public class TestesClasseAnonima {
    public static void main(String[] args){
        CarteiraContas carteira = new CarteiraContas();
        carteira.contaCorrente.imprimetipoConta();
        carteira.contaPoupanca.imprimetipoConta();
    }
}
