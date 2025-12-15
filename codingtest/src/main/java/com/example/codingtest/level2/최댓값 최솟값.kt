package com.example.codingtest.level2

fun main(){
    val s = "-1 -2 -3 -4"
    val split = s.split(" ").map { it.toInt() }
    var answer = ""
    val min = split.min()
    val max = split.max()

    answer = "${min} ${max}"

    println(answer)
}