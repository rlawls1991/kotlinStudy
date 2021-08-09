package com.kotlinstudy.chapter3

class Step2_ArrayAndList

fun arrayAndList() {
    var array = arrayOf(1, 2, 3)
    var list = listOf(3, 2, 1)
    var names = listOf("kim", "jin", "seok")

    for (e in array) {
        print("$e, ")
    }
    println()
    for (e in list) {
        print("$e, ")
    }
    println()
    for (index in names.indices) {
        println("Position of ${names.get(index)} is $index")
    }
    println()
}