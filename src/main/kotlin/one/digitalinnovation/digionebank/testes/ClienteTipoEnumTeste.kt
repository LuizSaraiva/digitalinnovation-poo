package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo

fun main() {

    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }

}