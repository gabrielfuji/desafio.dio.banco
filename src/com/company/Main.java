package com.company;

public class Main {

    public static void main(String[] args) {
        Cliente Gabriel = new Cliente();
        Gabriel.setNome("Gabriel");

        Conta cc = new contaCorrente(Gabriel);
        Conta poupanca = new contaPoupanca(Gabriel) {
            @Override
            public void transferir(double valor, Conta contaDestino) {

            }
        };

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}