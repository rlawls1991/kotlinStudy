/**
 *
 * 표현식은 많이, 멸여문은 적게
 * kotlinc-jvm -script chapter2_step9.kts
 */

fun styleJava(age: Int): String {
    var status: String
    if (age > 31) {
        status = "나이가 많구나"
    } else {
        status = "나이가 적구나"
    }
    return status
}
println(styleJava(100))

fun styleKotlin(age: Int): String {
    val status = if (age > 17) "나이가 많구나" else "나이가 적구나"
    return "$status"
}
println(styleKotlin(10))