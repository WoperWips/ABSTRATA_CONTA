package scr.banco.app;

public class ContaCorrente extends ContaBancaria {
    private final double limiteCredito;
    private final double taxaSaque;
    @SuppressWarnings("FieldMayBeFinal")
    private double taxaDeposito;

    public ContaCorrente(double saldoInicial, double limiteCredito, double taxaSaque, double taxaDeposito) {
        super(saldoInicial);
        this.limiteCredito = limiteCredito;
        this.taxaSaque = taxaSaque;
        this.taxaDeposito = taxaDeposito;
    }

    @Override
    public void saque(double valor) {
        double valorComTaxa = valor + taxaSaque;
        if (this.saldo + this.limiteCredito >= valorComTaxa) {
            this.saldo -= valorComTaxa;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo e limite insuficientes para realizar o saque.");
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
        System.out.println("Consultando saldo da Conta Corrente. Taxa de consulta: R$1.00");
        this.saldo -= 1.00;  // Taxa de consulta de R$1,00
        exibirSaldo();
        return this.saldo;
    }
}

