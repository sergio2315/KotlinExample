package com.example.kotlinexample

import java.time.Year

fun main(){
    var datos = LibrosEscolares()
    datos.dataBook("El señor de los anillos","1954",1272,"Tolkien","D",15000)
    datos.dataBook("El resplandor","1977",599,"Stephen King","D",12000)
    datos.dataBook("Don Quijote de la Mancha","1605",1560,"Miguel de Cervantes","D",14000)
    println(datos)
}
class LibrosEscolares{
    fun dataBook(name:String,year:String,pages:Int, author:String,type:String,price:Int){
        println("Nombre: $name")
        println("Año: $year")
        println("Páginas: $pages")
        println("Autor: $author")
        println("Tipo: $type")
        println("Precio $$price")
        println("***********************")
    }
    fun imprimirPrecio(mount: Int){
    }
}