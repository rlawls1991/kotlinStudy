package com.kotlinstudy.chapter3

class Step1_Loop

/**
 * 레인지 클래스 사용
 */
fun rangeClass() {
    var oneTofive: IntRange = 1..5
    var aToE: CharRange = 'a'..'e'
    var seekHelp: ClosedRange<String> = "hell".."help"

    println(oneTofive)
    println(oneTofive.random())
    println(aToE)
    println(aToE.random())
    println(seekHelp.contains("helm"))
    println(seekHelp.contains("helq"))
}

/**
 * 정방향 후방향 반복
 */
fun ward() {
    // 정방향
    for (i in 1..5) {
        print("$i, ")
    }
    println()
    // 후방향
    //for (i in 5.downTo(1)) {
    for (i in 5 downTo 1) {
        print("$i, ")
    }
    println()
    // 범위안의 값 건너뛰기
    for (i in 1 until 5) {
        print("$i, ")
    }
    println()
}

