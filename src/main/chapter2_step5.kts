/**
 * 이뮤터블이 뮤터블보다 좋은 이유
 * 이뮤터블 : 상태를 바꿀 수 없는 객체(java의 final과 비슷)
 * 뮤터블 : 상태를 바꿀 수 있는 객체
 *
 * 실행코드
 * kotlinc-jvm -script chapter2_step5.kts
 */
var factor = 2
fun doubleIt(n: Int) = n * factor
factor = 0
println(doubleIt(2))


// 이뮤터블인 예제 (아래코드를 실행시키면 에러가 발생이 된다.)
val message = StringBuilder("Hello")
message = StringBuilder("Hi")
message.append(" world")