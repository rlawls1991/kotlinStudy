package com.kotlinstudy

import com.kotlinstudy.chapter2.test
import com.kotlinstudy.chapter2.testVariable
import org.springframework.boot.autoconfigure.SpringBootApplication
import skipException

@SpringBootApplication
class KotlinStudyApplication

fun main(args: Array<String>) {
    test()
    testVariable()
    skipException()

    // runApplication<KotlinStudyApplication>(*args)
}
