Abstrata_Conta:Nesse reprositorio foi feito com o intuito de auxiliar logica de progamação orientada objeto.

🚀 Começando este projeto implementa um sistema simples de contas bancárias em Java, utilizando conceitos de herança e polimorfismo. A classe abstrata ContaBancaria serve como base para dois tipos de contas: ContaCorrente e ContaPoupanca, cada uma com regras específicas para saque, depósito e consulta de saldo.

Estrutura do Projeto
Pacote src.banco:Contém as classes que modelam as contas bancárias.
ContaBancaria:Classe abstrata que define os métodos básicos de uma conta.
ContaCorrente:Subclasse que permite saque além do saldo com limite de crédito.
ContaPoupanca:Subclasse que não permite saque maior que o saldo.
Pacote src.app:Contém a classe de teste.
TesteContaBancaria:Classe responsável por testar as operações de saque, depósito e consulta de saldo para ContaCorrente e ContaPoupanca.
Funcionalidades
ContaBancaria:

Métodos abstratos saque(), deposito() e consulta().
ContaCorrente:

Permite saques com limite de crédito.
Aplica taxas diferenciadas para saque, depósito e consulta.
ContaPoupanca:

Não permite saques maiores que o saldo disponível.
Aplica taxas específicas para saques e depósitos.

📋 Pré-requisitos Visual Studio + extensões do Java

🔧 Instalação Cada programa pode ser executado individualmente. Basta compilar o código em seu ambiente Java e executar o arquivo correspondente. Alguns programas utilizam a classe Scanner para permitir a entrada de dados pelo usuário.

🛠️ Construído com Ferramentas utilizadas e bibliotecas Visual Studio

📌 Versão Versão 1.0

✒️ Autores Herick Marlon - Trabalho Inicial - Abstrata_Conta