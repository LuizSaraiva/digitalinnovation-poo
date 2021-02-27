package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main() {

    val funcionario = Analista("João","123456",10.0)

    ImprimeRelatorioFuncionario.imprime(funcionario)

}
