package com.tunahan.kotlinadvancedfunctions

fun main(){
    val myNumList = listOf<Int>(1,3,5,7,9,11,13,15)

    //are all greater than 5
    val allCheck = myNumList.all { it>5 }
    println(allCheck)
    //is any one greater than 5
    val anyCheck = myNumList.any{it>5}
    println(anyCheck)
    //how many are greater than 5
    val totalCount = myNumList.count{it>5}
    println(totalCount)
    //first element greater than 5
    val findNum = myNumList.find { it>5 }
    println(findNum)
    //last element greater than 5
    val findLastNum = myNumList.findLast { it>5 }
    println(findLastNum)


    val myPredicate = {num:Int-> num>5}
    val allCheckWithPredicate = myNumList.all(myPredicate)
    println(allCheckWithPredicate)
    val anyCheckWithPredicate = myNumList.any(myPredicate)
    println(anyCheckWithPredicate)
    val totalCountWithPredicate = myNumList.count(myPredicate)
    println(totalCountWithPredicate)
    val findNumWithPredicate = myNumList.find(myPredicate)
    println(findNumWithPredicate)
    val findLastNumWithPredicate = myNumList.findLast(myPredicate)
    println(findLastNumWithPredicate)

}