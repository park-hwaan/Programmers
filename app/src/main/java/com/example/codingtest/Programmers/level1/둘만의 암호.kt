package com.example.codingtest.Programmers.level1


// 만약 마지막 z를 초과 할 경우를 생각해서  % 연산자를 사용
fun main(){
    val s = "aukks"
    val skip = "wbqd"
    val index = 5
    var answer = ""

    val alphabet = ('a'..'z').filter { !skip.contains(it) }

    for (c in s){
        val currentIndex = alphabet.indexOf(c)
        val newIndex = alphabet[(currentIndex + index) % alphabet.size]
        answer += newIndex
    }

    println(answer)
}