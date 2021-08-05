/**
 * 클래스와 함수는 생략 가능하다.
 */
fun nofluff() {
    println("nofluff called...")
    throw RuntimeException("oops")


}

println("not in a function, callling nofluff()")
try {
    nofluff()
} catch (ex: Exception) {
    val stackTrace = ex.getStackTrace()
    println(stackTrace[0])
    println(stackTrace[1])
}