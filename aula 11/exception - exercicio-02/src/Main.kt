fun main() {

    val calculo = CalculoMatematico()

    println(calculo.divisao(4, 1))
   try {
       println(calculo.divisao(4, 0))
   } catch (ex: ArithmeticException){
       println(ex.message)
   }

}