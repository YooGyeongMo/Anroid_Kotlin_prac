package com.gmlab.benew_practice_myself


import kotlin.Exception

//중첩 예외
fun main(args: Array<String>){
    try {
        val a = IntArray(5) // 사이즈가 5개
        a[5] = 10 / 0
    } catch(e:ArithmeticException){ // 어떤 숫자는 0으로 나눌 수 없어서 코드에서 에러 발생
        println("ArithmeticException 오류 발생 catch")
    } catch(e:ArrayIndexOutOfBoundsException) { //5개 사이즈가 있고 인덱싱이 4인데 [5] 에 접근하려함
        println("ArrayIndexOutOfBoundsExcetion 발생 !")
    } catch(e:Exception){  //그냥 예외처리.
        println("parent 예외 class")
    }
    println("예외 try-catch 이후 출력해뿌기 ~ ")
}

//nested 중첩 예외 try block
/*
* try
* { code block here
*     try { // code block
* }     catch {
*  } catch {
* }*/

