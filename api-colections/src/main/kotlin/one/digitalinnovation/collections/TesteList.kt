package one.digitalinnovation.collections

fun main(){
    val raul = Funcionario("Raul", 1000.0, "CLT")
    val luna = Funcionario("Luna", 2500.0, "PJ")
    val arthur = Funcionario("Arthur", 3000.0, "CLT")
    val clarissa = Funcionario("Clarissa", 2000.0, "PJ")

    val funcionarios = listOf(raul,luna,arthur,clarissa)

    funcionarios.forEach{ println(it) }

    println("-------------------------------------")
    println(funcionarios.find{it.nome=="Luna"})

    println("-------------------------------------")
    funcionarios.sortedBy{it.salario}.forEach{println(it)}


    println("-------------------------------------")
    funcionarios.sortedBy{ it.nome}.forEach{println(it)}

    println("-------------------------------------")
    funcionarios.groupBy{ it.contrato}.forEach{println(it)}

    println("-------------------------------------")

}

