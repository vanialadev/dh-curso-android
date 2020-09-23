import kotlin.math.max

class Estoque(
    var nome: String,
    var qtdAtual: Int,
    var qtdMinima: Int
) {

    init {
        qtdAtual = max(qtdAtual, 0)
        qtdMinima = max(qtdMinima, 0)
    }

    fun mudarNome(nome: String) {
        this.nome = nome
    }

    fun mudarQtdMinima(qtdMinima: Int) {
        if (qtdMinima < 0) {
            throw Exception("Quantidade não pode ser negativa")
        }
        this.qtdMinima = qtdMinima
    }

    fun repor(qtd: Int) {
        qtdAtual += qtd
    }

    fun darBaixa(qtd: Int) {
        if (qtd <= qtdAtual) {
            qtdAtual -= qtd
        } else {
            throw Exception("Quantidade não pode ser negativa")
        }
    }

    fun mostra(): String {
        return toString()
    }

    fun precisaRepor(): Boolean {
        return qtdAtual <= qtdMinima
    }

    override fun toString(): String {
        return "Estoque(nome='$nome', quantidade mínima=$qtdMinima, quantidade atual=$qtdAtual)"
    }


}

