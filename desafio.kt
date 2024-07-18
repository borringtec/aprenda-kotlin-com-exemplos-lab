enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome:  String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        // TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
    }
    
    fun exibirDetalhes() {
        for (conteudo in conteudos) {
            println(conteudo)
        }
        for (inscrito in inscritos) {
            println(inscrito.nome)
        }
    }
}

fun main() {
    // TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    // TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    val usuario01 = Usuario("Usuário 01")
    val usuario02 = Usuario("Usuário 02")
    
    val conteudo1 = ConteudoEducacional("Sintax Kotlin", 30, Nivel.BASICO)
    val conteudo2 = ConteudoEducacional("Laços de Repetição Kotlin", 60, Nivel.INTERMEDIARIO)
    val conteudo3 = ConteudoEducacional("Estrutura de Dads Java", 120, Nivel.DIFICIL)
    
    val formacaoKotlin = Formacao("Formação Kotlin", listOf(conteudo1, conteudo2, conteudo3))
    formacaoKotlin.matricular(usuario01)
    formacaoKotlin.matricular(usuario02)
    
    formacaoKotlin.exibirDetalhes()
}
