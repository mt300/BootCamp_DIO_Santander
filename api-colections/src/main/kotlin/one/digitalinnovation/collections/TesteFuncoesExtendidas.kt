package one.digitalinnovation.collections

fun main() {
    val salarios = arrayOf(
        "3000".toBigDecimal(),
        "1500".toBigDecimal(),
        "7500".toBigDecimal()
    )

    println("-------------------")
    println(salarios.somatoria())
    println("-------------------")
    println(salarios.media())
    salarios.sortBy{}
}

