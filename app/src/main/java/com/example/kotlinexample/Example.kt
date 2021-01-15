package com.example.kotlinexample


fun main(){
    print("Hola mundo\n")
    print("Otro mensaje\n")

    var number1 : Int = 10
    val number2 : Int = 10

    var number3 = 10
    var name = "pepe"

    var template: String
    var texto = "Esto es un texto"
    template = "El mensaje al interior es: $texto\n"
    var template1 = "El lago es: ${texto.length}"
    print(template)
    print(template1)
}
