package com.example.kotlinexample
//ejercicio1
/*
fun main(){
    println(getNombre("pepe"))
    var nombre = getNombre("pepe")
    var apellidos = "fica"
    var edad = 20
    println(imprimirNombreCompleto(getNombre("pepe"),"fica",18))
    print(imprimirNombreCompleto(nombre,apellidos,edad))

}
fun getNombre(nombre: String):String{
    return nombre
}
fun imprimirNombreCompleto(nombre: String,apellidos:String,edad:Int){
  println("$nombre $apellidos $edad")
}*/
//ejemplo instanciar una clase
/*
fun main(){
    var persona = Persona("lucas")
    var animal = Animal()
}
class Persona(persona:String)
class Animal()*/
//ejemplo instanciar clase llamando propiedades internas
/*fun main(){
    val contact = Contact(10, "sergiolillo@udec.cl")
    println(contact.id)
    println(contact.email)
}
//clase con su constructor
class Contact(val id:Int, val  email:String)*/

//ejemplo3 herencia de clases
/*
fun main(){
    val perro = Dog()
    perro.sayHello()
    val cachupin = Yorkshire()
    cachupin.sayHello()
}
open class Dog{
    open fun sayHello(){
        print("guau guau")
    }
}
//clase que extiende de Dog
class Yorkshire:Dog(){
    override fun sayHello() {
        println("wif wif")
    }
}*/
//data class
fun main(){
    val person = Person("Lucas",22,"avda #5")
    println(person)
}
data class Person(val name: String, val age:Int,val adress:String)