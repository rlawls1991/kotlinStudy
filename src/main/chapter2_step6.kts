/**
 *
 * 향상된 동일성 체크
 * kotlinc-jvm -script chapter2_step6.kts
 */
println("hi" == "hi")
println("hi" == "Hi")
println(null == "hi")
println("hi" == null)
println(null == null)