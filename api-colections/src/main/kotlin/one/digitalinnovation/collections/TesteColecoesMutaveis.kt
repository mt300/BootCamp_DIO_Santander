package one.digitalinnovation.collections

fun main(){
    val luna = Funcionario("Luna", 5500.0, "CLT")
    val clarissa = Funcionario("Clarissa", 7500.0, "CLT")
    val arthur = Funcionario("Arthur", 3500.0, "CLT")
    val raul = Funcionario("Raul", 4500.0, "PJ")

    val funcionarios = mutableListOf(luna,clarissa,arthur)
    funcionarios.forEach{println(it)}

    println("-----------------------")
    funcionarios.add(raul)
    funcionarios.forEach{println(it)}

    println("-------------------------")
    funcionarios.remove(arthur)
    funcionarios.forEach{println(it)}

    println("-----------------------")
    val funcionarioSet = mutableSetOf(clarissa)
    funcionarioSet.forEach{println(it)}

    println("------------------------")
    funcionarioSet.add(luna)
    funcionarioSet.add(raul)
    funcionarioSet.forEach { println(it) }

    println("-------------------------------")
    funcionarioSet.remove(luna)
    funcionarioSet.forEach{println(it)}
}