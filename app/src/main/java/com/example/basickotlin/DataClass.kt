package com.example.basickotlin

// Data class
// Data class adalah class yang digunakan untuk menyimpan data.
// Data class menyediakan fungsi untuk meng-override fungsi equels(), hashCode(), dan toString().
// Data class juga menyediakan fungsi copy() untuk membuat salinan objek dengan beberapa perubahan.

data class DataClass(
    val id: Int,
    var email: String
)

