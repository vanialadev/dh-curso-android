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

    fun transferir(valorTransferencia: Double, destino: ContaBancaria?) {
        if (sacar(valorTransferencia) && destino!!.depositar(valorTransferencia)) {
            println("Transferência realizada.")
        } else {
            println("Não foi possível realizar a transferência")
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ContaBancaria

        if (numeroDaConta != other.numeroDaConta) return false
        if (saldo != other.saldo) return false

        return true
    }

    override fun hashCode(): Int {
        var result = numeroDaConta
        result = 31 * result + saldo.hashCode()
        return result
    }


}