package com.example.basickotlin

fun withoutParameter(){
    println("== withoutParameter ==")
    println("Hello, World")
}

fun withParameter(name: String){
    println()
    println("== withParameter ==")
    println("Hello, $name!")
}

// named argument
// named argument merupakan cara untuk memanggil fungsi untuk menyebutkan nama parameter
fun withNamedArgument(name: String, age:Int){
    println()
    println("== withNamedArgument ==")
    println("Hello, $name! You are $age years old.")
}

// default parameter value
// default parameter value merupakan cara untuk memberikan nilai default pada parameter fungsi
fun withDefaultParameter(name:String = "Brili", age: Int){
    println()
    println("== withDefaultParameter ==")
    println("Hello, $name! You are $age years old.")
}

fun withReturn(panjang : Int, lebar : Int) : Int {
    return println(panjang * lebar)
}

