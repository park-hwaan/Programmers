package com.example.codingtest.Programmers.level1

fun main(){
    var a = 2
    var b = 1
    var n = 20
    var answer = 0

    while (n >= a ){
        answer += (n / a) * b
        n = (n % a) + (n / a) * b
    }

    println(answer)
}