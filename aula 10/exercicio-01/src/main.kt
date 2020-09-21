fun main(){

    val aluno = Aluno("1", "Vania", "Almeida")
    val professor = Professor("Zé", "123")
    val materia = Materia("matemática")
    val aula = Aula(materia, "19:00", "22:30")
    val curso = Curso("Ciência da computação", professor)
    val turma = Turma("manha", curso)
}