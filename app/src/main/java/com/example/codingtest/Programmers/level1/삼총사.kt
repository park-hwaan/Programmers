package com.example.codingtest.Programmers.level1

fun main(){
    val numbers = intArrayOf(-2, 3, 0, 2, -5)

    val num = numbers.size
    var answer = 0

    for (i in 0 until num - 2){
        for(j in i + 1 until num - 1){
            for(k in j+1 until num){
                if(numbers[i] + numbers[j] + numbers[k] == 0){
                    answer++
                }
            }
        }
    }

    println(answer)
}