package com.kotlinstudy

import com.kotlinstudy.chapter2.test
import com.kotlinstudy.chapter2.testVariable
import com.kotlinstudy.chapter3.*
import org.springframework.boot.autoconfigure.SpringBootApplication
import skipException

@SpringBootApplication
class KotlinStudyApplication

fun main(args: Array<String>) {
    // chapter2
    test()
    testVariable()
    skipException()

    // chapter3
    rangeClass()
    ward()
    arrayAndList()
    isAlive(true, 3)
    isAlive_리팩토링_When_사용(true, 3)
    println(whatToDo("Sunday"))
    println(whatToDo(3))
    // runApplication<KotlinStudyApplication>(*args)
}
