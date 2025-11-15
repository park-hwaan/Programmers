package com.example.codingtest.Programmers.level1

fun main(){
    val numbers = intArrayOf(5,0,2,7)

    var answer: IntArray = intArrayOf()

    for (i in numbers.indices){
        for(j in i+1 until numbers.size){
            val sum = numbers[i] + numbers[j]
            if(!answer.contains(sum)){
                answer = answer.plus(sum)
            }
        }
    }

    answer.sort()
    println(answer.contentToString())
}