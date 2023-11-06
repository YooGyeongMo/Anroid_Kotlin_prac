package com.gmlab.benew_practice_myself

fun main() {
    add(1,2)
    println("")

    //람다식 사용시 두개의 파라미터가 같으면 오류발생
    val sum:(Int,Int,Int) -> Int = {a:Int,b:Int,c:Int -> a+b+c}
    println(sum(1,2,3))
    //더 짧게
    val sum2 = {d:Int,f:Int->println(d+f)}
    sum2(1,2)
}


//아래와 같은 함수를 람다식으로
fun add(a:Int,b:Int){
    val plus = a + b
    print(plus)
}

