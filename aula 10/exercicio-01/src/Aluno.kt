class Aluno(private val ra: String,private val nome:String,private  val sobenome:String) {

    val podeAzssistirAula: Boolean = true


    val podeFazerLicaoCasa: Boolean
        get() = true
}

