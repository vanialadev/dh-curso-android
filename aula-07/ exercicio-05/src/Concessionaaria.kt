class Concessionaaria {

    var registroDeVenda = 0

    fun registrarVenda(veiculo: Veiculo, cliente: Cliente, valor: Double) {
        Venda(valor, veiculo, cliente)
        registroDeVenda++
    }
}