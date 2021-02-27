package one.digitalinnovation.digionebank

import java.math.BigDecimal

abstract class Funcionario(
    name:String,
    cpf:String,
    var salario: BigDecimal
    ) : Pessoa(name, cpf) {

        abstract fun calculoAuxilio()
}