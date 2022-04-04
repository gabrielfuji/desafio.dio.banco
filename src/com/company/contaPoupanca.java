package com.company;
public class contaPoupanca extends Conta{
        public contaPoupanca(Cliente cliente) {
                super(cliente);
        }

    @Override
    public void transferir(double valor, Conta contaDestino) {

    }

    @Override
        public void imprimirExtrato() {
                 System.out.println("=== Extrato Conta Poupança ===");
                 super.imprimirInfosComuns();
        }
}