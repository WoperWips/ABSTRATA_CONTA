package scr.banco.app;

public abstract class ContaBancaria {
    protected double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Métodos abstratos
    public abstract void saque(double valor);
    public abstract void deposito(double valor);
    public abstract double consulta();

    // Método para exibir o saldo
    public void exibirSaldo() {
        System.out.println("Saldo atual: R$" + this.saldo);
    }
}
