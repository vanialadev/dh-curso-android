class Curso(
    val nome: String,
    val professor: Professor
) {
    val aulas get() = arrayListOf<Aula>()
    val alunos get() = arrayListOf<Aluno>()
}

