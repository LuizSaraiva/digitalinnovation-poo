package one.digitalinnovation.digionebank

class Cliente(
    name: String,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val senha:String
): Pessoa(name, cpf), Logavel{

    override fun login(): Boolean = "c123" == senha

    override fun toString(): String = """
        Nome = $name
        CPF = $cpf
        Tipo Cliente = ${clienteTipo.descricao}
    """.trimIndent()
    }

