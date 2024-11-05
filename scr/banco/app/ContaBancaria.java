package scr.banco.app;

// Classe abstrata que representa uma conta bancária
public abstract class ContaBancaria {
    
    // Atributo protegido para armazenar o saldo da conta
    protected double saldo;

    // Construtor da classe, inicializa o saldo da conta com um valor inicial
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Métodos abstratos que devem ser implementados pelas subclasses
    // Método para realizar um saque da conta, o valor será subtraído do saldo
    public abstract void saque(double valor);

    // Método para realizar um depósito na conta, o valor será adicionado ao saldo
    public abstract void deposito(double valor);

    // Método abstrato para consultar o saldo, retornando o valor atual do saldo
    public abstract double consulta();

    // Método para exibir o saldo atual da conta na tela
    public void exibirSaldo() {
        // Imprime o saldo formatado
        System.out.println("Saldo atual: R$" + this.saldo);
    }
}
