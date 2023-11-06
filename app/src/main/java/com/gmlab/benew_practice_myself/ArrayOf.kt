package com.gmlab.benew_practice_myself

fun main() {
//    배열은 자료형에 맞춰야한다.
//    배열은 인덱스 갯수만큼 초기화 된 만큼 사용가능 더 추가하면 out of bound 발생
//    val numbers = intArrayOf(1,2,3,4,5,6)

    val numbers = arrayOf(1,2,3,4,5,6)

//    print(numbers.contentToString())
//    print(numbers1.contentToString())
//    for(element in numbers){
//        print(" ${element+2}")
//
//    }
//    for(element in numbers){
//        print(" $element")
//    }
    println("첫 배열 ${numbers.contentToString()}")
    numbers[0] = 6
    numbers[1] = 5
    numbers[4] = 2
    numbers[5] = 1
    println("수정된 배열 ${numbers.contentToString()}")
//    print(numbers[3])

    val days = arrayOf("Sun", "Mon","Tues","Wed","Thurs","Fri","Sat")

    print(days.contentToString())

    val fruits = arrayOf(Fruit("Apple",2000.0),Fruit("pear",20.0))

//    print(fruit.contentToString())

    for(fruit in fruits){
        println("${fruit.name}")
    }
    for(index in fruits.indices) { //indices 인덱스 알려주눈것
        println("${fruits[index].name} 은 $index")
    }

    val mix = arrayOf("Mon","Tues","Wed",1,2,3,Fruit("alomond",1.0))

    println(mix.contentToString())
}

data class Fruit(val name: String, val price: Double)