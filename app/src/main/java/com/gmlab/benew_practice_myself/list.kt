package com.gmlab.benew_practice_myself

fun main () {
    //수정할 수 있는 뮤터블타입과
    //수정이 안되는 이뮤터블 타입이 존재

    val months = listOf("January", "Febuary","March")
//    val anyTypes = listOf(1,2,3,"String",true,false)
//    print(anyTypes.size)
//
//    println(months[1])
//
//    for(month in months){
//        print(" ${month}")
//    }
    val additionalMonths = months.toMutableList()
    val newMonths = arrayOf("April","May","June")
    additionalMonths.addAll(newMonths)
    val newMonths2 = arrayOf("July","August","September","October","November","December")
    additionalMonths.addAll(newMonths2)
    print(additionalMonths)

    val days = mutableListOf<String>("Mon","Tues","Wed")
    days.add("Thurs")
//    days.removeAt(2)
    val removeList = mutableListOf<String>("Tues","Wed") //특정 아이템삭제
    days.removeAll(removeList)
    print(days)
}