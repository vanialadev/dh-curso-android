val banco = Banco()

fun main() {
    do {
        when (opcoesMenu()) {
            1 -> criarConta()
            2 -> selecionarConta()
            3 -> removerConta()
            4 -> gerarRelatorio()
            5 -> {
                println("Operação finalizada!")
                break
            }
            else -> println("Opção inválida")
        }
    } while (true)
}

private fun opcoesMenu(): Int {
    println("Selecione a opção")
    println("1 - Criar conta")
    println("2 - Selecionar conta")
    println("3 - Remover conta")
    println("4 - Gerar relatório")
    println("5 - Finalizar aplicação")
    return readLine()!!.toInt()
}

private fun gerarRelatorio() {
    banco.mostrarDados()
}

private fun removerConta() {
    val conta = buscaContaBancaria()
    if (conta != null) {
        banco.remover(conta)
    } else println("Conta inexistente")
}

private fun selecionarConta() {
    val conta = buscaContaBancaria()
    if (conta != null) {
        subMenu(conta)
    } else println("Conta inexistente")
}

private fun subMenu(conta: ContaBancaria?) {
    do {
        when (opcoesSubMenu()) {
            "a" -> depositar(conta!!)
            "b" -> sacar(conta!!)
            "c" -> transferir(conta!!)
            "d" -> gerarRelatorioDaConta(conta!!)
            "e" -> break
            else -> println("Opção inválida")
        }
    } while (true)
}

private fun opcoesSubMenu(): String {
    println("O que você deseja fazer?")
    println("a - Depositar")
    println("b - Sacar")
    println("c - Transferir")
    println("d - Gerar relatório")
    println("e - Retornar ao menu anterior")
    return readLine()!!.toString()
}

private fun gerarRelatorioDaConta(conta: ContaBancaria) {
    conta.mostrarDados()
}

private fun transferir(conta: ContaBancaria) {
    println("Qual valor você deseja transferir?")
    val valor = readLine()!!.toDouble()
    val contaDeposito = buscaContaBancaria()

    if (contaDeposito != null) {
        conta.transferir(valor, contaDeposito)
    } else println("Conta inexistente.")
}

private fun buscaContaBancaria(): ContaBancaria? {
    println("Informe o número da conta")
    val numero = readLine()!!.toInt()
    return banco.procurarConta(numero)
}

private fun sacar(conta: ContaBancaria) {
    println("Qual valor você deseja sacar?")
    val valor = readLine()!!.toDouble()
    conta.sacar(valor)
}

private fun depositar(conta: ContaBancaria) {
    println("Qual valor você deseja depositar?")
    val valor = readLine()!!.toDouble()
    conta.depositar(valor)
}

private fun criarConta() {
    do {
        println("Qual conta você quer criar?")
        println("1 - Corrente")
        println("2 - Poupanca")
        when (readLine()!!.toInt()) {
            1 -> {
                criarContaPoupancaOuCorrente()
                break
            }
            2 -> {
                criarContaPoupancaOuCorrente("poupanca")
                break
            }
            else -> println("Opção inválida")
        }
    } while (true)
}

private fun criarContaPoupancaOuCorrente(tipoConta: String = "corrente") {
    println("Qual o número da conta? ")
    val numero = readLine()!!.toInt()
    println("Qual o saldo inicial da conta?")
    val saldo = readLine()!!.toDouble()

    if (tipoConta == "corrente") {
        println("Qual a taxa de operação?")
        val taxa = readLine()!!.toDouble()
        val contaCorrente = ContaCorrente(numero, saldo, taxa)
        banco.inserir(contaCorrente)
    } else {
        println("Qual o limite?")
        val limite = readLine()!!.toDouble()
        val contaPoupanca = ContaPoupanca(numero, saldo, limite)
        banco.inserir(contaPoupanca)
    }
}


