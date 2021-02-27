package one.digitalinnovation.digionebank

abstract class Funcionario(
    name:String,
    cpf:String,
    var salario: Double
    ) : Pessoa(name, cpf) {

        protected abstract fun calculoAuxilio():Double

    override fun toString(): String {
        return """
            Nome: $name
            CPF: $cpf
            Salario: $salario
            Auxilio: ${calculoAuxilio()}
        """.trimIndent()
    }
}