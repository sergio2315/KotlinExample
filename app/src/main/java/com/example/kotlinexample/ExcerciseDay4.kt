package com.example.kotlinexample
//ejemplo usu del when
/*
fun main(){
    var gatito = "michi"
    case(1)
}
fun case(objeto: Any){
     when(objeto){
         1 -> println("One")
         "hello" -> println("Es un saludo")
         is Long -> println("Es del tipo long")
         !is String -> println("No es un string")
         else -> println("No tengo idea que es")
     }
}*/
//ejemplos uso del for
/*fun main(){
    val cakes = listOf("carrot","cheese","chocolate")
    for (item in cakes)
        println("Me comi un pastel de $item")
    for (i in 1..10){
        println("El numero es $i")
    }
    for (i in 1..10 step 2){
        println("El numero es $i")
    }
    for (i in 'a'..'z' step 2){
        println("El numero es $i")
    }
}*/
//ejemplo igualdades kotlin
/*
fun main() {
    val authors = setOf("Twsin", "Shakeaspere", "Heminguay")
    val whither = setOf("Twsin", "Shakeaspere", "Heminguay")
    println(authors== whither)
    println(authors=== whither)
}*/
fun main(){
    val gatito1 = Gato("Misiffus")
}
class Gato(){
    constructor(name: String, age: Int):this()
    constructor(breed: String):this()
   init {
       println("miau")
   }
}