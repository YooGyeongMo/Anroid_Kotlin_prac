package com.gmlab.benew_practice_myself

fun main(){

    val arrayList = ArrayList<String>(5)
    val list = mutableListOf<String>()

    list.add("One")
    list.add("Two")

    arrayList.addAll(list)


    println("....print ArrayList")
    print(list)

    val itr = arrayList.listIterator()

    while(itr.hasNext()){
        println(itr.next())
    }
    println("arrayList 의 크기 = " + arrayList.size)


    //get() = 인덱스

    val getArrayList = ArrayList<String>()
    getArrayList.add("One")
    getArrayList.add("Two")
    for(i in getArrayList){
        println(i)
    }
    println(getArrayList.get(1)) //인덱스


    val meanArrayList = ArrayList<Double>()
    val meanList = mutableListOf<Double>(1.00,2.00,3.00,4.00,5.00)
    meanArrayList.addAll(meanList)
    var plus = 0.0
    for(i in meanArrayList )
        plus += i
        print(plus/meanArrayList.size)
}