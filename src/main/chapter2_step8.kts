/**
 *
 * RAW 문자열
 * kotlinc-jvm -script chapter2_step8.kts
 */

// 이프케이프는 사용하지 않는다.
var escaped = "Hi, JinSeok \"Hello?\""
var escaped2 = """Hi, JinSeok "Hello?""""
println(escaped)
println(escaped2)

println("===============")
// 멀티라인 문자열
var name = "jinSeok"
var memo = """Hi, JinSeok
    |Hello
""".trimMargin()
println(memo)
println("===============")

