package com.example.codingtest.Programmers.level1

fun main(){
    val food = intArrayOf(1,3,4,6)
    var half = ""

    for(i in 1 until food.size){
        val num = food[i] / 2
        repeat(num){
            half +="$i"
        }
    }

    val answer = half + "0" + half.reversed()
    println(answer)
}