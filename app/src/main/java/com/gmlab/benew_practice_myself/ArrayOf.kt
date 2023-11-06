package com.gmlab.benew_practice_myself

fun main() {
//    val numbers = intArrayOf(1,2,3,4,5,6)

    val numbers = arrayOf(1,2,3,4,5,6)

//    print(numbers.contentToString())
//    print(numbers1.contentToString())
    for(element in numbers){
        print(" ${element+2}")

    }
    for(element in numbers){
        print(" $element")
    }

    print(numbers[3])



}