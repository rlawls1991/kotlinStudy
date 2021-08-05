/**
 *
 * 큰따음표 문자열에서 $ 심볼을 변수 앞에  붙여주면 어떤 변수라도 문자열 안에 들어간다.
 * kotlinc-jvm -script chapter2_step7.kts
 */
var factor = 2
fun doubleIt(n: Int) = n * factor

var message = "factor의 값은 : $factor"
factor = 0
println(doubleIt(2))
println(message)
