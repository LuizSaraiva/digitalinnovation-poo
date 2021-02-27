package one.digitalinnovation.digionebank

class Gerente(
    name: String,
    cpf: String,
    salario: Double,
    val senha:String
): Funcionario(name, cpf, salario), Logavel {

    override fun calculoAuxilio(): Double = salario * 0.5
    override fun login(): Boolean = "1234" == senha

}