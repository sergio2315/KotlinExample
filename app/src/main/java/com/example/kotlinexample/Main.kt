package com.example.kotlinexample
//punto1
fun main(){
    //punto2
   var name = "Luis"
    println("Mi nombre es $name")
    //punto3
    var num1 = 10
    var num2 = 20
    var num3 = 30
    //punto4
    var result = num1+num2+num3
    println("El resultado es: $result")
    //punto5
    var unString: String
    var unChar: Char
    //punto6
    unString = "Ark Reigen"
    unChar = 'A'
    //punto7
    println("El string tiene ${unString.length} caracteres")
    unChar = 'B'
    //punto8 y 9
    var number: Float
    number = 150f
    //punto10
    println("El maximo de Byte es "+ Byte.MAX_VALUE+" y el de Short es: "+Short.MAX_VALUE)
    //punto11
    println("El minimo de Int es :" + Int.MIN_VALUE+"y el de Long es: "+Long.MIN_VALUE)
    //punto12
    var isNight = true
    println(isNight)
    //punto15
    imprimiendoParametros("Daniel","Aranguiz")
    obtieneIVA(82)
}
//punto13
fun imprimiendoParametros(name:String, lastName:String) {
    println(name.length)
    println(lastName.length)
}
//punto14
fun obtieneIVA(neto:Int){
    var iva = 0.19
    var totalIva= neto*iva
    println(totalIva)
}