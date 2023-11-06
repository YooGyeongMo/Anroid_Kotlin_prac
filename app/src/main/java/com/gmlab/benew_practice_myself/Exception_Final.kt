package com.gmlab.benew_practice_myself
/*
* inally 블록을 사용하는 이유 중 하나는 리소스 관리입니다. 예를 들어, 파일을 열었을 때, 파일을 닫아야 하는데, 이것은 finally 블록에서 처리될 수 있습니다.
* finally 블록을 사용하면 예외가 발생하더라도 해당 리소스를 확실하게 해제하고 정리할 수 있습니다.

또한, finally 블록은 일반적으로 클린업 작업(메모리 해제, 연결 종료 등)에 사용됩니다. 따라서 예외가 발생하든 발생하지 않든 중요한 정리 작업을 보장할 수 있습니다.

그러나 모든 상황에서 finally 블록이 필요하지는 않습니다. 예외 처리가 필요 없는 코드 블록 내에서 어떤 작업을 수행하는 경우에는 finally 블록을 생략할 수 있습니다.
finally 블록은 주로 예외 처리와 관련된 코드에서 사용됩니다.*/
fun main(){
    try {
        val data = 10/5
        val data2: String? = null
//        val length = data2.length

        println(data)
//        println(length)
    } catch(e:NullPointerException){
        print(e)
    } finally{
        println("finally block는 항상 실행되는 예외")
    }
    println("try catch와 상관없이 실행되는 코드")
}