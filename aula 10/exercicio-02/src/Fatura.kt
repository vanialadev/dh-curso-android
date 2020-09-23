class Fatura {

    val itens = arrayListOf<Item>()

    fun getTotalFatura(): Double {
        var valorTotal = 0.0
        itens.forEach {
            valorTotal += it.quantidade * it.valor
        }
        return valorTotal
    }
}