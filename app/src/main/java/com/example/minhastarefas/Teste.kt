package com.example.minhastarefas

data class Usuario(
   val idade: Int,
    val nome: String,
    val brasileiro: Boolean
)

//lateinit var idade: Int
//lateinit var nome: String
val nome:String by lazy(initializer = {
    "joao"
})

val name by lazy { "ana" } //passar dentro do lazy o valor que quer atribuir
//lateinit var usuario1: Usuario
val usuario1 by lazy { Usuario(35,"ana",false) }
//var usuario1: Usuario = Usuario(idade = 36, nome = "pedro",brasileiro = true)//inicializa a variável usuario1

/*fun getName(): String {
    return "joao" //atribuindo para o metodo getName o valor "joao"
}

fun getNome(): String = "joao"
*/
fun main() {
    //usuario1 = Usuario(idade =56,nome="jose",brasileiro = false)
    //nome =                      "Joao"
    println("$usuario1")
    println("$nome")
}