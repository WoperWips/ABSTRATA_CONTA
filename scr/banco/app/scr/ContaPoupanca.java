package scr.banco.app.scr;

import scr.banco.app.ContaBancaria;

public class ContaPoupanca extends ContaBancaria {
    private final double taxaSaque;
    private final double taxaDeposito;

    public ContaPoupanca(double saldoInicial, double taxaSaque, double taxaDeposito) {
        super(saldoInicial);
        this.taxaSaque = taxaSaque;
        this.taxaDeposito = taxaDeposito;
    }

    @Override
    public void saque(double valor) {
        double valorComTaxa = valor + taxaSaque;
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
        exibirSaldo();
    }

    @Override
    public void deposito(double valor) {
        this.saldo += (valor - taxaDeposito);
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        exibirSaldo();
    }

    @Override
    public double consulta() {
        System.out.println("Consultando saldo da Conta Poupança.");
        exibirSaldo();
        return this.saldo;
    }

    public double getTaxaSaque() {
        return taxaSaque;
    }
}
