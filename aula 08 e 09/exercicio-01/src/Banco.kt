class Banco: Imprimivel {

    private val contas = arrayListOf<ContaBancaria>()

    fun inserir(conta: ContaBancaria) {
        contas.add(conta)
        println("Conta adicionada!")
    }

    fun remover(conta: ContaBancaria?) {
        contas.remove(conta)
        println("Conta removida!")
    }

    fun procurarConta(numeroConta: Int): ContaBancaria? {
        for (conta in contas) {
            if (conta.numeroDaConta == numeroConta) {
                return conta
            }
            contas.contains(conta)
        }
        return null
    }

    override fun mostrarDados() {
        contas.forEach {
            it.mostrarDados()
            println()
        }
    }
}