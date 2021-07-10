package one.digitalinnovation.collections

fun main() {
    val luna = Funcionario("Luna", 5500.0, "CLT")
    val clarissa = Funcionario("Clarissa", 7500.0, "CLT")
    val arthur = Funcionario("Arthur", 3500.0, "CLT")
    val raul = Funcionario("Raul", 4500.0, "PJ")

    val funcionarios1 = setOf(luna,clarissa)
    val funcionarios2 = setOf(arthur,raul)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach{println(it)}
    println("----------------------------------------")

    val funcionarios3 = setOf(raul,clarissa,luna,arthur)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach{println(it)}
    println("----------------------------------------")

    val resultIntersect = funcionarios3.intersect(funcionarios1)
    resultIntersect.forEach{println(it)}
}