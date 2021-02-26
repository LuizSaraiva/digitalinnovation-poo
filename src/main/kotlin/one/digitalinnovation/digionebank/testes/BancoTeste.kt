package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main() {
    val digital = Banco("digital", 123)
    val innovation = Banco(nome= "innovation", numero = 234)

    println(digital.nome)
    println(digital.numero)
    println("----")
    println(innovation.nome)
    println(innovation.numero)

    val banco = digital.copy(nome = "Banco")

    println("----")
    println(banco.nome)
    println(banco.numero)

    println(banco.info())
}