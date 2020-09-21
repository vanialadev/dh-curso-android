class ContaPoupanca(conta: Int,
                    saldo: Double,
                    private val limite: Double) : ContaBancaria(conta, saldo) {

    override fun sacar(valorSaque: Double): Boolean {
        val valorTotalSaque = saldo + limite
        return if (valorSaque <= valorTotalSaque) {
            saldo -= valorSaque
            println("Saque realizado! Saldo atual é R$ %.2f".format(saldo))
            true
        } else {
            println("Saldo insuficiente. Não é possível realizar o saque.")
            false
        }
    }

    override fun depositar(valorDeposito: Double): Boolean {
        saldo += valorDeposito
        println("Deposito realizado! Saldo atual é R$ %.2f".format(saldo))
        return true
    }

    override fun mostrarDados() {
        super.mostrarDados()
        println("Limite: $limite")
    }
}