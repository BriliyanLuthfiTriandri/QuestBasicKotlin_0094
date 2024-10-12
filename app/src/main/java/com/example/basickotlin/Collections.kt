package com.example.basickotlin

// List adalah kumpulan data yang disusun secara berurutan dari
// List bersifat ordered, artinya data yan dimasukan akan memiliki posisi sesuai urutan
// List bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// List Read-Only menggunakan listOf
// List Mutable menggunakan mutableListOf

fun ContohList(){
    println("=== List ===")
    //List Read-Only
    val readOnlyAbjad = listOf("A" , "B", "C")
    println(readOnlyAbjad)

    //List Mutable
    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    //Menambahkan data ke dalam List Mutable
    shape.add("Circle")
    println(shape)

    //Menghapus data dari list Mutable
    shape.remove("Triangle")
    println(shape)

    //Mengubah data di dalam List Mutable
    shape[0] = "Oval"
    println(shape)

    //List Read-Only
    val shapesLocked: List<String> = shape
    println(shapesLocked)
}

// Set adalah Kumpulan data yang tidak memiliki posisi atau urutan tertentu dan hanya menyimpan data unik ( tidak ada duplikasi )
// Set bersifat unordered, yang artinya data yang dimasukan tidak memiliki posisi tertentu
// Set bersifat mutable dan read only, artinya data yang dimasukan dapat diubah dan tidak dapat diubah
// Map Read-Only menggunakan setOf
// Set Mutable menggunanakan MutbaleSetOf

fun ContohSet(){
    println()
    println("=== Set ===")

    // Set Read-Only
    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)

    // Set Mutable
    val shape: MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
    println(shape)

    // Menambahkan data ke dalam Set Mutable
    shape.add("Rectangle")
    println(shape)

    // Menghapus data dari Set Mutable
    shape.remove("Circle")
    println(shape)

    // Set Read-Only
    val shapeLocked: Set<String> = shape
    println(shapeLocked)
}

// Map adalah kumpulan data yang disusuan dalma pasangan key-value
// Map bersifat unordered, artinya data yang dimasukan tidak memiiki posisi tertentu
// Map bersifat mutable dan read only, artinya data yang dimasukan dapat diubah dan tidak dapat diubah
// Map Read-Only mengguanakn mapOf
// Map Mutable menggunakan mutableMapOf

fun ContohMap(){

    println()
    println("=== Map ===")
    // Map Read-Only
    val readOnlyShape: Map<String, Int> = mapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(readOnlyShape)

    // Map Mutable
    val shape: MutableMap<String, Int> = mutableMapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(shape)

    // Menambahkan data ke dalam Map Mutable
    shape["Rectangle"] = 4
    println(shape)

    // Menghapus data dari Map Mutable
    shape.remove("Circle")
    println(shape)

    // Mengubah data di dalam Map Mutable
    shape["Square"] = 5
    println(shape)

    // Map Read-Only
    val shapeLocked: Map<String, Int> = shape
    println(shapeLocked)
}

fun main(){
    ContohList()
    ContohSet()
    ContohMap()
}