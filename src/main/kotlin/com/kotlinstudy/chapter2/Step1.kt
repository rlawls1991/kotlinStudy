package com.kotlinstudy.chapter2

/**
 * 세미콜론(;) 생략가능
 */
fun test() {
    print("hello world")
    print(6 * 2)
    println()
}

/**
 * 변수타입지정은 생략해도 된다.
 */
fun testVariable() {
    val greet = "hello";
    println(greet);
    println(greet::class)
    println(greet.javaClass)
}

// 컴파일 시간에 참조된 객체의 타입을 맞춰준다는 코드(실패코드)
//fun testVariable2(){
//    val greet = "hello";
//    println(greet);
//    greet = 0
//}

