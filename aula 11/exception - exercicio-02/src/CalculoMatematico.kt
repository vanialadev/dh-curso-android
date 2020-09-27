class CalculoMatematico {

    fun divisao(dividendo: Int, divisor: Int): Int {
//        return try {
//            dividendo / divisor
//        } catch (ex: ArithmeticException) {
//            println("Operação não pode ser realizada!")
//            0
//        }
        if (divisor == 0) {
            throw ArithmeticException("Não é possivel dividir por zero!")
        }
        return dividendo / divisor
    }
}