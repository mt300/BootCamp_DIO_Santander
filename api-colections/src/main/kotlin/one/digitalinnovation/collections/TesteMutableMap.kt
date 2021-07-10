package one.digitalinnovation.collections

fun main(){
    val luna = Funcionario("Luna", 5500.0, "CLT")
    val clarissa = Funcionario("Clarissa", 7500.0, "CLT")
    val arthur = Funcionario("Arthur", 3500.0, "CLT")
    val raul = Funcionario("Raul", 4500.0, "PJ")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(clarissa.nome, clarissa)
    repositorio.create(luna.nome, luna)
    repositorio.create(raul.nome, raul)
    repositorio.create(arthur.nome, arthur)

    println(repositorio.findById(clarissa.nome))

    println("---------------------------------")
    repositorio.findAll().sortedBy{it.nome}.forEach{println(it)}
    repositorio.findAll().sortedBy{it.salario}.forEach{println(it)}

    println("---------------------------------")
    repositorio.remove(raul.nome)
    repositorio.findAll().forEach{(k,v)-> println("Nome: $k - Salário: $v")}
}