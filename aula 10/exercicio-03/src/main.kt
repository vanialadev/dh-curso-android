fun main() {
    val estoque = Estoque("Meu estoque", 1, 1)

    estoque.repor(5)

    println(estoque.mostra())
    println(estoque.precisaRepor())


    estoque.mudarNome("novo nome")
    println(estoque.mostra())

    val estoque2 = Estoque("Meu estoque", -2, -2)
    println(estoque2.mostra())
//    estoque2.mudarQtdMinima(-10)
//    estoque2.darBaixa(10)

    println(estoque2.mostra())
    println(estoque2.precisaRepor())

}