package one.digitalinnovation.digionebank

class Pessoa {

    var name: String = "Luiz"
    var cpf:String = "123.123.123-12"
    private set

    constructor()

    fun pessoaInfo() = "$name - $cpf"
}

fun main() {

    val pessoa = Pessoa()
    println(pessoa.pessoaInfo())

}