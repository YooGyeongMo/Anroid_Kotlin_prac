package com.gmlab.benew_practice_myself

import androidx.constraintlayout.motion.widget.TransitionBuilder.validate

//throw 분명한 예외 던질 때
// 예외 객체를 던지는데 , 커스텀 예외를 사용하는데 사용

fun main(args: Array<String>){
    validate(15)
    println("타당성 체크")
}
fun validate(age:Int){
    if(age<18)
        throw ArithmeticException("under age") // under age 유발
    else
        println("운전 적격")
}