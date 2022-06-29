package com.eunbin.kotlinpractice

open class Human (val name : String= "anonymous"){              // 상속시켜주기 위해 open

    constructor(name : String, age : Int) : this(name) {
        println("my name is ${name}, ${age}years old")
    }
    init {
        println("New human has been born!!")
    }
    fun eatingCake() {
        println("This is so YUMMYY~")
    }
    open fun singASong() {
        println ("lalala")
    }
}

class Korean : Human() {
    override fun singASong() {          // 부모class 에서도 open 선언
        super.singASong()               // 부모것도 사용하고 싶을때 super선언
        println("라라라")
    }
}



fun main(){
    val human = Human("eunbin")     // 기본 생성자

    val stranger = Human()

    human.eatingCake()
    val mom = Human("kuri", 52)

    println("this human's name is ${stranger.name}")

    val korean = Korean()
    korean.singASong()
}

