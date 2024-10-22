package scr.banco.app;

import scr.banco.app.scr.ContaPoupanca;

public class TesteContaBancaria {
    public static void main(String[] args) {
        // Criando uma Conta Corrente com saldo inicial de R$1000, limite de crédito de R$500, taxa de saque R$5, taxa de depósito R$2
        ContaCorrente contaCorrente = new ContaCorrente(1000.00, 500.00, 5.00, 2.00);
        contaCorrente.deposito(200);  // Depósito de R$200
        contaCorrente.saque(300);     // Saque de R$300
        contaCorrente.consulta();     // Consulta de saldo (aplica taxa)

        // Criando uma Conta Poupança com saldo inicial de R$1500, taxa de saque R$3, taxa de depósito R$1
        ContaPoupanca contaPoupanca = new ContaPoupanca(1500.00, 3.00, 1.00);
        contaPoupanca.deposito(100);  // Depósito de R$100
        contaPoupanca.saque(200);     // Saque de R$200
        contaPoupanca.consulta();     // Consulta de saldo
    }
}
