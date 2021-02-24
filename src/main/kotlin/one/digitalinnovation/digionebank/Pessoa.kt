package one.digitalinnovation.digionebank

class Pessoa {

    var name: String = "Luiz"
    var cpf:String = "123.123.123-12"

}

fun main() {
    val pessoa = Pessoa()
    println(pessoa.name + " - " +pessoa.cpf)
}