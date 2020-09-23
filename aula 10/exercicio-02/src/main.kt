fun main() {

    val item1 = Item(1, "item a", 10, 1.0)
    val item2 = Item(2, "item b", 20, -2.0)
    val item3 = Item(3, "item c", -30, 3.0)

    val fatura = Fatura()
    fatura.itens.add(item1)
    fatura.itens.add(item2)
    fatura.itens.add(item3)

    println(fatura.getTotalFatura())

}
