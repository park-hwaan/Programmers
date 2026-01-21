package com.example.codingtest.level2

fun main(){
    val topping = intArrayOf(1, 2, 3, 1, 4)
    var answer = 0

    val leftMap = mutableMapOf<Int,Int>()
    val rightMap = topping.groupBy { it }.mapValues { it.value.size }.toMutableMap()

    for( i in topping){
        rightMap[i] = rightMap[i]!! - 1
        if(rightMap[i] == 0){
            rightMap.remove(i)
        }

        leftMap[i] = leftMap.getOrDefault(i,0) + 1

        if (rightMap.size == leftMap.size) answer++
    }

    println(answer)





}