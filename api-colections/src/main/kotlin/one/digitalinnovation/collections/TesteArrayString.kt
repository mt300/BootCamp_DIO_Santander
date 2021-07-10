package one.digitalinnovation.collections

fun main()  {
    val nomes = Array(3) {""}
    nomes[0] = "Luna"
    nomes[1] = "Arthur"
    nomes[2] = "Raul"

    for (nome in nomes) {
        println(nome)
    }
    println("-----------------------")
    nomes.sort()
    nomes.forEach {println(it)}

    val names2 = arrayOf("Clarissa", "Pablo", "Matheus")
    names2.sort()
    names2.forEach{println(it)}
}