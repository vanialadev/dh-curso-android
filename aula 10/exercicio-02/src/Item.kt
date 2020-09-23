import kotlin.math.max

class Item(
    val numero: Int,
    val descricao: String,
    var quantidade: Int,
    var valor: Double
) {

    init {
//        if (quantidade < 0) quantidade == 0
//        if (valor < 0) valor == 0.0
        valor = max(0.0, valor)
        quantidade = max(0, quantidade)
    }
}

