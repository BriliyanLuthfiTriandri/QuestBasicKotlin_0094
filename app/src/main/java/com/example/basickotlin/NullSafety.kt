package com.example.basickotlin

fun nullSafety(){
    // neverNull has String type
    var neverNull: String = "This can't be null"

    // Throws a compiler error
    // neverNull = null

    // nullable has nullable String type
    var nullable: String? = " You can keep a null here"

    // This is OK
    nullable = null


    // Check for null in conditions
    if (neverNull == null ){
        println("inferredNonNull is null")
    } else {
        println("inferredNonNull is not null")
    }

    // Safe call operator
    println(neverNull.length) // 18
    println(nullable?.length) // null


    // notNull doesn't accept null values
    fun strLenght(notNull: String): Int{
        return notNull.length
    }

    println(strLenght(neverNull)) // 18

}

