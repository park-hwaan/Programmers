package com.example.codingtest.Programmers.level1

fun main(){
    val array = intArrayOf(1,5,2,6,3,7,4)
    val commands = arrayOf(intArrayOf(2,5,3), intArrayOf(4,4,1), intArrayOf(1,7,3))

    var answer = intArrayOf()

    for ( command in commands){
        val (i, j, k) = command
        println("$i $j $k")
        val subArray = array.sliceArray(i - 1 until j).sortedArray()
        answer += subArray[k - 1]
    }
    println(answer.contentToString())
}