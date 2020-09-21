class ContaCorrente(conta: Int,
                    saldo: Double,
                    private val taxaDeOperacao: Double) : ContaBancaria(conta, saldo) {

    override fun sacar(valorSaque: Double): Boolean {
        val valorTotalDoSaque = valorSaque + taxaDeOperacao

        return if (saldo >= valorTotalDoSaque) {
            saldo -= valorTotalDoSaque
            println("Saque realizado! Saldo atual é R$ %.2f".format(saldo))
            true
        } else {
            println("Saldo insuficiente. Não é possível realizar o saque.")
            false
        }
    }

    override fun depositar(valorDeposito: Double): Boolean {
        val valorTotal = valorDeposito + saldo
        return if (valorTotal >= taxaDeOperacao) {
            saldo += valorDeposito - taxaDeOperacao
            println("Deposito realizado! Saldo atual é R$ %.2f".format(saldo))
            true
        } else {
            println("Valor insuficiente. Não é possível realizar o depósito.")
            false
        }
    }

    override fun mostrarDados() {
        super.mostrarDados()
        println("Taxa de operação: $taxaDeOperacao")
    }
}