package com.gmlab.benew_practice_myself

fun main() {
    // 중복 제거 컬렉션 이뮤터블 setOf 뮤터블 mutableSetOf
    val fruits = setOf("Orange","Apple","Mango","Grape","Apple","Orange")
//    print(fruits)
    print(fruits.toSortedSet()) // 알파벳 순서로 정렬

    val newFruits = fruits.toMutableList()
    newFruits.add("Water Melon")
    newFruits.add("Pear")
    print(newFruits)
    print(newFruits.elementAt(4))

    // Map 컬렉션 Key 1은 월요일에 저장
    // hashmap, 딕셔너리
    val daysOfTheWeek = mapOf(1 to "Monday",2 to "Tuesday",3 to "Wednesday")

    print(daysOfTheWeek[2]) //인덱스가 아닌 키값

    val newDaysOfTheWeek = daysOfTheWeek.toMutableMap()
    newDaysOfTheWeek[4] = "Thursday"
    newDaysOfTheWeek[5] = "Friday"

    print(newDaysOfTheWeek.toSortedMap())

    for(key in daysOfTheWeek.keys){
        print("$key 는 ${daysOfTheWeek[key]}")
    }
    val fruitsMap = mapOf("Favorite" to Fruit("Grape", 20.0),
        "Allergy" to Fruit("Apple",10.0))

}

data class Fruit(val name: String, val price: Double)