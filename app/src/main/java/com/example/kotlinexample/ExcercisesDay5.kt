package com.example.kotlinexample

/*
fun main(){
    var perro = Dog()
    perro.raza?.nombre  //puede llegar null
    perro.raza!!.nombre //afirmación de que no llegara null
}
class Raza{
    var nombre: String? = null
}
class Dog{
    var raza: Raza? = null
}*/
/*
fun main(){
   println(calculate(10,20,::sumar))
    println(calculate(10,20,::multiplicar))
}
fun calculate(num1: Int, num2: Int,opetation:(Int,Int)->Int):Int{
    return opetation(num1,num2)
}
fun sumar(num1: Int,num2: Int)=num1+num2
fun multiplicar(num1: Int,num2: Int)=num1*num2*/

/*fun main(){
    val upperCaseSimple:(String)->String={it.toUpperCase()}
}*/
//maneras de hacer listas mutables
/*
fun main(){
    val listMutable: MutableList<Int> = mutableListOf(1,3,5,7)
    val listMutableString= mutableListOf("Ana","Pedro","Juan")
    val listMutable2 = listOf("Pepe","Juaco","Rocio")
    listMutable.add(9)
    listMutable.remove(9)
    listMutable.forEach{
        println("Este es el elemento $it")
    }
}*/
//mapas mutables
/*
fun main(){
    val mapaMutable1: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 200, 3 to 300)
    val mapaMutableString= mutableMapOf("clave1" to 1,"clave2" to 2)
    mapaMutableString["clave3"]=3
    mapaMutableString["clave4"]=4
    mapaMutableString.forEach{
        println(it)
    }
}*/
//filtros en las listas
/*fun main(){
    val listNumeros = listOf(1,3,6,8,8,-1)
    //val positivos = listNumeros.filter { x-> x>0 }
    //val negativos = listNumeros.filter { x-> x<0 }
    //o se puede reemplazar las x por un it
    val positivos = listNumeros.filter { it>0 }
    val negativos = listNumeros.filter { it<0 }
    println(positivos)
    println(negativos)
    println(listNumeros)
}*/
fun main(){
    val listNumeros = listOf(1,3,6,8,8,-1)
    val listString= mutableListOf("Some","Something","Algo","Jose","Something")
    val dobles = listNumeros.map { x -> x*2 }
    println(dobles)
    var findFirst = listString.find { it.equals("Some") }
    var findLast = listString.findLast { it.startsWith("So") }
    println(findFirst)
    println(findLast)
    val ordenados =  listNumeros.sortedBy { -it }
    val stringOrdenados= listString.map { it.toLowerCase() }
    println(ordenados)
    println(stringOrdenados)
}