package com.example.codingtest.Programmers.level1

fun main(){
    val a = intArrayOf(1,2,3,4)
    val b = intArrayOf(-3,-1,0,2)
    var answer = 0

    for (i in a.indices){
        answer += a[i] * b[i]
    }

    println(answer)
}