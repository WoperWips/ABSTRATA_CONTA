package scr.banco.app;

// Classe que representa uma Conta Corrente, que herda da classe ContaBancaria
public class ContaCorrente extends ContaBancaria {

    // Atributo final para o limite de crédito da conta
    private final double limiteCredito;

    // Atributo final para a taxa de saque aplicada aos saques
    private final double taxaSaque;

    // Atributo não final (com possível modificação) para a taxa de depósito
    @SuppressWarnings("FieldMayBeFinal") // Aviso para o compilador sobre a possibilidade de não ser final
    private double taxaDeposito;

    // Construtor da ContaCorrente que inicializa o saldo, limite de crédito, taxas de saque e depósito
    public ContaCorrente(double saldoInicial, double limiteCredito, double taxaSaque, double taxaDeposito) {
        // Chama o construtor da classe pai (ContaBancaria) para inicializar o saldo
        super(saldoInicial);

        // Inicializa os atributos específicos da ContaCorrente
        this.limiteCredito = limiteCredito;
        this.taxaSaque = taxaSaque;
        this.taxaDeposito = taxaDeposito;
    }

    // Implementação do método de saque da ContaCorrente
    @Override
    public void saque(double valor) {
        // Calcula o valor do saque somado à taxa de saque
        double valorComTaxa = valor + taxaSaque;

        // Verifica se o saldo disponível, somado ao limite de crédito, é suficiente para cobrir o saque
        if (this.saldo + this.limiteCredito >= valorComTaxa) {
            // Atualiza o saldo subtraindo o valor do saque e a taxa
            this.saldo -= valorComTaxa;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            // Se não houver saldo suficiente, exibe uma mensagem de erro
            System.out.println("Saldo e limite insuficientes para realizar o saque.");
        }

        // Exibe o saldo atualizado após o saque
        exibirSaldo();
    }

    // Implementação do método de depósito da ContaCorrente
    @Override
    public void deposito(double valor) {
        // Subtrai a taxa de depósito do valor depositado e adiciona ao saldo
        this.saldo += (valor - taxaDeposito);
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");

        // Exibe o saldo atualizado após o depósito
        exibirSaldo();
    }

    // Implementação do método de consulta do saldo da ContaCorrente
    @Override
    public double consulta() {
        // Exibe uma mensagem informando sobre a consulta e a taxa associada a ela
        System.out.println("Consultando saldo da Conta Corrente. Taxa de consulta: R$1.00");

        // Subtrai a taxa de consulta de R$1,00 do saldo
        this.saldo -= 1.00;

        // Exibe o saldo atualizado após a consulta
        exibirSaldo();

        // Retorna o saldo atual
        return this.saldo;
    }
}
