abstract class ContaBancaria(
        val numeroDaConta: Int,
        protected var saldo: Double
):  Imprimivel {

    abstract fun sacar(valorSaque: Double): Boolean
    abstract fun depositar(valorDeposito: Double): Boolean

//    val numeroDaConta get() = conta
//    fun obterNumero(): Int = conta

    override fun mostrarDados() {
        println("O número da conta é: $numeroDaConta")
        println("Saldo da conta é R$ %.2f".format(saldo))
    }

    fun transferir(valorTransferencia: Double, destino: ContaBancaria) {
        val saldoContaOrigem = saldo

        if (sacar(valorTransferencia) && destino.depositar(valorTransferencia)) {
            println("Transferência realizada.")
        } else {
            saldo = saldoContaOrigem
            println("Não foi possível realizar a transferência")
        }
    }
}