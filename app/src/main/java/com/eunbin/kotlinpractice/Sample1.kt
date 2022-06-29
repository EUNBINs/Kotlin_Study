package com.eunbin.kotlinpractice

fun main() {

    // [3]. String Template

    val name = "yeeun"
    val lastName = "Han"
    println("my name is ${name + lastName} I'm 29")

    println("is this true? ${1==0}")

    println("this is 2\$a")
}

// [1] 함수
fun helloWorld() : Unit {
    println("Hello World!")                             // 리턴이 없을때에는 Uint 기재[안써도 됌] , java에서 void와 같은 개념
}
fun add(a : Int, b :Int) : Int {                        // 변수명 : 변수타입 , 리턴은 파라미터 먼저 써준 다음에
    return a+b
}

// [2] val vs var
// val = value [상수] , var = variable [변수]
fun hi() {
    val a : Int = 10
    var b : Int = 9
    b = 100

    val c = 100
    var d = 100
    var name = "eunbin"

    // var b = 10 이렇게 선언해도 되지만 var로 값을 변화시켜주려면 타입까지 함께 선언해야함 var b : Int = 10
}