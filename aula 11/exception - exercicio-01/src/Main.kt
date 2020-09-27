fun main () {
    val lista = arrayListOf<String>()

    lista.add("Pato")
    lista.add("Cachorro")
    lista.add("Gato")

    try {
        println(lista.get(3))
    } catch (ex: IndexOutOfBoundsException){
        println("A posição informada não existe")
        ex.printStackTrace()
    } catch (ex: Exception){
        ex.printStackTrace()
    }

//    println(lista.get(3))
    println(lista.get(1))

}