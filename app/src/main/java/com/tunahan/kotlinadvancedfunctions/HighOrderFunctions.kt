package com.tunahan.kotlinadvancedfunctions

fun main(){
    //filtering
    val myNumList = listOf<Int>(1,3,5,7,9,11,13,15)
    val smallNumberList = myNumList.filter { it<6 }
    for (num in smallNumberList){
        println(num)
    }

    //conversion

    val squaredNumbers = myNumList.map { it*it }
    for(num in squaredNumbers){
        println(num)
    }

    //filter and map
    val filterAndMap = myNumList.filter { it<6 }.map { it*it }
    for (num in filterAndMap){
        println(num)
    }

    val fruit = listOf<Fruit>(
        Fruit("banana",35,"yellow")
    , Fruit("orange",20,"orange")
    , Fruit("watermelon",60,"red")
    )

    val filteredFruit = fruit.filter { it.price<40 }.map { it.color }
    for (num in filteredFruit){
        println(num)
    }
}

data class Fruit(val name:String,val price:Int,val color:String)