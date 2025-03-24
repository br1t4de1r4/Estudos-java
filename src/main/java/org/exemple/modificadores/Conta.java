package org.exemple.modificadores;

import lombok.Setter;

public class Conta {

    @Setter
    private Double saldo;
    private String titular;

   public Conta(Double saldo){
       this.saldo = saldo;
   }

    public Double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

}
