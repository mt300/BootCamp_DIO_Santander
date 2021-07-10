package one.digitalinnovation.collections

data class Funcionario(
    val nome: String,
    val salario:Double,
    val contrato:String
)
{
    override fun toString(): String =
        """
     
            Nome: $nome
            salario: $salario
       
        """.trimIndent()
}

