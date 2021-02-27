package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val gerente = Gerente("Luiz", "456789",500.0)

    ImprimeRelatorioFuncionario.imprime(gerente)

}
