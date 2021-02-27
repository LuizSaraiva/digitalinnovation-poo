package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {

    val cliente = Cliente("maria","46789879", ClienteTipo.PF, "c123")

    println(cliente.toString())
    TesteAutenticacao().autentica(cliente)

}