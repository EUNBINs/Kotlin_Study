package com.eunbin.kotlinpractice

fun main() {
    forAndWhile()
}

// [4] 조건식

fun maxBy(a : Int, b : Int) : Int {
    if (a > b){
        return a
    } else {
        return b
    }
}
// 위의 식을 아래와 같이 쓸 수도 있음
fun maxBy2(a : Int, b : Int) = if (a>b) a else b

fun checkNum(score : Int) {
    when(score) {                               //switch의 역할
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
        else -> println("I don't know")             // else 생략 가능
    }
// 위의 식을 아래와 같이 쓸 수도 있음 --> else 를 항상 써줘야함
    var b = when(score) {
        1->1
        2->2
        else ->3
    }
    println("b : ${b}")
    when(score){
        in 90..100 -> println("you are genius")         // 90에서 10사이
        in 10..80 -> println("not bac")
        else -> println("okey")
    }
}

// [!] Expression vs Statement
// 코틀린의 모든 함수는 expression 이며, 아무리 리턴값이 없더라도 unit을 반환하고, if문이 자바에서는 statement지만
// 코틀린에서는 if문이나 when은 espression이나 statement로 사용할 수 있다

// [5] Array and List
// Array
// List 1. List [수정 불가능] 2. MutableList [수정 가능]

fun array() {
    val array : Array<Int> = arrayOf(1,2,3)
    val list : List<Int> = listOf(1,2,3)

    val array2 : Array<Any> = arrayOf(1,"D",3.4f)
    val list2 : List<Any> = listOf(1,"D",11L)

    array[0] = 3
    var result = list.get(0)

    var arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)

}

// [6] For / While

fun forAndWhile(){
    val students : ArrayList<String> = arrayListOf("joyce","james","jenny","jennifer")
    for (name in students){
        println("${name}")
    }

    for ((index,name) in students.withIndex()){
        println("${index+1}번째 학생 : ${name}")
    }
//------------------------------------------------------------------------------------------------
    var sum1 : Int = 0
    for(i in 1..10 step 2) {            // 2개씩 카운트
        sum1 += i
    }
    println(sum1)
//------------------------------------------------------------------------------------------------
    var sum2 : Int = 0
    for(i in 10 downTo 2) {            // 10부터 차례대로 1까지 내려오기
        sum2 += i
    }
    println(sum2)

    var sum3 : Int = 0
    for(i in 1 until 100) {            // 1부터 99까지 돌아가고, 1..100은 1부터 100까지 돌아가는 것
        sum3 += i
    }
    println(sum3)

    var index = 0
    while(index < 10) {
        println("current index :  ${index}")
        index++
    }
}