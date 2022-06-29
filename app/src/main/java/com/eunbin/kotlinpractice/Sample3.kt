package com.eunbin.kotlinpractice

fun main() {
nullcheck()
}

// [7] Nullable / NonNull

fun nullcheck () {
    // NPE : NULL pointer Exception

    var name : String = "joyce"

//    var nullName : String = null          --> 에러 Nonnull 타입에 null을 넣었기 때문에
    var nullName : String? = null         // null 타입을 만들고 싶다면 ? 사용

    var nameInUpperCase = name.toUpperCase()
    var nullNameInUpperCase = nullName?.toUpperCase()        // 빨간색표시 --> NULL인지 아닌지 모르겠으니까 표시해줘 --> ? 사용
    // ? 을 사용하게 되면 --> Null값일 경우 null 반환, Null값이 아닌 경우 toUpperCase 반환


    // ?:
    val lastName : String? = "jang"
    val fullName = name + " " + (lastName?: "NO lastName")      // lasyName이 null이면 디폴트값 부여
    var mLastName = lastName ?: throw IllegalArgumentException("No last name")
    println(fullName)


}
    // !!:          --> 하늘이 두쪽나도 null이 들어올 일은 없을때 사용

fun ignoreNulls(str : String?){
    val mNotNull : String = str!!           // 확실하지 않는 이상 !!는 지양해야 함
    val upper = mNotNull.toUpperCase()

    // email?.let ---> email 이 null이 아니면 let 해라
    val email : String ? = "eunbin95@naver.com"
    email?.let{
        println("my emial is ${email}")
    }
}