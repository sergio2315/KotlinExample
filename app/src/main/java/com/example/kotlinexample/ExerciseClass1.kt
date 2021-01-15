package com.example.kotlinexample
//ejercicio1
/*fun main(){
    var name1:String
    var name2 = "Hugo"
    var lastName = "Diaz"
    name1 = "$name2 $lastName"
    var template = "El apellido es: $lastName\n"
    print(template)
    print("Su nombre es: "+name1)*/
//ejercicio2
/*fun main(){
    var num = 1
    var num2 = 2f
    var words = "hola"
    var word = 'a'
    var show = "int: $num, double: $num2, string: $words, char: $word"
    print(show)
}*/
//ejercicio3
    fun main(){
        var num1= 10
        var num2 = 33
        var num3 = 66
        var result: Int
        result = num1+num2+num3
        print("$result\n")
        num1=55
        result = num1+num2+num3
        print("$result\n")
        var promedio = result/3
        print(promedio)
    }
