package com.example.codingtest.level2

fun main(){
    val tangerine = intArrayOf(1, 3, 2, 5, 4, 5, 2, 3)
    val k = 4

    val countMap = tangerine
        .asIterable()
        .groupingBy { it }
        .eachCount()
        .values
        .sortedByDescending { it }

    var answer = 0
    var sum = 0

    for (i in countMap){
        sum += countMap[i]
        answer++

        if(sum == k) break
    }

    println(answer)

}